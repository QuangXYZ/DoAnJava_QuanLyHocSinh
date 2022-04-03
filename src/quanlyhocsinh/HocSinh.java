package quanlyhocsinh;


public class HocSinh extends Nguoi {

	public String MSHS;
	public String lop;
	
	public HocSinh() {
		
	}
	
	public HocSinh(String hoTen, String gioiTinh,String queQuan, String MSHS, String lop) {
		super(hoTen, gioiTinh, queQuan);
		this.MSHS = MSHS;
		this.lop = lop;
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