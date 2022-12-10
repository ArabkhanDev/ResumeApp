/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.company.resume.panel;

import com.company.entity.EmployementHistory;
import java.text.SimpleDateFormat;
import com.mycompany.Main.Context;
import com.mycompany.dao.inter.EmployementHistoryDaoInter;
import java.sql.Date;

/**
 *
 * @author SMART
 */
public class EmployementHistoryPanel extends javax.swing.JPanel {
    private EmployementHistoryDaoInter EmployementHistoryDao = Context.instanceEmploymentHistoryDao();

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    /**
     * Creates new form EmployementHistoryPanel
     */
    public EmployementHistoryPanel() {
        initComponents();
        
    }
    
    

    public void fillUserComponents() {
        
        EmployementHistory emp = new EmployementHistory();
        txtAreaDescription.setText(emp.getJobDescription());
        txtAreaHeader.setText(emp.getHeader());
        
        Date bg = emp.getBeginDate();
        Date end = emp.getEnddate();
        String bdStr = sdf.format(bg);
        String endStr = sdf.format(end);
        
        txtDate.setText(bdStr);
        txtDate.setText(endStr);

    }
    
    public void fillEmploymentHistotory(EmployementHistory employmentHistory){
        try{
            String description = txtAreaDescription.getText();
            String header = txtAreaHeader.getText();
            String bgDate = txtDate.getText();
            String endDate = txtDate.getText();

            java.util.Date bgUtil = sdf.parse(bgDate);
            java.util.Date endUtil = sdf.parse(endDate);
            long b = bgUtil.getTime();
            long e = endUtil.getTime();

            java.sql.Date bd = new java.sql.Date(b);
            java.sql.Date end = new java.sql.Date(e);


            employmentHistory.setHeader(header);
            employmentHistory.setJobDescription(description);
            employmentHistory.setBeginDate(bd);
            employmentHistory.setEnddate(bd);
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProfilDescription = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaHeader = new javax.swing.JTextArea();
        lblDescription = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaDescription = new javax.swing.JTextArea();
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();

        lblHeader.setText("header:");

        txtAreaHeader.setColumns(20);
        txtAreaHeader.setRows(5);
        jScrollPane1.setViewportView(txtAreaHeader);

        lblDescription.setText("Description:");

        txtAreaDescription.setColumns(20);
        txtAreaDescription.setRows(5);
        jScrollPane2.setViewportView(txtAreaDescription);

        lblDate.setText("Date");

        javax.swing.GroupLayout pnlProfilDescriptionLayout = new javax.swing.GroupLayout(pnlProfilDescription);
        pnlProfilDescription.setLayout(pnlProfilDescriptionLayout);
        pnlProfilDescriptionLayout.setHorizontalGroup(
            pnlProfilDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProfilDescriptionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProfilDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProfilDescriptionLayout.createSequentialGroup()
                        .addComponent(lblDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                    .addGroup(pnlProfilDescriptionLayout.createSequentialGroup()
                        .addComponent(lblHeader)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addGap(93, 93, 93))
        );
        pnlProfilDescriptionLayout.setVerticalGroup(
            pnlProfilDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProfilDescriptionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProfilDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlProfilDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addGroup(pnlProfilDescriptionLayout.createSequentialGroup()
                        .addGroup(pnlProfilDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescription)
                            .addGroup(pnlProfilDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDate)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlProfilDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlProfilDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JPanel pnlProfilDescription;
    private javax.swing.JTextArea txtAreaDescription;
    private javax.swing.JTextArea txtAreaHeader;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables
}
