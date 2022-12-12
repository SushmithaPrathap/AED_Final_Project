/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PatientRole;

import model.appointment.Appointment;
import model.EcoSystem;
import model.Employee.Employee;
import model.Enterprise.Enterprise;
import model.Enterprise.Lab.Lab;
import model.Enterprise.Lab.LabTest;
import model.Organization.Organization;
import model.Patient.Patient;
import model.UserAccount.UserAccount;
import static model.Utility.EmailClass.sendEmailMessageAppointment;
import static model.Utility.EmailClass.sendTextMessageAppointment;
import model.WorkQueue.DoctorWorkRequest;
import model.WorkQueue.LabTechnicianWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author avina
 */
public class BookAppointmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookAppointmentJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    //EcoSystem system;
    Patient patient;
    Integer time;
    public BookAppointmentJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        //this.system = system;
        this.patient = patient;
        
        txtPatientName.setText(patient.getNameVar());
        
        time=0;
        //populate doctor
        if(enterprise.getTypeEnterprise().getValue().equals(Enterprise.EnterpriseType.Hospital.getValue())){
            txtTestName.setEnabled(false);
            lblTestName.setEnabled(false);
        }else{
            txtTestName.setEnabled(true);
            lblTestName.setEnabled(true);
        }
        
        populateDoctor(); //-- todo now
        
    }

    void populateDoctor(){
       List<Employee> empList= new ArrayList<>();//enterprise.getEmployeeDirectory().getDoctorList();
       
       ArrayList<Organization> deptList = enterprise.getOrgDir().getOrganizationArray();
       if(enterprise.getTypeEnterprise().getValue().equals(Enterprise.EnterpriseType.Hospital.getValue())){
           for(Organization dept : deptList)
                {
                    if(dept instanceof model.Organization.GeneralOrganization){
                    for(Employee emp : dept.getEmpDir().getEmployeeArray()){
                        if(emp.getRole()!= null && (emp.getRole().equals("Doctor Role")))
                        {
                            empList.add(emp);
                        }
                    }
                    }
                }
       }else if(enterprise.getTypeEnterprise().getValue().equals(Enterprise.EnterpriseType.Lab.getValue())){
           for(Organization dept : deptList)
                {
                    if((dept instanceof model.Organization.PathologyOrganization) || 
                            (dept instanceof model.Organization.RadiologyOrganization)){
                    for(Employee emp : dept.getEmpDir().getEmployeeArray()){
                        if(emp.getRole()!= null && (emp.getRole().equals("Lab Technician Role")))
                        {
                            empList.add(emp);
                        }
                    }
                    }
                }
       }
       
       
        cmbDoctor.removeAllItems();
        //Employee emp = new Employee();
        cmbDoctor.addItem("Select");
        for (Employee doc : empList){
            cmbDoctor.addItem(doc);
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbDoctor = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtAppointmetDate = new javax.swing.JTextField();
        txtBookAppointment = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtAppointmentType = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jpnael10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jpnael1014 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jpnael15 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jpnael11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jpnael12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jpnael16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblTestName = new javax.swing.JLabel();
        txtTestName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(68, 145, 157));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Appointment");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 220, -1));

        jButton1.setBackground(new java.awt.Color(102, 147, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 58, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Patient Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 109, -1));

        txtPatientName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 148, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Doctor:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 109, -1));

        cmbDoctor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDoctorActionPerformed(evt);
            }
        });
        add(cmbDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 148, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Appointment Date:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 150, -1));

        txtAppointmetDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAppointmetDateFocusLost(evt);
            }
        });
        txtAppointmetDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtAppointmetDateMouseExited(evt);
            }
        });
        txtAppointmetDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppointmetDateActionPerformed(evt);
            }
        });
        txtAppointmetDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAppointmetDateKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAppointmetDateKeyTyped(evt);
            }
        });
        add(txtAppointmetDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 148, -1));

        txtBookAppointment.setBackground(new java.awt.Color(255, 155, 54));
        txtBookAppointment.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtBookAppointment.setText("Book Appointment");
        txtBookAppointment.setPreferredSize(new java.awt.Dimension(167, 40));
        txtBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookAppointmentActionPerformed(evt);
            }
        });
        add(txtBookAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Appointment Type:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        txtAppointmentType.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAppointmentType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--", "In-Person", "Online" }));
        add(txtAppointmentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 148, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bookAppomnt.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, 145));

        jpnael10.setBackground(new java.awt.Color(164, 208, 215));
        jpnael10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnael10MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("10 AM");

        javax.swing.GroupLayout jpnael10Layout = new javax.swing.GroupLayout(jpnael10);
        jpnael10.setLayout(jpnael10Layout);
        jpnael10Layout.setHorizontalGroup(
            jpnael10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnael10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnael10Layout.setVerticalGroup(
            jpnael10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnael10Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(24, 24, 24))
        );

        add(jpnael10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        jpnael1014.setBackground(new java.awt.Color(164, 208, 215));
        jpnael1014.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnael1014MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("14 PM");

        javax.swing.GroupLayout jpnael1014Layout = new javax.swing.GroupLayout(jpnael1014);
        jpnael1014.setLayout(jpnael1014Layout);
        jpnael1014Layout.setHorizontalGroup(
            jpnael1014Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnael1014Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnael1014Layout.setVerticalGroup(
            jpnael1014Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnael1014Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(24, 24, 24))
        );

        add(jpnael1014, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, -1, -1));

        jpnael15.setBackground(new java.awt.Color(164, 208, 215));
        jpnael15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnael15MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("15 PM");

        javax.swing.GroupLayout jpnael15Layout = new javax.swing.GroupLayout(jpnael15);
        jpnael15.setLayout(jpnael15Layout);
        jpnael15Layout.setHorizontalGroup(
            jpnael15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnael15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jpnael15Layout.setVerticalGroup(
            jpnael15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnael15Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        add(jpnael15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        jpnael11.setBackground(new java.awt.Color(164, 208, 215));
        jpnael11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnael11MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("11 AM");

        javax.swing.GroupLayout jpnael11Layout = new javax.swing.GroupLayout(jpnael11);
        jpnael11.setLayout(jpnael11Layout);
        jpnael11Layout.setHorizontalGroup(
            jpnael11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnael11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnael11Layout.setVerticalGroup(
            jpnael11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnael11Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(24, 24, 24))
        );

        add(jpnael11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, -1));

        jpnael12.setBackground(new java.awt.Color(164, 208, 215));
        jpnael12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnael12MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("12 PM");

        javax.swing.GroupLayout jpnael12Layout = new javax.swing.GroupLayout(jpnael12);
        jpnael12.setLayout(jpnael12Layout);
        jpnael12Layout.setHorizontalGroup(
            jpnael12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnael12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jpnael12Layout.setVerticalGroup(
            jpnael12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnael12Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel12)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        add(jpnael12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, 60));

        jpnael16.setBackground(new java.awt.Color(164, 208, 215));
        jpnael16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnael16MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("16 PM");

        javax.swing.GroupLayout jpnael16Layout = new javax.swing.GroupLayout(jpnael16);
        jpnael16.setLayout(jpnael16Layout);
        jpnael16Layout.setHorizontalGroup(
            jpnael16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnael16Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnael16Layout.setVerticalGroup(
            jpnael16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnael16Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(24, 24, 24))
        );

        add(jpnael16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, 60));

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

        add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 200));

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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SMS.jpg"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 560, 497));

        lblTestName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTestName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTestName.setText("Test Name:");
        add(lblTestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 120, -1));

        txtTestName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtTestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtAppointmetDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppointmetDateActionPerformed
        // TODO add your handling code here:
      //  setPanelTime();
        
        
        
    }//GEN-LAST:event_txtAppointmetDateActionPerformed

    private void txtBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookAppointmentActionPerformed
        if(txtPatientName.getText().isEmpty() || txtAppointmetDate.getText().isEmpty() || txtAppointmentType.getSelectedIndex() == 0
                || cmbDoctor.getSelectedIndex() == 0 || (txtTestName.isEnabled() && txtTestName.getText().isEmpty()))
        {
            JOptionPane.showMessageDialog(null, "All fields are mandatory", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        //|| cmbDoctor.getSelectedIndex() == 0
        if(time==0)
        {
            JOptionPane.showMessageDialog(null, "Please select a time!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String sDate = txtAppointmetDate.getText();
        SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-MM-dd");
        Date date1= new Date();  
        try {
            date1 = formatter1.parse(sDate);
        } catch (ParseException ex) {
            Logger.getLogger(BookAppointmentJPanel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("expection in Book appointmentJPanel");
        }
        Employee doctor = (Employee)cmbDoctor.getSelectedItem();
        if(enterprise.getTypeEnterprise().getValue().equals(Enterprise.EnterpriseType.Hospital.getValue())){
            for(Appointment appointment : patient.getApptDir().getAppointmentList()){
                if((appointment.getDate().compareTo(date1) == 0) && (appointment.getDoctor().getID() == doctor.getID()) && !appointment.getStatus().equalsIgnoreCase(Appointment.AppointmentStatus.Cancel.getValue())){
                    JOptionPane.showMessageDialog(null, "Patient has already booked appointment!", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }else if(enterprise.getTypeEnterprise().getValue().equals(Enterprise.EnterpriseType.Lab.getValue())){
            for(Appointment appointment : patient.getLabApptDir().getAppointmentList()){
                if((appointment.getDate().compareTo(date1) == 0) && (appointment.getDoctor().getID() == doctor.getID()) && !appointment.getStatus().equalsIgnoreCase(Appointment.AppointmentStatus.Cancel.getValue())){
                    JOptionPane.showMessageDialog(null, "Patient has already booked appointment!", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }
        
        
       
        boolean check = doctor.checkAvailableSchedule(date1, time);
        if(check ==false)
        {
                JOptionPane.showMessageDialog(null, "Doctor has other appointment already, please select other time!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        
        
        Appointment appoint = null;
        if(enterprise.getTypeEnterprise().getValue().equals(Enterprise.EnterpriseType.Hospital.getValue())){
            appoint = patient.getApptDir().createAppointment(patient, doctor, date1 , (String)txtAppointmentType.getSelectedItem());
            appoint.setTime(time);
        }else if(enterprise.getTypeEnterprise().getValue().equals(Enterprise.EnterpriseType.Lab.getValue())){
            appoint = patient.getLabApptDir().createLabAppointment(patient, doctor, date1 , (String)txtAppointmentType.getSelectedItem());
            appoint.setTime(time);
        }
        
        //get user accout of dcotor selected
        
       
       List<Employee> empList= new ArrayList<>();//enterprise.getEmployeeDirectory().getDoctorList();
       UserAccount drUserAcc =null;
       ArrayList<Organization> deptList = enterprise.getOrgDir().getOrganizationArray();
       for(Organization dept : deptList)
       {
           if(dept instanceof model.Organization.GeneralOrganization){
                drUserAcc = dept.getUserAcctDir().getUserAccByEMployee(doctor);
             if(drUserAcc!=null ) {break;}
           }else if(dept instanceof model.Organization.PathologyOrganization){
               drUserAcc = dept.getUserAcctDir().getUserAccByEMployee(doctor);
              if(drUserAcc!=null ) {break;}
           }else if(dept instanceof model.Organization.RadiologyOrganization){
               drUserAcc = dept.getUserAcctDir().getUserAccByEMployee(doctor);
             if(drUserAcc!=null ) {break;}
           }
       }
       //Integer [] arr = null;
       
       
       
        doctor.postSchedule(date1, time);
        txtPatientName.setText("");
        cmbDoctor.setSelectedIndex(0);
        txtAppointmetDate.setText("");
        txtAppointmentType.setSelectedIndex(0);
        
        //add in work queue for assigned doctor
        if(enterprise.getTypeEnterprise().getValue().equals(Enterprise.EnterpriseType.Lab.getValue())){
            LabTechnicianWorkRequest workreq = new LabTechnicianWorkRequest();
                workreq.setStatus("New");
                appoint.setStatus(Appointment.AppointmentStatus.MarkforTest.getValue());
                workreq.setMessage("New Patient for Lab test, please confirm a Test Date");
                workreq.setStatus("New");
                workreq.setAppointment(appoint);
                workreq.setMessage("Please conduct lab test!");
                workreq.setRequestDate(date1 == null ? new Date() : date1);
                //workreq.setDoctorUserAccount(userAccount);
                workreq.setSender(userAccount);
                workreq.setPatient(patient);
                //workreq.setDoctor(doctor);
                //workreq.setReceiver(userAccount);
                Lab lab = (Lab) enterprise;
                lab.getOrgWq().getWorkRequestList().add(workreq);
                LabTest labTest= new LabTest();
                labTest.setLab(lab);
                labTest.setLabTech(null);
                labTest.setPatient(patient);
                labTest.setNameVar(txtTestName.getText());
                labTest.setDoc(appoint.getDoctor());
                labTest.setStatusVar("New");
                //labTest.setType(testType);
                workreq.setLabTest(labTest);
                appoint.getLabTestList().addLabTest(labTest);
                appoint.setStatus(Appointment.AppointmentStatus.MarkforTest.getValue());
        }else if(enterprise.getTypeEnterprise().getValue().equals(Enterprise.EnterpriseType.Hospital.getValue())){
            DoctorWorkRequest drWorkReq = new DoctorWorkRequest();
            drWorkReq.setMessage("New Appointment");
            drWorkReq.setReceiver(drUserAcc);
            drWorkReq.setSender(userAccount);
            drWorkReq.setStatus("New");
            drWorkReq.setPatient(patient);
            drWorkReq.setAppointment(appoint);
            drWorkReq.setRequestDate(new Date());
            drWorkReq.setResolveDate(new Date());
            drUserAcc.getWorkQueue().getWorkRequestList().add(drWorkReq);
        }
        if(txtTestName.isEnabled()){
            txtTestName.setText("");
        }
        JOptionPane.showMessageDialog(null, "Appointment added", "Information", JOptionPane.INFORMATION_MESSAGE);
        
        
        //send sms and email to patient for appointment book status
        
        //send Sms
                
          //send email and sms

        String statusString = "Hello! Your appointment is booked! Date: "+ date1 + "Doctor: "+ doctor.getNameVar();

        String uEmail= patient.getEmail();
        UserAccount account = patient.getUserAcc();
        String phonecontact = patient.getPhone()+patient.getMobileCarrier();
        //registrationRequest.setContactCarrierName(contact);
        sendEmailMessageAppointment(uEmail, account, statusString);//.getText());
        sendTextMessageAppointment(phonecontact, account, statusString);      
        setPanelTime();
        //DB4OUtil.getInstance().storeSystem(system);
        
        //return;
    }//GEN-LAST:event_txtBookAppointmentActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        //Component[] componentArray =userProcessContainer.getComponents();
        //Component component = componentArray[componentArray.length - 1];
        //ReceptionistWorkAreaJPanel sysAdminwajp = (ReceptionistWorkAreaJPanel) component;
        //sysAdminwajp.populatePatients();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDoctorActionPerformed
        // TODO add your handling code here:
        setPanelTime();
        
    }//GEN-LAST:event_cmbDoctorActionPerformed

    void setPanelTime()
    {
        if(cmbDoctor.getSelectedIndex() ==0)
        {
        resetLblColor(jpnael11);
        resetLblColor(jpnael12);
        resetLblColor(jpnael1014);
        resetLblColor(jpnael15);
        resetLblColor(jpnael16);
        resetLblColor(jpnael10);
        return;
        }
        
        
        Employee doctor = (Employee)cmbDoctor.getSelectedItem();
        if(doctor !=null)
        {
        Date date1= new Date();
        try {
        String sDate = txtAppointmetDate.getText().equals("") ? "2020-12-20" :txtAppointmetDate.getText() ;
        SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-MM-dd");
            date1 = formatter1.parse(sDate);
        } catch (ParseException ex) {
            Logger.getLogger(BookAppointmentJPanel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("expection in Book appointmentJPanel");
        }
        if(doctor.getSchedule() == null)
        {
            Map<Date,ArrayList<Integer>> schedule = new HashMap<>();
            doctor.setSchedule(schedule);
            //schedule.put()
        }
        
        for(Map.Entry<Date,ArrayList<Integer>> sch : doctor.getSchedule().entrySet()){
            if(sch.getKey().equals(date1) )
            {
                ArrayList<Integer> arr = sch.getValue();
                //for(int i=0;1<arr.length;i++){
                if( arr.contains(10))
                {
                    jpnael10.setEnabled(false);
                    setLblColor(jpnael10);
                    //continue;
                }
                if(arr.contains(11))
                {
                    jpnael11.setEnabled(false);
                    setLblColor(jpnael11);
                    //continue;
                }
                if(arr.contains(12))
                {
                    jpnael12.setEnabled(false);
                    setLblColor(jpnael12);
                    //continue;
                }
               if(arr.contains(14))
                {
                    jpnael1014.setEnabled(false);
                    setLblColor(jpnael1014);
                    //continue;
                }
                if(arr.contains(15))
                {
                    jpnael15.setEnabled(false);
                    setLblColor(jpnael15);
                    //continue;
                }
                if(arr.contains(16))
                {
                    jpnael16.setEnabled(false);
                    setLblColor(jpnael16);
                    //continue;
                }
               // }
            }
        }
        
        }
    }
    
    
    private void jpnael10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnael10MouseClicked
        // TODO add your handling code here:
        setLblColor(jpnael10);
        resetLblColor(jpnael11);
        resetLblColor(jpnael12);
        resetLblColor(jpnael1014);
        resetLblColor(jpnael15);
        resetLblColor(jpnael16);
        time=10;
        
    }//GEN-LAST:event_jpnael10MouseClicked

    private void jpnael11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnael11MouseClicked
        // TODO add your handling code here:
        setLblColor(jpnael11);
        resetLblColor(jpnael10);
        resetLblColor(jpnael12);
        resetLblColor(jpnael1014);
        resetLblColor(jpnael15);
        resetLblColor(jpnael16);
        time=11;
    }//GEN-LAST:event_jpnael11MouseClicked

    private void jpnael12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnael12MouseClicked
        // TODO add your handling code here:
        setLblColor(jpnael12);
        resetLblColor(jpnael11);
        resetLblColor(jpnael10);
        resetLblColor(jpnael1014);
        resetLblColor(jpnael15);
        resetLblColor(jpnael16);
        time=12;
    }//GEN-LAST:event_jpnael12MouseClicked

    private void jpnael1014MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnael1014MouseClicked
        // TODO add your handling code here:
        setLblColor(jpnael1014);
        resetLblColor(jpnael11);
        resetLblColor(jpnael12);
        resetLblColor(jpnael10);
        resetLblColor(jpnael15);
        resetLblColor(jpnael16);
        time=14;
    }//GEN-LAST:event_jpnael1014MouseClicked

    private void jpnael15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnael15MouseClicked
        // TODO add your handling code here:
        setLblColor(jpnael15);
        resetLblColor(jpnael11);
        resetLblColor(jpnael12);
        resetLblColor(jpnael1014);
        resetLblColor(jpnael10);
        resetLblColor(jpnael16);
        time=15;
    }//GEN-LAST:event_jpnael15MouseClicked

    private void jpnael16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnael16MouseClicked
        // TODO add your handling code here:
        setLblColor(jpnael16);
        resetLblColor(jpnael11);
        resetLblColor(jpnael12);
        resetLblColor(jpnael1014);
        resetLblColor(jpnael15);
        resetLblColor(jpnael10);
        time=16;
    }//GEN-LAST:event_jpnael16MouseClicked

    private void txtAppointmetDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAppointmetDateKeyReleased
        // TODO add your handling code here:
        //setPanelTime();
    }//GEN-LAST:event_txtAppointmetDateKeyReleased

    private void txtAppointmetDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAppointmetDateKeyTyped
        // TODO add your handling code here:
        
      //  setPanelTime();
    }//GEN-LAST:event_txtAppointmetDateKeyTyped

    private void txtAppointmetDateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAppointmetDateMouseExited
        // TODO add your handling code here:
        
       // setPanelTime();
    }//GEN-LAST:event_txtAppointmetDateMouseExited

    private void txtAppointmetDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAppointmetDateFocusLost
        // TODO add your handling code here:
        
        setPanelTime();
    }//GEN-LAST:event_txtAppointmetDateFocusLost

    public void setLblColor(JPanel lbl)
    {
        lbl.setBackground(new Color(22, 42, 57));
    }
    
      public void resetLblColor(JPanel lbl)
    {
        lbl.setBackground(new Color(153,204,255));
    }
    
    
    private void onClick(JPanel panel)
    {
        panel.setBackground(new Color(205, 136, 205));
    }
    
     private void onLeaveClick(JPanel panel)
    {
        panel.setBackground(Color.white);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbDoctor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jpnael10;
    private javax.swing.JPanel jpnael1014;
    private javax.swing.JPanel jpnael11;
    private javax.swing.JPanel jpnael12;
    private javax.swing.JPanel jpnael15;
    private javax.swing.JPanel jpnael16;
    private javax.swing.JLabel lblTestName;
    private javax.swing.JComboBox txtAppointmentType;
    private javax.swing.JTextField txtAppointmetDate;
    private javax.swing.JButton txtBookAppointment;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtTestName;
    // End of variables declaration//GEN-END:variables
}
