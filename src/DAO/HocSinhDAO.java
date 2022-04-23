/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.HocSinh;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.MyConnection;

/**
 *
 * @author Tit
 */
public class HocSinhDAO {
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    ArrayList<HocSinh> dshs = new ArrayList<>();
    public ArrayList<HocSinh> getAllUsers(){
        try {
            ArrayList<HocSinh> dshs = new ArrayList<>();
            String sqlSelectAll = "select * from HOCSINH";
            connection = MyConnection.getConnection();
            preparedStatement = connection.prepareStatement(sqlSelectAll);
            resultSet = preparedStatement.executeQuery();
         while(resultSet.next()){
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhDAO.class.getName()).log(Level.SEVERE, null, ex);
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
        return dshs;
    }
}
