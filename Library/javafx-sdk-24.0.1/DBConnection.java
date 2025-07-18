/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xemacscode.demo;
import java.sql.*;

/**
 *
 * @author mdana
 */
public class DBConnection {
    
    // we need to set the connector first.
    static final String DB_URL = "jdbc:mysql://localhost/demo";
    static final String USER = "root";
    static final String PASS = "";
    
    
    public static Connection connectDB(){
        
        Connection conn = null;
        
        try{
            // register jdbc driver, not required for newer version of jdk.
            //Class.forName("com.mysql.jdbc.Driver");
            
            // open a connection.
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            return conn;
            
        }catch(Exception ex){
            
            System.out.println("There were errors while connecting to Database.");
            
            return null;
        }
    }
    
}
