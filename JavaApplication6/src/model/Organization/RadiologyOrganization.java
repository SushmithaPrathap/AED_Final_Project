/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.LabTechnicianRole;
import model.Role.ReceptionistRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Suprith
 */
public class RadiologyOrganization extends Organization
{
    
    public RadiologyOrganization() {
        super(Organization.Type.Radiology.getValue());
    }

    //@Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabTechnicianRole());
        roles.add(new ReceptionistRole());
        return roles;
    }
     
   
    
    
}
