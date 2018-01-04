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
public class DangNhapActionSupport extends ActionSupport {
    private String userName;
    private String password;
    private boolean isLoginSuccess = true; 

    public boolean isIsLoginSuccess() {
        return isLoginSuccess;
    }

    public void setIsLoginSuccess(boolean isLoginSuccess) {
        this.isLoginSuccess = isLoginSuccess;
    }
    
    public DangNhapActionSupport() {
    }
    
    @Override
    public String execute() throws Exception {
        String page = "fail";
        if(this.password.equals("123") && this.userName.equals("khoa")){
            isLoginSuccess = true; 
            page = "success";
        }else{
            isLoginSuccess = false;
        }
        return page;
    }

    public String getUserName() {
        return userName;
    }
    public String dangnhap(){
        System.out.println("vao day");
        return "success";
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
