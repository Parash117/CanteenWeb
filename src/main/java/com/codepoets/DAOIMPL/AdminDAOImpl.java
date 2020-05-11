/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepoets.DAOIMPL;

import com.codepoets.DAO.AdminDAO;
import com.codepoets.entity.Admin;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Parash Gurung
 */
@Repository
public class AdminDAOImpl implements AdminDAO{

    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    
    @Override
    public Admin findAdminByEmail(String email) {
        Session session = sessionFactory.getCurrentSession();
        Admin admin = (Admin) session.createQuery("from Admin where email = :email").setParameter("email", email).uniqueResult();
        return admin;
    }

    @Override
    public void Insert(Admin admin) {
       Session session = sessionFactory.getCurrentSession();
       session.persist(admin);
       session.flush();
    }
    
    
}
