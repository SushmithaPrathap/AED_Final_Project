/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.appointment;

import model.Employee.Employee;
import model.Enterprise.Lab.LabTestDirectory;
import model.Enterprise.Pharmacy.Pharmacy;
import model.Medicine.Medicine;
import model.Patient.Patient;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sushmithaprathap
 */
public class Prescription {

    LabTestDirectory labTestArray;
    //MedicineDirectory medicineList;
    Map<Medicine, Double> medPrescribed;
    Map<Medicine, Integer> medicineListQuan;
    private Pharmacy pharm;
    private String status;
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pharmacy getPharm() {
        return pharm;
    }

    public void setPharm(Pharmacy pharm) {
        this.pharm = pharm;
    }
    private Date createdDate;
    Employee doc;
    Patient patient;
    private String history;

    public Prescription() {
        this.createdDate = new Date();
        medPrescribed = new HashMap<>();
        medicineListQuan = new HashMap<>();
    }

    public LabTestDirectory getLabTestArray() {
        return labTestArray;
    }

    public void setLabTestArray(LabTestDirectory labTestArray) {
        this.labTestArray = labTestArray;
    }

    public Map<Medicine, Double> getMedPrescribed() {
        return medPrescribed;
    }

    public void setMedPrescribed(Map<Medicine, Double> medPrescribed) {
        this.medPrescribed = medPrescribed;
    }

    public Map<Medicine, Integer> getMedicineListQuan() {
        return medicineListQuan;
    }

    public void setMedicineListQuan(Map<Medicine, Integer> medicineListQuan) {
        this.medicineListQuan = medicineListQuan;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Employee getDoc() {
        return doc;
    }

    public void setDoc(Employee doc) {
        this.doc = doc;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
}
