/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.LoginDAO;

/**
 *
 * @author Tit
 */
public class LoginBUS {
    LoginDAO lgDAO = new LoginDAO();
    public boolean checkLogin(String Username,String Password){
        return lgDAO.checkLogin(Username,Password);    
    }
}
