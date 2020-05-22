/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepoets.Service;

import com.codepoets.entity.Course;
import java.util.List;

/**
 *
 * @author Parash Gurung
 */
public interface CourseService {
    public void Insert(Course course);
    public List<Course> ListAll();
    public Course findCourseById(int id);
    public void Delete(int id);
    public void Update(Course course);
    
}
