/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

import com.mycompany.dao.inter.EmploymentHistoryDaoInter;

/**
 *
 * @author SMART
 */
public class Main {

    public static void main(String[] args) throws Exception {
          
        EmploymentHistoryDaoInter dao = Context.instanceEmploymentHistoryDao();
        
        System.out.println(dao.getAllEmploymentHistoryByUserId(6));

    }
}
