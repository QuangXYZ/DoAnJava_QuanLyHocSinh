package DTO;



public class QuanLiDiemHS /*extends HocSinh*/ {
	private float toan, anh, van, ly, sinh, hoa;
	private String MSHS;
	private HocSinh hocSinh;
	
	public QuanLiDiemHS() {
		hocSinh = new HocSinh();
	}
	

	public QuanLiDiemHS(String mSHS,float toan, float anh, float van, float ly, float sinh, float hoa) {
		this.toan = toan;
		this.anh = anh;
		this.van = van;
		this.ly = ly;
		this.sinh = sinh;
		this.hoa = hoa;
		this.MSHS = mSHS;
	}
        public QuanLiDiemHS(String mSHS) {
		toan = 0;
                anh = 0;
                ly = 0;
                hoa = 0;
                sinh = 0;
                anh = 0;
                van = 0;
		this.MSHS = mSHS;
	}
	
	

	public HocSinh getHocSinh() {
		return hocSinh;
	}


	public void setHocSinh(HocSinh hs) {
		this.hocSinh = hs;
	}


	public String getMSHS() {
		return MSHS;
	}


	public void setMSHS(String mSHS) {
		MSHS = mSHS;
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