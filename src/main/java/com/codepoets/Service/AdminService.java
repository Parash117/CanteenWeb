/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepoets.Service;

import com.codepoets.entity.Admin;

/**
 *
 * @author Parash Gurung
 */
public interface AdminService {
    public Admin findAdminByEmail(String email);
    void Insert(Admin admin);
}
