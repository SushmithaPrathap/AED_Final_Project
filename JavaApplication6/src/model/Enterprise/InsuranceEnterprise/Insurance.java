/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise.InsuranceEnterprise;

import model.Enterprise.Enterprise;
import model.Patient.PatientDirectory;
import model.Department.Receptionist;
import model.Person.EmployeeDirectory;
import model.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author sushmithaprathap
 */
public class Insurance extends Enterprise {
    int id;
    EmployeeDirectory doctorList;
    //NurseDirectory nurseList;
    PatientDirectory patientList;
    Receptionist receptionist;
    InsuranceDirectory indir;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EmployeeDirectory getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(EmployeeDirectory doctorList) {
        this.doctorList = doctorList;
    }

    public PatientDirectory getPatientList() {
        return patientList;
    }

    public void setPatientList(PatientDirectory patientList) {
        this.patientList = patientList;
    }

    public Receptionist getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Receptionist receptionist) {
        this.receptionist = receptionist;
    }

    public InsuranceDirectory getIndir() {
        return indir;
    }

    public void setIndir(InsuranceDirectory indir) {
        this.indir = indir;
    }
    
    //String enterpriseType;
    public Insurance(String name){
        super(name,EnterpriseType.Insurance);
        
        indir= new InsuranceDirectory();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}