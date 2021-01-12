/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepoets.DAOIMPL;

import com.codepoets.DAO.StaffDAO;
import com.codepoets.entity.Staff;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Parash Gurung
 */
@Repository
public class StaffDAOImpl implements StaffDAO {
    
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public ArrayList<Staff> findStaffByName(String Name) {
        Session session = sessionFactory.getCurrentSession();
        ArrayList<Staff> staffArray = new ArrayList<Staff>();
        staffArray = (ArrayList<Staff>)session.createQuery("from Staff where firstname like %:s%").setParameter("s",Name);
        return staffArray;
    }

    @Override
    public void Insert(Staff staff) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(staff);
        session.flush();
    }
    
    @Override
    public void Delete(int id){
        Session session = sessionFactory.getCurrentSession();
        Staff staf = (Staff)session.get(Staff.class, id);
        session.delete(staf);
        session.flush();
    }

    @Override
    public List<Staff> ListAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Staff> staffArray = session.createQuery("from Staff").list();
        return staffArray;
        
    }
    
    @Override
    public Staff findStaffById(int id){
        Session session = sessionFactory.getCurrentSession();
        Staff staff = (Staff)session.createQuery("from Staff where id = :id").setParameter("id",  id).uniqueResult();
        return staff;
    }

    @Override
    public void Update(Staff staff) {
        //Staff staff = new Staff();
        Session session = sessionFactory.getCurrentSession();
        session.update(staff);
    }
    
}
