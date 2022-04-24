package DTO;

import java.util.Date;

public class QuanLiDiemHS extends HocSinh {
	private float toan, anh, van, ly, sinh, hoa;

	public QuanLiDiemHS() {
		
	}
	

	public QuanLiDiemHS(String mSHS, String hoTen, Date ngaySinh, String gioiTinh, String queQuan, String lop,
			String img, float toan, float anh, float van, float ly, float sinh, float hoa) {
		super(mSHS, hoTen, ngaySinh, gioiTinh, queQuan, lop, img);
		this.toan = toan;
		this.anh = anh;
		this.van = van;
		this.ly = ly;
		this.sinh = sinh;
		this.hoa = hoa;
	}


	public float getToan() {
		return toan;
	}

	public void setToan(float toan) {
		this.toan = toan;
	}

	public float getAnh() {
		return anh;
	}

	public void setAnh(float anh) {
		this.anh = anh;
	}

	public float getVan() {
		return van;
	}

	public void setVan(float van) {
		this.van = van;
	}

	public float getLy() {
		return ly;
	}

	public void setLy(float ly) {
		this.ly = ly;
	}

	public float getSinh() {
		return sinh;
	}

	public void setSinh(float sinh) {
		this.sinh = sinh;
	}

	public float getHoa() {
		return hoa;
	}

	public void setHoa(float hoa) {
		this.hoa = hoa;
	}

	
	

}
