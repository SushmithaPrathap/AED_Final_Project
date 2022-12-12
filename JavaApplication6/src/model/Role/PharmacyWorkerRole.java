/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import UI.PharmacyWorkerRole.PharmacyManageAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Suprith
 */
public class PharmacyWorkerRole extends Role {

    @Override
    public JPanel postWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PharmacyManageAreaJPanel(userProcessContainer, account, organization, enterprise, business);

    }

    @Override
    public String roleValue() {
        return "Pharmacy Worker Role";
    }

}
