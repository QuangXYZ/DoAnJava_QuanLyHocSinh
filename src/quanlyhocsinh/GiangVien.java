package quanlyhocsinh;

import java.util.Date;

public class GiangVien extends Nguoi {
	
	private String MSGV;
	private String giangDayMon;
	private String img;
	
	public GiangVien() {
		
	}
	
	

	public GiangVien(String MSGV,String hoTen,Date ngaySinh, String gioiTinh, String queQuan,  String giangDayMon,String img) {
		super(hoTen, gioiTinh, queQuan, ngaySinh);
		this.MSGV = MSGV;
		this.giangDayMon = giangDayMon;
		this.img = img;
	}



	public String getMsGV() {
		return MSGV;
	}

	public void setMsGV(String msGV) {
		MSGV = msGV;
	}

	public String getGiangDayMon() {
		return giangDayMon;
	}

	public void setGiangDayMon(String giangDayMon) {
		this.giangDayMon = giangDayMon;
	}

}