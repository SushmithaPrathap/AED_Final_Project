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
import userinterface.InsuranceRole.InsuranceDMainAreaJPanel;

/**
 *
 * @author Suprith
 */
public class InsuranceDealerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       return new InsuranceDMainAreaJPanel(userProcessContainer, account, organization, business, enterprise);
    //return new DoctorWorkAreaJPanel(userProcessContainer, account, organization, enterprise);
    
    }
    
    @Override
    public String roleValue()
    {
        return "Insurance Dealer Role";
    }
    
}
