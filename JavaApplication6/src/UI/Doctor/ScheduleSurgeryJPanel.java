/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Doctor;

import model.appointment.Appointment;
import model.appointment.AppointmentDirectory;
import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Employee.Employee;
import model.Enterprise.Enterprise;
import model.Medicine.MedicineDirectory;
import model.Operation.Operation;
import model.Patient.Patient;
import model.UserAccount.UserAccount;
import model.Utility.Validation;
import model.WorkQueue.NurseWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suprith
 */


public class ScheduleSurgeryJPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Patient patient;
    private Employee doctor;
    private Appointment appointment;
    private MedicineDirectory medicineList;
    private AppointmentDirectory prescriptionList;
    private Enterprise enterprise;
    private EcoSystem ecosystem;
    
    /**
     * Creates new form ScheduleSurgeryJPanel
     */
    public ScheduleSurgeryJPanel(JPanel userProcessContainer, Patient patient, Appointment appointment, Employee doctor,
            MedicineDirectory medicineList,EcoSystem ecosystem, Enterprise enterprise, UserAccount userAccount) {
       initComponents();
        this.userProcessContainer = userProcessContainer;
        this.appointment = appointment;
        this.patient = patient;
        this.doctor = doctor;
        this.ecosystem=ecosystem;
        this.medicineList = medicineList;
        this.enterprise= enterprise;
        this.userAccount = userAccount;
        
        //doctorNameTxt.setText(doctor.getName());
        //docotr
        //appointment.
        //appointment.setPrescription(prescription);
        populateSurgery();
        populateOperationType();
        
        File file = new File("./icon/istockphoto-1284998097-612x612");
                URL url;



try {
url = file.toURI().toURL();
    ImageIcon profilePic = new ImageIcon(url);
profilePic = new ImageIcon(profilePic.getImage().getScaledInstance(250,250, Image.SCALE_SMOOTH)); //a



jLabel6.setText("");
jLabel6.setIcon(profilePic);



} catch(MalformedURLException ex) {
    Logger.getLogger(this.getName()).log(Level.SEVERE , null , ex);
}
        
    }

    
    void populateSurgery(){
           DefaultTableModel model = (DefaultTableModel) tblSurgeyDetails.getModel();
        model.setRowCount(0);
        Operation operatn = appointment.getOperation();
        if(appointment.getOperation() == null)
        {
            scheduleSurgeryJPanel.setVisible(true);
            patientNameTxt.setText(patient.getNameVar());
            appoinmtntDTxt.setText(String.valueOf(appointment.getAppointmentId()));
            appoinmtntDTxt.setEditable(false);
            patientNameTxt.setEditable(false);
            return;
        }else{
            scheduleSurgeryJPanel.setVisible(false);
        }
        
        //for (Map.Entry<Medicine, Double> entry : appointment.getPrescription().getMedicinePrescribed().entrySet()){
         Object[] row = new Object[7];
            row[0] = operatn.getOprType();
            row[1] = operatn.getOpDate();
            row[2] = operatn.getStatus() == null ? "New" : operatn.getStatus()  ;
            row[3] = operatn.getOpAmount();
            row[4] = operatn.getAssignedBed() == null ? "Requested" : operatn.getAssignedBed() ;
            row[5] = operatn.getOpDesc();
            row[6] = operatn.getPerson() == null ? "Not Assigned" : operatn.getPerson();
            //row[7] = operatn.get
            model.addRow(row);
    //}
        
        
    }
    
     public void populateOperationType(){
        cmbOperationType.removeAllItems();
        
        for (Operation.OperationType type : Operation.OperationType.values()){
            cmbOperationType.addItem(type.toString());
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

        scheduleSurgeryJPanel = new javax.swing.JPanel();
        appoinmtntDTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        patientNameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        closebtn = new javax.swing.JButton();
        oprDesc = new javax.swing.JLabel();
        cmbOperationType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOprDescptn = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSurgeyDetails = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scheduleSurgeryJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Add Schedule", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(68, 145, 157))); // NOI18N

        appoinmtntDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appoinmtntDTxtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Appointment ID:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Patient Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Schedule Date:");

        saveButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        saveButton.setText("Save");
        saveButton.setPreferredSize(new java.awt.Dimension(100, 40));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        closebtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        closebtn.setText("Close");
        closebtn.setPreferredSize(new java.awt.Dimension(100, 40));
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });

        oprDesc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        oprDesc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        oprDesc.setText("Decription:");

        cmbOperationType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOperationType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOperationTypeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Operation:");

        txtOprDescptn.setColumns(20);
        txtOprDescptn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtOprDescptn.setRows(5);
        jScrollPane2.setViewportView(txtOprDescptn);

        javax.swing.GroupLayout scheduleSurgeryJPanelLayout = new javax.swing.GroupLayout(scheduleSurgeryJPanel);
        scheduleSurgeryJPanel.setLayout(scheduleSurgeryJPanelLayout);
        scheduleSurgeryJPanelLayout.setHorizontalGroup(
            scheduleSurgeryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scheduleSurgeryJPanelLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(scheduleSurgeryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(oprDesc)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(scheduleSurgeryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbOperationType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(appoinmtntDTxt)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(scheduleSurgeryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(scheduleSurgeryJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(patientNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(scheduleSurgeryJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(dateTxt))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scheduleSurgeryJPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        scheduleSurgeryJPanelLayout.setVerticalGroup(
            scheduleSurgeryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scheduleSurgeryJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(scheduleSurgeryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appoinmtntDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(patientNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(scheduleSurgeryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(scheduleSurgeryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbOperationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(scheduleSurgeryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oprDesc)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(scheduleSurgeryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(scheduleSurgeryJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        tblSurgeyDetails.setBackground(new java.awt.Color(255, 193, 131));
        tblSurgeyDetails.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblSurgeyDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Surgery Name", "Date", "Status", "Charge", "Bed number", "Operation Desciprtion", "Nurse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSurgeyDetails.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblSurgeyDetails);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 1010, 162));

        backJButton.setBackground(new java.awt.Color(102, 147, 255));
        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.setPreferredSize(new java.awt.Dimension(100, 40));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 66, -1, -1));

        jPanel13.setBackground(new java.awt.Color(68, 145, 157));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 170, -1));

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

        add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 170));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(68, 145, 157));
        jLabel4.setText("Surgery Scheduling");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 212, 35));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 330, 290));
    }// </editor-fold>//GEN-END:initComponents

    private void appoinmtntDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appoinmtntDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appoinmtntDTxtActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
         DefaultTableModel model = (DefaultTableModel) tblSurgeyDetails.getModel();
        if(model.getRowCount()==1)
        {
            JOptionPane.showMessageDialog(null, "Operation is already created");
            return;
        }
        
        
        
        if(appoinmtntDTxt.getText().equals("") || patientNameTxt.getText().equals("") ||  dateTxt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty");
            return;
        }
        else{
            try {
              //  int selectedrow=DoctorWorkAreaTable.getSelectedRow();
              //  if(selectedrow<0){
               //     JOptionPane.showMessageDialog(null, "Please select a patient");
               //     return;
              //  }
                Operation operation= new Operation();//(Operation)DoctorWorkAreaTable.getValueAt(selectedrow, 0);

               // Patient patient = this.patient;
              //  Appointment appointment = 

                String date1=dateTxt.getText();

                boolean check=Validation.validateDate(date1);

                if(check == false)
                {
                    JOptionPane.showMessageDialog(null, "Date is not valid");
                    return;
                }

                operation.setPatient(patient);

                operation.setOpDate(date1);
                if(txtOprDescptn.getText() != null){
                    operation.setOpDesc(txtOprDescptn.getText());
                }
                else {
                    operation.setOpDesc(" ");

                }

                operation.setOpAmount(10000.00);
                operation.setDoc(doctor);
                operation.setStatus(Operation.OperationStatus.WaitingConfirmation.getStatValue());
                operation.setOprType((String)cmbOperationType.getSelectedItem());
                //set operation
                appointment.setOperation(operation);
                //changed next line status
                appointment.setStatus(Appointment.AppointmentStatus.Markforsurgery.getValue());
                NurseWorkRequest workreq = new NurseWorkRequest();
                workreq.setAppointment(appointment);
                workreq.setMessage("New Patient for Operation, please confirm an operation Date.");

                workreq.setSender(userAccount);
                workreq.setPatient(patient);

                //get today's Date->
                Date date= new Date();
                workreq.setRequestDate(date);
                workreq.setResolveDate(date);
                workreq.setStatus("New");
                UserAccount nurseUserAcc =null;
                //need employee list of the doctor's department -> organization
                // List<UserAccount> userAccDir=  organization.getUserAccountDirectory().getUserAccountList();
                //List<UserAccount> nurseList = enterprise.getUserAccountDirectory().getUserAccountList();
                //for(UserAccount account: userAccDir)
                // {
                    //    if(account.getRole().roleValue().equals("Nurse Role"))
                    //    {
                        workreq.setReceiver(null);
                        enterprise.getWorkQueue().getWorkRequestList().add(workreq);
                        //      }

                    //  }

                JOptionPane.showMessageDialog(null, "Schedule added successfully!");
                DB4OUtil.getInstance().storeSystem(ecosystem);
                scheduleSurgeryJPanel.setVisible(false);
                appoinmtntDTxt.setText("");
                patientNameTxt.setText("");
                //bloodGrpTxt.setText("");
                dateTxt.setText("");
                txtOprDescptn.setText("");
                populateSurgery();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Date must be entered in YYYY-MM-DD format");
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        scheduleSurgeryJPanel.setVisible(false);
    }//GEN-LAST:event_closebtnActionPerformed

    private void cmbOperationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOperationTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOperationTypeActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component [] componentArray = userProcessContainer.getComponents();
        Component c = componentArray[componentArray.length-1];
        DoctorWorkAreaJPanel ms = (DoctorWorkAreaJPanel) c;
        ms.populateRequestTable();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField appoinmtntDTxt;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton closebtn;
    private javax.swing.JComboBox<String> cmbOperationType;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel oprDesc;
    private javax.swing.JTextField patientNameTxt;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel scheduleSurgeryJPanel;
    private javax.swing.JTable tblSurgeyDetails;
    private javax.swing.JTextArea txtOprDescptn;
    // End of variables declaration//GEN-END:variables
}
