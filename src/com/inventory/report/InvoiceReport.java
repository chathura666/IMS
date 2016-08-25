/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.report;

import com.inventory.database.ConnectionFactory;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author CHATHURA
 */
public class InvoiceReport {
    
    String m_report_source = "report1.jrxml";
    String m_sql_stmt = "SELECT prod.productcode,prod.productname,prod.brand,pu.quantity,prod.costprice,pu.totalcost FROM ims.products prod,ims.purchaseinfo pu\n" +
"WHERE prod.productcode = pu.productcode AND suppliercode = 'sup1'";
    Map parametersMap = new HashMap();

    protected void showReport() throws JRException, ClassNotFoundException {
        ConnectionFactory con = new ConnectionFactory();
        InputStream is = getClass().getResourceAsStream(m_report_source);
        JRDesignQuery jrDesignQuery = new JRDesignQuery();
        jrDesignQuery.setText(m_sql_stmt);
        JasperDesign jasperDesign = JRXmlLoader.load(is);
        jasperDesign.setQuery(jrDesignQuery);
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMap, con.getConnection());
        JasperViewer.viewReport(jasperPrint, false);
    }
    
    public static void main(String[] args) throws JRException, ClassNotFoundException {
        InvoiceReport rp = new InvoiceReport();
        
        rp.showReport();
    }
    
}
