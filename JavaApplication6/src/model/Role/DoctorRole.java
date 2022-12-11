/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import UI.Doctor.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Suprith
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       return new DoctorWorkAreaJPanel(userProcessContainer,organization, account, enterprise, business);
    //return new DoctorWorkAreaJPanel(userProcessContainer, account, organization, enterprise);
    
    }
    
    @Override
    public String roleValue()
    {
        return "Doctor Role";
    }
    
}
