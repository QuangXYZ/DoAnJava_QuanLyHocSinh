/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.GiaoVienDAO;
import DTO.GiaoVienDTO;
import java.util.ArrayList;

/**
 *
 * @author Tit
 */
public class GiaoVienBUS {
    GiaoVienDAO gvDAO = new GiaoVienDAO();
    public ArrayList<GiaoVienDTO> getAllGiaoVien() {  
        return gvDAO.getAllGiaoVien();
    }
    public int addGiaoVien(GiaoVienDTO gv) {  
        return gvDAO.addGiaoVien(gv);
    }
    public int deleteGiaoVien(String msgv) {  
        return gvDAO.deleteGiaoVien(msgv);
    }
    public int updateGiaoVien(GiaoVienDTO gv) {  
        return gvDAO.updateGiaoVien(gv);
    }
    public ArrayList<GiaoVienDTO> searchGiaoVienMSGV(String MSGV) {  
        return gvDAO.searchGiaoVienMSGV(MSGV);
    }
    public ArrayList<GiaoVienDTO> searchGiaoVienHoTen(String HoTen) {  
        return gvDAO.searchGiaoVienHoTen(HoTen);
    }
    public ArrayList<GiaoVienDTO> searchGiaoVienNgaySinh(String NgaySinh) {  
        return gvDAO.searchGiaoVienNgaySinh(NgaySinh);
    }
    public ArrayList<GiaoVienDTO> searchGiaoVienQueQuan(String QueQuan) {  
        return gvDAO.searchGiaoVienQueQuan(QueQuan);
    }
    public ArrayList<GiaoVienDTO> searchGiaoVienLop(String Lop) {  
        return gvDAO.searchGiaoVienLop(Lop);
    }
    public ArrayList<GiaoVienDTO> searchGiaoVienGioiTinh(String GioiTinh) {  
        return gvDAO.searchGiaoVienGioiTinh(GioiTinh);
    }
}
