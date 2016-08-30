/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stock.database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class ConnectionFactory {

    Properties prop = new Properties();
    InputStream input = null;

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    boolean flag = false;

    String username;
    String pw;
    String host;
    String database;
    String port;
    String driver = "com.mysql.jdbc.Driver";
    String url;

    //Constructor starts
    public ConnectionFactory() {

        try {
            input = new FileInputStream("config.properties");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            // load a properties file
            prop.load(input);
        } catch (IOException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

        host = prop.getProperty("host");
        database = prop.getProperty("database");
        port = prop.getProperty("port");
        username = prop.getProperty("dbuser");
        pw = prop.getProperty("dbpassword");
//        host ="localhost";
//        database = "ims";
//        port = "3306";
//        username = "root";
//        pw = "root";
        url = "jdbc:mysql://" + host + ":" + port + "/" + database;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, pw);
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//end of constructor ConnectionFactory

    //method Connection starts
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, pw);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }//end of method Connection

    //method checkLogin starts
    public boolean checkLogin(String username, String password, String user) {
        if (user == "ADMINISTRATOR") {
            String query = "SELECT * FROM users WHERE username='" + username + "' AND password='" + password + "' AND category='ADMINISTRATOR'";
            try {
                rs = stmt.executeQuery(query);
                while (rs.next()) {
                    flag = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            String query = "SELECT * FROM users WHERE username='" + username + "' AND password='" + password + "'AND category='" + user + "'";
            try {
                rs = stmt.executeQuery(query);
                while (rs.next()) {
                    flag = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return flag;
    }
}
