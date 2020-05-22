/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepoets.DAO;

import com.codepoets.entity.Student;
import java.util.List;

/**
 *
 * @author Parash Gurung
 */
public interface StudentDAO {
    public void Insert(Student student);
    public List<Student> ListAll();
    public Student findStudnetById(int id);
    public Student findStudnetByUniqueKey(String uniqueKey);
    public List<Student> findStudnetByName(String name);
    public List<Student> findStudnetByCourseId(int cid);
    public void Delete(int id);
    public void Edit(Student student);
    
}
