/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepoets.controller;

import com.codepoets.Service.StudentService;
import com.codepoets.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Parash Gurung
 */
@Controller
public class StudentController {
    
    private StudentService studentService;
    
    @Autowired
    @Qualifier("studentService")
    public void setService(StudentService studentService){
        this.studentService = studentService;
    }
    
    
    @RequestMapping(value = "/addStudent")
    public String addStudentPage(){
        return "studentRegister";
    }
    
    @RequestMapping(value = "/stdLogin", method = RequestMethod.GET)
    public ModelAndView stdLogin(@RequestParam("uid") String uid){
        Student student = studentService.findStudnetByUniqueKey(uid);
        ModelAndView model = new ModelAndView("studentLogin");
        model.addObject("studentDet", student);
        return model;
    }
}
