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
    
}
