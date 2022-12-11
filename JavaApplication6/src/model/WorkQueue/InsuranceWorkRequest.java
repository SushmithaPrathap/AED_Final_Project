/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

import model.Appointment.Appointment;
import model.Bill.Bill;
import model.Patient.Patient;

/**
 *
 * @author Suprith
 */
public class InsuranceWorkRequest extends WorkRequest{
        /* inherited
    
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    
    
    
    */
    private Patient patient;
    private Appointment appointment;

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

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        WorkRequest.count = count;
    }

    
    
}
