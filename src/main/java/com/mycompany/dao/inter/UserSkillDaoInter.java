/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao.inter;

import com.company.entity.User;
import com.company.entity.UserSkill;
import java.util.List;


public interface UserSkillDaoInter {
     
     
    public List<UserSkill> getAllSkillByUserId(int id);

    public boolean insertUserSkill(UserSkill u);
    
    public boolean updateUserSkill(UserSkill u);
    
    public boolean removeUserSkill(int id);
}