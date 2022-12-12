/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

/**
 *
 * @author sushmithaprathap
 */
import model.Role.Role;

import java.util.ArrayList;

public class AdminOrg extends Organization {

    public AdminOrg() {
        super(Type.Admin.getValue());
    }

    @Override
    public ArrayList<Role> getRoleSupported() {
        ArrayList<Role> rolesArray = new ArrayList();
        //roles.add(new AdminRole());
        return rolesArray;
    }

}
