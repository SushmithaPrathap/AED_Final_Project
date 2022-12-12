/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.InsuranceRole;

import model.appointment.Appointment;
import model.Bill.Bill;
import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Employee.Employee;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.Patient.Patient;
import model.UserAccount.UserAccount;
import model.Utility.Validation;
import model.WorkQueue.InsuranceWorkRequest;
import model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sushmithaprathap
 */
public class InsuranceDWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    //private LabOrganization labOrganization;

    private Employee insurnceAprrover;
    private Appointment appointment;
    private Patient patient;
    private WorkRequest request;
    private Enterprise enterprise;
    private Bill bill;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public InsuranceDWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, WorkRequest request, Enterprise enterprise) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        //this.labOrganization = (LabOrganization)organization;

        //this.insurnceAprrover = insurnceAprrover;
        this.appointment = ((InsuranceWorkRequest) request).getAppointment();
        this.patient = appointment.getPatient();
        this.request = request;
        this.enterprise = enterprise;
        this.bill = appointment.getHospitalbill();
        populatecbox();
        //populateTable();
        txtInsuID.setText(patient.getInsId());
        txtInsuID.setEditable(false);
        txtEnterprise.setEditable(false);
        txtEnterprise.setText(bill.getEnterprise().getOrgName() == null ? " " : bill.getEnterprise().getOrgName());

        double amt = bill.getChargeTotal() == 0.0 ? 1000.00 : bill.getChargeTotal();
        txtRequestedAmt.setText(String.valueOf(amt));
        txtApprovedAmt.setText(String.valueOf(amt));

        txtRequestedAmt.setEditable(false);
        txtApprovedAmt.setEditable(true);
        txtPatientName.setText(patient.getNameVar());

        Date date = new Date();
        // String timeFormatString = "hh:mm:ss a";
        //DateFormat timeFormat = new SimpleDateFormat(timeFormatString);
        //String currentTime = timeFormat.format(date);
        // System.out.println("Current time: "+currentTime);
        String dateFormatString = "YYYY-MM-dd";
        DateFormat dateFormat = new SimpleDateFormat(dateFormatString);
        String currentDate = dateFormat.format(date);
        //System.out.println("Current date: "+currentDate);
        txtDate.setText(currentDate);

        if (request.getStatus().equalsIgnoreCase("Close")) {
            // JOptionPane.showMessageDialog(null, "Request is already completed!");
            // return;
            btnSubmit.setEnabled(false);
        }

    }

    public void populatecbox() {
        cmbStatusType.removeAllItems();
        cmbStatusType.addItem("Select");
        //for (Appointment.AppointmentStatus type : Appointment.AppointmentStatus.values()){
        cmbStatusType.addItem("Approve");
        cmbStatusType.addItem("Not Approve");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        txtRequestedAmt = new javax.swing.JTextField();
        txtInsuID = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEnterprise = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        cmbStatusType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtApprovedAmt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Requested Amount:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Insurance ID :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Patient Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(68, 145, 157));
        jLabel3.setText("Insurance Approval Request");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        backJButton.setBackground(new java.awt.Color(102, 147, 255));
        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.setPreferredSize(new java.awt.Dimension(100, 40));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        txtRequestedAmt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtRequestedAmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 160, -1));

        txtInsuID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtInsuID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 160, -1));

        txtPatientName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 160, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Status :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        txtEnterprise.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 160, -1));

        btnSubmit.setBackground(new java.awt.Color(102, 147, 255));
        btnSubmit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setPreferredSize(new java.awt.Dimension(100, 40));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        cmbStatusType.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbStatusType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbStatusType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusTypeActionPerformed(evt);
            }
        });
        add(cmbStatusType, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 160, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/insurance2.jpg"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 530, 350));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Enterprise :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Approved Amount:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        txtApprovedAmt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtApprovedAmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 160, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Date:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        txtDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 160, -1));

        jPanel14.setBackground(new java.awt.Color(196, 224, 229));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 170));

        jPanel13.setBackground(new java.awt.Color(68, 145, 157));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        InsuranceDMainAreaJPanel sysAdminwajp = (InsuranceDMainAreaJPanel) component;
        sysAdminwajp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try {
            //String testName = testNameTxt.getText();
            int index = cmbStatusType.getSelectedIndex();

            if (request.getStatus().equalsIgnoreCase("Close")) {
                JOptionPane.showMessageDialog(null, "Request is already completed!");
                return;
            }

            if (index == 0) {
                JOptionPane.showMessageDialog(null, "Please select Status!");
                return;
            }
            if (index == 2) {
                JOptionPane.showMessageDialog(null, "Request is disapproved!");
                appointment.setStatus(Appointment.AppointmentStatus.DisapprovedInsurance.getValue());
                bill.setStatus("Disapproved Insurance");

                request.setStatus("Close");

                Validation.sendEmailMessage(patient.getEmail(), "Insurance Approval Report",
                        "Insurance is not approved, please pay amount! ");
                return;

            }

            Date date1 = new Date();
            String dateFormatString = "YYYY-MM-dd";
//      DateFormat dateFormat = new SimpleDateFormat(dateFormatString);
//      String currentDate = dateFormat.format(date1);
//        double testCharge = Double.parseDouble(txtApprovedAmt.getText());
            String testDate = txtDate.getText();
            try {
                SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
                date1 = formatter1.parse(testDate);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Please enter date properly!");
                return;
            }

            Double appAmt = 0d;
            try {
                appAmt = Double.parseDouble(txtApprovedAmt.getText());
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Please enter approved amount properly!");
                return;
            }

//        if(appAmt.equals("") || !Validation.validateDouble(appAmt))
//        {
//            JOptionPane.showMessageDialog(null, "Please enter approved amount properly!");
//            return;
//        }
            Double reqAmtDouble = bill.getChargeTotal();
            Double appAmtDouble = appAmt;

            if (appAmtDouble > reqAmtDouble) {
                JOptionPane.showMessageDialog(null, "Approved amount cannot be greater than requested amount!");
                return;
            }

            Double remaingAmt = reqAmtDouble - appAmtDouble;

            //String technicianName = technicianNameTxt.getText();
            //if(testName.equals("") || testDate.equals("") || technicianName.equals(""))
//       Appointment app= appointment; //(Appointment)cmbStatusType.getSelectedItem();
            appointment.setStatus(Appointment.AppointmentStatus.ApprovedInsurance.getValue());
            bill.setStatus("Approved Insurance");
            JOptionPane.showMessageDialog(null, "Insurance approved, sending email to patient for remaining amount if any.", "Information", JOptionPane.INFORMATION_MESSAGE);
            // txtPatientName.setText("");
            // txtAppointmetDate.setText("");
            //txtAppointmentType.setSelectedIndex(0);
            // cmbDoctor.setSelectedIndex(0);

            request.setStatus("Close");

            //send report to doctor email
            Validation.sendEmailMessage(patient.getEmail(), "Insurance Approval Report",
                    "Insurance is approved, please pay remaining amount: " + remaingAmt);
            DB4OUtil.getInstance().storeSystem(business);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Please fill in all fields properly");
        }


    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cmbStatusTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusTypeActionPerformed
        //String str=String.valueOf(cmbStatusType.getSelectedItem());
    }//GEN-LAST:event_cmbStatusTypeActionPerformed

    /* public void populatelabTestDetails(){
        DefaultTableModel model = (DefaultTableModel)labTestTbl.getModel();
        model.setRowCount(0);
        Object row[]=new Object[4];
            row[0] = labTest.getName();
            row[1] = labTest.getType();
            row[2] = labTest.getCreatedOn();
            row[3] = insurnceAprrover.getName();
            row[4] = labTest.getStatus();
            model.addRow(row);
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbStatusType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JTextField txtApprovedAmt;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEnterprise;
    private javax.swing.JTextField txtInsuID;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtRequestedAmt;
    // End of variables declaration//GEN-END:variables
}
