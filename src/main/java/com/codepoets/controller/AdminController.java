/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepoets.controller;

import com.codepoets.Service.AdminService;
import com.codepoets.entity.Admin;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Parash Gurung
 */
@Controller
public class AdminController {
    
    private AdminService adminService;
    
    @Autowired
    @Qualifier("adminService")
    public void setAdminService(AdminService adminService){
        this.adminService = adminService;
    }
    
    @RequestMapping(value = {"/","/index"},method = RequestMethod.GET)
    public String index(){
//        Admin admin = new Admin();
//        admin.setName("admin");
//        admin.setEmail("subedisantos");
//        admin.setPassword("admin");
//        adminService.Insert(admin);
//System.out.println("===================================> Index Controller");
        //Admin admin = adminService.findAdminByEmail("subedisantos");
        //System.out.println("Email:"+admin.getEmail()+"\nPassword:"+admin.getPassword());
        return "loginMenu";
    }
    
    @RequestMapping(value = "/adminpanel")
    public String adminPanelPage(){
        return "adminPanel";
    }
    
    @RequestMapping(value = "/admin")
    public String adminLoginpage(){
        return "adminLogin";
    }
    
    @RequestMapping(value = "/adminloginsubmit", method = RequestMethod.POST)
    public String adminLoginSubmit(@RequestParam("email") String email, @RequestParam("password") String password, HttpServletRequest request){
        
        Admin admin = adminService.findAdminByEmail(email);
       
        if(admin.getEmail().equals(email) && admin.getPassword().equals(password)){
            request.getSession().setAttribute("adminID", admin.getId());
            request.getSession().setAttribute("Name", admin.getName());
            request.getSession().setAttribute("email", email);
            return "adminPanel";
        }
        else{
            return "adminLogin";
        }
       
    }
    
    @RequestMapping(value = "/addStaffPage", method = RequestMethod.GET)
    public String addStaffPage(){
        return "staffRegister";
    }
    
    
}
