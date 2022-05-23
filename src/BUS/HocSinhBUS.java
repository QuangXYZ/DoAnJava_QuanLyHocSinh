/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.HocSinhDAO;
import DTO.HocSinhDTO;
import java.util.ArrayList;

/**
 *
 * @author Tit
 */
public class HocSinhBUS {
    HocSinhDAO hsDAO = new HocSinhDAO();
    public ArrayList<HocSinhDTO> getAllHocSinh() {  
        return hsDAO.getAllHocSinh();
    }
    public int addHocSinh(HocSinhDTO hs) {  
        return hsDAO.addHocSinh(hs);
    }
    public int deleteHocSinh(String mshs) {  
        return hsDAO.deleteHocSinh(mshs);
    }
    public int updateHocSinh(HocSinhDTO hs) {  
        return hsDAO.updateHocSinh(hs);
    }
    public ArrayList<HocSinhDTO> searchHocSinhMSHS(String MSHS) {  
        return hsDAO.searchHocSinhMSHS(MSHS);
    }
    public ArrayList<HocSinhDTO> searchHocSinhHoTen(String HoTen) {  
        return hsDAO.searchHocSinhHoTen(HoTen);
    }
    public ArrayList<HocSinhDTO> searchHocSinhNgaySinh(String NgaySinh) {  
        return hsDAO.searchHocSinhNgaySinh(NgaySinh);
    }
    public ArrayList<HocSinhDTO> searchHocSinhQueQuan(String QueQuan) {  
        return hsDAO.searchHocSinhQueQuan(QueQuan);
    }
    public ArrayList<HocSinhDTO> searchHocSinhLop(String Lop) {  
        return hsDAO.searchHocSinhLop(Lop);
    }
    public ArrayList<HocSinhDTO> searchHocSinhGioiTinh(String GioiTinh) {  
        return hsDAO.searchHocSinhGioiTinh(GioiTinh);
    }
    
}
