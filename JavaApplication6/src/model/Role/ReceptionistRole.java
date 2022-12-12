/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.ReceptionistRole.ReceptionistWorkAreaJPanel;

/**
 *
 * @author Suprith
 */
public class ReceptionistRole extends Role {

    @Override
    public JPanel postWorkArea(JPanel userProcessContainer, UserAccount account,
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ReceptionistWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }

    @Override
    public String roleValue() {
        return "Receptionist Role";
    }
}
