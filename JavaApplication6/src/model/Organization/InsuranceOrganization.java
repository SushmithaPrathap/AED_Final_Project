/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

/**
 *
 * @author sushmithaprathap
 */
//import model.Role.InsuranceDealerRole;
import model.Role.InsuranceDealerRole;
import model.Role.Role;
import java.util.ArrayList;

public class InsuranceOrganization extends Organization {

    public InsuranceOrganization() {
        // super(Organization.Type.Dental.getValue());
        super(Organization.Type.Insurance.getValue());
    }

    //@Override
    public ArrayList<Role> getRoleSupported() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceDealerRole());
        return roles;
    }

}
