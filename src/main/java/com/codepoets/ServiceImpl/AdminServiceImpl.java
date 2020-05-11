/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepoets.ServiceImpl;

import com.codepoets.DAO.AdminDAO;
import com.codepoets.Service.AdminService;
import com.codepoets.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Parash Gurung
 */
public class AdminServiceImpl implements AdminService{
    
    private AdminDAO adminDAO;
    
    @Autowired
    public void setAdminDAO(AdminDAO adminDAO){
        this.adminDAO = adminDAO;
    }

    @Transactional
    @Override
    public Admin findAdminByEmail(String email) {
        return adminDAO.findAdminByEmail(email);
    }

    @Transactional
    @Override
    public void Insert(Admin admin) {
       adminDAO.Insert(admin); //To change body of generated methods, choose Tools | Templates.
    }
    
}
