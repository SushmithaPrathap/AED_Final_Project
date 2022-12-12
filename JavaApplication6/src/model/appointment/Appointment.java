/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.appointment;

import model.Bill.Bill;
import model.Employee.Employee;
import model.Enterprise.Lab.LabTestDirectory;
import model.Enterprise.Pharmacy.Pharmacy;
import model.Operation.Operation;
import model.Patient.Patient;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sushmithaprathap
 */
public class Appointment {

    int apptId;
    String type; //online, in-person
    Date date;
    Employee doc;
    Patient patient;
    String status;  //status should be --> new, booked, cancelled, rescheduled, completed , mark for billing
    String location;
    private Operation op;
    LabTestDirectory labTestArray;
    Prescription prescription;
    Integer time;
    Bill hospBill;

    public Bill getHospBill() {
        return hospBill;
    }

    public void setHospBill(Bill bill) {
        this.hospBill = bill;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
    String apptHistory;

    public String getApptHistory() {
        return apptHistory;
    }

    public void setApptHistory(String apptHistory) {
        this.apptHistory = apptHistory;
    }

    Pharmacy pharm;

    public Prescription getPrescription() {
        return prescription;
    }

    public LabTestDirectory getLabTestArray() {
        return labTestArray;
    }

    public void setLabTestArray(LabTestDirectory labTestArray) {
        this.labTestArray = labTestArray;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public Appointment(int cnt) {
        this.apptId = cnt;
        prescription = new Prescription();
        labTestArray = new LabTestDirectory();
        apptHistory = "";
    }

    public int getApptId() {
        return apptId;
    }

    public void setApptId(int apptId) {
        this.apptId = apptId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        this.apptHistory += " " + this.status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Operation getOp() {
        return op;
    }

    public void setOp(Operation op) {
        this.op = op;
    }

    public Pharmacy getPharm() {
        return pharm;
    }

    public void setPharm(Pharmacy pharm) {
        this.pharm = pharm;
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = dateFormat.format(this.date);
        return strDate;
    }

    // Appointment status should be one of these --> New, markforbilling, markforsurgery, markforTest, close
    public enum AppointmentStatus {
        New("New"),
        Markforbilling("Mark for billing"),
        Markforsurgery("Mark for Surgery"),
        MarkforTest("Mark for Test"),
        Close("Close"),
        AnalyseReport("Analyse Report"),
        Cancel("Cancel"),
        GeneratedReport("Generated Report"),
        MarkForInsurance("Mark For Insurance"),
        BedAssigned("Bed Assigned"),
        ApprovedInsurance("ApprovedInsurance"),
        DisapprovedInsurance("DisapprovedInsurance");
        private String value;

        private AppointmentStatus(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
