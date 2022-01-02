/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransaksiDermaga.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hanvito Michael Lee
 */
public class Database {

    static final String DB_URL = "jdbc:mysql://localhost/transaksi_dermaga";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public void connectDB() {
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void disconnectDB() throws SQLException{
        this.conn.close();
    }
    
    
}
