package quanlyhocsinh;

import java.util.Date;

public class HocSinh extends Nguoi {

	private String MSHS;
	private String lop;
	private String img;
	private double toan, van, anh, hoa, ly, sinh;
	
	public HocSinh() {
		
	}
	
	
	
	public HocSinh(String mSHS,String hoTen, Date ngaySinh,String gioiTinh, String queQuan, String lop,String img, double toan, double van, double anh, double hoa, double sinh, double ly) {
		super(hoTen, gioiTinh, queQuan, ngaySinh);
		this.MSHS = mSHS;
		this.lop = lop;
		this.img = img;
		this.toan = toan;
		this.van = van;
		this.anh = anh;
		this.hoa = hoa;
		this.ly = ly;
		this.sinh = sinh;
	}



	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	public double getToan() {
		return toan;
	}
	public void setToan(double toan) {
		this.toan = toan;
	}

	public double getVan() {
		return van;
	}
	public void setVan(double van) {
		this.van = van;
	}

	public double getAnh() {
		return anh;
	}
	public void setAnh(double anh) {
		this.anh = anh;
	}

	public double getHoa() {
		return hoa;
	}
	public void setHoa(double hoa) {
		this.hoa = hoa;
	}

	public double getLy() {
		return ly;
	}
	public void setLy(double ly) {
		this.ly = ly;
	}

	public double getSinh() {
		return sinh;
	}
	public void setSinh(double sinh) {
		this.sinh = sinh;
	}

	public String getMSHS() {
		return MSHS;
	}
	public void setMSHS(String mSHS) {
		this.MSHS = mSHS;
	}
	
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	
}