/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Bill;

import model.Appointment.Appointment;
import model.Employee.Employee;
import model.Enterprise.Enterprise;
import model.Patient.Patient;

/**
 *
 * @author sushmithaprathap
 */
public class Bill {
    //cumulative charges->> labs, medicine, consultation, hospital charges
    int billId;
    Patient patient;
    Employee doctor;
    Appointment appointment;
    double totalCharges;
    String status;//paid, unpaid
    //int invoiceNumber;
    private static int count = 1;
    private Enterprise enterprise;

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
    
    public Bill() {
        billId = count;
        count++;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Employee getDoctor() {
        return doctor;
    }

    public void setDoctor(Employee doctor) {
        this.doctor = doctor;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public double getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCharges(double totalCharges) {
        this.totalCharges = totalCharges;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    @Override 
    public String toString(){
        return ("Bill" + this.getBillId());
    } 
    
    
}
