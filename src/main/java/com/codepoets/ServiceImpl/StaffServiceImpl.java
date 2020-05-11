/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepoets.ServiceImpl;

import com.codepoets.DAO.StaffDAO;
import com.codepoets.Service.StaffService;
import com.codepoets.entity.Staff;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Parash Gurung
 */
public class StaffServiceImpl implements StaffService {
    private StaffDAO staffDAO;
    
    @Autowired
    public void setStaffDAO (StaffDAO staffDAO){
        this.staffDAO = staffDAO;
    }
    
    @Transactional
    @Override
    public ArrayList<Staff> findStaffByName(String Name) {
        return staffDAO.findStaffByName(Name);
    }
    @Transactional
    @Override
    public void Insert(Staff staff) {
        staffDAO.Insert(staff);
    }
    @Transactional
    @Override
    public void Delete(int id) {
        staffDAO.Delete(id);
    }
    
    @Transactional
    @Override
    public List<Staff> ListAll(){
        List<Staff> staff = staffDAO.ListAll();
        return staff;
    }

    @Transactional
    @Override
    public Staff findStaffById(int id) {
       Staff staff = staffDAO.findStaffById(id);
       return staff;
    }
    
    @Transactional
    @Override
    public void Update(Staff staff) {
        staffDAO.Update(staff);
    }
    
}
