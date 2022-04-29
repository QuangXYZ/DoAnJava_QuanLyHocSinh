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

	
	public ArrayList<KetQuaDTO> doDuLieuComboBox() {
		return ketQuaDAO.doDuLieuComboBox();
	}
	
}
