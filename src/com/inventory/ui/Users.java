/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.ui;

import com.inventory.dao.UserDAO;
import com.inventory.dto.UserDTO;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Users extends javax.swing.JPanel {

    File f;
    JFileChooser chooser;

    /**
     * Creates new form NewJPanel
     */
    public Users() {

        initComponents();

        //usernameTxt.setEnabled(false);
        chooser = new JFileChooser();
        editBttn.setEnabled(false);
        UserdeleteBttn.setEnabled(false);
        btnEditDetails.setEnabled(false);
        loadDatas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addBttn = new javax.swing.JLabel();
        locationLab = new javax.swing.JLabel();
        userComboBox = new javax.swing.JComboBox();
        fullNameLab = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        locationTxt = new javax.swing.JTextField();
        fullNameTxt = new javax.swing.JTextField();
        phoneLab = new javax.swing.JLabel();
        UserdeleteBttn = new javax.swing.JLabel();
        clearBttn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        editBttn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fullNameLab1 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fullNameLab2 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        passwordTxt2 = new javax.swing.JTextField();
        fullNameLab3 = new javax.swing.JLabel();
        fullNameLab4 = new javax.swing.JLabel();
        btnEditDetails = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        mainPanel.setPreferredSize(new java.awt.Dimension(1070, 531));
        mainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainPanelMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comfortaa", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("USERS");
        jLabel2.setMinimumSize(new java.awt.Dimension(125, 50));
        jLabel2.setPreferredSize(new java.awt.Dimension(125, 50));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PLEASE FILL ALL THE FIELDS"));

        addBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/addPeople.png"))); // NOI18N
        addBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttnMouseClicked(evt);
            }
        });

        locationLab.setText("Location:");

        userComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMINISTRATOR", "STOCK MANAGER", "CLERK" }));
        userComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userComboBoxActionPerformed(evt);
            }
        });

        fullNameLab.setText("Full Name: ");

        phoneTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        locationTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        fullNameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        phoneLab.setText("Phone:");

        UserdeleteBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/deletelarge.png"))); // NOI18N
        UserdeleteBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserdeleteBttnMouseClicked(evt);
            }
        });

        clearBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/clear.png"))); // NOI18N
        clearBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBttnMouseClicked(evt);
            }
        });

        jLabel3.setText("Add");

        jLabel5.setText("Delete");

        jLabel6.setText("Cancel");

        editBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/editPeople.png"))); // NOI18N
        editBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBttnMouseClicked(evt);
            }
        });

        jLabel4.setText("Update");

        fullNameLab1.setText("Username:");

        usernameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel1.setText("User Type:");

        fullNameLab2.setText("Password:");

        passwordTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        passwordTxt2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        fullNameLab3.setText("Password:");

        fullNameLab4.setText("Confirm");

        btnEditDetails.setText("Edit Details");
        btnEditDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnEditDetails))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(userComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(fullNameLab2)
                        .addGap(18, 18, 18)
                        .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullNameLab4)
                            .addComponent(fullNameLab3))
                        .addGap(20, 20, 20)
                        .addComponent(passwordTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addBttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBttn)
                        .addGap(2, 2, 2)
                        .addComponent(UserdeleteBttn)
                        .addGap(12, 12, 12)
                        .addComponent(clearBttn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullNameLab)
                            .addComponent(locationLab))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fullNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fullNameLab1)
                                .addGap(18, 18, 18)
                                .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(phoneLab))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(btnEditDetails)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameLab)
                    .addComponent(fullNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(locationLab))
                    .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(phoneLab))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameLab1)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(fullNameLab2))
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(fullNameLab4)
                        .addGap(6, 6, 6)
                        .addComponent(fullNameLab3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBttn)
                    .addComponent(editBttn)
                    .addComponent(UserdeleteBttn)
                    .addComponent(clearBttn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4))
                    .addComponent(jLabel6)))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userComboBoxActionPerformed

    public String encryptPassword(String input) {
        String encPass = null;
        if (input == null) {
            return null;
        }

        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(input.getBytes(), 0, input.length());
            encPass = new BigInteger(1, digest.digest()).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return encPass;
    }

    String user;
    private void addBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttnMouseClicked
        UserDTO userdto = new UserDTO();

        if (fullNameTxt.getText().equals("") || locationTxt.getText().equals("") || phoneTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields!");
        } else {

            if (passwordTxt.getText().equals(passwordTxt2.getText())) {
                user = (String) userComboBox.getSelectedItem();
                userdto.setFullName(fullNameTxt.getText());
                userdto.setLocation(locationTxt.getText());
                userdto.setPhone(phoneTxt.getText());
                userdto.setCategory(user);
                userdto.setUsername(usernameTxt.getText());
                userdto.setPassword(passwordTxt.getText());
                new UserDAO().addUserDAO(userdto, user);

                fullNameTxt.setText("");
                locationTxt.setText("");
                phoneTxt.setText("");
                usernameTxt.setText("");
                passwordTxt.setText("");
                passwordTxt2.setText("");

                editBttn.setEnabled(false);
                UserdeleteBttn.setEnabled(false);
                btnEditDetails.setEnabled(false);

                loadDatas();
            } else {
                JOptionPane.showMessageDialog(null, "passwords do not match!");
            }
        }
    }//GEN-LAST:event_addBttnMouseClicked
    String username;
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row = table.getSelectedRow();
        int column = table.getColumnCount();
        Object[] val = new Object[column];
        for (int i = 0; i < column; i++) {
            val[i] = table.getValueAt(row, i);
        }
        usernameTxt.setText(val[3].toString());
        fullNameTxt.setText((String) val[0]);
        locationTxt.setText((String) val[1]);
        phoneTxt.setText((String) val[2]);
        user = (String) userComboBox.getSelectedItem();
        userComboBox.setSelectedItem(user);
        username = (String) val[3];

        fullNameTxt.setEditable(false);
        locationTxt.setEditable(false);
        phoneTxt.setEditable(false);
        usernameTxt.setEditable(false);
        passwordTxt.setEditable(false);
        passwordTxt2.setEditable(false);

        editBttn.setEnabled(true);
        UserdeleteBttn.setEnabled(true);
        btnEditDetails.setEnabled(true);
    }//GEN-LAST:event_tableMouseClicked

    private void UserdeleteBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserdeleteBttnMouseClicked
        if (table.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Select a table data first!");
        } else {
            new UserDAO().deleteUserDAO(String.valueOf(table.getValueAt(table.getSelectedRow(), 3)));

            fullNameTxt.setText("");
            locationTxt.setText("");
            phoneTxt.setText("");
            usernameTxt.setText("");
            passwordTxt.setText("");

            editBttn.setEnabled(false);
            UserdeleteBttn.setEnabled(false);
            btnEditDetails.setEnabled(false);
            loadDatas();

            fullNameTxt.setEditable(false);
            locationTxt.setEditable(false);
            phoneTxt.setEditable(false);
            usernameTxt.setEditable(false);
            passwordTxt.setEditable(false);
            passwordTxt2.setEditable(false);
            userComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_UserdeleteBttnMouseClicked

    private void clearBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBttnMouseClicked
        usernameTxt.setText("");
        fullNameTxt.setText("");
        locationTxt.setText("");
        phoneTxt.setText("");
        passwordTxt.setText("");

        editBttn.setEnabled(false);
        UserdeleteBttn.setEnabled(false);
        btnEditDetails.setEnabled(false);
    }//GEN-LAST:event_clearBttnMouseClicked
    String filename;
    private void mainPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMouseClicked
        usernameTxt.setText("");
        fullNameTxt.setText("");
        locationTxt.setText("");
        phoneTxt.setText("");
        passwordTxt.setText("");
    }//GEN-LAST:event_mainPanelMouseClicked

    private void editBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBttnMouseClicked
        
        if (table.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Select a table data first!");
        } else {
            UserDTO userdto = new UserDTO();

            if (fullNameTxt.getText().equals("") || locationTxt.getText().equals("") || phoneTxt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields!");
            } else {
                user = (String) userComboBox.getSelectedItem();
                userdto.setFullName(fullNameTxt.getText());
                userdto.setLocation(locationTxt.getText());
                userdto.setPhone(phoneTxt.getText());
                userdto.setUsername(usernameTxt.getText());
                userdto.setCategory(user);
                new UserDAO().editUserDAO(userdto);

                fullNameTxt.setText("");
                locationTxt.setText("");
                phoneTxt.setText("");
                usernameTxt.setText("");
                passwordTxt.setText("");

                editBttn.setEnabled(false);
                UserdeleteBttn.setEnabled(false);
                btnEditDetails.setEnabled(false);
                loadDatas();

                fullNameTxt.setEditable(false);
                locationTxt.setEditable(false);
                phoneTxt.setEditable(false);
                usernameTxt.setEditable(false);
                passwordTxt.setEditable(false);
                passwordTxt2.setEditable(false);
                userComboBox.setEnabled(false);
            }
        }
    }//GEN-LAST:event_editBttnMouseClicked

    private void btnEditDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDetailsActionPerformed
        fullNameTxt.setEditable(true);
        locationTxt.setEditable(true);
        phoneTxt.setEditable(true);

        fullNameTxt.setEditable(true);
        locationTxt.setEditable(true);
        phoneTxt.setEditable(true);
        usernameTxt.setEditable(true);
        passwordTxt.setEditable(true);
        passwordTxt2.setEditable(true);
        userComboBox.setEnabled(true);
        //usernameTxt.setEditable(true);
        passwordTxt.setEditable(false);
        passwordTxt2.setEditable(false);
    }//GEN-LAST:event_btnEditDetailsActionPerformed

    public void loadDatas() {
        try {
            UserDAO userDAO = new UserDAO();
            table.setModel(userDAO.buildTableModel(userDAO.getQueryResult1()));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserdeleteBttn;
    private javax.swing.JLabel addBttn;
    private javax.swing.JButton btnEditDetails;
    private javax.swing.JLabel clearBttn;
    private javax.swing.JLabel editBttn;
    private javax.swing.JLabel fullNameLab;
    private javax.swing.JLabel fullNameLab1;
    private javax.swing.JLabel fullNameLab2;
    private javax.swing.JLabel fullNameLab3;
    private javax.swing.JLabel fullNameLab4;
    private javax.swing.JTextField fullNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel locationLab;
    private javax.swing.JTextField locationTxt;
    public javax.swing.JPanel mainPanel;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField passwordTxt2;
    private javax.swing.JLabel phoneLab;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JTable table;
    private javax.swing.JComboBox userComboBox;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
