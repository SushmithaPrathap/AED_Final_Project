/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Patient;

import model.Enterprise.InsuranceEnterprise.Insurance;
import model.Location.Location;
import model.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sushmithaprathap
 */
public class PatientDirectory {

    private List<Patient> patientArray;

    public PatientDirectory() {
        patientArray = new ArrayList<>();
    }

    public List<Patient> getPatientArray() {
        return patientArray;
    }

    public void setPatientArray(List<Patient> patientArray) {
        this.patientArray = patientArray;
    }

    //craete a new patient
    public Patient createPatient(String patientName, String phoneNumber, String gender, String bloodGroup, UserAccount userAccount, Location locationPoint, String email,
            Insurance insuranceE, String insuranceId, String SSN) {
        Patient patient = new Patient();
        patient.setNameVar(patientName);
        patient.setPhone(phoneNumber);
        patient.setPatSex(gender);
        //patient.setAddress(address);
        patient.setBloodGrp(bloodGroup);
        patient.setUserAcc(userAccount);
        patient.setAddressVar(locationPoint);
        patient.setRole("Patient Role");
        patient.setEmail(email);
        patientArray.add(patient);
        patient.createNewApptDir();
        patient.setInsId(insuranceId);
        patient.setInsVar(insuranceE);
        patient.setSsnVar(SSN);
        return patient;
    }

    //upadate the patient
    public void updatePatient(int patientID, String name, String phoneNumber, String gender, String bloodGroup, Location locationPoint, String email) {
        for (Patient patient : patientArray) {
            if (patient.getID() == patientID) {
                patient.setNameVar(name);
                patient.setAddressVar(locationPoint);
                patient.setPatSex(gender);
                patient.setPhone(phoneNumber);
                patient.setBloodGrp(bloodGroup);
                patient.setEmail(name);
            }
        }
    }

    //get patient by id passed
    public Patient getPatById(int patientId) {
        for (Patient patient : patientArray) {
            if (patient.getID() == patientId) {
                return patient;
            }
        }
        return null;
    }

    // get patient by the ssn passed
    public Patient getPatBySSN(String ssn) {
        for (Patient patient : patientArray) {
            if (patient.getSsnVar().equals(ssn)) {
                return patient;
            }
        }
        return null;
    }

}
