package DTO;

public class KetQuaDTO {
	private float diemTrungBinh;
	private String hocLuc, MSHS, slHocSinhGioi, slHocSinhKha, slHocSinhTrungBinh, slHocsinhYeu, tongSoHocSinh;
	private HocSinhDTO hocSinh;
	
	public KetQuaDTO() {
		
	}
	
	public KetQuaDTO(String mSHS, float diemTrungBinh, String hocLuc) {
		this.diemTrungBinh = diemTrungBinh;
		this.hocLuc = hocLuc;
		this.MSHS = mSHS;
	}
        public KetQuaDTO(String mSHS) {
		this.diemTrungBinh = 0;
		this.hocLuc = null;
		this.MSHS = mSHS;
	}
	
	

	public HocSinhDTO getHocSinh() {
		return hocSinh;
	}

	public void setHocSinh(HocSinhDTO hocSinh) {
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
	
	public String getSlHocSinhGioi() {
		return slHocSinhGioi;
	}

	public void setSlHocSinhGioi(String slHocSinhGioi) {
		this.slHocSinhGioi = slHocSinhGioi;
	}

	public String getSlHocSinhKha() {
		return slHocSinhKha;
	}

	public void setSlHocSinhKha(String slHocSinhKha) {
		this.slHocSinhKha = slHocSinhKha;
	}

	public String getSlHocSinhTrungBinh() {
		return slHocSinhTrungBinh;
	}

	public void setSlHocSinhTrungBinh(String slHocSinhTrungBinh) {
		this.slHocSinhTrungBinh = slHocSinhTrungBinh;
	}

	public String getSlHocsinhYeu() {
		return slHocsinhYeu;
	}

	public void setSlHocsinhYeu(String slHocsinhYeu) {
		this.slHocsinhYeu = slHocsinhYeu;
	}
	
	public String getTongSoHocSinh() {
		return tongSoHocSinh;
	}

	public void setTongSoHocSinh(String tongSoHocSinh) {
		this.tongSoHocSinh = tongSoHocSinh;
	}
}
