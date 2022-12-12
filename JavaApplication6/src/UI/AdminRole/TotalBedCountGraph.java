/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole;

import model.Bed.Bed;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.BedMgmtDept;
import model.Organization.Organization;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author Suprith
 */
public class TotalBedCountGraph extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem system;
    JFreeChart barChart;
   
    Network selectedNetwork;
//    /**
//     * Creates new form ViewScenesGraph
//     */
    public TotalBedCountGraph(JPanel userProcessContainer, EcoSystem system, Network selectedNetwork) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.selectedNetwork= selectedNetwork;
        jLabel6.setText("Bed Status Across " + selectedNetwork.getName().toUpperCase());
        populateBarGraph();
        
    }
//    
    public void populateBarGraph() {

        Map<String, Integer> workReqMap = new HashMap<>();
        
        for (Enterprise epr : selectedNetwork.getEnterpriseDir().getEnterpriseArray()) 
        {
            for (Organization org : epr.getOrgDir().getOrganizationList()) 
            {
                if (org instanceof BedMgmtDept) 
                {
                    List<Bed> bedList = ((BedMgmtDept) org).getBedArray().getListBed();
                    for (Bed b : bedList) 
                    {
                        if (b.getBedStatus().getStatus().equals(Bed.BedStatus.Available.getStatus())) 
                        {
                            workReqMap.put("Available", workReqMap.getOrDefault("Available", 0) + 1);

                        } else if (b.getBedStatus().getStatus().equals(Bed.BedStatus.Occupied.getStatus())) 
                        {
                            workReqMap.put("Occupied", workReqMap.getOrDefault("Occupied", 0) + 1);

                        }
                        if (b.getBedStatus().getStatus().equals(Bed.BedStatus.AssignedLaundry.getStatus())) 
                        {
                            workReqMap.put("Laundry", workReqMap.getOrDefault("Laundry", 0) + 1);

                        }
                    }
                }
            }
        }
     
        barChart = ChartFactory.createPieChart(
         "Number of beds Available, Occupied, Laundry",                     
         createDataset(workReqMap),          
         true, true, false);
         
        ChartPanel chartPanel = new ChartPanel( barChart );   
        jPanel1.removeAll();
        jPanel1.add(chartPanel, BorderLayout.CENTER);
        jPanel1.validate(); 
    }
    
    private PieDataset createDataset(Map<String, Integer> workReqMap) {
       
        final DefaultPieDataset dataset = new DefaultPieDataset();  

        for(String r : workReqMap.keySet()) {
            dataset.setValue(r, workReqMap.get(r));
        }               

        return dataset; 
   }
    
//    /**
//     * This method is called from within the constructor to initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is always
//     * regenerated by the Form Editor.
//     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1058, 840));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.BorderLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 730, 450));

        jButton1.setBackground(new java.awt.Color(255, 155, 54));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(25, 56, 82));
        jButton1.setText("Download Graph");
        jButton1.setPreferredSize(new java.awt.Dimension(167, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(68, 145, 157));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BEDS STATUS ACROSS ALL NETWORK");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 594, -1));

        backJButton.setBackground(new java.awt.Color(102, 147, 255));
        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.setPreferredSize(new java.awt.Dimension(100, 40));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jPanel14.setBackground(new java.awt.Color(196, 224, 229));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jPanel13.setBackground(new java.awt.Color(68, 145, 157));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int width = 640;    /* Width of the image */
            int height = 480;   /* Height of the image */
            File BarChart = new File( "BedsAcross"+selectedNetwork.getName()+".jpeg" );
            ChartUtilities.saveChartAsJPEG( BarChart , barChart , width , height );
            JOptionPane.showMessageDialog(null, "A JPEG image file named BedsAcross"+selectedNetwork.getName()+".jpeg is downloaded in your current directory.");
        } catch (IOException ex) {
            Logger.getLogger(TotalBedCountGraph.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    // End of variables declaration//GEN-END:variables
}