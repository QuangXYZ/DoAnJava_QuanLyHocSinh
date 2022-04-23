/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Tit
 */
public class MyConnection {
    public static String dbUrl ="jdbc:mysql://localhost:3306/qlhs";      
    public static String username="root";
    public static String password=  "12345678";
    public static Connection getConnection() {
        try {
          return DriverManager.getConnection(dbUrl,username,password);
        } catch (Exception ex) {
           return null;
        }
    }
    public static void main(String[] args) {
        MyConnection.getConnection();
    }
}

