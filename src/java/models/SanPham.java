/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author lampstudio
 */
public class SanPham {
    private String maSP;
    private String tenSP;
    private Long giaSP;

    public SanPham(String maSP, String tenSP, Long giaSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
    }

    public SanPham() {
    }
    
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Long getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(Long giaSP) {
        this.giaSP = giaSP;
    }
    
}
