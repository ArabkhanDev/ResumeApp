/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

import com.company.bean.User;
import com.mycompany.dao.inter.UserDaoInter;

/**
 *
 * @author SMART
 */
public class Main {

    public static void main(String[] args) throws Exception {
          
        UserDaoInter userDao = Context.instanceUserDao();
        System.out.println("salam");
//        List<User> list = userDao.getAll();
//        userDao.removeUser(1);
//        List<User> list2 = userDao.getAll();
//        
//        System.out.println("list=" + list);
//        System.out.println("list=" + list2);
        
        User u =  userDao.getById(2);
        u.setName("Eldar");
        userDao.updateUser(u);

    }
}
