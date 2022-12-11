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
import userinterface.PatientLogin.PatientMainWorkAreaJPanel;


/**
 *
 * @author Suprith
 */
public class PatientRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PatientMainWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }
    
    @Override
    public String roleValue()
    {
        return "Patient Role";
    }
    
    
}
