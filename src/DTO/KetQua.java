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
public class KetQua {
    private String MSHS;
    private String MaMH;
    private Double Diem;
    private String MaLop;
    private String NamHoc;

    public KetQua(String MSHS, String MaMH, Double Diem, String MaLop, String NamHoc) {
        this.MSHS = MSHS;
        this.MaMH = MaMH;
        this.Diem = Diem;
        this.MaLop = MaLop;
        this.NamHoc = NamHoc;
    }

    public KetQua() {
    }

    public String getMSHS() {
        return MSHS;
    }

    public void setMSHS(String MSHS) {
        this.MSHS = MSHS;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public Double getDiem() {
        return Diem;
    }

    public void setDiem(Double Diem) {
        this.Diem = Diem;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public String getNamHoc() {
        return NamHoc;
    }

    public void setNamHoc(String NamHoc) {
        this.NamHoc = NamHoc;
    }
    
    
}
