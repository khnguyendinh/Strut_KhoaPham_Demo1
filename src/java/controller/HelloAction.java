/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author lampstudio
 */
public class HelloAction extends ActionSupport {
    
    public HelloAction() {
    }
    
    @Override
    public String execute() throws Exception {
        return "success";
    }
     public String hienThi() {
        return "success";
    }
}
