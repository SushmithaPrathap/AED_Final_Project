/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Doctor;

import model.appointment.PatientHistoryDetails;
import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.Patient.Patient;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suprith
 */
public class PatientHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientHistoryJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem ecosystem;
    private Patient patient;
    private PatientHistoryDetails previuous;

    PatientHistoryJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem ecosystem, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        this.patient = patient;
         patientNameTxt.setEditable(false);
        patientNameTxt.setText(patient.getNameVar());
        txtpatientHistoryId.setVisible(false);
        populatePatientDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        previousDiagnosisTxt = new javax.swing.JTextField();
        medAlergiesTxt = new javax.swing.JTextField();
        familyHistoryTxt = new javax.swing.JTextField();
        alergiesTxt = new javax.swing.JTextField();
        surgeryHistoryTxt = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        btnAddPatientDetails = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientDetailsTbl = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        patientNameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnViewDetails = new javax.swing.JButton();
        txtpatientHistoryId = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(9, 87, 136));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(9, 87, 136));
        jLabel1.setText("Patient Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 170, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Family History :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Medicine Allergies :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Allergies :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Surgery History :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Previous visit diagnosis :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 190, 50));
        add(previousDiagnosisTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 157, 137));

        medAlergiesTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        medAlergiesTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medAlergiesTxtActionPerformed(evt);
            }
        });
        add(medAlergiesTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 270, -1));

        familyHistoryTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        familyHistoryTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyHistoryTxtActionPerformed(evt);
            }
        });
        add(familyHistoryTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 270, -1));

        alergiesTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        alergiesTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergiesTxtActionPerformed(evt);
            }
        });
        add(alergiesTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 270, -1));

        surgeryHistoryTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        surgeryHistoryTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surgeryHistoryTxtActionPerformed(evt);
            }
        });
        add(surgeryHistoryTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 270, -1));

        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.setPreferredSize(new java.awt.Dimension(100, 40));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        btnAddPatientDetails.setBackground(new java.awt.Color(9, 87, 136));
        btnAddPatientDetails.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAddPatientDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPatientDetails.setText("Add Details");
        btnAddPatientDetails.setPreferredSize(new java.awt.Dimension(167, 40));
        btnAddPatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientDetailsActionPerformed(evt);
            }
        });
        add(btnAddPatientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        patientDetailsTbl.setBackground(new java.awt.Color(255, 193, 131));
        patientDetailsTbl.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 204, 255)));
        patientDetailsTbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientDetailsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Allergies", "Allergies", "Previous Visit", "Family History", "Surgery History", "Details ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patientDetailsTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(patientDetailsTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 570, 148));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Patient Name :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        patientNameTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        patientNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientNameTxtActionPerformed(evt);
            }
        });
        add(patientNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 161, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/prescroption1.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 180, -1));

        btnViewDetails.setBackground(new java.awt.Color(9, 87, 136));
        btnViewDetails.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnViewDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDetails.setText("View Details");
        btnViewDetails.setPreferredSize(new java.awt.Dimension(167, 40));
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });
        add(btnViewDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, -1, -1));

        txtpatientHistoryId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtpatientHistoryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpatientHistoryIdActionPerformed(evt);
            }
        });
        add(txtpatientHistoryId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 161, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void medAlergiesTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medAlergiesTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medAlergiesTxtActionPerformed

    private void familyHistoryTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyHistoryTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_familyHistoryTxtActionPerformed

    private void alergiesTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergiesTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergiesTxtActionPerformed

    private void surgeryHistoryTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surgeryHistoryTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surgeryHistoryTxtActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnAddPatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientDetailsActionPerformed
         
         PatientHistoryDetails patientHistoryDetails = null;
        if(previuous != null){
            patientHistoryDetails = previuous;
            previuous = null;
        }
        String patientName=patientNameTxt.getText();
        String previousDiagnosis = previousDiagnosisTxt.getText();
        String medsalergies = medAlergiesTxt.getText();
        if(patientName.equals("") || previousDiagnosis.equals("") || medsalergies.equals("") ||
                alergiesTxt.getText().isEmpty() || surgeryHistoryTxt.getText().isEmpty() || 
                familyHistoryTxt.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "Fields cannot be empty, Please fill in all fields"); 
        }
        else{
            
        if(patientHistoryDetails == null){
            patientHistoryDetails = new PatientHistoryDetails();
            patient.getPatHistoryDetails().add(patientHistoryDetails);
        }
        
        if(patient.getPatHistoryDetails() == null)
        {
            ArrayList<PatientHistoryDetails> pdh = new ArrayList<>();
            patient.setPatHistoryDetails(pdh);
        }
        
        //prescription.setDate(date);
        patientHistoryDetails.setMedAllergies(medsalergies);
        patientHistoryDetails.setPrevDiagnosis(previousDiagnosis);
        patientHistoryDetails.setPatient(patient);
        patientHistoryDetails.setFamilyHistory(familyHistoryTxt.getText());
        patientHistoryDetails.setSurgeryHistory(surgeryHistoryTxt.getText());
        patientHistoryDetails.setAllergy(alergiesTxt.getText());
        //dateTxt.setText("");
//        patientNameTxt.setText("");
        previousDiagnosisTxt.setText("");
        medAlergiesTxt.setText("");
        alergiesTxt.setText("");
        surgeryHistoryTxt.setText("");
        familyHistoryTxt.setText("");
        //appointment.setPrescription(prescription);
        JOptionPane.showMessageDialog(null, "History sucessfully added"); 
        DB4OUtil.getInstance().storeSystem(ecosystem);
        populatePatientDetails();
        }
        
    }//GEN-LAST:event_btnAddPatientDetailsActionPerformed

    public void populatePatientDetails(){
        DefaultTableModel model = (DefaultTableModel) patientDetailsTbl.getModel();
        model.setRowCount(0);
        if(patient.getPatHistoryDetails() == null )
        {
            PatientHistoryDetails patientHistoryDetails = new PatientHistoryDetails();
                
                patient.getPatHistoryDetails().add(patientHistoryDetails);
        }
        for(PatientHistoryDetails phd : patient.getPatHistoryDetails())
        {
        
            Object[] row = new Object[6];
            row[0] = phd.getMedAllergies();
            row[1] = phd.getAllergy();
            row[2] =phd.getPrevDiagnosis();
            row[3] = phd.getFamilyHistory();
            row[4] = phd.getSurgeryHistory();
            row[5] = phd;//.getId();
            model.addRow(row);
        }   
    }
    
    
    private void patientNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientNameTxtActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int row = patientDetailsTbl.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

         PatientHistoryDetails fsch= (PatientHistoryDetails)  patientDetailsTbl.getValueAt(row,5);
        
        previuous = fsch;
        patientNameTxt.setText(patient.getNameVar());
        previousDiagnosisTxt.setText(fsch.getPrevDiagnosis());
        medAlergiesTxt.setText(fsch.getMedAllergies());
        alergiesTxt.setText(fsch.getAllergy());
        surgeryHistoryTxt.setText(fsch.getSurgeryHistory());
        familyHistoryTxt.setText(fsch.getFamilyHistory());
        
        
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void txtpatientHistoryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpatientHistoryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpatientHistoryIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alergiesTxt;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAddPatientDetails;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JTextField familyHistoryTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField medAlergiesTxt;
    private javax.swing.JTable patientDetailsTbl;
    private javax.swing.JTextField patientNameTxt;
    private javax.swing.JTextField previousDiagnosisTxt;
    private javax.swing.JTextField surgeryHistoryTxt;
    private javax.swing.JTextField txtpatientHistoryId;
    // End of variables declaration//GEN-END:variables
}
