/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stock.dao;

import com.stock.database.ConnectionFactory;
import com.stock.dto.UserDTO;
import com.stock.ui.Users;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class UserDAO {

    Connection con = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    public UserDAO() {
        try {
            con = new ConnectionFactory().getConnection();
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addUserDAO(UserDTO userdto, String user) {
        try {
            String query = "SELECT * FROM users WHERE fullname='" + userdto.getFullName() + "' AND location='" + userdto.getLocation() + "' AND phone='" + userdto.getPhone() + "' AND category='" + userdto.getCategory() + "'";
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Same User has already been added!");
            } else {
                addFunction(userdto, user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//end of method addUserDTO

    public void addFunction(UserDTO userdto, String user) {
        try {

            String password = userdto.getPassword();

            String encPass = null;

            encPass = new Users().encryptPassword(password);

            String query = "INSERT INTO users (fullname,location, phone, username, password, category) VALUES(?,?,?,?,?,?)";
            pstmt = (PreparedStatement) con.prepareStatement(query);
            pstmt.setString(1, userdto.getFullName());
            pstmt.setString(2, userdto.getLocation());
            pstmt.setString(3, userdto.getPhone());
            pstmt.setString(4, userdto.getUsername());
            pstmt.setString(5, encPass);
            pstmt.setString(6, userdto.getCategory());
            pstmt.executeUpdate();
            if ("ADMINISTRATOR".equals(user)) {
                JOptionPane.showMessageDialog(null, "NEW ADMINISTRATOR ADDED");
            } else {
                JOptionPane.showMessageDialog(null, "NEW NORMAL USER ADDED");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void editUserDAO(UserDTO userdto) {
        try {
            String query = "UPDATE users SET fullname=?,location=?,phone=?,category=? WHERE username=?";
            pstmt = (PreparedStatement) con.prepareStatement(query);
            pstmt.setString(1, userdto.getFullName());
            pstmt.setString(2, userdto.getLocation());
            pstmt.setString(3, userdto.getPhone());
            pstmt.setString(4, userdto.getCategory());
            pstmt.setString(5, userdto.getUsername());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//end of method editUserDTO

    public void editFunction(UserDTO userdto, String imgLink, File file) {

        try {
            if (imgLink.equals("")) {

            } else {
                String query = "UPDATE users SET fullname=?,location=?,phone=?,username=?,password=?,category=?,image=? WHERE id=?";
                FileInputStream fis = new FileInputStream(file);
                pstmt = (PreparedStatement) con.prepareStatement(query);
                pstmt.setString(1, userdto.getFullName());
                pstmt.setString(2, userdto.getLocation());
                pstmt.setString(3, userdto.getPhone());
                pstmt.setString(4, userdto.getUsername());
                pstmt.setString(5, userdto.getPassword());
                pstmt.setString(6, userdto.getCategory());
                pstmt.setBinaryStream(7, fis, (int) file.length());
                pstmt.setInt(8, userdto.getId());
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Updated");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteUserDAO(String value) {
        try {
            String query = "delete from users where username=?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, value);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted..");
        } catch (SQLException e) {
        }
        new Users().loadDatas();
    }

    public ResultSet getQueryResult1() {
        try {
            String query = "SELECT fullname,location,phone,username,category FROM users";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet getUser(String user) {
        try {
            String query = "SELECT * FROM users WHERE username='" + user + "'";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet getPassword(String user, String pass) {
        try {
            String query = "SELECT password FROM users WHERE username='" + user + "' AND password='" + pass + "'";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void changePassword(String user, String pass) {
        try {
            String query = "UPDATE users SET password=? WHERE username=?";
            pstmt = con.prepareStatement(query);
            String encPass = new Users().encryptPassword(pass);
            pstmt.setString(1, encPass);
            pstmt.setString(2, user);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //start of method DefaultTableModle
    public DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData(); //resultset ko metadata
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();

        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }
        return new DefaultTableModel(data, columnNames);
    }//end of method DefaultTableModel
}
