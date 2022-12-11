/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

/**
 *
 * @author sushmithaprathap
 */
import model.Role.DoctorRole;
import model.Role.NurseRole;
import model.Role.ReceptionistRole;
import model.Role.Role;
import java.util.ArrayList;

public class GeneralOrganization extends Organization {

    public GeneralOrganization(String type) {
        // super(Organization.Type.Dental.getValue());
        super(type);
    }

    //@Override
    public ArrayList<Role> getRoleSupported() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        roles.add(new NurseRole());
        roles.add(new ReceptionistRole());
        return roles;
    }

}
