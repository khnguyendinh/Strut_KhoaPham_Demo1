/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import models.TaiKhoan;
import com.opensymphony.xwork2.validator.annotations.*;
/**
 *
 * @author lampstudio
 */
public class DangKyActionSupport extends ActionSupport {
    private TaiKhoan taiKhoan = new TaiKhoan();
    @VisitorFieldValidator
    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
    
    public DangKyActionSupport() {
    }
    
    public String execute() throws Exception {
        System.out.println("hoten"+taiKhoan.getHoTen());
        return SUCCESS;
    }
    
}
