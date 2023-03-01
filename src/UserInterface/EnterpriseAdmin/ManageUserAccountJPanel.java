/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.EnterpriseAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ClinicOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author darsh
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    private final JPanel workContainer;
    private final Enterprise enterprise;
    private final EcoSystem business;
    
    DefaultTableModel tblModel;
    
    /**
     * Creates new form ManageUserAccountJPanel
     * @param workContainer
     * @param enterprise
     * @param business
     */
    public ManageUserAccountJPanel(JPanel workContainer, Enterprise enterprise , EcoSystem business) {
        initComponents();
        this.workContainer = workContainer;
        this.enterprise = enterprise;
        this.business = business;
        populateUserAccountTable();
    }
    
    protected void populateUserAccountTable(){
        tblModel = (DefaultTableModel) tblUserAccounts.getModel();

        tblModel.setRowCount(0);
        
            for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[5];
                row[0] = userAccount.getPerson().getFirstName()+ " "+userAccount.getPerson().getLastName();
                row[1] = "Enterprise Admin";
                row[2] = userAccount;
                row[3] = userAccount.getPassword();
                row[4] = userAccount.getRole();
                
                ((DefaultTableModel) tblUserAccounts.getModel()).addRow(row);
            }
        
        

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount userAcc : organization.getUserAccountDirectory().getUserAccountList()) {
                Object[] rowData = new Object[5];
                rowData[0] = userAcc.getPerson().getFirstName()+ " "+userAcc.getPerson().getLastName();
                if(organization instanceof ClinicOrganization)
                {
                    ClinicOrganization satOrg =(ClinicOrganization)organization;
                    rowData[1] = satOrg.getClincName()+"Clinic";
                }
                else rowData[1] = organization;
                rowData[2] = userAcc;
                rowData[3] = userAcc.getPassword();
                rowData[4] = userAcc.getRole();
                
                ((DefaultTableModel) tblUserAccounts.getModel()).addRow(rowData);
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

        lblManageUserAccount = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserAccounts = new javax.swing.JTable();
        btnCreateNewUser = new javax.swing.JButton();
        btnViewAndUpdate = new javax.swing.JButton();
        btnRemoveUser = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lblManageUserAccount.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblManageUserAccount.setForeground(new java.awt.Color(0, 0, 102));
        lblManageUserAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageUserAccount.setText("Manage User Accounts");

        tblUserAccounts.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tblUserAccounts.setForeground(new java.awt.Color(0, 0, 102));
        tblUserAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Person Name", "Department", "UserName", "Password", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUserAccounts.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblUserAccounts);

        btnCreateNewUser.setBackground(new java.awt.Color(0, 0, 102));
        btnCreateNewUser.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnCreateNewUser.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateNewUser.setText("Create New User Account");
        btnCreateNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewUserActionPerformed(evt);
            }
        });

        btnViewAndUpdate.setBackground(new java.awt.Color(0, 0, 102));
        btnViewAndUpdate.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnViewAndUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnViewAndUpdate.setText("View / Update User Account");
        btnViewAndUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAndUpdateActionPerformed(evt);
            }
        });

        btnRemoveUser.setBackground(new java.awt.Color(0, 0, 102));
        btnRemoveUser.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnRemoveUser.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveUser.setText("Remove User");
        btnRemoveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblManageUserAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnViewAndUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(btnRemoveUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(btnCreateNewUser)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManageUserAccount)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateNewUser)
                    .addComponent(btnViewAndUpdate)
                    .addComponent(btnRemoveUser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewUserActionPerformed
        // TODO add your handling code here:
        CreateUserAccountJPanel panel = new CreateUserAccountJPanel(workContainer, enterprise , this, business);
        workContainer.add("CreateUserAccountJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnCreateNewUserActionPerformed

    private void btnViewAndUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAndUpdateActionPerformed
        // TODO add your handling code here:
        int row = tblUserAccounts.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a user account from table");
            return;
        }
        Organization org = null;
        UserAccount userAcc = (UserAccount)tblUserAccounts.getValueAt(row, 2);
        if((tblUserAccounts.getValueAt(row, 1) instanceof String) == false)
        org = (Organization) tblUserAccounts.getValueAt(row, 1);
        ViewUserAccountJPanel panel = new ViewUserAccountJPanel(workContainer, enterprise , this, userAcc, org, business);
        workContainer.add("ViewUserAccountJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);

    }//GEN-LAST:event_btnViewAndUpdateActionPerformed

    private void btnRemoveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveUserActionPerformed
        // TODO add your handling code here:
        int row = tblUserAccounts.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a user account from table");
            return;
        }
        Organization org = null;

        UserAccount ua = (UserAccount)tblUserAccounts.getValueAt(row, 2);

        if(tblUserAccounts.getValueAt(row, 1) instanceof String)
        {
            enterprise.getUserAccountDirectory().removeUserAccount(ua);
        }
        else
        { org = (Organization) tblUserAccounts.getValueAt(row, 1);

            org.getUserAccountDirectory().removeUserAccount(ua);
        }
        populateUserAccountTable();

    }//GEN-LAST:event_btnRemoveUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateNewUser;
    private javax.swing.JButton btnRemoveUser;
    private javax.swing.JButton btnViewAndUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageUserAccount;
    private javax.swing.JTable tblUserAccounts;
    // End of variables declaration//GEN-END:variables
}