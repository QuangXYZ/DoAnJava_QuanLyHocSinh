package DAO;

import DTO.HocSinh;
import DTO.QuanLiDiemHS;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.MyConnection;

public class QuanLyDiemHocSinhDAO {
	    
	    private Connection connection = null;
	    private PreparedStatement preparedStatement = null;
	    private ResultSet resultSet = null;
	    //SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
	    ArrayList<QuanLiDiemHS> dsDiemHocSinh = new ArrayList<QuanLiDiemHS>();
	    public ArrayList<QuanLiDiemHS> docDiemHocSinh(){
	        try {
	        	connection = MyConnection.getConnection();
				String sql = ("SELECT HS.MAHS, HS.HOTEN, DHS.TOAN, DHS.ANH, DHS.VAN, DHS.SINH, DHS.LI, DHS.HOA FROM HOCSINH HS, DIEMHOCSINH DHS WHERE HS.MAHS = DHS.MAHS");
				preparedStatement = connection.prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
				while(resultSet.next()) {
					QuanLiDiemHS diemHS = new QuanLiDiemHS();
					HocSinh hocSinh = new HocSinh();
					diemHS.setMSHS(resultSet.getString(1));
					hocSinh.setHoTen(resultSet.getString(2));
					diemHS.setToan(resultSet.getFloat(3));
					diemHS.setVan(resultSet.getFloat(4));
					diemHS.setAnh(resultSet.getFloat(5));
					diemHS.setSinh(resultSet.getFloat(6));
					diemHS.setLy(resultSet.getFloat(7));
					diemHS.setHoa(resultSet.getFloat(8));
					diemHS.setHocSinh(hocSinh);
					dsDiemHocSinh.add(diemHS);
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
	                Logger.getLogger(QuanLyDiemHocSinhDAO.class.getName()).log(Level.SEVERE, null, ex);
	            }
	        }
	        return dsDiemHocSinh;
	    }
	    
	    public int themDiemHocSinh(QuanLiDiemHS diemHS) {
	    	int result = 0;
			try {
				connection = MyConnection.getConnection();
				String sql = ("insert into DIEMHOCSINH (MAHS, TOAN, ANH, VAN, SINH, LI, HOA) value(?, ?, ?, ?, ?, ?, ?)");
				preparedStatement = connection.prepareStatement(sql);
				
				preparedStatement.setString(1, diemHS.getMSHS());
				preparedStatement.setFloat(2, diemHS.getToan());
				preparedStatement.setFloat(3, diemHS.getAnh());
				preparedStatement.setFloat(4, diemHS.getVan());
				preparedStatement.setFloat(5, diemHS.getSinh());
				preparedStatement.setFloat(6, diemHS.getLy());
				preparedStatement.setFloat(7, diemHS.getHoa());				
				result = preparedStatement.executeUpdate();;//lớn hơn 0 thì thêm được
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
	    
	    public int xoaDiemHocSinh(QuanLiDiemHS diemHS) {
	    	int result = 0;
			try {
				connection = MyConnection.getConnection();
				String sql = ("delete from DIEMHOCSINH where MAHS = ?");
				preparedStatement = connection.prepareStatement(sql);
				
				preparedStatement.setString(1, diemHS.getMSHS());
				
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
	    
	    public int suaDiemHocSinh(QuanLiDiemHS diemHS) {
	    	int result = 0;
			try {
				connection = MyConnection.getConnection();
				String sql = ("update DIEMHOCSINH set TOAN = ?, ANH = ?, VAN = ?, SINH = ?, LI = ?, HOA = ?" + "where MAHS = ?");
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setFloat(1, diemHS.getToan());
				preparedStatement.setFloat(2, diemHS.getAnh());
				preparedStatement.setFloat(3, diemHS.getVan());
				preparedStatement.setFloat(4, diemHS.getSinh());
				preparedStatement.setFloat(5, diemHS.getLy());
				preparedStatement.setFloat(6, diemHS.getHoa());
				preparedStatement.setString(7, diemHS.getMSHS());
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
	    
	    public ArrayList<QuanLiDiemHS> timDiemHocSinh(String mshs){
			 ArrayList<QuanLiDiemHS> dsDiemHS = new ArrayList<QuanLiDiemHS>();
			 try {
				 	connection = MyConnection.getConnection();
					String sql = ("select HS.MAHS, HS.HOTEN, TOAN, ANH, VAN, SINH, LI, HOA FROM HOCSINH HS, DIEMHOCSINH DHS WHERE HS.MAHS = DHS.MAHS AND DHS.MAHS = ?");
					preparedStatement = connection.prepareStatement(sql);
					preparedStatement.setString(1, mshs);
					resultSet = preparedStatement.executeQuery();
					while(resultSet.next()) {
						QuanLiDiemHS diemHS = new QuanLiDiemHS();
						HocSinh hocSinh = new HocSinh();
						diemHS.setMSHS(resultSet.getString(1));
						hocSinh.setHoTen(resultSet.getString(2));
						diemHS.setToan(resultSet.getFloat(3));
						diemHS.setVan(resultSet.getFloat(4));
						diemHS.setAnh(resultSet.getFloat(5));
						diemHS.setSinh(resultSet.getFloat(6));
						diemHS.setLy(resultSet.getFloat(7));
						diemHS.setHoa(resultSet.getFloat(8));
						diemHS.setHocSinh(hocSinh);
						dsDiemHS.add(diemHS);
					}
					connection.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			 return dsDiemHS;
			}
	    
	  //lay ma hoc sinh trong bang DIEMHOCSINH sql
	  		public  ArrayList<String> layMaHocSinh(){
	  			ArrayList<String> listMSHS = new ArrayList<>();						
	  				try {				
	  				connection = MyConnection.getConnection();
	  				Statement stmt=connection.createStatement();
	  				ResultSet rs = stmt.executeQuery("select MAHS from HOCSINH  ");
	  		
	  				while(rs.next())
	  	            {
	  					String maHocSinh = new String(rs.getString("MAHS"));               
	  					listMSHS.add(maHocSinh);
	  	            }
	  					
	  				} catch (Exception e) {
	  					System.out.println(e);
	  				}
	  				
	  				return listMSHS;
	  		}
	  		
	  		public float tinhTrungBinh(float a, float b, float c, float d, float e, float f) {
	  			float trungBinh = (float)Math.round(((a + b + c + d + e + f)/6)*100) / 100;		
	  			return trungBinh;
	  		}

}