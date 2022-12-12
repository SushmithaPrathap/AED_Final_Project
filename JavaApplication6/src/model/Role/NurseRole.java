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
import UI.NurseRole.NurseWorkAreaJPanel;

/**
 *
 * @author Suprith
 */
public class NurseRole extends Role {

    @Override
    public JPanel postWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new NurseWorkAreaJPanel(userProcessContainer, enterprise, account);
    }

    @Override
    public String roleValue() {
        return "Nurse Role";
    }
}
