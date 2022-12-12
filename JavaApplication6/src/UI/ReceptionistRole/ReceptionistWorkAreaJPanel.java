/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ReceptionistRole;

import model.appointment.Appointment;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.Patient.Patient;
import model.UserAccount.UserAccount;
import model.WorkQueue.ReceptionistWorkRequest;
import model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import UI.PatientRole.BookAppointmentJPanel;
import UI.PatientRole.CreateNewPatientJPanel;
import UI.PatientRole.ViewPatientJPanel;

/**
 *
 * @author Mohit
 */
public class ReceptionistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReceptionistWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    
    public ReceptionistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = business;
        
        jLabel5.setText("Welcome " + account.getEmp().getNameVar());
        
        if(enterprise.getTypeEnterprise().getValue().equals("Hospital"))
        {
           populatePatients();
        }
        
        
        if(enterprise.getTypeEnterprise().getValue().equals("Lab"))
        {
            populateTest();
        }
        
        
        if(enterprise.getTypeEnterprise().getValue().equals("Pharmacy"))
        {
           // populatepharmacyReceptionist();
        }
        
        
        if(enterprise.getTypeEnterprise().getValue().equals("Insurance"))
        {
          //  populateTest();
        }
        
        
    }

    public void populatePatients() {
        DefaultTableModel model = (DefaultTableModel) PatientDataJTable.getModel();
        model.setRowCount(0);
        if(enterprise.getPatDirectory()!= null && enterprise.getPatDirectory().getPatientArray() != null){
            for (Patient patient : enterprise.getPatDirectory().getPatientArray()) {
                    Object[] row = new Object[4];
                    row[0] = patient.getID();
                    row[1] = patient;//.getName();
                    row[2] = patient.getPhone();
                    row[3] = patient.getBloodGrp();
                    model.addRow(row); 
            }
        }
    }
    
    
    
     public void populateTest() {
        DefaultTableModel model = (DefaultTableModel) PatientDataJTable.getModel();
        model.setRowCount(0);
        if(enterprise.getOrgWq() != null ){
            List<WorkRequest> wrList = enterprise.getOrgWq().getWorkRequestArray();
            for (WorkRequest wr : wrList) {
                if(wr instanceof ReceptionistWorkRequest)
                {
                    Appointment app = ((ReceptionistWorkRequest) wr).getAppt();
                Patient patient = ((ReceptionistWorkRequest)wr).getPatient();
                if(patient == null && app !=null){
                    patient= ((ReceptionistWorkRequest) wr).getAppt().getPatient();
                            
                }
                
                
                if(patient!=null)
                {
                
                    Object[] row = new Object[4];
                    row[0] = patient.getID();
                    row[1] = patient;//getName();
                    row[2] = patient.getPhone();
                    row[3] = patient.getBloodGrp();
                    model.addRow(row); 
                }
                }
            }
        }
    }
    
     
     public void populatepharmacyReceptionist() {
        DefaultTableModel model = (DefaultTableModel) PatientDataJTable.getModel();
        model.setRowCount(0);
        if(enterprise.getOrgWq() != null ){
            List<WorkRequest> wrList = enterprise.getOrgWq().getWorkRequestArray();
            for (WorkRequest wr : wrList) {
                if(wr instanceof ReceptionistWorkRequest)
                {
                
                Patient patient = ((ReceptionistWorkRequest)wr).getPatient();
                if(patient!=null)
                {
                
                    Object[] row = new Object[4];
                    row[0] = patient.getID();
                    row[1] = patient;
                    row[2] = patient.getPhone();
                    row[3] = patient.getBloodGrp();
                    model.addRow(row); 
                }
                }
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        PatientDataJTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnManagePatient = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnBookAppointment = new javax.swing.JButton();
        btnViewAppointment = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 204, 255)));

        PatientDataJTable.setBackground(new java.awt.Color(236, 236, 236));
        PatientDataJTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        PatientDataJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Patient Name", "Phone Number", "Blood Group"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        PatientDataJTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(PatientDataJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 876, 362));

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManagePatient.setBackground(new java.awt.Color(9, 87, 136));
        btnManagePatient.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnManagePatient.setForeground(new java.awt.Color(255, 255, 255));
        btnManagePatient.setText("Create New Patient");
        btnManagePatient.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnManagePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePatientActionPerformed(evt);
            }
        });
        jPanel1.add(btnManagePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 280, 50));

        jButton2.setBackground(new java.awt.Color(9, 87, 136));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View Patient");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 250, 50));

        btnBookAppointment.setBackground(new java.awt.Color(9, 87, 136));
        btnBookAppointment.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBookAppointment.setForeground(new java.awt.Color(255, 255, 255));
        btnBookAppointment.setText("Book Appointment");
        btnBookAppointment.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentActionPerformed(evt);
            }
        });
        jPanel1.add(btnBookAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 280, 50));

        btnViewAppointment.setBackground(new java.awt.Color(9, 87, 136));
        btnViewAppointment.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnViewAppointment.setForeground(new java.awt.Color(255, 255, 255));
        btnViewAppointment.setText("View Appointment");
        btnViewAppointment.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnViewAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAppointmentActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 250, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 650, 190));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/receptionist.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, -1, 230));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(9, 87, 136));
        jLabel5.setText("Welcome!");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 430, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManagePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePatientActionPerformed

        CreateNewPatientJPanel createNewPatientJPanel = new CreateNewPatientJPanel(userProcessContainer, userAccount, organization, enterprise, system);
        userProcessContainer.add("createNewPatientJPanel",createNewPatientJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePatientActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRow = PatientDataJTable.getSelectedRow();
        if(selectedRow >= 0){
            Patient patient = (Patient)PatientDataJTable.getValueAt(selectedRow,1);
//            Order order = (Order)OrderJTable.getValueAt(selectedRow, 0);
            ViewPatientJPanel viewPatientJPanel = new ViewPatientJPanel(userProcessContainer, userAccount, organization, enterprise, system, patient);
            userProcessContainer.add("viewPatientJPanel",viewPatientJPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentActionPerformed
        int selectedRow = PatientDataJTable.getSelectedRow();
        if(selectedRow >= 0){
            //int patientId = (int) PatientDataJTable.getValueAt(selectedRow, 0);
            Patient temp = (Patient)  PatientDataJTable.getValueAt(selectedRow, 1);
            BookAppointmentJPanel appointmentJPanel = new BookAppointmentJPanel(userProcessContainer, userAccount, organization, enterprise, system, temp);
            userProcessContainer.add("appointmentJPanel",appointmentJPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBookAppointmentActionPerformed

    private void btnViewAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAppointmentActionPerformed
        // TODO add your handling code here:
       int selectedRow = PatientDataJTable.getSelectedRow();
        if(selectedRow >= 0){
             
            Patient temp = (Patient) PatientDataJTable.getValueAt(selectedRow, 1);
           
            UI.PatientRole.ViewAppointmentJPanel viewAppointmentJPanel = new UI.PatientRole.ViewAppointmentJPanel(userProcessContainer, userAccount, organization, enterprise, system, temp);
            userProcessContainer.add("viewAppointmentJPanel",viewAppointmentJPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_btnViewAppointmentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PatientDataJTable;
    private javax.swing.JButton btnBookAppointment;
    private javax.swing.JButton btnManagePatient;
    private javax.swing.JButton btnViewAppointment;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
}
