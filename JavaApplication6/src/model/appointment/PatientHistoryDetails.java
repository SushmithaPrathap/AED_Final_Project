/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.appointment;

import model.Patient.Patient;
import model.Person.Person;
import java.util.Date;

/**
 *
 * @author sushmithaprathap
 */
public class PatientHistoryDetails {

    private String medAllergies;
    private Patient patient;
    private String prevDiagnosis;
    private Person person;
    private Date created;
    private String surgeryHistory;
    private String familyHistory;
    private String allergy;
    private int id;
    private static int cnt = 10;

    public int getId() {
        return id;
    }

    public PatientHistoryDetails() {
        this.id = id + ++cnt;
    }

    @Override
    public String toString() {
        return String.valueOf(this.id);
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getSurgeryHistory() {
        return surgeryHistory;
    }

    public void setSurgeryHistory(String surgeryHistory) {
        this.surgeryHistory = surgeryHistory;
    }

    public String getFamilyHistory() {
        return familyHistory;
    }

    public void setFamilyHistory(String familyHistory) {
        this.familyHistory = familyHistory;
    }

    public Date getCreated() {
        return created;
    }

    public String getMedAllergies() {
        return medAllergies;
    }

    public void setMedAllergies(String medAllergies) {
        this.medAllergies = medAllergies;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getPrevDiagnosis() {
        return prevDiagnosis;
    }

    public void setPrevDiagnosis(String prevDiagnosis) {
        this.prevDiagnosis = prevDiagnosis;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
