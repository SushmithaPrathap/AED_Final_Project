/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise.HospitalEnterprise;

//import model.Department.DepartmentDirectory;
import model.Enterprise.Enterprise;
//import model.Location.Location;
//import model.Nurse.NurseDirectory;
//import model.Patient.PatientDirectory;
//import model.Department.Receptionist;
//import model.Person.EmployeeDirectory;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sushmithaprathap
 */
public class Hospital extends Enterprise {
    int id;
    //EmployeeDirectory doctorList;
    //NurseDirectory nurseList;
    //Location location;
    //DepartmentDirectory departmentList;
    //PatientDirectory patientList;
    //Receptionist receptionist;
    
    
    //String enterpriseType;
    public Hospital(String name){
        super(name,EnterpriseType.Hospital);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}
