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
    
    
}
