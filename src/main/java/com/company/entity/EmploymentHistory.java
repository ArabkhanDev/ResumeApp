/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.entity;

import java.sql.Date;

/**
 *
 * @author SMART
 */
public class EmploymentHistory {
    
    private Integer id;
    private String header;
    private Date beginDate;
    private Date enddate;
    private String jobDescription;
    private User user;

    public EmploymentHistory() {
    }

    public EmploymentHistory(Integer id, String header, Date beginDate, Date enddate, String jobDescription, User user) {
        this.id = id;
        this.header = header;
        this.beginDate = beginDate;
        this.enddate = enddate;
        this.jobDescription = jobDescription;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "EmploymentHistory{" + "id=" + id + ", header=" + header + ", beginDate=" + beginDate + ", enddate=" + enddate + ", jobDescription=" + jobDescription + ", user=" + user + '}';
    }

    
    
    
}
