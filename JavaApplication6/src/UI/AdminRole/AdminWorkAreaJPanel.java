

package UI.AdminRole;

import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.BedManagementDepartment;
import model.Organization.Organization;
import model.Organization.OrganizationDirectory;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author  Suprith
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    Organization organization;
    EcoSystem system;
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise,UserAccount account, Organization organization, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.organization = organization;
        this.system = system;
        lblEnterprise.setText(enterprise.getName());
        jLabel5.setText("Welcome " + account.getEmployee().getNameVar());
        String enterpriseType= enterprise.getTypeEnterprise().toString();
        if(enterpriseType.equals("Hospital"))
        {
            manageBedBtn.setEnabled(true);
            manageBedBtn.setVisible(true);
        }
        else{
             manageBedBtn.setEnabled(false);
             manageBedBtn.setVisible(false);
        }
        
        
        if(enterpriseType.equals("Pharmacy"))
        {            
            manageMedicineInvtry.setVisible(true);
            manageMedicineInvtry.setEnabled(true);
        }
        else{
            manageMedicineInvtry.setVisible(false);
            manageMedicineInvtry.setEnabled(false);
        }
        
        if(enterpriseType.equals("Hospital"))
        {        
        lblEnterpriseImage.setIcon(new ImageIcon("src/icon/hospital.png"));
        }
        else if(enterpriseType.equals("Pharmacy"))
        {        
        lblEnterpriseImage.setIcon(new ImageIcon("src/icon/pharm1.png"));
        }
        else if(enterpriseType.equals("Lab"))
        {        
        lblEnterpriseImage.setIcon(new ImageIcon("src/icon/laboratory.jpg"));
        }   
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEnterprise = new javax.swing.JLabel();
        lblEnterpriseImage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        manageOrganizationJButton = new javax.swing.JButton();
        userJButton = new javax.swing.JButton();
        manageBedBtn = new javax.swing.JButton();
        manageMedicineInvtry = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEnterprise.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblEnterprise.setForeground(new java.awt.Color(68, 145, 157));
        lblEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lblEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 280, 30));

        lblEnterpriseImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnterpriseImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/admin.png"))); // NOI18N
        add(lblEnterpriseImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 620, 330));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 204, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageOrganizationJButton.setBackground(new java.awt.Color(255, 155, 54));
        manageOrganizationJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageOrganizationJButton.setText("Manage Department");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, 60));

        userJButton.setBackground(new java.awt.Color(255, 155, 54));
        userJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        userJButton.setText("Manage Staff");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 150, 60));

        manageBedBtn.setBackground(new java.awt.Color(255, 155, 54));
        manageBedBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageBedBtn.setText("Manage Bed");
        manageBedBtn.setEnabled(false);
        manageBedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBedBtnActionPerformed(evt);
            }
        });
        jPanel1.add(manageBedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 150, 60));

        manageMedicineInvtry.setBackground(new java.awt.Color(255, 155, 54));
        manageMedicineInvtry.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageMedicineInvtry.setText("Manage Inventory");
        manageMedicineInvtry.setEnabled(false);
        manageMedicineInvtry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMedicineInvtryActionPerformed(evt);
            }
        });
        jPanel1.add(manageMedicineInvtry, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 170, 60));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 840, 130));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(68, 145, 157));
        jLabel5.setText("Welcome");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 360, 37));

        jPanel14.setBackground(new java.awt.Color(196, 224, 229));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, -1, 280));

        jPanel13.setBackground(new java.awt.Color(68, 145, 157));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 330, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageMedicineInvtryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMedicineInvtryActionPerformed

        ManageMedicinesJPanel manageEmployeeJPanel = new ManageMedicinesJPanel(userProcessContainer, enterprise.getOrgDir(), enterprise);
        userProcessContainer.add("ManageMedicinesJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageMedicineInvtryActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrgDir(), enterprise, system);
        userProcessContainer.add("ManageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void manageBedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBedBtnActionPerformed
        // TODO add your handling code here:
        //check if bed management department is created or not
        boolean flag=false;
        BedManagementDepartment bedOrg=null;
        OrganizationDirectory orgDir = enterprise.getOrgDir();
        for(Organization org : orgDir.getOrganizationList() ){
            if(org.getName().equals(Organization.Type.BedManagement.getValue()))
            {
                //if bed management departemtn is present then navigate to bed management screen
                flag = true;
                bedOrg = (BedManagementDepartment)org;
            }
        }
        
        if(flag == true){
        ManageBedJPanel manageOrganizationJPanel = new ManageBedJPanel(userProcessContainer, 
                orgDir, organization, bedOrg, enterprise,system);
        userProcessContainer.add("ManageBedJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        
        else{
            JOptionPane.showMessageDialog(null, "No Bed Management department, please create one!");
            return;

        }
    }//GEN-LAST:event_manageBedBtnActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblEnterpriseImage;
    private javax.swing.JButton manageBedBtn;
    private javax.swing.JButton manageMedicineInvtry;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
    
}
