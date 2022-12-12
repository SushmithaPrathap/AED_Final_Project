/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

import model.appointment.Appointment;
import model.Bill.Bill;
import model.Patient.Patient;

/**
 *
 * @author Suprith
 */
public class InsuranceWorkRequest extends WorkRequest {

    private Patient patient;
    private Appointment appt;

    public Bill getHospitalBill() {
        return hospitalBill;
    }

    //private LabTest labTest;
    public void setHospitalBill(Bill hospitalBill) {
        this.hospitalBill = hospitalBill;
    }
    //private UserAccount doctorUserAccount;
    private String amount;
    private Bill hospitalBill;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Appointment getAppt() {
        return appt;
    }

    public void setAppt(Appointment appt) {
        this.appt = appt;
    }

    public static int getCount() {
        return cnt;
    }

    public static void setCount(int cnt) {
        WorkRequest.cnt = cnt;
    }

}
