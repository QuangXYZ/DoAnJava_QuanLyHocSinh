package DAO;

import DTO.HocSinhDTO;
import DTO.KetQuaDTO;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import sql.MyConnection;


public class KetQuaDAO {
	private Connection connection = null;
    private PreparedStatement preparedStatement = null, preparedStatement2 = null, preparedStatement3 = null, preparedStatement4 = null, preparedStatement5 = null, preparedStatement6 = null;
    private ResultSet resultSet = null, resultSet2 = null, resultSet3 = null, resultSet4 = null, resultSet5 = null, resultSet6 = null;
    
    public ArrayList<KetQuaDTO> docKetQuaHocLuc(String maLop){
    	ArrayList<KetQuaDTO> dsKetQuaHocLuc = new ArrayList<KetQuaDTO>();
        try {			
			String sql = ("select HS.MAHS, HS.HOTEN, HS.LOP, KQ.DIEMTB, KQ.HOCLUC from HOCSINH HS, KETQUA KQ where HS.MAHS = KQ.MAHS AND  HS.LOP= '" + maLop +"'");
			connection = MyConnection.getConnection();//Kết nối csdl
			preparedStatement = connection.prepareStatement(sql);// gửi sql đến cơ sở dữ liệu và thực thi 
			resultSet = preparedStatement.executeQuery();//resultSet: truy cập dữ liệu trả về từ csdl,executeQuery: sử dụng cho câu lệnh sql select 
			while(resultSet.next()) {// di chuyển con trỏ đến dòng kế, 
				KetQuaDTO KQ = new KetQuaDTO();
				HocSinhDTO hocSinh = new HocSinhDTO();
				KQ.setMSHS(resultSet.getString(1));
				hocSinh.setHoTen(resultSet.getString(2));
				hocSinh.setLop(resultSet.getString(3));
				KQ.setDiemTrungBinh(resultSet.getFloat(4));
				KQ.setHocLuc(resultSet.getString(5));
				KQ.setHocSinh(hocSinh);
				dsKetQuaHocLuc.add(KQ);
			}
         
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         finally{
            try {
                connection.close();//thực hiện đóng kết nối
                preparedStatement.close();
                resultSet.close();
            } catch (SQLException ex) {//xử lý ngoại lệ khi thao tác với sql
                Logger.getLogger(KetQuaDAO.class.getName()).log(Level.SEVERE, null, ex);//phương pháp, nó cung cấp một phương tiện xử lý ngoại lệ (ghi nhật ký)
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
				
			result = preparedStatement.executeUpdate();//Sử dụng cho cậu lệnh sql update, trả về giá trị 0 cho các câu sql không có kết quả gì
			
		}catch (SQLException e) {
            e.printStackTrace();//in ra vị trí xảy ra ngoại lệ
        }
        finally{
            try {
                connection.close();//Thực hiện đóng kết nối
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }  
	
	public int suaKetQuaHocLuc(KetQuaDTO ketQuaDTO) {
    	int result = 0;
		try {
			connection = MyConnection.getConnection();
			String sql = ("update KETQUA set DIEMTB = ?, HOCLUC = ?" + "where MAHS = ?");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(3, ketQuaDTO.getMSHS());
			preparedStatement.setFloat(1, ketQuaDTO.getDiemTrungBinh());
			preparedStatement.setString(2, ketQuaDTO.getHocLuc());
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
	
	public ArrayList<KetQuaDTO> doDuLieuComboBox() {
		ArrayList<KetQuaDTO> dsMaLop = new ArrayList<KetQuaDTO>();
		try {
			connection = MyConnection.getConnection();
			String sql = ("select DISTINCT LOP from HOCSINH;  ");
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				KetQuaDTO maLopHS = new KetQuaDTO();
				HocSinhDTO hocSinh = new HocSinhDTO();
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
    public int xoaKetQua(KetQuaDTO ms){
        int result = 0;  
        String sqlDelete = "delete from KETQUA where MAHS = ?";
        try {      
                connection = MyConnection.getConnection();
                preparedStatement = connection.prepareStatement(sqlDelete);
                //preparedStatement.setString(1,ms);
                preparedStatement.setString(1, ms.getMSHS());
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
    
    public int xuatFileExcel(String maLop)   {
    	int result = 0;
    	try {
			String sql2 = ("SELECT COUNT(*) FROM KETQUA kq, HOCSINH HS WHERE HOCLUC = 'Khá' and HS.LOP = '"+ maLop +"' and HS.MAHS = kq.MAHS;");
			String sql = ("select HS.MAHS, HS.HOTEN, HS.LOP, KQ.DIEMTB, KQ.HOCLUC from HOCSINH HS, KETQUA KQ where HS.MAHS = KQ.MAHS AND  HS.LOP= '" + maLop +"'");
			String sql3 = ("SELECT COUNT(*) FROM KETQUA kq, HOCSINH HS WHERE HS.LOP = '"+ maLop +"' and HS.MAHS = kq.MAHS;");
			String sql4 = ("SELECT COUNT(*) FROM KETQUA kq, HOCSINH HS WHERE HOCLUC = 'Giỏi' and HS.LOP = '"+ maLop +"' and HS.MAHS = kq.MAHS;");
			String sql5 = ("SELECT COUNT(*) FROM KETQUA kq, HOCSINH HS WHERE HOCLUC = 'Trung bình' and HS.LOP = '"+ maLop +"' and HS.MAHS = kq.MAHS;");
			String sql6 = ("SELECT COUNT(*) FROM KETQUA kq, HOCSINH HS WHERE HOCLUC = 'Yếu' and HS.LOP = '"+ maLop +"' and HS.MAHS = kq.MAHS;");
			
			connection = MyConnection.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			preparedStatement2 = connection.prepareStatement(sql2);
			resultSet2 = preparedStatement2.executeQuery();
			preparedStatement3 = connection.prepareStatement(sql3);			
			resultSet3 = preparedStatement3.executeQuery();
			preparedStatement4 = connection.prepareStatement(sql4);			
			resultSet4 = preparedStatement4.executeQuery();
			preparedStatement5 = connection.prepareStatement(sql5);			
			resultSet5 = preparedStatement5.executeQuery();
			preparedStatement6 = connection.prepareStatement(sql6);			
			resultSet6 = preparedStatement6.executeQuery();
			 // tạo đối tượng XSSFWorkbook
			 XSSFWorkbook wb = new XSSFWorkbook();
			 //Tạo một sheet và đặt tên bảng tính
			 XSSFSheet sheet = wb.createSheet("DanhSachHocSinh");
			 //Tạo đối tượng XSSFRow, tham số đầu vào là chỉ số hàng
			 XSSFRow header3 = sheet.createRow(0);
			 header3.createCell(0).setCellValue("Tổng số học sinh:");
			 while(resultSet3.next()) {
				 header3.createCell(2).setCellValue(resultSet3.getString(1)); 
			 }
			 
			 XSSFRow header2 = sheet.createRow(1);
			 header2.createCell(0).setCellValue("Số lượng hoc sinh khá:");
			 while(resultSet2.next()) {
				 header2.createCell(3).setCellValue(resultSet2.getString(1)); 
			 }
			 
			 XSSFRow header4 = sheet.createRow(2);
			 header4.createCell(0).setCellValue("Số lượng học sinh giỏi:");
			 while(resultSet4.next()) {
				 header4.createCell(3).setCellValue(resultSet4.getString(1)); 
			 }
			 
			 XSSFRow header5 = sheet.createRow(3);
			 header5.createCell(0).setCellValue("Số lượng học sinh trung bình:");
			 while(resultSet5.next()) {
				 header5.createCell(3).setCellValue(resultSet5.getString(1)); 
			 }
			 
			 XSSFRow header6 = sheet.createRow(4);
			 header6.createCell(0).setCellValue("Số lượng học sinh yếu:");
			 while(resultSet6.next()) {
				 header6.createCell(3).setCellValue(resultSet6.getString(1)); 
			 }
			 
			 XSSFRow header = sheet.createRow(6);
			 header.createCell(0).setCellValue("MAHS");
			 header.createCell(1).setCellValue("HỌ VÀ TÊN");
			 header.createCell(3).setCellValue("LỚP");
			 header.createCell(4).setCellValue("ĐIỂM TRUNG BÌNH");
			 header.createCell(6).setCellValue("HỌC LỰC");
			 
			 int index = 7;
			 while(resultSet.next()) {
				 XSSFRow row = sheet.createRow(index);
				 row.createCell(0).setCellValue(resultSet.getString(1));
				 row.createCell(1).setCellValue(resultSet.getString(2));
				 row.createCell(3).setCellValue(resultSet.getString(3));
				 row.createCell(4).setCellValue(resultSet.getString(4));
				 row.createCell(6).setCellValue(resultSet.getString(5));
				 index++;
			 }
			 //đặt tên file excel khi xuất
			 FileOutputStream fileOut = new FileOutputStream(maLop+".xlsx");
			 wb.write(fileOut);//Thực hiện lưu thông tin với đối tượng fileOut
			 fileOut.close();
			 wb.close();
				//JOptionPane.showMessageDialog(null, "Xuất file excel thành công ! ");	
			 	 result =1;
				 preparedStatement.close();
				 resultSet.close();
			 } catch (SQLException ex) {
				//JOptionPane.showMessageDialog(null, "Xuất file excel không thành công ! ");
				 result = 0;
				ex.printStackTrace();
				
			 } catch (IOException e) { //bắt ngoại lệ khi đọc ghi file không được
				 result = 0;
				//JOptionPane.showMessageDialog(null, "Xuất file excel không thành công ! ");
				e.printStackTrace();
				 				 
			}
    	
    		return result;
    	//https://www.youtube.com/watch?v=ktwMW13FrQM&ab_channel=Murtaza%27sWorkshop-RoboticsandAI
    }
    
    /*public int xuatFileExcel(String maLop)   {
    	int result = 0;
    	try {			
			String sql = ("select HS.MAHS, HS.HOTEN, HS.LOP, KQ.DIEMTB, KQ.HOCLUC from HOCSINH HS, KETQUA KQ where HS.MAHS = KQ.MAHS AND  HS.LOP= '" + maLop +"'");
			connection = MyConnection.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			
			 File file = new File("petycash.xlsx");

			 MemPOI memPOI = MempoiBuilder.aMemPOI()
	                    .withFile(file)
	                    .addMempoiSheet(new MempoiSheet(preparedStatement))
	                    .build();
			 CompletableFuture<String> fut = memPOI.prepareMempoiReportToFile();
			 String absoluteFileName = fut.get();
			 	
		    } catch (Exception e) {
		        e.printStackTrace();
		    }	 
				 
    	
    	return result;
    }*/
}
