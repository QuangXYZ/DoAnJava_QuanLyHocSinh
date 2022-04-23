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
    private String MSGV;

    public LopHoc() {
    }
    public LopHoc(String MaLop, String TenLop, String MSGV) {
        this.MaLop = MaLop;
        this.TenLop = TenLop;
        this.MSGV = MSGV;
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

    public String getMSGV() {
        return MSGV;
    }

    public void setMSGV(String MSGV) {
        this.MSGV = MSGV;
    }
    
    
    
}
