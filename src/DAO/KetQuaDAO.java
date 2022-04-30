package DAO;

import DTO.HocSinh;
import DTO.KetQuaDTO;
import DTO.QuanLiDiemHS;
import GUI.KetQuaQGUI;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import BUS.KetQuaBUS;
import sql.MyConnection;

public class KetQuaDAO {
	private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    public ArrayList<KetQuaDTO> docKetQuaHocLuc(String maLop){
    	ArrayList<KetQuaDTO> dsKetQuaHocLuc = new ArrayList<KetQuaDTO>();
        try {			
			String sql = ("select HS.MAHS, HS.HOTEN, HS.LOP, KQ.DIEMTB, KQ.HOCLUC from HOCSINH HS, KETQUA KQ where HS.MAHS = KQ.MAHS AND  HS.LOP= '" + maLop +"'");
			connection = MyConnection.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				KetQuaDTO KQ = new KetQuaDTO();
				HocSinh hocSinh = new HocSinh();
				KQ.setMSHS(resultSet.getString(1));
				hocSinh.setHoTen(resultSet.getString(2));
				hocSinh.setLop(resultSet.getString(3));
				KQ.setDiemTrungBinh(resultSet.getFloat(4));
				KQ.setHocLuc(resultSet.getString(5));
				KQ.setHocSinh(hocSinh);
				dsKetQuaHocLuc.add(KQ);
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
                Logger.getLogger(KetQuaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dsKetQuaHocLuc;
    }
    
	public int themKetQuaHocLuc(KetQuaDTO ketQuaDTO) {
		
    	int result = 0;
		try {
			connection = MyConnection.getConnection();
			String sql = ("insert into ketqua (MAHS, DIEMTB, HOCLUC) values (?, ?, ?)");
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, ketQuaDTO.getMSHS());
			preparedStatement.setFloat(2, ketQuaDTO.getDiemTrungBinh());
			preparedStatement.setString(3, ketQuaDTO.getHocLuc());
				
			result = preparedStatement.executeUpdate();//lá»›n hÆ¡n 0 thÃ¬ thÃªm Ä‘Æ°á»£c
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
	
	public ArrayList<KetQuaDTO> doDuLieuComboBox() {
		ArrayList<KetQuaDTO> dsMaLop = new ArrayList<KetQuaDTO>();
		try {
			connection = MyConnection.getConnection();
			String sql = ("select DISTINCT LOP from HOCSINH;  ");
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			//kq.comboBox.removeAllItems();//xóa tất cả các mục được hiển thị trong comboBox

			while(resultSet.next()) {
					//đổ dữ liệu vào conboBox
					//kq.comboBox.addItem(resultSet.getString("LOP"));
				KetQuaDTO maLopHS = new KetQuaDTO();
				HocSinh hocSinh = new HocSinh();
				hocSinh.setLop(resultSet.getString(1));
				maLopHS.setHocSinh(hocSinh);
				dsMaLop.add(maLopHS);
				
			}
	            }catch (SQLException ex) {
		            System.out.println("error "+ex );
	        }
	         finally{
	            try {
	                connection.close();
	                preparedStatement.close();
	                resultSet.close();
	            } catch (SQLException ex) {
	                Logger.getLogger(QuanLyDiemHocSinhDAO.class.getName()).log(Level.SEVERE, null, ex);
	            }
	        }
		return dsMaLop;
	}
	
	public ArrayList<KetQuaDTO> laySoLuongHSKha(String maLop){
    	ArrayList<KetQuaDTO> soLuongHocSinh = new ArrayList<KetQuaDTO>();
        try {			
			String sql = ("SELECT COUNT(*) FROM KETQUA kq, HOCSINH HS WHERE HOCLUC = 'Khá' and HS.LOP = '"+ maLop +"' and HS.MAHS = kq.MAHS;");
			connection = MyConnection.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
			KetQuaDTO soluong = new KetQuaDTO();
			soluong.setSlHocSinhKha(resultSet.getString(1));
			soLuongHocSinh.add(soluong);
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
                Logger.getLogger(KetQuaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return soLuongHocSinh;
    }
	
	public ArrayList<KetQuaDTO> laySoLuongHSGioi(String maLop){
    	ArrayList<KetQuaDTO> soLuongHocSinh = new ArrayList<KetQuaDTO>();
        try {			
			String sql = ("SELECT COUNT(*) FROM KETQUA kq, HOCSINH HS WHERE HOCLUC = 'Giỏi' and HS.LOP = '"+ maLop +"' and HS.MAHS = kq.MAHS;");
			connection = MyConnection.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
			KetQuaDTO soluong = new KetQuaDTO();
			soluong.setSlHocSinhGioi(resultSet.getString(1));
			soLuongHocSinh.add(soluong);
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
                Logger.getLogger(KetQuaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return soLuongHocSinh;
    }
	
	public ArrayList<KetQuaDTO> laySoLuongHSTrungBinh(String maLop){
    	ArrayList<KetQuaDTO> soLuongHocSinh = new ArrayList<KetQuaDTO>();
        try {			
			String sql = ("SELECT COUNT(*) FROM KETQUA kq, HOCSINH HS WHERE HOCLUC = 'Trung bình' and HS.LOP = '"+ maLop +"' and HS.MAHS = kq.MAHS;");
			connection = MyConnection.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
			KetQuaDTO soluong = new KetQuaDTO();
			soluong.setSlHocSinhTrungBinh(resultSet.getString(1));
			soLuongHocSinh.add(soluong);
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
                Logger.getLogger(KetQuaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return soLuongHocSinh;
    }
	
	public ArrayList<KetQuaDTO> laySoLuongHSYeu(String maLop){
    	ArrayList<KetQuaDTO> soLuongHocSinh = new ArrayList<KetQuaDTO>();
        try {			
			String sql = ("SELECT COUNT(*) FROM KETQUA kq, HOCSINH HS WHERE HOCLUC = 'Yếu' and HS.LOP = '"+ maLop +"' and HS.MAHS = kq.MAHS;");
			connection = MyConnection.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
			KetQuaDTO soluong = new KetQuaDTO();
			soluong.setSlHocsinhYeu(resultSet.getString(1));
			soLuongHocSinh.add(soluong);
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
                Logger.getLogger(KetQuaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return soLuongHocSinh;
    }
	
	public ArrayList<KetQuaDTO> layTongSoHocSinh(String maLop){
    	ArrayList<KetQuaDTO> soLuongHocSinh = new ArrayList<KetQuaDTO>();
        try {			
			String sql = ("SELECT COUNT(*) FROM KETQUA kq, HOCSINH HS WHERE HS.LOP = '"+ maLop +"' and HS.MAHS = kq.MAHS;;");
			connection = MyConnection.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
			KetQuaDTO soluong = new KetQuaDTO();
			soluong.setTongSoHocSinh(resultSet.getString(1));
			soLuongHocSinh.add(soluong);
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
                Logger.getLogger(KetQuaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return soLuongHocSinh;
    }
	
}
