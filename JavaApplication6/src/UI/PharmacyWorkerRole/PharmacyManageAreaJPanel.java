/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PharmacyWorkerRole;

import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Suprith
 */
public class PharmacyManageAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyManageAreaJPanel
     */
    private JPanel userProcessContainer;
   
    //private Enterprise enterprise;
    private UserAccount  account;
    private Organization  organization;
    private Enterprise enterprise ;
    private EcoSystem business;
    public PharmacyManageAreaJPanel(JPanel userProcessContainer, UserAccount
            account, Organization  organization,   Enterprise enterprise , EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        //this.enterprise = doctor;
        this.enterprise = enterprise;
        this.business= business;
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageMedicineBtn = new javax.swing.JButton();
        managePatientsBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageMedicineBtn.setBackground(new java.awt.Color(255, 155, 54));
        manageMedicineBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageMedicineBtn.setText("Manage Medicines");
        manageMedicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMedicineBtnActionPerformed(evt);
            }
        });
        add(manageMedicineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 256, 75));

        managePatientsBtn.setBackground(new java.awt.Color(255, 155, 54));
        managePatientsBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        managePatientsBtn.setText("Manage Patients");
        managePatientsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePatientsBtnActionPerformed(evt);
            }
        });
        add(managePatientsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 256, 75));

        jLabel2.setBackground(new java.awt.Color(68, 145, 157));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 270, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pharmacyRecp1.PNG"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 700, 376));

        jPanel14.setBackground(new java.awt.Color(196, 224, 229));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 200));

        jPanel13.setBackground(new java.awt.Color(68, 145, 157));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(68, 145, 157));
        jLabel15.setText("Welcome, Pharmacist!");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 250, 37));
    }// </editor-fold>//GEN-END:initComponents

    private void managePatientsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePatientsBtnActionPerformed
        PharmacyMainWorkAreaJPanel managePatientsJPanel = new  PharmacyMainWorkAreaJPanel(userProcessContainer, account, organization, business, enterprise);
        userProcessContainer.add("PharmacyMainWorkAreaJPanel", managePatientsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePatientsBtnActionPerformed

    private void manageMedicineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMedicineBtnActionPerformed
        // TODO add your handling code here:
        ManageMedicinesJPanel managePatientsJPanel = new ManageMedicinesJPanel(userProcessContainer,  enterprise.getOrgDir(),enterprise);
        userProcessContainer.add("ManageMedicinesJPanel", managePatientsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_manageMedicineBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JButton manageMedicineBtn;
    private javax.swing.JButton managePatientsBtn;
    // End of variables declaration//GEN-END:variables
}
