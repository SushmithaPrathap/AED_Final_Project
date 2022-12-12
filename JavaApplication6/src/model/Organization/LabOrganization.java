/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Suprith
 */
public class LabOrganization extends Organization
{
    
    public LabOrganization() {
        super(Organization.Type.Lab.getValueVar());
    }

    //@Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolesArray = new ArrayList();
//        rolesArray.add(new LabTechnicianRole());
//        rolesArray.add(new ReceptionistRole());
        return rolesArray;
    }
     
   
    
    
}
