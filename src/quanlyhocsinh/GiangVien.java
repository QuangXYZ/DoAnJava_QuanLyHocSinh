package quanlyhocsinh;


public class GiangVien extends Nguoi {
	
	public String MSGV;
	public String giangDayMon;
	
	public GiangVien() {
		
	}
	
	

	public GiangVien(String hoTen, String gioiTinh, String queQuan, String MSGV, String giangDayMon) {
		super(hoTen, gioiTinh, queQuan);
		this.MSGV = MSGV;
		this.giangDayMon = giangDayMon;
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