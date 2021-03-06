/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stock.ui;

import com.stock.dao.CustomerDAO;
import com.stock.dao.ProductDAO;
import com.stock.dto.ProductDTO;
import com.stock.report.ReportView;
import static com.stock.ui.Products.productCode;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Issues extends javax.swing.JPanel {

    String u;
    private String userRole;
    ReportView reportView;

    /**
     * Creates new form SalesReport
     */
    public Issues(String user, String role) {
        initComponents();
        u = user;
        this.userRole = role;
        loadDatas();
        salesIdTxt.setVisible(false);
        customerNameLab.setVisible(false);
        productNameLab.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        salePanel = new javax.swing.JPanel();
        productCodeLab = new javax.swing.JLabel();
        productCodeTxt = new javax.swing.JTextField();
        quantityTxt = new javax.swing.JTextField();
        quantityLab = new javax.swing.JLabel();
        sellingPriceTxt = new javax.swing.JTextField();
        sellingPriceLab = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        customerCodeTxt = new javax.swing.JTextField();
        productCodeLab1 = new javax.swing.JLabel();
        productNameLab = new javax.swing.JLabel();
        sellBttn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        deleteBttn = new javax.swing.JLabel();
        clearBttn1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        salesIdTxt = new javax.swing.JTextField();
        customerNameLab = new javax.swing.JLabel();
        printBttn = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        issueCodeTxt = new javax.swing.JTextField();
        productCodeLab2 = new javax.swing.JLabel();
        supplierInfoPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        supplierInfoLab = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        purchasedDateLab = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        searchByLab = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(1070, 531));
        setMinimumSize(new java.awt.Dimension(1070, 531));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1070, 531));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;   //Disallow the editing of any cell
            }
        };
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 695, 345));

        jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("ISSUES");
        jLabel1.setRequestFocusEnabled(false);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 160, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 990, 11));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PLEASE FILL ALL THE FIELDS"));
        jPanel1.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N

        productCodeLab.setText("Product Code:");

        productCodeTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        productCodeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productCodeTxtActionPerformed(evt);
            }
        });
        productCodeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productCodeTxtKeyReleased(evt);
            }
        });

        quantityTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        quantityLab.setText("Qty:");

        sellingPriceTxt.setEditable(false);
        sellingPriceTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        sellingPriceLab.setText("Selling Price:");

        jLabel3.setText("Date:");

        customerCodeTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        customerCodeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                customerCodeTxtKeyReleased(evt);
            }
        });

        productCodeLab1.setText("Customer Code:");

        productNameLab.setBackground(new java.awt.Color(204, 204, 255));
        productNameLab.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        productNameLab.setForeground(new java.awt.Color(102, 102, 255));

        sellBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stock/ui/images/saleLarge.png"))); // NOI18N
        sellBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellBttnMouseClicked(evt);
            }
        });

        jLabel7.setText("Delete");

        deleteBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stock/ui/images/delete item.png"))); // NOI18N
        deleteBttn.setEnabled(false);
        deleteBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBttnMouseClicked(evt);
            }
        });

        clearBttn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stock/ui/images/clear.png"))); // NOI18N
        clearBttn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBttn1MouseClicked(evt);
            }
        });

        jLabel8.setText("Clear");

        jLabel9.setText("Sell");

        salesIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesIdTxtActionPerformed(evt);
            }
        });

        customerNameLab.setBackground(new java.awt.Color(204, 204, 255));
        customerNameLab.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        customerNameLab.setForeground(new java.awt.Color(102, 102, 255));

        printBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stock/ui/images/printer_print_page_document_printout_flat_icon_symbol-48.png"))); // NOI18N
        printBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printBttnMouseClicked(evt);
            }
        });

        jLabel11.setText("Print");

        issueCodeTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        issueCodeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                issueCodeTxtKeyReleased(evt);
            }
        });

        productCodeLab2.setText("Issue Code:");

        javax.swing.GroupLayout salePanelLayout = new javax.swing.GroupLayout(salePanel);
        salePanel.setLayout(salePanelLayout);
        salePanelLayout.setHorizontalGroup(
            salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salePanelLayout.createSequentialGroup()
                        .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(salePanelLayout.createSequentialGroup()
                                .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(salePanelLayout.createSequentialGroup()
                                        .addComponent(sellBttn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deleteBttn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(clearBttn1))
                                    .addGroup(salePanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel9)
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel7)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel8)))
                                .addGap(18, 18, 18)
                                .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(salePanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel11))
                                    .addComponent(printBttn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salesIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(salePanelLayout.createSequentialGroup()
                                .addComponent(productCodeLab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(productCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(salePanelLayout.createSequentialGroup()
                                .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(productCodeLab1)
                                    .addComponent(jLabel3)
                                    .addComponent(productCodeLab2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customerCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(issueCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(customerNameLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(salePanelLayout.createSequentialGroup()
                        .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(productNameLab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, salePanelLayout.createSequentialGroup()
                                .addComponent(sellingPriceLab)
                                .addGap(18, 18, 18)
                                .addComponent(sellingPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(quantityLab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        salePanelLayout.setVerticalGroup(
            salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issueCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productCodeLab2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productCodeLab1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerNameLab, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productCodeLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productNameLab, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sellingPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellingPriceLab)
                    .addComponent(quantityLab)
                    .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 24, Short.MAX_VALUE)
                .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(deleteBttn, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(sellBttn, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(clearBttn1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(printBttn, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(salesIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel8))
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(salePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sales", jPanel1);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 70, -1, -1));

        supplierInfoPanel.setBackground(new java.awt.Color(255, 255, 204));
        supplierInfoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(144, 128, 14), 1, true));

        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Customer Info: ");

        supplierInfoLab.setForeground(new java.awt.Color(0, 0, 51));
        supplierInfoLab.setText("         ");

        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Sold Date:");

        purchasedDateLab.setForeground(new java.awt.Color(0, 51, 51));
        purchasedDateLab.setText("                ");

        javax.swing.GroupLayout supplierInfoPanelLayout = new javax.swing.GroupLayout(supplierInfoPanel);
        supplierInfoPanel.setLayout(supplierInfoPanelLayout);
        supplierInfoPanelLayout.setHorizontalGroup(
            supplierInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplierInfoPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(supplierInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(supplierInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(purchasedDateLab, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(supplierInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(supplierInfoLab, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        supplierInfoPanelLayout.setVerticalGroup(
            supplierInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supplierInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchasedDateLab)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supplierInfoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(supplierInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(supplierInfoLab))
                .addContainerGap())
        );

        add(supplierInfoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 461, 695, 54));

        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("(Search using Product Name,  Product Code, Customer Name or Username)");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 79, 430, -1));

        searchByLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchByLab.setText("SEARCH");
        add(searchByLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 79, 80, -1));

        searchTxt.setToolTipText("Search using Product Name, Brand Name OR Product Code");
        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });
        add(searchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 74, 123, 25));
    }// </editor-fold>//GEN-END:initComponents

    int quantity;
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row = table.getSelectedRow();
        int column = table.getColumnCount();
        Object[] val = new Object[column];
        for (int i = 0; i < column; i++) {
            val[i] = table.getValueAt(row, i);
        }
        salesIdTxt.setText(val[0].toString());
        issueCodeTxt.setText(val[1].toString());
        String cus = new ProductDAO().getProductsCustomer(Integer.parseInt(salesIdTxt.getText()));
        supplierInfoLab.setText("Sold to " + cus);
        String soldDate = new ProductDAO().getSoldDate(Integer.parseInt(salesIdTxt.getText()));
        purchasedDateLab.setText(soldDate);

        quantity = Integer.parseInt(val[4].toString());
        productCode = val[2].toString();
        productCodeTxt.setText(productCode);
        customerCodeTxt.setText(cus);
        quantityTxt.setText(val[4].toString());

        DateFormat df = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");

        // Convert from String to Date
        Date startDate = null;
        try {
            startDate = df.parse(soldDate);
        } catch (ParseException ex) {
            Logger.getLogger(GRNPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        dateChooser.setDate(startDate);

        if (!userRole.equalsIgnoreCase("CLERK")) {
            deleteBttn.setEnabled(true);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void salesIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salesIdTxtActionPerformed

    private void clearBttn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBttn1MouseClicked
        salesIdTxt.setText("");
        customerCodeTxt.setText("");
        productNameLab.setText("");
        productNameLab.setVisible(false);
        customerNameLab.setText("");
        customerNameLab.setVisible(false);
        dateChooser.setDate(null);
        productCodeTxt.setText("");
        issueCodeTxt.setText("");
        quantityTxt.setText("");
        sellingPriceTxt.setText("");
    }//GEN-LAST:event_clearBttn1MouseClicked

    private void deleteBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBttnMouseClicked
        if (!userRole.equalsIgnoreCase("CLERK")) {
            if (table.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(null, "Select a table data first!");
            } else {
                new ProductDAO().deleteSalesDAO(String.valueOf(table.getValueAt(table.getSelectedRow(), 0)));
                new ProductDAO().editSoldStock(String.valueOf(table.getValueAt(table.getSelectedRow(), 1)), quantity);
                loadDatas();
            }
        }
    }//GEN-LAST:event_deleteBttnMouseClicked

    private void sellBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellBttnMouseClicked
        if (dateChooser.getDate() == null || quantityTxt.getText().equals("") || customerCodeTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields!");
        } else {
            try {
                ResultSet rs = new CustomerDAO().getCustomersName(customerCodeTxt.getText());
                if (rs.next()) {
                    ProductDTO productdto = new ProductDTO();
                    productdto.setIssueCode(issueCodeTxt.getText());
                    productdto.setCustomerCode(customerCodeTxt.getText());
                    productdto.setSellDate(dateChooser.getDate().toString());
                    productdto.setProductCode(productCodeTxt.getText());
                    Double sellingPrice = Double.parseDouble(sellingPriceTxt.getText());
                    Double totalRevenue = sellingPrice * Integer.parseInt(quantityTxt.getText());
                    productdto.setTotalRevenue(totalRevenue);
                    productdto.setQuantity(Integer.parseInt(quantityTxt.getText()));
                    //productdto.setUserName(u);
                    new ProductDAO().sellProductDAO(productdto, u);
                    loadDatas();
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter valid customer code!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_sellBttnMouseClicked

    private void customerCodeTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerCodeTxtKeyReleased
        customerNameLab.setVisible(true);

        try {
            ResultSet rs = new CustomerDAO().getCustomersName(customerCodeTxt.getText());
            if (rs.next()) {
                customerNameLab.setText("Name: " + rs.getString("fullname") + " | Location: " + rs.getString("location"));
            } else {
                customerNameLab.setText("Not associated with any Customers!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_customerCodeTxtKeyReleased

    private void productCodeTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productCodeTxtKeyReleased
        productNameLab.setVisible(true);

        try {
            ResultSet rs = new CustomerDAO().getProductsName(productCodeTxt.getText());
            if (rs.next()) {
                productNameLab.setText("Name: " + rs.getString("productname") + " | Available Quantity: " + rs.getInt("quantity"));
                Double sellingPrice = new ProductDAO().getProductSellingPrice(productCodeTxt.getText());
                sellingPriceTxt.setText(sellingPrice.toString());
            } else {
                productNameLab.setText("Not associated with any Products!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_productCodeTxtKeyReleased

    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtKeyReleased
        String text = searchTxt.getText();
        loadSearchSalesDatas(text);

        //       loadSearchProductsDatas(text);
    }//GEN-LAST:event_searchTxtKeyReleased

    private void productCodeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productCodeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productCodeTxtActionPerformed

    private void issueCodeTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_issueCodeTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_issueCodeTxtKeyReleased

    private void printBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printBttnMouseClicked

        String code = JOptionPane.showInputDialog("Please Enter Issue Code: ");

        HashMap para = new HashMap();
        if (!code.trim().equals("")) {
            para.put("salesid", code);
            System.out.println(para);
            //portView = new ReportView();
            reportView = new ReportView("C:\\CEMS\\report\\IssueNote.jasper", para);
            reportView.setVisible(true);
        }
    }//GEN-LAST:event_printBttnMouseClicked

    public void loadDatas() {
        try {
            ProductDAO productDAO = new ProductDAO();
            table.setModel(productDAO.buildTableModel(productDAO.getSalesReportQueryResult()));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void loadSearchSalesDatas(String text) {
        try {
            ProductDAO productDAO = new ProductDAO();
            table.setModel(productDAO.buildTableModel(productDAO.getSearchSalesQueryResult(text)));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clearBttn1;
    private javax.swing.JTextField customerCodeTxt;
    private javax.swing.JLabel customerNameLab;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel deleteBttn;
    private javax.swing.JTextField issueCodeTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel printBttn;
    private javax.swing.JLabel productCodeLab;
    private javax.swing.JLabel productCodeLab1;
    private javax.swing.JLabel productCodeLab2;
    private javax.swing.JTextField productCodeTxt;
    private javax.swing.JLabel productNameLab;
    private javax.swing.JLabel purchasedDateLab;
    private javax.swing.JLabel quantityLab;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JPanel salePanel;
    private javax.swing.JTextField salesIdTxt;
    private javax.swing.JLabel searchByLab;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JLabel sellBttn;
    private javax.swing.JLabel sellingPriceLab;
    private javax.swing.JTextField sellingPriceTxt;
    private javax.swing.JLabel supplierInfoLab;
    private javax.swing.JPanel supplierInfoPanel;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
