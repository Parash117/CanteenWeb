/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepoets.DAOIMPL;

import com.codepoets.DAO.CourseDAO;
import com.codepoets.entity.Course;
import com.codepoets.entity.Staff;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Parash Gurung
 */
public class CourseDAOImpl implements CourseDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void Insert(Course course) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(course);
        session.flush();
    }

    @Override
    public List<Course> ListAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Course> coursearray = session.createQuery("from course").list();
        return coursearray;
    }

    @Override
    public Course findCourseById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Course course = (Course) session.createQuery("from course where id = :id").setParameter("id", id).uniqueResult();
        return course;
    }

    @Override
    public void Delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Course course = (Course)session.get(Staff.class, id);
        session.delete(course);
        session.flush();
    }

    @Override
    public void Update(Course course) {
        Session session = sessionFactory.getCurrentSession();
        session.update(course);
    }

}
