/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepoets.controller;

import com.codepoets.Service.StaffService;
import com.codepoets.entity.Staff;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Parash Gurung
 */
@Controller
public class StaffController {
    
    private StaffService staffService;
    
    @Autowired
    @Qualifier("staffService")
    public void setStaffService(StaffService staffService){
        this.staffService = staffService;   
    }
    
    @RequestMapping(value = "/registerStaff", method = RequestMethod.POST)
    public String addStaff(@RequestParam("fname") String fname, @RequestParam("lname") String lname, @RequestParam("address") String address, @RequestParam("email") String email, @RequestParam("phoneno") String phoneno, @RequestParam("password") String password){
        Staff staff = new Staff();
        staff.setFirstname(fname);
        staff.setLastname(lname);
        staff.setAddress(address);
        staff.setEmail(email);
        staff.setPhoneno(phoneno);
        staff.setPassword(password);
        long millis=System.currentTimeMillis();
        Date date = new Date(millis);
        staff.setDateofjoin(date);
        staffService.Insert(staff);
        return "adminPanel";
    }
    
    @RequestMapping(value = "/viewStaffPage", method = RequestMethod.GET)
    public ModelAndView viewAllStaff(){
        List<Staff> staff = staffService.ListAll();
        ModelAndView model = new ModelAndView("staffView");
        model.addObject("staffList",staff);
        return model;
    }
    
    @RequestMapping(value = "/deleteStaffBtn", method = RequestMethod.GET)
    public ModelAndView deleteStaffById(@RequestParam("staffid") int staffid){
        System.out.println("=====================>"+staffid);
        staffService.Delete(staffid);
        List<Staff> staff = staffService.ListAll();
        ModelAndView model = new ModelAndView("staffView");
        model.addObject("staffList",staff);
        return model;
    }
    
    @RequestMapping(value = "/editStaffBtn", method = RequestMethod.GET)
    public ModelAndView editStaffById(@RequestParam("staffid") int staffid){
        Staff staff = staffService.findStaffById(staffid);
        //staff.setId(staffid);
        ModelAndView model = new ModelAndView("staffEdit");
        model.addObject("staffDet",staff);
        return model;
    }
    @RequestMapping(value = "updateStaffSubmit")
    public ModelAndView updateStaff(@RequestParam("fname") String fname, @RequestParam("id") int id, @RequestParam("lname") String lname, @RequestParam("address") String address, @RequestParam("email") String email, @RequestParam("phoneno") String phoneno, @RequestParam("password") String password, @RequestParam("dateofjoin") Date dateofjoin){
        Staff staff = new Staff();
        
        staff.setFirstname(fname);
        staff.setLastname(lname);
        staff.setAddress(address);
        staff.setEmail(email);
        staff.setPhoneno(phoneno);
        staff.setPassword(password);
        staff.setDateofjoin(dateofjoin);
        staff.setId(id);
        staffService.Update(staff);
        
        List<Staff> staffs = staffService.ListAll();
        ModelAndView model = new ModelAndView("staffView");
        model.addObject("staffList",staffs);
        return model;
    }
}
