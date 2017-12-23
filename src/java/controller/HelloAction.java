/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import models.SanPham;

/**
 *
 * @author lampstudio
 */
public class HelloAction extends ActionSupport {
    private String hoTen;
    private SanPham sanPham;
    private List<SanPham> dsSP;

    public List<SanPham> getDsSP() {
        return dsSP;
    }

    public void setDsSP(List<SanPham> dsSP) {
        this.dsSP = dsSP;
    }
    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }
    
    public HelloAction() {
    }
    
    @Override
    public String execute() throws Exception {
        this.hoTen = "Nguyen van A";
        this.sanPham = new SanPham("SP1", "nồi cơm điện", 1000L);
       
        return "success";
    }
     public String hienThi() {
        this.dsSP.add(new SanPham("Ma_SP1", "nồi cơm điện 1", 1000L));
        this.dsSP.add(new SanPham("Ma_SP2", "nồi cơm điện 2", 2000L));
        this.dsSP.add(new SanPham("Ma_SP3", "nồi cơm điện 3", 3000L));
        return "success";
    }
}
