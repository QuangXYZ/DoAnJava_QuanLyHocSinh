package BUS;

import java.util.ArrayList;

import DAO.KetQuaDAO;
import DTO.KetQuaDTO;
import DTO.QuanLiDiemHS;

public class KetQuaBUS {
	
	KetQuaDAO ketQuaDAO = new KetQuaDAO();
	
	/*public ArrayList<KetQuaDTO> docKetQuaHocLuc(){
		return ketQuaDAO.docKetQuaHocLuc();
	}*/
	
	public int themKetQuaHocLuc(KetQuaDTO ketQuaDTO) {
		return ketQuaDAO.themKetQuaHocLuc(ketQuaDTO);
	}
	
}
