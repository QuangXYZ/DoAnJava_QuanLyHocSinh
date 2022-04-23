/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.HocSinh;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
    ArrayList<HocSinh> dshs = new ArrayList<>();
    public ArrayList<HocSinh> getAllHocSinh(){
        try {
            ArrayList<HocSinh> dshs = new ArrayList<>();
            String sqlSelectAll = "select * from HOCSINH";
            connection = MyConnection.getConnection();
            preparedStatement = connection.prepareStatement(sqlSelectAll);
            resultSet = preparedStatement.executeQuery();
         dshs.add(new HocSinh("129","Quang",formatDate.parse("12/06/2002"),"Nam","Hà Nội","DCT1205","none"));        
         while(resultSet.next()){
            dshs.add(new HocSinh(resultSet.getString(1),resultSet.getString(2),formatDate.parse(resultSet.getString(3)),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7)));        
         }
         System.out.println("dshs "+dshs.get(0).getHoTen());
        } catch (SQLException ex) {
            System.out.println("error "+ex );
        } catch (ParseException ex) {
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
        return dshs;
    }

    
}
