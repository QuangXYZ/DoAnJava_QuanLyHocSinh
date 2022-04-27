package DTO;

public class KetQuaDTO {
	private float diemTrungBinh;
	private String hocLuc, MSHS;
	private HocSinh hocSinh;
	
	public KetQuaDTO() {
		
	}
	
	public KetQuaDTO(String mSHS, float diemTrungBinh, String hocLuc) {
		this.diemTrungBinh = diemTrungBinh;
		this.hocLuc = hocLuc;
		this.MSHS = mSHS;
	}
	
	

	public HocSinh getHocSinh() {
		return hocSinh;
	}

	public void setHocSinh(HocSinh hocSinh) {
		this.hocSinh = hocSinh;
	}

	public String getMSHS() {
		return MSHS;
	}

	public void setMSHS(String mSHS) {
		MSHS = mSHS;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	public String getHocLuc() {
		return hocLuc;
	}
	public void setHocLuc(String hocLuc) {
		this.hocLuc = hocLuc;
	}
	
	
}
