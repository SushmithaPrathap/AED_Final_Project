/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Doctor;

import model.appointment.Appointment;
import model.appointment.Prescription;
import model.EcoSystem;
import model.Employee.Employee;
import model.Enterprise.Enterprise;
import model.Medicine.Medicine;
import model.Organization.Organization;
import model.Patient.Patient;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suprith
 */
public class ViewPrescriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPrescriptionJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem ecosystem;
    private Appointment appointment;
    private Patient patient;
    private Employee doctor;
    
    public ViewPrescriptionJPanel( JPanel userProcessContainer, UserAccount userAccount,Organization organization,Enterprise enterprise,EcoSystem ecosystem, Appointment appointment, Patient patient, Employee doctor) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
       this.enterprise= enterprise;
       this.ecosystem = ecosystem;
       this.appointment = appointment;
       this.patient = patient;
       this.doctor= doctor;
       Prescription prescription = appointment.getPrescription();
       populatePrescription();
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        viewPrescriptionTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(196, 224, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewPrescriptionTbl.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 204, 255)));
        viewPrescriptionTbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        viewPrescriptionTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient", "Doctor", "Medicines", "Dosage", "Pharmacy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(viewPrescriptionTbl);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 140, 420, 370));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(68, 145, 157));
        jLabel1.setText("Prescription");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        backJButton.setBackground(new java.awt.Color(102, 147, 255));
        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.setPreferredSize(new java.awt.Dimension(100, 40));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 53, -1, -1));

        jPanel13.setBackground(new java.awt.Color(68, 145, 157));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, -1));

        jPanel14.setBackground(new java.awt.Color(196, 224, 229));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 160));
    }// </editor-fold>//GEN-END:initComponents

    public void populatePrescription(){
         DefaultTableModel model = (DefaultTableModel) viewPrescriptionTbl.getModel();
        model.setRowCount(0);
        Prescription prelist = appointment.getPrescription();
        
        
        for (Map.Entry<Medicine, Double> entry : appointment.getPrescription().getMedicinePrescribed().entrySet()){
         Object[] row = new Object[5];
            row[0] = patient.getName();
            row[1] = doctor.getName();
            row[2] = entry.getKey();
            row[3] = entry.getValue();
            row[4] = prelist.getPhmacy().getName();
            model.addRow(row);
    }
        }
    
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable viewPrescriptionTbl;
    // End of variables declaration//GEN-END:variables
}
