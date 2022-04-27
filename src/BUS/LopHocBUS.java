/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;


import DAO.LopHocDAO;
import DTO.HocSinh;
import DTO.LopHoc;
import java.util.ArrayList;

/**
 *
 * @author Tit
 */
public class LopHocBUS {
    LopHocDAO lhDAO = new LopHocDAO();
    public ArrayList<LopHoc> getAllLopHoc() {  
        return lhDAO.getAllLopHoc();
    }
    public ArrayList<HocSinh> getAllHocSinh(String tenLop) {  
        return lhDAO.getAllHocSinh(tenLop);
    }
    public int addLopHoc(LopHoc lh){
        return lhDAO.addLopHoc(lh);
    }
    public int delLopHoc(LopHoc lh){
        return lhDAO.delLopHoc(lh);
    }
    
}
