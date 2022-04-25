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
            String sqlSelectAll = "select * from HOCSINH";
            connection = MyConnection.getConnection();
            preparedStatement = connection.prepareStatement(sqlSelectAll);
            resultSet = preparedStatement.executeQuery();
                 
         while(resultSet.next()){
            dshs.add(new HocSinh(resultSet.getString(1),resultSet.getString(2),formatDate.parse(resultSet.getString(3)),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7)));        
         }
         
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
    public int addHocSinh(HocSinh hs){
        int result = 0;
        String sqlInsert = "insert into HOCSINH(MAHS,HOTEN,NGAYSINH,GIOITINH,QUEQUAN,LOP,IMG) values (?,?,?,?,?,?,?);";

        try {
        connection = MyConnection.getConnection();
                preparedStatement = connection.prepareStatement(sqlInsert);
                preparedStatement.setString(1, hs.getMSHS());
                preparedStatement.setString(2, hs.getHoTen());
                preparedStatement.setString(3, formatDate.format(hs.getNgaySinh()));
                preparedStatement.setString(4, hs.getGioiTinh());
                preparedStatement.setString(5, hs.getQueQuan());
                preparedStatement.setString(6, hs.getLop());
                preparedStatement.setString(7, hs.getImg());
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
     public int deleteHocSinh(String ms){
        int result = 0;  
        String sqlDelete = "delete from HOCSINH where MAHS = ?";
        try {      
                connection = MyConnection.getConnection();
                preparedStatement = connection.prepareStatement(sqlDelete);
                preparedStatement.setString(1,ms);
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
     public int updateHocSinh(HocSinh hs){
    int result = 0;
    String sqlUpdate = "update HOCSINH set HOTEN = ?, NGAYSINH = ?, GIOITINH = ?, QUEQUAN = ?, LOP = ?, IMG = ? where MAHS = ?";

    try { 
       connection = MyConnection.getConnection();
                preparedStatement = connection.prepareStatement(sqlUpdate);
                preparedStatement.setString(7, hs.getMSHS());
                preparedStatement.setString(1, hs.getHoTen());
                preparedStatement.setString(2, formatDate.format(hs.getNgaySinh()));
                preparedStatement.setString(3, hs.getGioiTinh());
                preparedStatement.setString(4, hs.getQueQuan());
                preparedStatement.setString(5, hs.getLop());
                preparedStatement.setString(6, hs.getImg());
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
}
