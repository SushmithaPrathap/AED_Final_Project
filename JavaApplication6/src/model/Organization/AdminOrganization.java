/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

/**
 *
 * @author sushmithaprathap
 */
//import model.Role.AdminRole;
import model.Role.Role;

import java.util.ArrayList;

public class AdminOrganization extends Organization {

    public AdminOrganization() {
        super(Type.Admin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        //roles.add(new AdminRole());
        return roles;
    }

}
