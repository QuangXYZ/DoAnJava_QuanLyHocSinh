package DTO;

import java.util.Date;

public class HocSinhDTO extends NguoiDTO {

	private String MSHS;
	private String lop;
	private String img;
	
	public HocSinhDTO() {
		
	}
	
	
	
	public HocSinhDTO(String mSHS,String hoTen, Date ngaySinh,String gioiTinh, String queQuan, String lop,String img) {
		super(hoTen, gioiTinh, queQuan, ngaySinh);
		this.MSHS = mSHS;
		this.lop = lop;
		this.img = img;
		
	}



	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
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