/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdmin;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Employee.Employee;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Role.AdminRole;
import model.UserAccount.UserAccount;
import static model.Utility.EmailClass.sendEmailMessage;
import static model.Utility.EmailClass.sendTextMessage;
import model.Utility.Validation;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sushmithaprathap
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateNetworkComboBox();
        populateMobileCarrierComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkArray()) {
            for (Enterprise enterprise : network.getEnterpriseDir().getEnterpriseArray()) {
                for (UserAccount userAccount : enterprise.getUserAcctDir().getUserAccountList()) {
                    if(userAccount.getRole().roleValue().equals("Admin Role")){
                        Object[] row = new Object[3];
                        row[0] = enterprise.getOrgName();
                        row[1] = network.getName();
                        row[2] = userAccount.getUsername();

                        model.addRow(row);
                    }
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkArray()){
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseJComboBox.removeAllItems();
        //enterpeirse-> bostonHospital!
        for (Enterprise enterprise : network.getEnterpriseDir().getEnterpriseArray()){
            enterpriseJComboBox.addItem(enterprise);
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
        enterpriseJTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        submitJButton = new javax.swing.JButton();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        contactCarrier = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        phoneNumberTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        uEmailTxt = new javax.swing.JTextField();
        nameJTextField = new javax.swing.JTextField();
        passwordJPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setBackground(new java.awt.Color(255, 193, 131));
        enterpriseJTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(68, 145, 157)));
        enterpriseJTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseJTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 400, 210));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(68, 145, 157)));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        submitJButton.setBackground(new java.awt.Color(102, 147, 255));
        submitJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.setPreferredSize(new java.awt.Dimension(100, 40));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        networkJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Username");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(25, 56, 82));
        jLabel11.setText("Carrier");

        usernameJTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        usernameJTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 204, 255)));
        usernameJTextField.setSelectionColor(new java.awt.Color(68, 145, 157));

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

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Enterprise");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(25, 56, 82));
        jLabel9.setText("Phone Number");

        enterpriseJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        phoneNumberTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        phoneNumberTxt.setForeground(new java.awt.Color(25, 56, 82));
        phoneNumberTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 204, 255)));
        phoneNumberTxt.setSelectionColor(new java.awt.Color(68, 145, 157));
        phoneNumberTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTxtActionPerformed(evt);
            }
        });
        phoneNumberTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneNumberTxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneNumberTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneNumberTxtKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(25, 56, 82));
        jLabel7.setText("Email Id");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Password");

        uEmailTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        uEmailTxt.setForeground(new java.awt.Color(25, 56, 82));
        uEmailTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 204, 255)));
        uEmailTxt.setSelectionColor(new java.awt.Color(68, 145, 157));
        uEmailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uEmailTxtActionPerformed(evt);
            }
        });
        uEmailTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uEmailTxtKeyTyped(evt);
            }
        });

        nameJTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nameJTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 204, 255)));
        nameJTextField.setSelectionColor(new java.awt.Color(68, 145, 157));

        passwordJPasswordField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        passwordJPasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 204, 255)));
        passwordJPasswordField.setSelectionColor(new java.awt.Color(68, 145, 157));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Network");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Name");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Add Enterprise Head");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3))
                                    .addGap(52, 52, 52)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(networkJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel11))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(contactCarrier, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(uEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactCarrier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/managerHead.jpg"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 217, 319));

        jPanel14.setBackground(new java.awt.Color(196, 224, 229));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 130));

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

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(68, 145, 157));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Manage Enterprise Head");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 450, 40));

        backJButton.setBackground(new java.awt.Color(102, 147, 255));
        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.setPreferredSize(new java.awt.Dimension(100, 40));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
        
        
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    
    
    public void populateMobileCarrierComboBox() {
        contactCarrier.removeAllItems();
        contactCarrier.addItem("ATT");
        contactCarrier.addItem("Sprint");
        contactCarrier.addItem("TMobile");
        contactCarrier.addItem("Verizon");
    }
    
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void contactCarrierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactCarrierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactCarrierActionPerformed

    private void contactCarrierKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactCarrierKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_contactCarrierKeyTyped

    private void phoneNumberTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTxtActionPerformed

    private void phoneNumberTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTxtKeyPressed

    private void phoneNumberTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberTxtKeyReleased
        // TODO add your handling code here:
        //        if(uContact.getText().trim().length() != 11){
            //          contactFormatMessage.setVisible(true);
            //          contactValid = false;
            //        }
        //        else if (!contactValidity(uContact.getText())) {
            //            contactFormatMessage.setVisible(true);
            //            contactValid = false;
            //        } else {
            //            uContact.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            //            uContact.setForeground(Color.BLACK);
            //            contactFormatMessage.setVisible(false);
            //            contactSuccessLabel.setVisible(true);
            //            contactValid = true;
            //            int delay = 2500; //milliseconds
            //            ActionListener taskPerformer = new ActionListener() {
                //                public void actionPerformed(ActionEvent evt) {
                    //                    contactSuccessLabel.setVisible(false);
                    //                }
                //            };
            //            javax.swing.Timer tick = new javax.swing.Timer(delay, taskPerformer);
            //            tick.setRepeats(false);
            //            tick.start();
            //        }
    }//GEN-LAST:event_phoneNumberTxtKeyReleased

    private void phoneNumberTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberTxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTxtKeyTyped

    private void uEmailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uEmailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uEmailTxtActionPerformed

    private void uEmailTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uEmailTxtKeyTyped
      
    }//GEN-LAST:event_uEmailTxtKeyTyped

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();

        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();
        String uEmail = uEmailTxt.getText();//"aditijain2025@gmail.com";

        //check if username is unique
        boolean isUserNameUnique = Validation.checkIfUserNameIsUniqueAcrossNetworks(system,username);

        System.out.println("isUserNameUnique:" + isUserNameUnique);
        if (isUserNameUnique == false) {

            JOptionPane.showMessageDialog(null, "Username already exists, try another name!");
            return;
        }

        boolean isUserNameCorrect = Validation.userNameValidator(username);
        if(isUserNameCorrect == false)
        {
            JOptionPane.showMessageDialog(null, "Enter username properly: only alphabets and numbers allowed!");
            return;
        }
        boolean isValid=Validation.emailValidator(uEmail);
        if(isValid == false){
            JOptionPane.showMessageDialog(null, "Enter email correctly");
            return;
        }
        boolean isPasswordCorrect = Validation.passwordValidator(password);
        if(isPasswordCorrect == false)
        {
            JOptionPane.showMessageDialog(null, "Enter password properly!");
            return;
        }
        boolean isNameCorrect = Validation.validateString(name);
        if(isNameCorrect == false)
        {
            JOptionPane.showMessageDialog(null, "Enter name properly!");
            return;
        }

        if(!phoneNumberValidity(phoneNumberTxt.getText())){
            JOptionPane.showMessageDialog(null, "Phone number is incorrect, only 10 digits no prefix");
            return;
        }

        Employee employee = enterprise.getEmpDir().postEmployee(name);
        employee.setRole("Head Role");
        UserAccount account = enterprise.getUserAcctDir().createUserAccount(username, password, employee, new AdminRole());
        populateTable();
        //send email and sms

        String contact = "";

        if (contactCarrier.getSelectedItem().equals("ATT")) {
            contact = phoneNumberTxt.getText() + "@txt.att.net";
        } else if (contactCarrier.getSelectedItem().equals("Verizon")) {
            contact = phoneNumberTxt.getText() + "@vmobl.com";
        } else if (contactCarrier.getSelectedItem().equals("Sprint")) {
            contact = phoneNumberTxt.getText() + "@messaging.sprintpcs.com";
        } else if (contactCarrier.getSelectedItem().equals("TMobile")) {
            contact = phoneNumberTxt.getText() + "@tmomail.net";
        }
        //registrationRequest.setContactCarrierName(contact);
        sendEmailMessage(uEmail, account);//.getText());
        sendTextMessage(contact);

        JOptionPane.showMessageDialog(null, "User added successfully");
        // return;
        DB4OUtil.getInstance().storeSystem(system);
        
        nameJTextField.setText("");
        passwordJPasswordField.setText("");
        uEmailTxt.setText("");
        usernameJTextField.setText("");
        phoneNumberTxt.setText("");
    }//GEN-LAST:event_submitJButtonActionPerformed
public Boolean phoneNumberValidity(String customerContact) {
        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(customerContact);
        if(matcher.matches()){
            return true;
        }
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox contactCarrier;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JTextField phoneNumberTxt;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField uEmailTxt;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
