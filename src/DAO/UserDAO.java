/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import DTO.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.MyConnection;

/**
 *
 * @author Tit
 */
public class UserDAO {
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    ArrayList<User> dsUser = new ArrayList<>();
    public ArrayList<User> getAllUser(){
        try {
            String sqlSelectAll = "select * from USERS";
            connection = MyConnection.getConnection();
            preparedStatement = connection.prepareStatement(sqlSelectAll);
            resultSet = preparedStatement.executeQuery();
                 
         while(resultSet.next()){
            dsUser.add(new User(resultSet.getString(1),resultSet.getString(2),resultSet.getInt(3)));      
             
         }
         
        } catch (SQLException ex) {
            System.out.println("error "+ex );
        } 
         finally{
            try {
                connection.close();
                preparedStatement.close();
                resultSet.close();
            } catch (SQLException ex) {
                Logger.getLogger(HocSinhDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dsUser;
    }
    public int addUser(User us){
        int result = 0;
        String sqlInsert = "insert into USERS(USERNAME,USERPASSWORD,USERLEVEL) values (?,?,?);";

        try {
        connection = MyConnection.getConnection();
                preparedStatement = connection.prepareStatement(sqlInsert);
                preparedStatement.setString(1, us.getUserName());
                preparedStatement.setString(2, us.getPassWord());
                preparedStatement.setInt(3, us.getLevel());
                result = preparedStatement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            try {
                connection.close();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }  
    public int delUser(String Username){
        int result = 0;  
        String sqlDelete = "delete from USERS where USERNAME = ?";
        try {      
                connection = MyConnection.getConnection();
                preparedStatement = connection.prepareStatement(sqlDelete);
                preparedStatement.setString(1,Username);
                result = preparedStatement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
        try {
            connection.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            }
        }
        return result;
    }
     public ArrayList<User> search(String Username){
        try {
            String sqlSelectAll = "select * from Users;";
            connection = MyConnection.getConnection();
            preparedStatement = connection.prepareStatement(sqlSelectAll);
            resultSet = preparedStatement.executeQuery();
         while(resultSet.next()){
            if (resultSet.getString(1).contains(Username))  
            dsUser.add(new User(resultSet.getString(1),resultSet.getString(2),resultSet.getInt(3)));             }
         
        } catch (SQLException ex) {
            System.out.println("error "+ex );
        }
         finally{
            try {
                connection.close();
                preparedStatement.close();
                resultSet.close();
            } catch (SQLException ex) {
                Logger.getLogger(HocSinhDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dsUser;
    }
    public boolean checkAdmin(String Username){
         try {
            String sqlSelectAll = "select * from Users where Username = ?;";
            connection = MyConnection.getConnection();
            preparedStatement = connection.prepareStatement(sqlSelectAll);
            preparedStatement.setString(1, Username);
            resultSet = preparedStatement.executeQuery();
         while(resultSet.next()){
            if (resultSet.getInt(3) == 0)  return true;
            else return false ;           
         }
         
        } catch (SQLException ex) {
            System.out.println("error "+ex );
        }
         finally{
            try {
                connection.close();
                preparedStatement.close();
                resultSet.close();
            } catch (SQLException ex) {
                Logger.getLogger(HocSinhDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
}
