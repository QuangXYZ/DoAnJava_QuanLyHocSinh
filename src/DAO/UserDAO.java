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
    public ArrayList<User> getAllHocSinh(){
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
    
}
