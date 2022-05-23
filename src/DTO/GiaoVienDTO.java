package DTO;

import java.util.Date;

public class GiaoVienDTO extends NguoiDTO {
	
	private String MSGV;
	private String lop;
	private String img;
	
	public GiaoVienDTO() {
		
	}
	
	

	public GiaoVienDTO(String MSGV,String hoTen,Date ngaySinh, String gioiTinh, String queQuan,  String lop,String img) {
		super(hoTen, gioiTinh, queQuan, ngaySinh);
		this.MSGV = MSGV;
		this.lop = lop;
		this.img = img;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getMSGV() {
		return MSGV;
	}

	public void setMSGV(String msGV) {
		MSGV = msGV;
	}

	public String getlop() {
		return lop;
	}

	public void setlop(String lop) {
		this.lop = lop;
	}

}