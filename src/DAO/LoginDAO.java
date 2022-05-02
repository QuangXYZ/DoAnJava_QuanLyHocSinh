/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import sql.MyConnection;

/**
 *
 * @author Tit
 */
public class LoginDAO {
    public boolean checkLogin(String Username,String Password){
         try{     
            Connection con = MyConnection.getConnection();
            System.out.println("Connect success");
            Statement s=con.createStatement();
            ResultSet rs =s.executeQuery("SELECT * FROM USERS");
            while(rs.next()){
                if (rs.getString(1).equals(Username)&&rs.getString(2).equals(Password)){
                    con.close();
                    return true;
                    
                }
            }
        } catch(Exception e){
            System.out.println("Connect Error "+e);
        } 
        return false;
    }
}
