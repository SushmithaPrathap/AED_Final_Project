/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PatientLogin;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Employee.Employee;
import model.Enterprise.Enterprise;
import model.Enterprise.InsuranceEnterprise.Insurance;
import model.Location.Location;
import model.Network.Network;
import model.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Patient.Patient;
import model.Patient.PatientDirectory;
import model.Role.PatientRole;
import model.Utility.Validation;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import UI.KGradientPanel;


/**
 *
 * @author Suprith
 */
public class CreateNewPatientSelfJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewPatientJPanel
     */
   
    JPanel userProcessContainer;
    //Organization organization;
    //Enterprise enterprise;
    //UserAccount userAccount;
    DB4OUtil dB4OUtil ;
    EcoSystem ecosystem;
    Location locationPoint;
    //Network network;
    public CreateNewPatientSelfJPanel(
            JPanel userProcessContainer,
            DB4OUtil dB4OUtil 
            ,EcoSystem ecosystem) {
        initComponents();
        if(ecosystem.getPatientDirectory() == null){
            PatientDirectory patientDirectory = new PatientDirectory();
            patientDirectory.setPatientList(new ArrayList<Patient>());
            ecosystem.setPatientDirectory(patientDirectory);
        }
        
        if(ecosystem.getPatientDirectory().getPatientList() == null){
            
            ecosystem.getPatientDirectory().setPatientList(new ArrayList<Patient>());
           // ecosystem.setPatientDirectory(patientDirectory);
        }
       this.userProcessContainer = userProcessContainer;
        //this.organization = organization;
        //this.enterprise = enterprise;
       // this.userAccount = account;
        this.ecosystem = ecosystem;
        this.dB4OUtil = dB4OUtil;
        //this.network = network;
        populateMobileCarrierComboBox();
        populateCmbInsurance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblPatientName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JComboBox();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtBloodGroup = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        txtAddrStreet = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        contactCarrier = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        lblUserName1 = new javax.swing.JLabel();
        txtInsuranceID = new javax.swing.JTextField();
        lblGender1 = new javax.swing.JLabel();
        cmbInsuranceCompany = new javax.swing.JComboBox();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblUserName2 = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAddrCity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAddrState = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(102, 147, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        lblPatientName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPatientName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPatientName.setText("Patient Name:");
        add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 124, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(68, 145, 157));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register Patient");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 199, -1));

        txtPatientName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 166, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Street:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 60, -1));

        lblGender.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender:");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 124, -1));

        txtGender.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--", "Male", "Female", "Other" }));
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 166, -1));

        lblPhoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoneNumber.setText("Phone Number:");
        add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 124, -1));

        txtPhoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 166, -1));

        lblUserName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserName.setText("Username:");
        add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 90, -1));

        txtUserName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 166, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Password:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 74, -1));

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 166, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Blood Group:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        txtBloodGroup.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        add(txtBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 166, -1));

        btnSubmit.setBackground(new java.awt.Color(102, 147, 255));
        btnSubmit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setPreferredSize(new java.awt.Dimension(100, 40));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 750, -1, -1));

        txtAddrStreet.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAddrStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddrStreetActionPerformed(evt);
            }
        });
        add(txtAddrStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 166, -1));

        lblemail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblemail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblemail.setText("Email:");
        add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 129, -1));

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 166, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(25, 56, 82));
        jLabel11.setText("Carrier:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, 20));

        contactCarrier.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        contactCarrier.setForeground(new java.awt.Color(25, 56, 82));
        contactCarrier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        contactCarrier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactCarrierActionPerformed(evt);
            }
        });
        contactCarrier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactCarrierKeyTyped(evt);
            }
        });
        add(contactCarrier, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 165, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/CreatePatient.jpg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 299, -1));

        lblUserName1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblUserName1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserName1.setText("Insurance ID:");
        add(lblUserName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 110, -1));

        txtInsuranceID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 166, -1));

        lblGender1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblGender1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender1.setText("Insurance Company:");
        add(lblGender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 650, 160, -1));

        cmbInsuranceCompany.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbInsuranceCompany.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--", "Male", "Female", "Other" }));
        add(cmbInsuranceCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 650, 160, -1));

        jPanel14.setBackground(new java.awt.Color(196, 224, 229));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 210));

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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/createPatient2.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 530, 340));

        lblUserName2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblUserName2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserName2.setText("SSN:");
        add(lblUserName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 700, 110, -1));

        txtSSN.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 700, 166, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("ADDRESS");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 90, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("City:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 60, -1));

        txtAddrCity.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAddrCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddrCityActionPerformed(evt);
            }
        });
        add(txtAddrCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 166, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("State:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 60, -1));

        txtAddrState.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAddrState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddrStateActionPerformed(evt);
            }
        });
        add(txtAddrState, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 166, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    
    void populateCmbInsurance(){
         cmbInsuranceCompany.removeAllItems();;
        for(Network network : ecosystem.getNetworkList()){
        List<Enterprise> enterprsList = network.getEnterpriseDirectory().getEnterpriseList();
        if (enterprsList == null || enterprsList.isEmpty()) {
            //nothing
        } else {
            for (Enterprise enterprise : enterprsList) {
                if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.Insurance.getValue())) {
                    {
                        cmbInsuranceCompany.addItem(enterprise);
                    }
                }
            }

        }
        }//netowrk for
    }
    
    
    
    
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if(txtPatientName.getText().isEmpty() || txtGender.getSelectedIndex() == 0 ||
                txtPhoneNumber.getText().isEmpty() || txtUserName.getText().isEmpty() ||
                txtPassword.getText().isEmpty() || txtBloodGroup.getSelectedIndex() == 0
                || txtAddrStreet.getText().isEmpty()
                || txtEmail.getText().isEmpty()||
                txtInsuranceID.getText().isEmpty()
                || txtSSN.getText().isEmpty()
                ){
            JOptionPane.showMessageDialog(null, "All fields are mandatory", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String ssnString = txtSSN.getText();
        boolean checkSSN = Validation.checkSNNValidAndUnique(ssnString);
        if(checkSSN == false)
        {
            JOptionPane.showMessageDialog(null, "SSN is invalid", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String emailid= txtEmail.getText();
        boolean valid = Validation.emailValidator(emailid);
        if(valid == false)
        {
            JOptionPane.showMessageDialog(null, "Email ID invalid", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String userName = txtUserName.getText();
       // valid = enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
        
        //if(valid == false)
        //{
         //   JOptionPane.showMessageDialog(null, "User name exists, try other name", "Warning", JOptionPane.WARNING_MESSAGE);
          //  return;
        //}
        
        
        //check if username is unique
         boolean isUserNameUnique = Validation.checkIfUserNameIsUniqueAcrossNetworks(ecosystem,userName);
        System.out.println("isUserNameUnique: "+ isUserNameUnique);
         if(isUserNameUnique== false)
              {
                  
                  JOptionPane.showMessageDialog(null, "Username already exists, try another name!");
            return;
              }
        String phoneNumberString = txtPhoneNumber.getText();
        
        if(phoneNumberString.length() != 10){
            JOptionPane.showMessageDialog(null, "Phone number is not proper!");
            return;
        }
        
        locationPoint = new Location();
        locationPoint.setStreet(txtAddrStreet.getText());
        locationPoint.setState(txtAddrState.getText());
        locationPoint.setCity(txtAddrCity.getText());
        
        Insurance insuranceE =(Insurance)cmbInsuranceCompany.getSelectedItem();
        String insuranceId = txtInsuranceID.getText();
        UserAccount account = ecosystem.getUserAccountDirectory().createUserAccount(txtUserName.getText(), txtPassword.getText(), null, new PatientRole());
       
       
        Employee emp= ecosystem.getPatientDirectory().createPatient(txtPatientName.getText(), phoneNumberString, txtGender.getSelectedItem().toString(),
                txtBloodGroup.getSelectedItem().toString(), account, locationPoint, txtEmail.getText(),insuranceE,insuranceId , ssnString);
        account.setEmployee(emp);
       
        if (contactCarrier.getSelectedItem().equals("ATT")) {
             phoneNumberString="@txt.att.net";
        } else if (contactCarrier.getSelectedItem().equals("Verizon")) {
            phoneNumberString ="@vmobl.com";
        } else if (contactCarrier.getSelectedItem().equals("Sprint")) {
            phoneNumberString =  "@messaging.sprintpcs.com";
        } else if (contactCarrier.getSelectedItem().equals("TMobile")) {
            phoneNumberString = "@tmomail.net";
        }
        emp.setCarrier(phoneNumberString);
        
        JOptionPane.showMessageDialog(null, "Registered successfully!","Information", JOptionPane.INFORMATION_MESSAGE);
        
        txtPatientName.setText("");
        txtPhoneNumber.setText("");
        txtGender.setSelectedIndex(0);
        txtUserName.setText("");
        txtPassword.setText("");
        txtBloodGroup.setSelectedIndex(0);
        txtAddrStreet.setText("");
        txtAddrState.setText("");
        txtAddrCity.setText("");
        txtEmail.setText("");
        txtInsuranceID.setText("");
        txtSSN.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

    
     public void populateMobileCarrierComboBox() {
        contactCarrier.removeAllItems();
        contactCarrier.addItem("ATT");
        contactCarrier.addItem("Sprint");
        contactCarrier.addItem("TMobile");
        contactCarrier.addItem("Verizon");
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        userProcessContainer.remove(this);
//       
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);

      userProcessContainer.removeAll();
        //JPanel blankJP = new JPanel();
        KGradientPanel blankJP = new KGradientPanel();
        userProcessContainer.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        dB4OUtil.storeSystem(ecosystem);

    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void contactCarrierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactCarrierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactCarrierActionPerformed

    private void contactCarrierKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactCarrierKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_contactCarrierKeyTyped

    private void txtAddrStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddrStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddrStreetActionPerformed

    private void txtAddrCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddrCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddrCityActionPerformed

    private void txtAddrStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddrStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddrStateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cmbInsuranceCompany;
    private javax.swing.JComboBox contactCarrier;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblGender1;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserName1;
    private javax.swing.JLabel lblUserName2;
    private javax.swing.JLabel lblemail;
    private javax.swing.JTextField txtAddrCity;
    private javax.swing.JTextField txtAddrState;
    private javax.swing.JTextField txtAddrStreet;
    private javax.swing.JComboBox txtBloodGroup;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JComboBox txtGender;
    private javax.swing.JTextField txtInsuranceID;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
