/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.HocSinh;
import DTO.LopHoc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class LopHocDAO {
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    ArrayList<LopHoc> dslh = new ArrayList<>();
    ArrayList<HocSinh> dshs = new ArrayList<>();
    SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

    public ArrayList<LopHoc> getAllLopHoc(){
        try {
            String sqlSelectAll = "select * from LOPHOC";
            connection = MyConnection.getConnection();
            preparedStatement = connection.prepareStatement(sqlSelectAll);
            resultSet = preparedStatement.executeQuery();
                 
         while(resultSet.next()){
            dslh.add(new LopHoc(resultSet.getString(1),resultSet.getString(2)));        
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
                Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dslh;
    }
    public ArrayList<HocSinh> getAllHocSinh(String tenLop){
        try {
            String sqlSelectAll = "select * from HOCSINH where LOP = ?";
            connection = MyConnection.getConnection();
            preparedStatement = connection.prepareStatement(sqlSelectAll);
            preparedStatement.setString(1, tenLop);
            resultSet = preparedStatement.executeQuery();
                 
         while(resultSet.next()){
                try {        
                    dshs.add(new HocSinh(resultSet.getString(1),resultSet.getString(2),formatDate.parse(resultSet.getString(3)),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7)));
                } catch (ParseException ex) {
                    Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
                }

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
                Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dshs;
    }
    public int addLopHoc(LopHoc lh){
        int result = 0;
        String sqlInsert = "insert into LOPHOC(MALOP,TENLOP) values (?,?);";

        try {
        connection = MyConnection.getConnection();
                preparedStatement = connection.prepareStatement(sqlInsert);
                preparedStatement.setString(1, lh.getMaLop());
                preparedStatement.setString(2, lh.getTenLop());
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
    
    public int delLopHoc(LopHoc lh){
        int result = 0;  
        int result2 =0;
        String sqlDelete = "delete from LOPHOC where MALOP = ?;";
        String sqlDelete2 = "delete from HOCSINH where LOP = ?;";
        try {      
                connection = MyConnection.getConnection();
                preparedStatement = connection.prepareStatement(sqlDelete);
                 preparedStatement.setString(1,lh.getMaLop());
                result = preparedStatement.executeUpdate(); 
                PreparedStatement preparedStatement2 = connection.prepareStatement(sqlDelete2);
                preparedStatement2.setString(1,lh.getTenLop());
                result2 = preparedStatement2.executeUpdate(); 
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
}
