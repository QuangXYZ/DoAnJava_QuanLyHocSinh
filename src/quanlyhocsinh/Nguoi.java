package quanlyhocsinh;


public class Nguoi {

	public String hoTen;
	public String gioiTinh;
	public String queQuan;
	
	public Nguoi() {
		
	}
	
	public Nguoi(String hoTen, String gioiTinh, String queQuan) {
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.queQuan = queQuan;
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