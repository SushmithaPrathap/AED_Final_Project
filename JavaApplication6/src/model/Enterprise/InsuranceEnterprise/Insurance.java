/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise.InsuranceEnterprise;

import model.Enterprise.Enterprise;
import model.Patient.PatientDirectory;
import model.Dept.Receptionist;
import model.Person.EmployeeDirectory;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sushmithaprathap
 */
public class Insurance extends Enterprise {

    int insId;
    EmployeeDirectory docList;
    //NurseDirectory nurseList;
    PatientDirectory patList;
    Receptionist receptionist;
    InsuranceDirectory insdir;

    public int getInsId() {
        return insId;
    }

    public void setInsId(int insId) {
        this.insId = insId;
    }

    public EmployeeDirectory getDocList() {
        return docList;
    }

    public void setDocList(EmployeeDirectory docList) {
        this.docList = docList;
    }

    public PatientDirectory getPatList() {
        return patList;
    }

    public void setPatList(PatientDirectory patList) {
        this.patList = patList;
    }

    public Receptionist getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Receptionist receptionist) {
        this.receptionist = receptionist;
    }

    public InsuranceDirectory getInsdir() {
        return insdir;
    }

    public void setInsdir(InsuranceDirectory insdir) {
        this.insdir = insdir;
    }

    // enterpriseType should be string ;
    public Insurance(String name) {
        super(name, EnterpriseType.Insurance);

        insdir = new InsuranceDirectory();
    }

    @Override
    public ArrayList<Role> getRoleSupported() {
        return null;
    }
}
