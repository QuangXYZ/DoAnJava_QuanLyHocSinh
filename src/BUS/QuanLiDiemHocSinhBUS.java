package BUS;

import DAO.QuanLyDiemHocSinhDAO;
import DTO.QuanLiDiemHocSinhDTO;
import java.util.ArrayList;

public class QuanLiDiemHocSinhBUS {
	QuanLyDiemHocSinhDAO diemHocSinhDAO = new QuanLyDiemHocSinhDAO();
	public ArrayList<QuanLiDiemHocSinhDTO> docDiemHocSinh(){
		return diemHocSinhDAO.docDiemHocSinh();
	}
	
	public int themDiemHocSinh(QuanLiDiemHocSinhDTO diemHS) {
		return diemHocSinhDAO.themDiemHocSinh(diemHS);
	}
	
	public int xoaDiemHocSinh(QuanLiDiemHocSinhDTO mshs) {
		return diemHocSinhDAO.xoaDiemHocSinh(mshs);
	}
	
	public int suaDiemHocSinh(QuanLiDiemHocSinhDTO diemHS) {
		return diemHocSinhDAO.suaDiemHocSinh(diemHS);
	}
	
	public ArrayList<QuanLiDiemHocSinhDTO> timDiemHocSinh(String mshs){
		return diemHocSinhDAO.timDiemHocSinh(mshs);
	}
	
	public ArrayList<String> layMaHocSinh(){
		return diemHocSinhDAO.layMaHocSinh();
	}
	
	public int kiemTraMSHS(String mshs) {
		return diemHocSinhDAO.kiemTraMSHS(mshs);
	}
	
	public float tinhTrungBinh(float a, float b, float c, float d, float e, float f) {
		return diemHocSinhDAO.tinhTrungBinh(a, b, c, d, e, f);
	}
}