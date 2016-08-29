/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymangagementsystem;

/**
 *
 * @author CHATHURA
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class configurations {

    static OutputStream output = null;
    static Properties prop;

    public static void main(String[] args) {

        prop = new Properties();
        try {
            output = new FileOutputStream("");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Cannot find propert file!!");
        }

        prop.setProperty("database", "ims");
        prop.setProperty("port", "3306");
        prop.setProperty("dbuser", "root");
        prop.setProperty("dbpassword", "root");
        prop.setProperty("mySQL_path", "C:\\Program Files\\MySQL\\MySQL Server 5.6\\bin");
        prop.setProperty("backup_path", "");

        try {
            //save properties to project root folder
            prop.store(output, null);
        } catch (IOException ex) {
            Logger.getLogger(configurations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public configurations() {
        prop = new Properties();
        try {
            output = new FileOutputStream("config/config.properties");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Cannot find propert file!!");
        }
    }

    public void setDBProperties(String host, String port, String un, String pw) {

        //set the properties value
        prop.setProperty("database", host);
        prop.setProperty("port", port);
        prop.setProperty("dbuser", un);
        prop.setProperty("dbpassword", pw);
        prop.setProperty("mySQL_path", "C:\\Program Files\\MySQL\\MySQL Server 5.6\\bin");

        try {
            //save properties to project root folder
            prop.store(output, null);
        } catch (IOException ex) {
            Logger.getLogger(configurations.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void setBackupProperties(String path) {

        prop.setProperty("backup_path", path);
        try {
            //save properties to project root folder
            prop.store(output, null);
        } catch (IOException ex) {
            Logger.getLogger(configurations.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
