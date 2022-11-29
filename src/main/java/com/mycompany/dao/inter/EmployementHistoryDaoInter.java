/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao.inter;

import com.company.entity.EmployementHistory;
import java.util.List;

/**
 *
 * @author SMART
 */
public interface EmployementHistoryDaoInter {
    
      
    public List<EmployementHistory> getAllEmploymentHistoryByUserId(int userId);
}
