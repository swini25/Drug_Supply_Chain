/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.NationalEnterprise.Distributor;
import Business.Network.StateNetwork;
import Business.Organization.DistributorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Distributor.DistributorEmployeeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author riyavirani
 */
public class DistributorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, EcoSystem business, StateNetwork state) {
        return new DistributorEmployeeWorkAreaJPanel(userProcessContainer, account, (Distributor)enterprise, (DistributorOrganization)organization, business);
    }
   
}
