package BUS;

import java.util.ArrayList;

import DAO.KetQuaDAO;
import DTO.KetQuaDTO;

public class KetQuaBUS {
	KetQuaDAO ketQuaDAO = new KetQuaDAO();
	
	public ArrayList<KetQuaDTO> docKetQuaHocLuc(String maLop){
		return ketQuaDAO.docKetQuaHocLuc(maLop);
	}
	
	public int themKetQuaHocLuc(KetQuaDTO ketQuaDTO) {
		return ketQuaDAO.themKetQuaHocLuc(ketQuaDTO);
	}
	
	public int suaKetQuaHocLuc(KetQuaDTO ketQuaDTO) {
		return ketQuaDAO.suaKetQuaHocLuc(ketQuaDTO);
	}

	
	public ArrayList<KetQuaDTO> doDuLieuComboBox() {
		return ketQuaDAO.doDuLieuComboBox();
	}
	
	public ArrayList<KetQuaDTO> laySoLuongHSKha(String maLop){
		return ketQuaDAO.laySoLuongHSKha(maLop);
	}
	
	public ArrayList<KetQuaDTO> laySoLuongHSGioi(String maLop){
		return ketQuaDAO.laySoLuongHSGioi(maLop);
	}
	
	public ArrayList<KetQuaDTO> laySoLuongHSTrungBinh(String maLop){
		return ketQuaDAO.laySoLuongHSTrungBinh(maLop);
	}
	
	public ArrayList<KetQuaDTO> laySoLuongHSYeu(String maLop){
		return ketQuaDAO.laySoLuongHSYeu(maLop);
	}
	
	public ArrayList<KetQuaDTO> layTongSoHocSinh(String maLop){
		return ketQuaDAO.layTongSoHocSinh(maLop);
	}
    public int xoaKetQua(KetQuaDTO ms){
            return ketQuaDAO.xoaKetQua(ms);
    }
        
    public int xuatFileExcel(String maLop){
    	return ketQuaDAO.xuatFileExcel(maLop);
    }
	
}
