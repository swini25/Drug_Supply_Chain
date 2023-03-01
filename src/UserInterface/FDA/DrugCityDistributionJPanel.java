/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.FDA;

import Business.EcoSystem;
import Business.NationalEnterprise.FDA;
import Business.Network.CityNetwork;
import Business.Network.StateNetwork;
import Business.Organization.FDAOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author darsh
 */
public class DrugCityDistributionJPanel extends javax.swing.JPanel {

    private final JPanel workContainer;
    private final UserAccount userAccount;
    private final EcoSystem business;
    private final FDA cdcEnterprise;
    private final FDAOrganization cdcOrg;
    private final StateNetwork state;
    /**
     * Creates new form VaccineCityDistributionJPanel
     * @param workContainer
     * @param userAccount
     * @param business
     * @param cdcEnterprise
     * @param cdcOrg
     * @param state
     */
    public DrugCityDistributionJPanel(JPanel workContainer, UserAccount userAccount,EcoSystem business,FDA cdcEnterprise,FDAOrganization cdcOrg,StateNetwork state) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.cdcEnterprise = cdcEnterprise;
        this.cdcOrg = cdcOrg;
        this.state = state;
        txtStateName.setText(state.getStateName());
        populateTable();
       
    }
    
    
    private void populateTable(){
         DefaultTableModel defaulttabelmodel = (DefaultTableModel) tbldetails.getModel();
        defaulttabelmodel.setRowCount(0);
        if(business.getStateList() != null)
        {
            for(CityNetwork city: state.getCityList())
            {
                Object[] row = new Object[2];
               row[0] = city;
               row[1] = city.getTotalVaccinesDistributedInCity();
               
               
               defaulttabelmodel.addRow(row);
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

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldetails = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        lblState = new javax.swing.JLabel();
        txtStateName = new javax.swing.JTextField();
        btnViewChart = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Drug Distribution in State");

        tbldetails.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        tbldetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "City", "Total Drugs Distibuted"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbldetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbldetails);

        btnViewDetails.setBackground(new java.awt.Color(0, 0, 102));
        btnViewDetails.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnViewDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDetails.setText("View Details");
        btnViewDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        lblState.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblState.setForeground(new java.awt.Color(0, 0, 102));
        lblState.setText("State:");

        txtStateName.setEnabled(false);

        btnViewChart.setBackground(new java.awt.Color(0, 0, 102));
        btnViewChart.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnViewChart.setForeground(new java.awt.Color(255, 255, 255));
        btnViewChart.setText("View Chart");
        btnViewChart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewChartActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 102));
        btnBack.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblState)
                        .addGap(18, 18, 18)
                        .addComponent(txtStateName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnViewChart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewDetails)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewChart)
                    .addComponent(btnViewDetails))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbldetails.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a City");
            return;
        }
        CityNetwork city = (CityNetwork)tbldetails.getValueAt(selectedRow, 0);

        DrugProviderJPanel panel = new DrugProviderJPanel(workContainer,userAccount, business, cdcEnterprise, cdcOrg, city);
        workContainer.add("VaccineProviderJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnViewChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewChartActionPerformed
        // TODO add your handling code here:

        DefaultPieDataset pieDataset = new DefaultPieDataset();
        for(CityNetwork city: state.getCityList())
        {
            pieDataset.setValue(city.getName(), city.getTotalVaccinesDistributedInCity());

        }
        JFreeChart chart = ChartFactory.createPieChart3D("Distribution of all vaccines", pieDataset,true, true, true);
        PiePlot3D p = (PiePlot3D)chart.getPlot();
        ChartFrame frame = new ChartFrame("Distribution of all vaccines",chart);
        frame.setVisible(true);
        frame.setSize(450,500);
    }//GEN-LAST:event_btnViewChartActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewChart;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tbldetails;
    private javax.swing.JTextField txtStateName;
    // End of variables declaration//GEN-END:variables
}