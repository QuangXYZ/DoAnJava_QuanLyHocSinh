/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.GiaoVienDAO;
import DTO.GiaoVien;
import java.util.ArrayList;

/**
 *
 * @author Tit
 */
public class GiaoVienBUS {
    GiaoVienDAO gvDAO = new GiaoVienDAO();
    public ArrayList<GiaoVien> getAllGiaoVien() {  
        return gvDAO.getAllGiaoVien();
    }
    public int addGiaoVien(GiaoVien gv) {  
        return gvDAO.addGiaoVien(gv);
    }
    public int deleteGiaoVien(String msgv) {  
        return gvDAO.deleteGiaoVien(msgv);
    }
    public int updateGiaoVien(GiaoVien gv) {  
        return gvDAO.updateGiaoVien(gv);
    }
    public ArrayList<GiaoVien> searchGiaoVienMSGV(String MSGV) {  
        return gvDAO.searchGiaoVienMSGV(MSGV);
    }
    public ArrayList<GiaoVien> searchGiaoVienHoTen(String HoTen) {  
        return gvDAO.searchGiaoVienHoTen(HoTen);
    }
    public ArrayList<GiaoVien> searchGiaoVienNgaySinh(String NgaySinh) {  
        return gvDAO.searchGiaoVienNgaySinh(NgaySinh);
    }
    public ArrayList<GiaoVien> searchGiaoVienQueQuan(String QueQuan) {  
        return gvDAO.searchGiaoVienQueQuan(QueQuan);
    }
    public ArrayList<GiaoVien> searchGiaoVienLop(String Lop) {  
        return gvDAO.searchGiaoVienLop(Lop);
    }
    public ArrayList<GiaoVien> searchGiaoVienGioiTinh(String GioiTinh) {  
        return gvDAO.searchGiaoVienGioiTinh(GioiTinh);
    }
}
