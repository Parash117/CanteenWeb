/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepoets.controller;

import com.codepoets.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Parash Gurung
 */
@Controller
public class CourseController {
    
    private CourseService courseService;
    
    @Autowired
    @Qualifier("courseService")
    public void setService(CourseService courseService){
        this.courseService = courseService;
    }
    
    @RequestMapping(value = "/updateCourse")
    public void addAllCourse(){
        
    }
    
}
