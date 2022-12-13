/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.LabTechnicianRole;

import model.appointment.Appointment;
import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Employee.Employee;
import model.Enterprise.Enterprise;
import model.Enterprise.Lab.Lab;
import model.Enterprise.Lab.LabTest;
import model.Organization.LabOrganization;
import model.Organization.Organization;
import model.Patient.Patient;
import model.UserAccount.UserAccount;
import model.Utility.Validation;
import model.WorkQueue.DoctorWorkRequest;
import model.WorkQueue.LabTechWorkRequest;
import model.WorkQueue.ReceptionistWorkRequest;
import model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sushmithaprathap
 */
public class LabTechnicianWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private LabOrganization labOrganization;
    private LabTest labTest;
    private Employee labTechnician;
    private Appointment appointment;
    private Patient patient;
    private WorkRequest request;
    private Enterprise enterprise;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public LabTechnicianWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, WorkRequest request, LabTest labTest, Enterprise enterprise) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        //this.labOrganization = (LabOrganization)organization;
        this.labTest = labTest;
        //this.labTechnician = labTechnician;
        this.appointment = ((LabTechWorkRequest) request).getAppt();
        this.request = request;
        this.enterprise = enterprise;
        this.patient = appointment.getPatient();
        populatecbox();
        //populateTable();
        testNameTxt.setText(labTest.getNameVar());
        testNameTxt.setEditable(false);
        technicianNameTxt.setEditable(false);
        technicianNameTxt.setText(userAccount.getEmp().getNameVar());
        testDateTxt.setText(new Date().toString());

        Date date = new Date();
        // String timeFormatString = "hh:mm:ss a";
        //DateFormat timeFormat = new SimpleDateFormat(timeFormatString);
        //String currentTime = timeFormat.format(date);
        // System.out.println("Current time: "+currentTime);
        String dateFormatString = "YYYY-MM-dd";
        DateFormat dateFormat = new SimpleDateFormat(dateFormatString);
        String currentDate = dateFormat.format(date);
        //System.out.println("Current date: "+currentDate);
        testDateTxt.setText(currentDate);

        if (labTest.getStatusVar().equals("Completed")) {
            cmbStatusType.setSelectedIndex(1);
            cmbStatusType.setEnabled(false);
        }
        txtDrRemarks.setText(request.getMsg());

        testChargeTxt.setText(labTest.getTestAmount() == 0d ? "" : String.valueOf(labTest.getTestAmount()));

        if (labTest.getStatusVar().equals("Completed")) {
            DefaultTableModel dtm = (DefaultTableModel) labTestTbl.getModel();
            dtm.setRowCount(0);
            //for (Appointment.AppointmentStatus type : Appointment.AppointmentStatus.values()){
            Object[] row = new Object[6];
            row[0] = labTest.getNameVar();
            row[1] = labTest.getTestAmount();
            row[2] = currentDate;
            row[3] = labTest.getLabTech().getNameVar();
            row[4] = cmbStatusType.getSelectedItem();
            row[5] = appointment.getPatient().getNameVar();
            dtm.addRow(row);
        }

    }

    public void populatecbox() {
        cmbStatusType.removeAllItems();
        cmbStatusType.addItem("Select");
        //for (Appointment.AppointmentStatus type : Appointment.AppointmentStatus.values()){
        cmbStatusType.addItem("Generated Report");

        //}
    }

//    public void populateTable(){
//        DefaultTableModel model = (DefaultTableModel)labTestTbl.getModel();
//        
//        model.setRowCount(0);
//        
//        for(WorkRequest request : labOrganization.getWorkQueue().getWorkRequestList()){
//            Object[] row = new Object[4];
//            row[0] = request;
//            row[1] = request.getSender().getEmployee().getName();
//            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
//            row[3] = request.getStatus();
//            
//            model.addRow(row);
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        labTestTbl = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        testDateTxt = new javax.swing.JTextField();
        testNameTxt = new javax.swing.JTextField();
        testChargeTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        technicianNameTxt = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblFileUpload = new javax.swing.JLabel();
        cmbStatusType = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDrRemarks = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labTestTbl.setBackground(new java.awt.Color(236, 236, 236));
        labTestTbl.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 204, 255)));
        labTestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Test Name", "Test charge", "Date", "Technician Name", "Status", "Patient"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(labTestTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 670, 160));

        processJButton.setBackground(new java.awt.Color(9, 87, 136));
        processJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        processJButton.setForeground(new java.awt.Color(255, 255, 255));
        processJButton.setText("Process for Billing");
        processJButton.setPreferredSize(new java.awt.Dimension(167, 40));
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, -1));

        refreshJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(9, 87, 136));
        refreshJButton.setText("Refresh");
        refreshJButton.setPreferredSize(new java.awt.Dimension(100, 40));
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Test Date :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Doctor Remarks: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Test charges :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(9, 87, 136));
        jLabel3.setText("Reporting and Testing");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(9, 87, 136));
        backJButton.setText("Back");
        backJButton.setPreferredSize(new java.awt.Dimension(100, 40));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        testDateTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(testDateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 160, -1));

        testNameTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(testNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 160, -1));

        testChargeTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(testChargeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 160, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Status :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        technicianNameTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(technicianNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 160, -1));

        btnSubmit.setBackground(new java.awt.Color(9, 87, 136));
        btnSubmit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.setPreferredSize(new java.awt.Dimension(100, 40));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        lblFileUpload.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(lblFileUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 360, 20));

        cmbStatusType.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbStatusType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbStatusType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusTypeActionPerformed(evt);
            }
        });
        add(cmbStatusType, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 160, -1));

        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(68, 145, 157));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/LabTechnicianRole/upload_48px_1.png"))); // NOI18N
        jLabel8.setText("Upload Report");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(202, 202, 202))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(112, 112, 112))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 170, 70));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Technician Name :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Test name :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txtDrRemarks.setColumns(20);
        txtDrRemarks.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtDrRemarks.setRows(5);
        jScrollPane2.setViewportView(txtDrRemarks);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 160, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = labTestTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        } else {
            if (request.getStatus().equals("Close")) {
                JOptionPane.showMessageDialog(null, "Already processed!");
                return;
            }

            Appointment labAppointment = null;
            if (request.getSender().getEmp().getRole().equals("Doctor Role")) {
                labAppointment = patient.getLabApptDir().postLabAppointment(patient, userAccount.getEmp(), appointment.getDate(), appointment.getType());
                labAppointment.getLabTestArray().addLabTest(labTest);
//                patient.getLabAppointmentDirectory().getAppointmentList().add(labAppointment);
                appointment.setStatus(Appointment.AppointmentStatus.GeneratedReport.getValue());
//                labAppointment.setStatus(Appointment.AppointmentStatus.Markforbilling.getValue());
            } else {
                labAppointment = appointment;
            }

            ReceptionistWorkRequest workreq = new ReceptionistWorkRequest();
            workreq.setStatus(Appointment.AppointmentStatus.Markforbilling.getValue());
            labAppointment.setStatus(Appointment.AppointmentStatus.Markforbilling.getValue());
            workreq.setMsg("Test completed for Patient, make bill");
            workreq.setAppt(labAppointment);
            // workreq.setPatient(patient);
            workreq.setSender(userAccount);
            workreq.setPatient(patient);
            workreq.setDoc(userAccount.getEmp());
            //workreq.setReceiver(userAccount);
            Lab lab = (Lab) enterprise;
            lab.getOrgWq().getWorkRequestArray().add(workreq);
            request.setStatus("Close");
            DB4OUtil.getInstance().storeSystem(business);

//                boolean isAdd = true;
//                if(lab.getPatientDirectory() != null && 
//                        lab.getPatientDirectory().getPatientList() != null){
//                    for(Patient p : lab.getPatientDirectory().getPatientList()){
//                        if(p.getId() == patient.getId()){
//                            isAdd = false;
//                            break;
//                        }
//                    }
//                }
//                if(isAdd){
//                    lab.getPatientDirectory().getPatientList().add(patient);
//                }
//UserAccount recepUseracc = null;
            //List<UserAccount> userAccDir=  organization.getUserAccountDirectory().getUserAccountList();
            //List<UserAccount> nurseList = enterprise.getUserAccountDirectory().getUserAccountList();
            //workreq.setReceiver(lab.getUserAccountDirectory().getUserAccountList().get(0));
        }

        JOptionPane.showMessageDialog(null, "Request completed, sent for billing!");

//        LabTestWorkRequest request = (LabTestWorkRequest)labTestTbl.getValueAt(selectedRow, 0);
//     
//        request.setStatus("Processing");
//        
//        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request);
//        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        //populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistantMainAreaJPanel sysAdminwajp = (LabAssistantMainAreaJPanel) component;
        sysAdminwajp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try {
            //String testName = testNameTxt.getText();
            int index = cmbStatusType.getSelectedIndex();
            if (index == 0) {
                JOptionPane.showMessageDialog(null, "Please select Status!");
                return;
            }

            if (lblFileUpload.getText() == null || lblFileUpload.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please upload file!");
                return;
            }
            if (labTest.getStatusVar() != null && labTest.getStatusVar().equals("Completed")) {
                JOptionPane.showMessageDialog(null, "Lab test is already completed!");
                return;
            }

            Date date1 = new Date();
            String dateFormatString = "YYYY-MM-dd";
            DateFormat dateFormat = new SimpleDateFormat(dateFormatString);
            String currentDate = dateFormat.format(date1);
            double testCharge = Double.parseDouble(testChargeTxt.getText());
            String testDate = testDateTxt.getText();
            try {
                SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
                date1 = formatter1.parse(testDate);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Please enter date properly!");
                return;
            }
            labTest.setStatusVar("Completed");
            labTest.setTestAmount(testCharge);
            //String technicianName = technicianNameTxt.getText();
            //if(testName.equals("") || testDate.equals("") || technicianName.equals(""))
            Appointment app = appointment; //(Appointment)cmbStatusType.getSelectedItem();
            //to do work request to send to doctor
            //add in work queue for assigned doctor
            DoctorWorkRequest drWorkReq = new DoctorWorkRequest();
            drWorkReq.setMsg("Test Completed, please analyse reports");

            UserAccount drUserAcc = request.getSender();

            drWorkReq.setReceiver(drUserAcc);
            drWorkReq.setSender(userAccount);
            drWorkReq.setStatus("New");
            app.setStatus(Appointment.AppointmentStatus.GeneratedReport.getValue());
            LabTechWorkRequest lwr = ((LabTechWorkRequest) (request));//.getPatient()

            lwr.setResDate(date1);
            drWorkReq.setPatient(lwr.getPatient());
            drWorkReq.setAppt(lwr.getAppt());
            drWorkReq.setReqDate(new Date());
            //drWorkReq.setResolveDate(new Date());
            //drUserAcc.getWorkQueue().getWorkRequestList().add(drWorkReq);
            JOptionPane.showMessageDialog(null, "Lab Test reports submitted, sending reports through email.", "Information", JOptionPane.INFORMATION_MESSAGE);
            DB4OUtil.getInstance().storeSystem(business);
            // txtPatientName.setText("");
            // txtAppointmetDate.setText("");
            //txtAppointmentType.setSelectedIndex(0);
            // cmbDoctor.setSelectedIndex(0);

            request.setStatus("Reports Sent");

            //
            DefaultTableModel dtm = (DefaultTableModel) labTestTbl.getModel();
            dtm.setRowCount(0);
            //for (Appointment.AppointmentStatus type : Appointment.AppointmentStatus.values()){
            Object[] row = new Object[6];
            row[0] = labTest.getNameVar();
            row[1] = labTest.getTestAmount();
            row[2] = currentDate;
            row[3] = labTest.getLabTech().getNameVar();
            row[4] = cmbStatusType.getSelectedItem();
            row[5] = appointment.getPatient().getNameVar();
            dtm.addRow(row);
            //}

            //send report to doctor email
            Validation.sendEmailAttachmentFunc(request.getSender().getEmp().getEmail(), "Reports for patient",
                    "Please find reports attached", lblFileUpload.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields properly");
        }


    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cmbStatusTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusTypeActionPerformed
        //String str=String.valueOf(cmbStatusType.getSelectedItem());
    }//GEN-LAST:event_cmbStatusTypeActionPerformed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        jPanel3.setBackground(Color.lightGray);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        //fc.showOpenDialog(jPanel3);

        // invoke the showsSaveDialog function to show the save dialog 
        int r = fc.showSaveDialog(null);

        // if the user selects a file 
        if (r == JFileChooser.APPROVE_OPTION) {
            // set the label to the path of the selected file 
            lblFileUpload.setText(fc.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel3MouseEntered

    /* public void populatelabTestDetails(){
        DefaultTableModel model = (DefaultTableModel)labTestTbl.getModel();
        model.setRowCount(0);
        Object row[]=new Object[4];
            row[0] = labTest.getName();
            row[1] = labTest.getType();
            row[2] = labTest.getCreatedOn();
            row[3] = labTechnician.getName();
            row[4] = labTest.getStatus();
            model.addRow(row);
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbStatusType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable labTestTbl;
    private javax.swing.JLabel lblFileUpload;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTextField technicianNameTxt;
    private javax.swing.JTextField testChargeTxt;
    private javax.swing.JTextField testDateTxt;
    private javax.swing.JTextField testNameTxt;
    private javax.swing.JTextArea txtDrRemarks;
    // End of variables declaration//GEN-END:variables
}
