/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.UserDAO;
import DTO.UserDTO;
import java.util.ArrayList;

/**
 *
 * @author Tit
 */
public class UserBUS {
    UserDAO userDAO = new UserDAO();
    public ArrayList<UserDTO> getAllUser(){
        return userDAO.getAllUser();
    }
    public int addUser(UserDTO us){
        return userDAO.addUser(us);
    }

    public int delUser(String Username) {
        return userDAO.delUser(Username);       
    }
    public ArrayList<UserDTO> search(String Username){
        return userDAO.search(Username);
    }
    public boolean checkAdmin(String Username){
        return userDAO.checkAdmin(Username);
    }
     public boolean checkLogin(String Username,String Password){
        return userDAO.checkLogin(Username,Password);    
    }
    
    
}
