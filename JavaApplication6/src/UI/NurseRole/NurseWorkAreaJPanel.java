/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.NurseRole;

import model.appointment.Appointment;
import model.Enterprise.Enterprise;
import model.Operation.Operation;
import model.Patient.Patient;
import model.UserAccount.UserAccount;
import model.WorkQueue.NurseWorkRequest;
import model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sushmithaprathap
 */
public class NurseWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    //private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;

    /**
     * Creates new form NurseWorkAreaJPanel
     */
    public NurseWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount ua) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = ua;
        //viewDetailsJPanel.setVisible(false);
        //searchJPanel.setVisible(false);
        enterpriseLabel.setText(enterprise.getName());
        jLabel5.setText("Welcome " + ua.getEmployee().getName());
        // requestTestJButton.setVisible(false);
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()) {

            if (request instanceof NurseWorkRequest) {
                Object[] row = new Object[11];
                row[0] = request.getSender();
                row[1] = request.getReceiver();
                row[2] = ((NurseWorkRequest) request).getPatient();
                row[3] = request.getStatus();
                Appointment app = ((NurseWorkRequest) request).getAppointment();
                row[4] = app;//request.getMessage() == null ? " " : request.getMessage() ;
                row[5] = request;
                row[6] = request.getMessage();
                row[7] = app.getStatus();
                Operation opr = app.getOperation() == null ? null : app.getOperation();
                row[8] = opr.getStatus() == null ? "" : opr.getStatus();
                row[9] = opr.getOprType();
                row[10] = opr.getOperationDate() == null ? "" : opr.getOperationDate();
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
        workRequestJTable = new javax.swing.JTable();
        buttonPanel = new javax.swing.JPanel();
        viewReqBtn = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        viewDetailsBtn = new javax.swing.JButton();
        btnManageBedAssngmt = new javax.swing.JButton();
        btnAssignToMe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setBackground(new java.awt.Color(255, 193, 131));
        workRequestJTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 204, 255)));
        workRequestJTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Receiver", "Patient", "Status", "Appointment Date", "Request ID", "Message", "Appointment Status", "Operation Status", "Operation Type", "Operation Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1088, 183));

        buttonPanel.setBackground(new java.awt.Color(164, 208, 215));

        viewReqBtn.setBackground(new java.awt.Color(255, 155, 54));
        viewReqBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        viewReqBtn.setText("View New Request");
        viewReqBtn.setPreferredSize(new java.awt.Dimension(167, 40));
        viewReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReqBtnActionPerformed(evt);
            }
        });

        refreshTestJButton.setBackground(new java.awt.Color(255, 155, 54));
        refreshTestJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.setPreferredSize(new java.awt.Dimension(167, 40));
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        viewDetailsBtn.setBackground(new java.awt.Color(255, 155, 54));
        viewDetailsBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        viewDetailsBtn.setText("View Details");
        viewDetailsBtn.setPreferredSize(new java.awt.Dimension(167, 40));
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });

        btnManageBedAssngmt.setBackground(new java.awt.Color(255, 155, 54));
        btnManageBedAssngmt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnManageBedAssngmt.setText("Manage Bed Assignment");
        btnManageBedAssngmt.setPreferredSize(new java.awt.Dimension(167, 40));
        btnManageBedAssngmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageBedAssngmtActionPerformed(evt);
            }
        });

        btnAssignToMe.setBackground(new java.awt.Color(255, 155, 54));
        btnAssignToMe.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAssignToMe.setText("Assign To Me");
        btnAssignToMe.setPreferredSize(new java.awt.Dimension(167, 40));
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(viewDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnManageBedAssngmt, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btnAssignToMe, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageBedAssngmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssignToMe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        add(buttonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 99, 1090, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Nurse.PNG"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, -1, 320));

        jPanel14.setBackground(new java.awt.Color(196, 224, 229));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );

        add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel13.setBackground(new java.awt.Color(68, 145, 157));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(68, 145, 157));
        jLabel5.setText("Welcome!");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 270, 37));

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(68, 145, 157));
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 300, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void viewReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReqBtnActionPerformed
        // TODO add your handling code here:
        //show all new request
        if (enterprise.getWorkQueue().getWorkRequestList().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No request!");
            return;

        }

        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()) {
            if ((request.getStatus().equals("New")) && (request instanceof NurseWorkRequest)) {

                //sender, receiver, pateint,status, message
                Object[] row = new Object[11];
                row[0] = request.getSender();
                row[1] = request.getReceiver();
                row[2] = ((NurseWorkRequest) request).getPatient();
                row[3] = request.getStatus();

                //String result = ((LabTestWorkRequest) request).getTestResult();
                //row[3] = result == null ? "Waiting" : result;
                Appointment app = ((NurseWorkRequest) request).getAppointment();
                row[4] = app;//request.getMessage() == null ? " " : request.getMessage() ;
                row[5] = request;
                row[6] = request.getMessage();
                row[7] = app.getStatus();
                Operation opr = app.getOperation() == null ? null : app.getOperation();
                row[8] = opr.getStatus() == null ? "" : opr.getStatus();
                row[9] = opr.getOprType();
                row[10] = opr.getOperationDate() == null ? "" : opr.getOperationDate();
                model.addRow(row);

            }
        }

    }//GEN-LAST:event_viewReqBtnActionPerformed

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
        //viewDetailsJPanel.setVisible(true);

        int row = workRequestJTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        UserAccount doctor = (UserAccount) workRequestJTable.getValueAt(row, 0);

        Patient patient = (Patient) workRequestJTable.getValueAt(row, 2);

        Appointment appointment = (Appointment) workRequestJTable.getValueAt(row, 4);
        //FlightSchedule fsch= (FlightSchedule)  tblFlightSchedule.getValueAt(row,7);
        UserAccount nurseUserAccount = userAccount;
        WorkRequest workreq = (WorkRequest) workRequestJTable.getValueAt(row, 5);

        if (workreq.getReceiver() == null) {
            JOptionPane.showMessageDialog(null, "Please assign request!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        AssignBedJPanel manageOrganizationJPanel = new AssignBedJPanel(userProcessContainer, enterprise, appointment, patient, doctor, nurseUserAccount, workreq);
        userProcessContainer.add("AssignBedJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDetailsBtnActionPerformed

    private void btnManageBedAssngmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageBedAssngmtActionPerformed
        // TODO add your handling code here:

        CardLayout layout = (CardLayout) userProcessContainer.getLayout(); //JPanel,Enterprise,UserAccount
        userProcessContainer.add("ManageBedsFinalJPanel", new ManageBedsFinalJPanel(userProcessContainer, enterprise, userAccount));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnManageBedAssngmtActionPerformed

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        // TODO add your handling code here:

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 5);

        if (request.getReceiver() != null && request.getReceiver().equals(userAccount)) {
            JOptionPane.showMessageDialog(null, "Already handled, cannot assign!");
            return;

        }
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateRequestTable();

        JOptionPane.showMessageDialog(null, "Assignment successful!");

    }//GEN-LAST:event_btnAssignToMeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnManageBedAssngmt;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton viewDetailsBtn;
    private javax.swing.JButton viewReqBtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
