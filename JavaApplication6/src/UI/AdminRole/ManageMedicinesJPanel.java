/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole;

import model.Enterprise.Enterprise;
import model.Enterprise.Pharmacy.Pharmacy;
import model.Medicine.Medicine;
import model.Medicine.MedicineDirectory;
import model.Organization.Organization;
import model.Organization.OrganizationDirectory;
import model.Role.DoctorRole;
import model.Role.LabTechnicianRole;
import model.Role.NurseRole;
import model.Role.PatientRole;
import model.Role.ReceptionistRole;
import model.Role.Role;
import model.Utility.Validation;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suprith
 */
public class ManageMedicinesJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private MedicineDirectory medicineDir;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageMedicinesJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDir, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.enterprise = enterprise;
        this.medicineDir = ((Pharmacy) enterprise).getMedicineArray();
        //populateMainMedicineComboBox();
        //populateOrganizationEmpComboBox();
        viewMedicineJPanel.setVisible(false);
        addMedicineJPanel.setVisible(false);
    }

    public void populateOrganizationComboBox() {
        cmbMainMedicineType.removeAllItems();

        for (Organization organization : organizationDir.getOrganizationList()) {
            cmbMainMedicineType.addItem(organization);
        }
    }

    public void populateOrganizationEmpComboBox() {
        cmbMedicineType.removeAllItems();
        Organization organization = (Organization) cmbMainMedicineType.getSelectedItem();
        List<Role> rolesList = organization.getRoleSupported();

        for (Role role : rolesList) {

            cmbMedicineType.addItem(role.roleValue());
        }
    }

    private void populateTable(String medType) {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        String date1 = null;
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
        for (Medicine med : medicineDir.getMedicineList()) {
            if (med.getType().equals(medType)) {

                Object[] row = new Object[6];
                row[0] = med;//.getId();
                row[1] = med.getName();
                row[2] = med.getDosage();
                row[3] = med.getQuantity();
                row[4] = med.getType();

                try {
                    date1 = formatter1.format(med.getExpiryDate());
                } catch (Exception ex) {
                    ex.printStackTrace();
//            Logger.getLogger(userinterface.PharmacyRole.ManageMedicinesJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }

                row[5] = date1;
                model.addRow(row);
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
        organizationJTable = new javax.swing.JTable();
        cmbMainMedicineType = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addMedicineJPanel = new javax.swing.JPanel();
        dosageJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        nameJTextField = new javax.swing.JTextField();
        cmbMedicineType = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        availableQtyTxt = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        closebtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        expDate = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        backJButton = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        viewMedicineJPanel = new javax.swing.JPanel();
        dosageJTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        priceTxt1 = new javax.swing.JTextField();
        nameJTextField1 = new javax.swing.JTextField();
        cmbMedicineType1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        availableQtyTxt1 = new javax.swing.JTextField();
        btnSave1 = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        closebtn1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        expDate1 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setBackground(new java.awt.Color(255, 193, 131));
        organizationJTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 204, 255)));
        organizationJTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Dosage", "Quantity", "Type", "Expiry Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationJTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(organizationJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 641, 177));

        cmbMainMedicineType.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbMainMedicineType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Liquid", "Tablet", "Gel", "Injection", "Other" }));
        cmbMainMedicineType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMainMedicineTypeActionPerformed(evt);
            }
        });
        add(cmbMainMedicineType, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 179, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(68, 145, 157));
        jLabel1.setText("Medicine Type");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(68, 145, 157));
        jLabel4.setText("Manage Medicine Inventory");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        addMedicineJPanel.setBackground(new java.awt.Color(255, 255, 255));
        addMedicineJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Medicine", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(68, 145, 157))); // NOI18N
        addMedicineJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dosageJTextField.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        addMedicineJPanel.add(dosageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 122, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel7.setText("Price");
        addMedicineJPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel2.setText("Name");
        addMedicineJPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        priceTxt.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        addMedicineJPanel.add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 122, -1));

        nameJTextField.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        addMedicineJPanel.add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 122, -1));

        cmbMedicineType.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        cmbMedicineType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Liquid", "Tablet", "Gel", "Injection", "Other" }));
        cmbMedicineType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMedicineTypeActionPerformed(evt);
            }
        });
        addMedicineJPanel.add(cmbMedicineType, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 32, 122, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel3.setText("Type");
        addMedicineJPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 38, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel5.setText("Dosage");
        addMedicineJPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel6.setText("Available Unit");
        addMedicineJPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        availableQtyTxt.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        addMedicineJPanel.add(availableQtyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 122, -1));

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        addMedicineJPanel.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 63, -1));

        closebtn.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        closebtn.setText("Close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        addMedicineJPanel.add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel8.setText("Expiry Date");
        addMedicineJPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        expDate.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        addMedicineJPanel.add(expDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 122, -1));

        add(addMedicineJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 416, 310, 340));

        jPanel1.setBackground(new java.awt.Color(164, 208, 215));

        backJButton.setBackground(new java.awt.Color(102, 147, 255));
        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(255, 155, 54));
        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdd.setText("Add Medicine");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(255, 155, 54));
        btnView.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnView.setText("View Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 47, -1, -1));

        viewMedicineJPanel.setBackground(new java.awt.Color(255, 255, 255));
        viewMedicineJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Medicine", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(68, 145, 157))); // NOI18N
        viewMedicineJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dosageJTextField1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        viewMedicineJPanel.add(dosageJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 105, 122, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Price");
        viewMedicineJPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 188, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Name");
        viewMedicineJPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 70, -1, -1));

        priceTxt1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        viewMedicineJPanel.add(priceTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 185, 122, -1));

        nameJTextField1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        viewMedicineJPanel.add(nameJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 67, 122, -1));

        cmbMedicineType1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        cmbMedicineType1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Liquid", "Tablet", "Gel", "Injection", "Other" }));
        cmbMedicineType1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMedicineType1ActionPerformed(evt);
            }
        });
        viewMedicineJPanel.add(cmbMedicineType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 32, 122, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Type");
        viewMedicineJPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 38, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Dosage");
        viewMedicineJPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 108, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Available Unit");
        viewMedicineJPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 148, -1, -1));

        availableQtyTxt1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        viewMedicineJPanel.add(availableQtyTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 145, 122, -1));

        btnSave1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSave1.setText("Save");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });
        viewMedicineJPanel.add(btnSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 256, 63, -1));

        btnUpdate1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnUpdate1.setText("Update Details");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });
        viewMedicineJPanel.add(btnUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 256, 124, -1));

        closebtn1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        closebtn1.setText("Close");
        closebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtn1ActionPerformed(evt);
            }
        });
        viewMedicineJPanel.add(closebtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Expiry Date");
        viewMedicineJPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 223, -1, -1));

        expDate1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        viewMedicineJPanel.add(expDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 220, 122, -1));

        add(viewMedicineJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 416, 300, 340));

        jPanel14.setBackground(new java.awt.Color(196, 224, 229));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 190));

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String name = nameJTextField.getText();
        String dosage = dosageJTextField.getText();
        String qty = availableQtyTxt.getText();
        String type = (String) cmbMedicineType.getSelectedItem();
        String date = expDate.getText();
        String priceString = priceTxt.getText();

        if (name == null || name.equals("")
                || dosage == null || dosage.equals("")
                || qty == null || qty.equals("")
                || type == null || type.equals("")
                || date == null || date.equals("")
                || priceString == null || priceString.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter all details", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //validation on data
        boolean valid = Validation.validateString(name);
        if (valid == false) {
            JOptionPane.showMessageDialog(null, "Please enter name correctly", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        valid = Validation.validateNumeric(dosage);
        if (valid == false) {
            JOptionPane.showMessageDialog(null, "Please enter dosage correctly", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        valid = Validation.validateNumeric(qty);
        if (valid == false) {
            JOptionPane.showMessageDialog(null, "Please enter quantity correctly", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        valid = Validation.validateDate(date);
        if (valid == false) {
            JOptionPane.showMessageDialog(null, "Please enter date correctly", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        valid = Validation.validateNumeric(dosage);
        if (valid == false) {
            JOptionPane.showMessageDialog(null, "Please enter price correctly", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //parse
        int quantity = Integer.parseInt(qty);
        double price = Double.parseDouble(priceString);

        if (price == 0.0) {
            JOptionPane.showMessageDialog(null, "Please enter price correctly, cannot be zero", "Warning", JOptionPane.WARNING_MESSAGE);
            return;

        }
        //Date parse

        Date date1 = null;
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date1 = formatter1.parse(date);
        } catch (ParseException ex) {
            System.out.println("Error in ManageMedicineJPanel for date paring");
            Logger.getLogger(ManageMedicinesJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        Medicine medicine = new Medicine();
        medicine.setDosage(dosage);
        medicine.setExpiryDate(date1);
        medicine.setName(name);
        medicine.setPrice(price);
        medicine.setQuantity(quantity);
        medicine.setType(type);
        //Add to dir           
        medicineDir.getMedicineList().add(medicine);

        JOptionPane.showMessageDialog(null, "Added successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        //DB4OUtil.getInstance().storeSystem(system);

        //populate table by using main medicine cmb box 
        String medType = (String) cmbMainMedicineType.getSelectedItem();
        populateTable(medType);

        nameJTextField.setText("");
        dosageJTextField.setText("");
        availableQtyTxt.setText("");
        //cmbMedicineType.setSelectedItem(med.getType());
        expDate.setText("");
        priceTxt.setText("");


    }//GEN-LAST:event_btnSaveActionPerformed

    public Role createObjectForRole(String roleString) {
        Role role = null;
        if (roleString.equals("DoctorRole")) {
            role = new DoctorRole();
        } else if (roleString.equals("NurseRole")) {
            role = new NurseRole();
        } else if (roleString.equals("LabTechnicianRole")) {
            role = new LabTechnicianRole();
        } else if (roleString.equals("PatientRole")) {
            role = new PatientRole();
        } else if (roleString.equals("ReceptionistRole")) {
            role = new ReceptionistRole();
        }

        return role;
    }


    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void cmbMedicineTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMedicineTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMedicineTypeActionPerformed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        addMedicineJPanel.setVisible(false);
    }//GEN-LAST:event_closebtnActionPerformed

    private void cmbMainMedicineTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMainMedicineTypeActionPerformed
        String medType = (String) cmbMainMedicineType.getSelectedItem();
        if (medicineDir != null && !medicineDir.getMedicineList().isEmpty()) {
            populateTable(medType);
            //populateOrganizationEmpComboBox();  //based on organization seleted, get the supported roles only
        }
    }//GEN-LAST:event_cmbMainMedicineTypeActionPerformed

    private void cmbMedicineType1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMedicineType1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMedicineType1ActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        // TODO add your handling code here:

        String name = nameJTextField1.getText();
        String dosage = dosageJTextField1.getText();
        String qty = availableQtyTxt1.getText();
        String type = (String) cmbMedicineType1.getSelectedItem();
        String date = expDate1.getText();
        String priceString = priceTxt1.getText();

        if (name == null || name.equals("")
                || dosage == null || dosage.equals("")
                || qty == null || qty.equals("")
                || type == null || type.equals("")
                || date == null || date.equals("")
                || priceString == null || priceString.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter all details", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //validation on data
        boolean valid = Validation.stringValidator(name);
        if (valid == false) {
            JOptionPane.showMessageDialog(null, "Please enter name correctly", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        valid = Validation.validateNumeric(dosage);
        if (valid == false) {
            JOptionPane.showMessageDialog(null, "Please enter dosage correctly", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        valid = Validation.validateNumeric(qty);
        if (valid == false) {
            JOptionPane.showMessageDialog(null, "Please enter quantity correctly", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        valid = Validation.validateDate(date);
        if (valid == false) {
            JOptionPane.showMessageDialog(null, "Please enter date correctly", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        valid = Validation.validateNumeric(dosage);
        if (valid == false) {
            JOptionPane.showMessageDialog(null, "Please enter price correctly", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //parse
        int quantity = Integer.parseInt(qty);

        if (quantity < 0) {
            JOptionPane.showMessageDialog(null, "Please enter quantity correctly", "Warning", JOptionPane.WARNING_MESSAGE);
            return;

        }

        double price = Double.parseDouble(priceString);
        if (price == 0.0) {
            JOptionPane.showMessageDialog(null, "Please enter price correctly, cannot be zero", "Warning", JOptionPane.WARNING_MESSAGE);
            return;

        }
        //Date parse

        Date date1 = null;
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date1 = formatter1.parse(date);
        } catch (ParseException ex) {
            System.out.println("Error in ManageMedicineJPanel view panel for date paring");
            Logger.getLogger(ManageMedicinesJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        int row = organizationJTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Medicine medicine = (Medicine) organizationJTable.getValueAt(row, 0);
        medicine.setDosage(dosage);
        medicine.setExpiryDate(date1);
        medicine.setName(name);
        medicine.setPrice(price);
        medicine.setQuantity(quantity);
        medicine.setType(type);

        // medicineDir.getMedicineList().add(medicine);
        JOptionPane.showMessageDialog(null, "Updated successfully", "Information", JOptionPane.INFORMATION_MESSAGE);

        //populate table by using main medicine cmb box 
        String medType = (String) cmbMainMedicineType.getSelectedItem();
        populateTable(medType);

        cmbMedicineType1.setEnabled(false);
        nameJTextField1.setEditable(false);
        dosageJTextField1.setEditable(false);
        availableQtyTxt1.setEditable(false);
        expDate1.setEditable(false);
        priceTxt1.setEditable(false);
        btnSave1.setEnabled(false);
        btnUpdate1.setEnabled(true);


    }//GEN-LAST:event_btnSave1ActionPerformed

    private void closebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtn1ActionPerformed
        // TODO add your handling code here:
        viewMedicineJPanel.setVisible(false);
    }//GEN-LAST:event_closebtn1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        addMedicineJPanel.setVisible(true);

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:

        cmbMedicineType1.setEnabled(true);
        nameJTextField1.setEditable(true);
        dosageJTextField1.setEditable(true);
        availableQtyTxt1.setEditable(true);
        expDate1.setEditable(true);
        priceTxt1.setEditable(true);
        btnSave1.setEnabled(true);
        btnUpdate1.setEnabled(false);
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int row = organizationJTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        viewMedicineJPanel.setVisible(true);

        //populate 
        Medicine med = (Medicine) organizationJTable.getValueAt(row, 0);
        populateViewMedicine(med);
    }//GEN-LAST:event_btnViewActionPerformed

    void populateViewMedicine(Medicine med) {

        nameJTextField1.setText(med.getName());
        dosageJTextField1.setText(med.getDosage());
        availableQtyTxt1.setText(String.valueOf(med.getQuantity()));
        cmbMedicineType1.setSelectedItem(med.getType());

        String date1 = null;
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date1 = formatter1.format(med.getExpiryDate());
        } catch (Exception ex) {
            System.out.println("Error in ManageMedicineJPanel view panel for date paring");
            Logger.getLogger(UI.PharmacyWorkerRole.ManageMedicinesJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        expDate1.setText(date1);
        priceTxt1.setText(String.valueOf(med.getPrice()));

        cmbMedicineType1.setEnabled(false);
        nameJTextField1.setEditable(false);
        dosageJTextField1.setEditable(false);
        availableQtyTxt1.setEditable(false);
        expDate1.setEditable(false);
        priceTxt1.setEditable(false);
        btnSave1.setEnabled(false);
        btnUpdate1.setEnabled(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addMedicineJPanel;
    private javax.swing.JTextField availableQtyTxt;
    private javax.swing.JTextField availableQtyTxt1;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnView;
    private javax.swing.JButton closebtn;
    private javax.swing.JButton closebtn1;
    private javax.swing.JComboBox cmbMainMedicineType;
    private javax.swing.JComboBox cmbMedicineType;
    private javax.swing.JComboBox cmbMedicineType1;
    private javax.swing.JTextField dosageJTextField;
    private javax.swing.JTextField dosageJTextField1;
    private javax.swing.JTextField expDate;
    private javax.swing.JTextField expDate1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField nameJTextField1;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JTextField priceTxt1;
    private javax.swing.JPanel viewMedicineJPanel;
    // End of variables declaration//GEN-END:variables
}
