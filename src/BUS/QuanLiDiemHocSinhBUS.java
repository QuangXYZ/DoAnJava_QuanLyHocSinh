package BUS;

import DAO.QuanLyDiemHocSinhDAO;
import DTO.QuanLiDiemHS;
import java.util.ArrayList;

public class QuanLiDiemHocSinhBUS {
	QuanLyDiemHocSinhDAO diemHocSinhDAO = new QuanLyDiemHocSinhDAO();
	public ArrayList<QuanLiDiemHS> docDiemHocSinh(){
		return diemHocSinhDAO.docDiemHocSinh();
	}
	
	public int themDiemHocSinh(QuanLiDiemHS diemHS) {
		return diemHocSinhDAO.themDiemHocSinh(diemHS);
	}
	
	public int xoaDiemHocSinh(QuanLiDiemHS diemHS) {
		return diemHocSinhDAO.xoaDiemHocSinh(diemHS);
	}
	
	public int suaDiemHocSinh(QuanLiDiemHS diemHS) {
		return diemHocSinhDAO.suaDiemHocSinh(diemHS);
	}
	
	public ArrayList<QuanLiDiemHS> timDiemHocSinh(String mshs){
		return diemHocSinhDAO.timDiemHocSinh(mshs);
	}
	
	public ArrayList<String> layMaHocSinh(){
		return diemHocSinhDAO.layMaHocSinh();
	}
	
	public float tinhTrungBinh(float a, float b, float c, float d, float e, float f) {
		return diemHocSinhDAO.tinhTrungBinh(a, b, c, d, e, f);
	}
}