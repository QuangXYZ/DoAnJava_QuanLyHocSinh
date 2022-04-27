/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Tit
 */
public class LopHoc {
    private String MaLop;
    private String TenLop;

    public LopHoc() {
    }
    public LopHoc(String MaLop, String TenLop) {
        this.MaLop = MaLop;
        this.TenLop = TenLop;
       
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }
    
}
