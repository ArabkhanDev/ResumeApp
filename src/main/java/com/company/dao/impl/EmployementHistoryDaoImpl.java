package com.company.dao.impl;

import com.company.entity.EmployementHistory;
import com.company.entity.User;
import com.mycompany.dao.inter.AbstractDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.dao.inter.EmployementHistoryDaoInter;

/**
 *
 * @author SMART
 */
public class EmployementHistoryDaoImpl extends AbstractDAO implements EmployementHistoryDaoInter {

    

    private EmployementHistory getEmploymentHistory(ResultSet rs) throws Exception {
        String header = rs.getString("header");
        String jobDescription = rs.getString("job_description");
        Date beginDate = rs.getDate("begin_date");
        Date endDate = rs.getDate("end_date");
        int userId = rs.getInt("user_id");
        EmployementHistory emp = new EmployementHistory(null, header, beginDate, endDate, jobDescription, new User(userId));
        return emp;

    }

    @Override
    public List<EmployementHistory> getAllEmploymentHistoryByUserId(int userId) {
        List<EmployementHistory> result = new ArrayList<>();
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("select * from employment_history where user_id = ?");
            stmt.setInt(1, userId);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            
            while (rs.next()) {
                EmployementHistory emp = getEmploymentHistory(rs);
                result.add(emp);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

}
