/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

import com.company.dao.impl.CountryDaoImpl;
import com.company.dao.impl.EmployementHistoryDaoImpl;
import com.company.dao.impl.SkillDaoImpl;
import com.company.dao.impl.UserDaoImpl;
import com.company.dao.impl.UserSkillDaoImpl;
import com.mycompany.dao.inter.CountryDaoInter;
import com.mycompany.dao.inter.UserDaoInter;
import com.mycompany.dao.inter.UserSkillDaoInter;
import com.mycompany.dao.inter.EmployementHistoryDaoInter;
import com.mycompany.dao.inter.SkillDaoInter;

/**
 *
 * @author SMART
 */
public class Context {
    
    public static UserDaoInter instanceUserDao(){
        return new UserDaoImpl();
    }
    
    public static UserSkillDaoInter instanceUserSkillDao(){
        return new UserSkillDaoImpl();
    }
    
    public static EmployementHistoryDaoInter instanceEmploymentHistoryDao(){
        return new EmployementHistoryDaoImpl();
    }
    
    public static CountryDaoInter instanceCountryDao(){
        return new CountryDaoImpl();
    }
    
    public static SkillDaoInter instanceSkillDao(){
        return new SkillDaoImpl();
    }
    
    
}
