/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.entity;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author SMART
 */
public class User {
    
    private int id;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private Date birthdate;
    private Country nationality;
    private Country birthplace;
    private List<UserSkill> Skills;
    
    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    
    
    public User(int id, String name, String surname, String phone, String email, Date birthdate, Country nationality, Country birthplace) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.birthdate = birthdate;
        this.nationality = nationality;
        this.birthplace = birthplace;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Country getNationality() {
        return nationality;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public Country getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(Country birthplace) {
        this.birthplace = birthplace;
    }

    public List<UserSkill> getSkills() {
        return Skills;
    }

    public void setSkills(List<UserSkill> Skills) {
        this.Skills = Skills;
    }
    
    

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", phone=" + phone + ", email=" + email + ", birthdate=" + birthdate + ", nationality=" + nationality + ", birthplace=" + birthplace + '}';
    }
    
    

    
    
    
}
