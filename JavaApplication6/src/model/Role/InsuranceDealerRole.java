/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.InsuranceRole.InsuranceDMainAreaJPanel;

/**
 *
 * @author Suprith
 */
public class InsuranceDealerRole extends Role {

    @Override
    public JPanel postWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InsuranceDMainAreaJPanel(userProcessContainer, account, organization, business, enterprise);

    }

    @Override
    public String roleValue() {
        return "Insurance Dealer Role";
    }

}
