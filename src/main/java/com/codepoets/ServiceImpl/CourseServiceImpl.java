/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepoets.ServiceImpl;

import com.codepoets.DAO.CourseDAO;
import com.codepoets.Service.CourseService;
import com.codepoets.entity.Course;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Parash Gurung
 */
public class CourseServiceImpl implements CourseService{
    
    private CourseDAO courseDAO;
    
    @Autowired
    public void setCourseDAO(CourseDAO courseDAO){
        this.courseDAO = courseDAO;
    }
    
    @Transactional
    @Override
    public void Insert(Course course) {
        courseDAO.Insert(course);
    }
    @Transactional
    @Override
    public List<Course> ListAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    @Override
    public Course findCourseById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    @Override
    public void Delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    @Override
    public void Update(Course course) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
