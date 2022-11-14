/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

import com.company.dao.impl.UserDaoImpl;
import com.company.dao.impl.UserDaoImpl2;
import com.mycompany.dao.inter.UserDaoInter;

/**
 *
 * @author SMART
 */
public class Context {
    
    public static UserDaoInter instanceUserDao(){
        return new UserDaoImpl2();
    }
    
}
