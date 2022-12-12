/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import UI.LabTechnicianRole.LabAssistantMainAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Suprith
 */
public class LabTechnicianRole extends Role {

    @Override
    public JPanel postWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LabAssistantMainAreaJPanel(userProcessContainer, account, organization, business, enterprise);
    }

    @Override
    public String roleValue() {
        return "Lab Technician Role";
    }

}
