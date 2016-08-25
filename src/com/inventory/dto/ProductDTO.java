/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.dto;

import com.inventory.dao.ProductDAO;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class ProductDTO {

    private String productId;
    private int poid;
    private String productCode;
    private String oldproductCode;
    private String date;
    private String sellDate;
    private String supplierCode;
    private String productName;
    private int quantity;
    private double costPrice;
    private double sellingPrice;
    private String brand;
    private String description;
    private int userId;
    private String customersName;

    public String getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(String purchaseID) {
        this.purchaseID = purchaseID;
    }
    private String customerCode;
    private Double totalCost;
    private Double totalRevenue;
    private String purchaseID;

    public int getPoid() {
        return poid;
    }

    public void setPoid(int poid) {
        this.poid = poid;
    }

    public String getProductId() {
        return productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getOldproductCode() {
        return oldproductCode;
    }

    public void setOldproductCode(String oldproductCode) {
        this.oldproductCode = oldproductCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSellDate() {
        return sellDate;
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public ResultSet getSuppliersName() {
        ResultSet rs = new ProductDAO().getSuppliersInfo();
        return rs;
    }

    public ResultSet getCustomersName() {
        ResultSet rs = new ProductDAO().getCustomersInfo();
        return rs;
    }

    public ResultSet getProductsName() {
        ResultSet rs = new ProductDAO().getProductInfo();
        return rs;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(Double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

}
