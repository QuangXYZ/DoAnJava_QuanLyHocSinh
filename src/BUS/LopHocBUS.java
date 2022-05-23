/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;


import DAO.LopHocDAO;
import DTO.HocSinhDTO;
import DTO.LopHocDTO;
import java.util.ArrayList;

/**
 *
 * @author Tit
 */
public class LopHocBUS {
    LopHocDAO lhDAO = new LopHocDAO();
    public ArrayList<LopHocDTO> getAllLopHoc() {  
        return lhDAO.getAllLopHoc();
    }
    public ArrayList<HocSinhDTO> getAllHocSinh(String tenLop) {  
        return lhDAO.getAllHocSinh(tenLop);
    }
    public int addLopHoc(LopHocDTO lh){
        return lhDAO.addLopHoc(lh);
    }
    public int delLopHoc(LopHocDTO lh){
        return lhDAO.delLopHoc(lh);
    }
    public int updateLopHoc(LopHocDTO lh,String lh1){
        return lhDAO.updateLopHoc(lh,lh1);
    }
 
}
