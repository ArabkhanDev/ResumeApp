/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao.inter;

import com.company.entity.EmploymentHistory;
import java.util.List;

/**
 *
 * @author SMART
 */
public interface EmploymentHistoryDaoInter {
    
      
    public List<EmploymentHistory> getAllEmploymentHistoryByUserId(int userId);
}