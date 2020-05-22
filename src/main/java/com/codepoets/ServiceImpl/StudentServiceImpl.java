/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepoets.ServiceImpl;

import com.codepoets.DAO.StudentDAO;
import com.codepoets.Service.StudentService;
import com.codepoets.entity.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Parash Gurung
 */
public class StudentServiceImpl implements StudentService {

    private StudentDAO studentDAO;
    
    @Autowired
    public void setStudentDAO(StudentDAO studentDAO){
        this.studentDAO = studentDAO;
    }
    
    @Transactional
    @Override
    public void Insert(Student student) {
        studentDAO.Insert(student);
    }

    @Transactional
    @Override
    public List<Student> ListAll() {
        return studentDAO.ListAll();
    }

    @Transactional
    @Override
    public Student findStudnetById(int id) {
        return studentDAO.findStudnetById(id);
    }

    @Transactional
    @Override
    public Student findStudnetByUniqueKey(String uniqueKey) {
        return studentDAO.findStudnetByUniqueKey(uniqueKey);
    }

    @Transactional
    @Override
    public List<Student> findStudnetByName(String name) {
        return studentDAO.findStudnetByName(name);
    }

    @Transactional
    @Override
    public List<Student> findStudnetByCourseId(int cid) {
        return studentDAO.findStudnetByCourseId(cid);
    }

    @Transactional
    @Override
    public void Delete(int id) {
        studentDAO.Delete(id);
    }

    @Transactional
    @Override
    public void Edit(Student student) {
        studentDAO.Edit(student);
    }
    
}
