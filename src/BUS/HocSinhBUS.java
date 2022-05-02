/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.HocSinhDAO;
import DTO.HocSinh;
import java.util.ArrayList;

/**
 *
 * @author Tit
 */
public class HocSinhBUS {
    HocSinhDAO hsDAO = new HocSinhDAO();
    public ArrayList<HocSinh> getAllHocSinh() {  
        return hsDAO.getAllHocSinh();
    }
    public int addHocSinh(HocSinh hs) {  
        return hsDAO.addHocSinh(hs);
    }
    public int deleteHocSinh(String mshs) {  
        return hsDAO.deleteHocSinh(mshs);
    }
    public int updateHocSinh(HocSinh hs) {  
        return hsDAO.updateHocSinh(hs);
    }
    public ArrayList<HocSinh> searchHocSinhMSHS(String MSHS) {  
        return hsDAO.searchHocSinhMSHS(MSHS);
    }
    public ArrayList<HocSinh> searchHocSinhHoTen(String HoTen) {  
        return hsDAO.searchHocSinhHoTen(HoTen);
    }
    public ArrayList<HocSinh> searchHocSinhNgaySinh(String NgaySinh) {  
        return hsDAO.searchHocSinhNgaySinh(NgaySinh);
    }
    public ArrayList<HocSinh> searchHocSinhQueQuan(String QueQuan) {  
        return hsDAO.searchHocSinhQueQuan(QueQuan);
    }
    public ArrayList<HocSinh> searchHocSinhLop(String Lop) {  
        return hsDAO.searchHocSinhLop(Lop);
    }
    
    
}
