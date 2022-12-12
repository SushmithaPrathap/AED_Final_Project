/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise.Hospital;

import model.Enterprise.Enterprise;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sushmithaprathap
 */
public class Hospital extends Enterprise {

    int Id;

    public Hospital(String name) {
        super(name, EnterpriseType.Hospital);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
