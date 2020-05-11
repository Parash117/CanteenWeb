/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepoets.Service;

import com.codepoets.entity.Staff;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Parash Gurung
 */
public interface StaffService {
    public ArrayList<Staff> findStaffByName(String Name);
    public void Insert(Staff staff);
    public void Delete(int id);
    public List<Staff> ListAll();
    public Staff findStaffById(int id);
    public void Update(Staff staff);
}
