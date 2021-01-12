/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepoets.DAOIMPL;

import com.codepoets.DAO.StudentDAO;
import com.codepoets.entity.Student;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Parash Gurung
 */
@Repository
public class StudentDAOImpl implements StudentDAO {

    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void Insert(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(student);
        session.flush();
    }

    @Override
    public List<Student> ListAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Student> std = session.createQuery("from student").list();
        return std;
    }

    @Override
    public Student findStudnetById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Student std = (Student) session.createQuery("from student where id=" + id);
        return std;
    }

    @Override
    public Student findStudnetByUniqueKey(String uniqueKey) {
        Session session = sessionFactory.getCurrentSession();
        //Student std = (Student) session.createQuery("from Student where uniquekey = :uid").setParameter("uid", uniqueKey).uniqueResult();
        Student std = (Student) session.createQuery("from Student where uniquekey = '"+uniqueKey+"'").uniqueResult();
        //Student std = (Student) session.createQuery("from student");
        return std;
    }

    @Override
    public List<Student> findStudnetByName(String name) {
        Session session = sessionFactory.getCurrentSession();
        List<Student> stdarr = session.createQuery("from student fname like where firstname %" + name + "%").list();
        return stdarr;
    }

    @Override
    public List<Student> findStudnetByCourseId(int cid) {
        Session session = sessionFactory.getCurrentSession();
        List<Student> std = session.createQuery("from student where course_id=" + cid).list();

        return std;
    }

    @Override
    public void Delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Student std = (Student) session.get(Student.class, id);
        session.delete(std);
        session.flush();
    }

    @Override
    public void Edit(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.update(student);
    }

}
