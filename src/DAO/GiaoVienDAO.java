/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.GiaoVienDTO;
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
public class GiaoVienDAO {
    
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
    ArrayList<GiaoVienDTO> dsgv = new ArrayList<>();
    public ArrayList<GiaoVienDTO> getAllGiaoVien(){
        try {
            String sqlSelectAll = "select * from GIAOVIEN";
            connection = MyConnection.getConnection();
            preparedStatement = connection.prepareStatement(sqlSelectAll);
            resultSet = preparedStatement.executeQuery();
                 
         while(resultSet.next()){
            dsgv.add(new GiaoVienDTO(resultSet.getString(1),resultSet.getString(2),formatDate.parse(resultSet.getString(3)),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7)));        
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
                Logger.getLogger(GiaoVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dsgv;
    }
    public int addGiaoVien(GiaoVienDTO gv){
        int result = 0;
        String sqlInsert = "insert into GIAOVIEN(MAGV,HOTEN,NGAYSINH,GIOITINH,QUEQUAN,LOP,IMG) values (?,?,?,?,?,?,?);";

        try {
        connection = MyConnection.getConnection();
                preparedStatement = connection.prepareStatement(sqlInsert);
                preparedStatement.setString(1, gv.getMSGV());
                preparedStatement.setString(2, gv.getHoTen());
                preparedStatement.setString(3, formatDate.format(gv.getNgaySinh()));
                preparedStatement.setString(4, gv.getGioiTinh());
                preparedStatement.setString(5, gv.getQueQuan());
                preparedStatement.setString(6, gv.getlop());
                preparedStatement.setString(7, gv.getImg());
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
     public int deleteGiaoVien(String gv){
        int result = 0;  
        String sqlDelete = "delete from GIAOVIEN where MAGV = ?";
        try {      
                connection = MyConnection.getConnection();
                preparedStatement = connection.prepareStatement(sqlDelete);
                preparedStatement.setString(1,gv);
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
     public int updateGiaoVien(GiaoVienDTO gv){
    int result = 0;
    String sqlUpdate = "update GIAOVIEN set HOTEN = ?, NGAYSINH = ?, GIOITINH = ?, QUEQUAN = ?, LOP = ?, IMG = ? where MAGV = ?";

    try { 
       connection = MyConnection.getConnection();
                preparedStatement = connection.prepareStatement(sqlUpdate);
                preparedStatement.setString(7, gv.getMSGV());
                preparedStatement.setString(1, gv.getHoTen());
                preparedStatement.setString(2, formatDate.format(gv.getNgaySinh()));
                preparedStatement.setString(3, gv.getGioiTinh());
                preparedStatement.setString(4, gv.getQueQuan());
                preparedStatement.setString(5, gv.getlop());
                preparedStatement.setString(6, gv.getImg());
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
    public ArrayList<GiaoVienDTO> searchGiaoVienMSGV(String MSGV){
        try {
            String sqlSelectAll = "select * from GIAOVIEN";
            connection = MyConnection.getConnection();
            preparedStatement = connection.prepareStatement(sqlSelectAll);
            resultSet = preparedStatement.executeQuery();
         while(resultSet.next()){
            if (resultSet.getString(1).contains(MSGV))   
            dsgv.add(new GiaoVienDTO(resultSet.getString(1),resultSet.getString(2),formatDate.parse(resultSet.getString(3)),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7)));        
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
                Logger.getLogger(GiaoVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dsgv;
    }
     public ArrayList<GiaoVienDTO> searchGiaoVienHoTen(String HoTen){
        try {
            String sqlSelectAll = "select * from GIAOVIEN";
            connection = MyConnection.getConnection();
            preparedStatement = connection.prepareStatement(sqlSelectAll);
        
            resultSet = preparedStatement.executeQuery();
         while(resultSet.next()){
            if (resultSet.getString(2).contains(HoTen))
            dsgv.add(new GiaoVienDTO(resultSet.getString(1),resultSet.getString(2),formatDate.parse(resultSet.getString(3)),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7)));        
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
                Logger.getLogger(GiaoVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dsgv;
    }
     public ArrayList<GiaoVienDTO> searchGiaoVienNgaySinh(String NgaySinh){
        try {
            String sqlSelectAll = "select * from GIAOVIEN";
            connection = MyConnection.getConnection();
            preparedStatement = connection.prepareStatement(sqlSelectAll);
        
            resultSet = preparedStatement.executeQuery();
         while(resultSet.next()){
            if (resultSet.getString(3).contains(NgaySinh))
            dsgv.add(new GiaoVienDTO(resultSet.getString(1),resultSet.getString(2),formatDate.parse(resultSet.getString(3)),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7)));        
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
                Logger.getLogger(GiaoVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dsgv;
    }
     public ArrayList<GiaoVienDTO> searchGiaoVienGioiTinh(String GioiTinh){
        try {
            String sqlSelectAll = "select * from GIAOVIEN ";
            connection = MyConnection.getConnection();
            preparedStatement = connection.prepareStatement(sqlSelectAll);
            resultSet = preparedStatement.executeQuery();
         while(resultSet.next()){
             if (resultSet.getString(4).contains(GioiTinh))
            dsgv.add(new GiaoVienDTO(resultSet.getString(1),resultSet.getString(2),formatDate.parse(resultSet.getString(3)),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7)));        
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
                Logger.getLogger(GiaoVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dsgv;
    }
     public ArrayList<GiaoVienDTO> searchGiaoVienQueQuan(String QueQuan){
        try {
            String sqlSelectAll = "select * from GIAOVIEN ";
            connection = MyConnection.getConnection();
            preparedStatement = connection.prepareStatement(sqlSelectAll);
            resultSet = preparedStatement.executeQuery();
         while(resultSet.next()){
             if (resultSet.getString(5).contains(QueQuan))
            dsgv.add(new GiaoVienDTO(resultSet.getString(1),resultSet.getString(2),formatDate.parse(resultSet.getString(3)),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7)));        
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
                Logger.getLogger(GiaoVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dsgv;
    }
     public ArrayList<GiaoVienDTO> searchGiaoVienLop(String Lop){
        try {
            String sqlSelectAll = "select * from GIAOVIEN ";
            connection = MyConnection.getConnection();
            preparedStatement = connection.prepareStatement(sqlSelectAll);
            resultSet = preparedStatement.executeQuery();
         while(resultSet.next()){
             if (resultSet.getString(6).contains(Lop))
            dsgv.add(new GiaoVienDTO(resultSet.getString(1),resultSet.getString(2),formatDate.parse(resultSet.getString(3)),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7)));        
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
                Logger.getLogger(GiaoVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dsgv;
    }
}
