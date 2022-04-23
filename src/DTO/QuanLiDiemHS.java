package DTO;

public class QuanLiDiemHS {
	private float toan, anh, van, ly, sinh, hoa;

	public QuanLiDiemHS() {
		
	}

	public QuanLiDiemHS(float toan, float anh, float van, float ly, float sinh, float hoa) {
		super();
		this.toan = toan;
		this.anh = anh;
		this.van = van;
		this.ly = ly;
		this.sinh = sinh;
		this.hoa = hoa;
	}

	public double getToan() {
		return toan;
	}

	public void setToan(float toan) {
		this.toan = toan;
	}

	public double getAnh() {
		return anh;
	}

	public void setAnh(float anh) {
		this.anh = anh;
	}

	public double getVan() {
		return van;
	}

	public void setVan(float van) {
		this.van = van;
	}

	public double getLy() {
		return ly;
	}

	public void setLy(float ly) {
		this.ly = ly;
	}

	public double getSinh() {
		return sinh;
	}

	public void setSinh(float sinh) {
		this.sinh = sinh;
	}

	public double getHoa() {
		return hoa;
	}

	public void setHoa(float hoa) {
		this.hoa = hoa;
	}
	
	
	

}
