/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole;

import model.Bed.Bed;
import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.BedMgmtDept;
import model.Organization.Organization;
import model.Organization.OrganizationDirectory;
import model.Patient.Patient;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suprith
 */
public class ManageBedJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    OrganizationDirectory organizationDirectory;
    Organization organization;
    BedMgmtDept bedorg;
    Enterprise ent;
    EcoSystem system;
    /**
     * Creates new form ManageBedJPanel
     */
    public ManageBedJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory, Organization organization, BedMgmtDept bedorg, Enterprise ent, EcoSystem system) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.organizationDirectory= organizationDirectory;
        this.organization=organization;
        this.bedorg = bedorg;
        btnUpdate.setEnabled(true);
        btnSave.setEnabled(false);
        bedCountTxt.setEditable(false);
        txtCurrent.setText(String.valueOf(this.bedorg.getBedCnt()));
        txtCurrent.setEditable(false);
        this.system= system;
        this.ent = ent;
        populateBedTable();
        
    }

    
    void populateBedTable(){
        DefaultTableModel model = (DefaultTableModel) bedJTable.getModel();
        
        model.setRowCount(0);
        String bedStatus = (String)bedStatusCmb.getSelectedItem();
        for (Bed bed : bedorg.getBedArray().getListBed()){
            if(bed.getBedStatus().getStatus().equals(bedStatus)){
            Object[] row = new Object[3];
            row[0] = bed.getBedId();
            row[1] = bed.getBedStatus().getStatus();
            Patient p = bed.getPat();
            row[2] = p == null ? "": p;
            model.addRow(row);
            //row[2] = 
            }//end if
            
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

        jLabel3 = new javax.swing.JLabel();
        bedCountTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bedJTable = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        bedStatusCmb = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCurrent = new javax.swing.JTextField();
        btnViewGraph = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnViewApptntStatus = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(100, 100));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("New Bed Count");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        bedCountTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(bedCountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 146, -1));

        bedJTable.setBackground(new java.awt.Color(204, 204, 204));
        bedJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Bed ID", "Status", "Patient"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bedJTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(bedJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 560, 180));

        btnSave.setBackground(new java.awt.Color(9, 87, 136));
        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setPreferredSize(new java.awt.Dimension(100, 40));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(9, 87, 136));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setPreferredSize(new java.awt.Dimension(100, 40));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Bed Status");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        bedStatusCmb.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bedStatusCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Available", "Occupied", "Assigned Laundry" }));
        bedStatusCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedStatusCmbActionPerformed(evt);
            }
        });
        add(bedStatusCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 220, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(9, 87, 136));
        jLabel6.setText("Bed Management");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 350, -1));

        btnView.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(9, 87, 136));
        btnView.setText("View");
        btnView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(9, 87, 136)));
        btnView.setPreferredSize(new java.awt.Dimension(100, 40));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, 90, 30));

        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(9, 87, 136));
        backJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(9, 87, 136)));
        backJButton.setLabel("Back");
        backJButton.setPreferredSize(new java.awt.Dimension(100, 40));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 90, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Current Bed Count");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        txtCurrent.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtCurrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 270, -1));

        btnViewGraph.setBackground(new java.awt.Color(9, 87, 136));
        btnViewGraph.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnViewGraph.setForeground(new java.awt.Color(255, 255, 255));
        btnViewGraph.setText("View Bed Graph");
        btnViewGraph.setPreferredSize(new java.awt.Dimension(167, 40));
        btnViewGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewGraphActionPerformed(evt);
            }
        });
        add(btnViewGraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 240, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BedMangmt.JPG"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 100));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 299, 227));

        btnViewApptntStatus.setBackground(new java.awt.Color(9, 87, 136));
        btnViewApptntStatus.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnViewApptntStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnViewApptntStatus.setText("View Appointment Status");
        btnViewApptntStatus.setPreferredSize(new java.awt.Dimension(180, 40));
        btnViewApptntStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewApptntStatusActionPerformed(evt);
            }
        });
        add(btnViewApptntStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 240, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
       // organization.g
        String count = bedCountTxt.getText();
        if(count.equals("") || count == null){
             JOptionPane.showMessageDialog(null, "Please enter value!");
            return;
        }
        int newCountBed = Integer.parseInt(bedCountTxt.getText());
        int currentCount = bedorg.getBedCnt();
        
        if(currentCount > newCountBed){
            JOptionPane.showMessageDialog(null, "Cannot decrease bed Count!");
            return;

        }
        
        if(currentCount == newCountBed){
            JOptionPane.showMessageDialog(null, "No change in bed Count!");
            return;

        }
        
        newCountBed = newCountBed - currentCount;
        
        bedorg.addBed(newCountBed);
        JOptionPane.showMessageDialog(null, "Beds added successfully!");
        DB4OUtil.getInstance().storeSystem(system);
            //return;

        btnUpdate.setEnabled(true);
        btnSave.setEnabled(false);
        bedCountTxt.setEditable(false);
        txtCurrent.setText(String.valueOf(bedorg.getBedCnt()));
        bedCountTxt.setText("");
        populateBedTable();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);
        bedCountTxt.setEditable(true);
        DB4OUtil.getInstance().storeSystem(system);
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void bedStatusCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedStatusCmbActionPerformed
       // Organization organization = (Organization) bedStatusCmb.getSelectedItem();
        //if (organization != null){
            //populateEmployeeComboBox(organization);
           // populateRoleComboBox(organization);
        //}
    }//GEN-LAST:event_bedStatusCmbActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        populateBedTable();
        
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnViewGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewGraphActionPerformed
        // TODO add your handling code here:

        BedCountGraph manageOrganizationJPanel = new BedCountGraph(userProcessContainer, system ,ent);
        userProcessContainer.add("BedCountGraph", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewGraphActionPerformed

    private void btnViewApptntStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewApptntStatusActionPerformed
        // TODO add your handling code here:
        
        AppointmentStatusGraphInEnterprise manageOrganizationJPanel = new AppointmentStatusGraphInEnterprise(userProcessContainer, system, ent );
        userProcessContainer.add("AppointmentStatusGraphInEnterprise", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewApptntStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bedCountTxt;
    private javax.swing.JTable bedJTable;
    private javax.swing.JComboBox bedStatusCmb;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnViewApptntStatus;
    private javax.swing.JButton btnViewGraph;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCurrent;
    // End of variables declaration//GEN-END:variables
}
