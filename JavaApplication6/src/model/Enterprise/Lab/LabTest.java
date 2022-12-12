/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise.Lab;

import model.Employee.Employee;
import model.Patient.Patient;
import java.util.Date;

/**
 *
 * @author Suprith
 */
public class LabTest {

    int labId;
    String nameVar;
    String typeVar;
    double testAmount;
    Date createdDate;
    String statusVar; //Should be - scheduled, in-process, complete etc
    Employee doc;
    Employee labTech;
    private Patient patient;
    private Lab lab;

    public int getLabId() {
        return labId;
    }

    public void setLabId(int labId) {
        this.labId = labId;
    }

    public String getNameVar() {
        return nameVar;
    }

    public void setNameVar(String nameVar) {
        this.nameVar = nameVar;
    }

    public String getTypeVar() {
        return typeVar;
    }

    public void setTypeVar(String typeVar) {
        this.typeVar = typeVar;
    }

    public double getTestAmount() {
        return testAmount;
    }

    public void setTestAmount(double testAmount) {
        this.testAmount = testAmount;
    }

    public String getStatusVar() {
        return statusVar;
    }

    public void setStatusVar(String statusVar) {
        this.statusVar = statusVar;
    }

    public Employee getDoc() {
        return doc;
    }

    public void setDoc(Employee doc) {
        this.doc = doc;
    }

    public Employee getLabTech() {
        return labTech;
    }

    public void setLabTech(Employee labTech) {
        this.labTech = labTech;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Lab getLab() {
        return lab;
    }

    public void setLab(Lab lab) {
        this.lab = lab;
    }

    @Override
    public String toString() {
        return this.getNameVar();
    }
}
