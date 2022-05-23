package DTO;

import java.util.Date;

import javax.xml.crypto.Data;

public class NguoiDTO {

	private String hoTen;
	private String gioiTinh;
	private String queQuan;
	private Date ngaySinh;
	
	public NguoiDTO() {
		
	}
	
	
	public NguoiDTO(String hoTen, String gioiTinh, String queQuan, Date ngaySinh) {
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.queQuan = queQuan;
		this.ngaySinh = ngaySinh;
	}
	


	public Date getNgaySinh() {
		return ngaySinh;
	}


	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}


	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	
}