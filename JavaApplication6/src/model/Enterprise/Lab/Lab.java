/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise.Lab;

import model.Dept.Receptionist;
import model.Enterprise.Enterprise;
import model.Patient.PatientDirectory;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Suprith
 */
public class Lab extends Enterprise {

    int labId;
    PatientDirectory patientArray;
    Receptionist receptionist;
    LabTechnicianDirectory labTechArray;
    
    //String enterpriseType;
    public Lab(String name){
        super(name,Enterprise.EnterpriseType.Lab);
    }
    @Override
    public ArrayList<Role> getRoleSupported() {
        return null;
    }
    
}
