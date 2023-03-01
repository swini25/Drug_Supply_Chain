/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.StateHealthDepartment;

import Business.Network.StateNetwork;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author darsh
 */
public class EnterStatePopulationJPanel extends javax.swing.JPanel {

  
    private final JPanel workContainer;
    private final StateNetwork state;
    
    public EnterStatePopulationJPanel(JPanel workContainer, StateNetwork state) {
        initComponents();
        this.workContainer = workContainer;
        this.state = state;
        
        txtCurrentPopulation.setText(String.valueOf(state.getStatePopulation()));
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
        lblCurrentPopulation = new javax.swing.JLabel();
        txtCurrentPopulation = new javax.swing.JTextField();
        lblUpdatePopulation = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtUpdatePopulation = new javax.swing.JTextField();
        btnModifyPopulation = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("State Population");

        lblCurrentPopulation.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblCurrentPopulation.setText("Current Population:");

        txtCurrentPopulation.setEnabled(false);
        txtCurrentPopulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurrentPopulationActionPerformed(evt);
            }
        });

        lblUpdatePopulation.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblUpdatePopulation.setText("Update Population:");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 102));

        btnModifyPopulation.setBackground(new java.awt.Color(0, 0, 102));
        btnModifyPopulation.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnModifyPopulation.setForeground(new java.awt.Color(255, 255, 255));
        btnModifyPopulation.setText("Modify");
        btnModifyPopulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyPopulationActionPerformed(evt);
            }
        });

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/population_900x350.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCurrentPopulation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCurrentPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUpdatePopulation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUpdatePopulation, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModifyPopulation)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCurrentPopulation, lblUpdatePopulation});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCurrentPopulation, txtUpdatePopulation});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrentPopulation)
                    .addComponent(txtCurrentPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUpdatePopulation)
                    .addComponent(txtUpdatePopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyPopulation))
                .addGap(18, 18, 18)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnModifyPopulation, lblCurrentPopulation, lblUpdatePopulation, txtCurrentPopulation, txtUpdatePopulation});

    }// </editor-fold>//GEN-END:initComponents

    private void txtCurrentPopulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurrentPopulationActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_txtCurrentPopulationActionPerformed

    private void btnModifyPopulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyPopulationActionPerformed
        // TODO add your handling code here:
        try{
            int oldPopulation = state.getStatePopulation();
            int oldVaccineLeft = state.getVaccinesLeftForState();
           
            int population = Integer.parseInt(txtUpdatePopulation.getText());
            state.setStatePopulation(population);

            int populationChange = oldPopulation - population;
            if(populationChange>=0)
            {
                state.setVaccinesLeftForState(oldVaccineLeft+populationChange);
            }
            else
            {
                state.setVaccinesLeftForState(population-oldPopulation+oldVaccineLeft);
            }


            txtCurrentPopulation.setText(String.valueOf(state.getStatePopulation()));
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Enter Numeric Value..!!");
            //return;
        }
    }//GEN-LAST:event_btnModifyPopulationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModifyPopulation;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCurrentPopulation;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUpdatePopulation;
    private javax.swing.JTextField txtCurrentPopulation;
    private javax.swing.JTextField txtUpdatePopulation;
    // End of variables declaration//GEN-END:variables
}