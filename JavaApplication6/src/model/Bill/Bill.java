/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Bill;

import model.appointment.Appointment;
import model.Employee.Employee;
import model.Enterprise.Enterprise;
import model.Patient.Patient;

/**
 *
 * @author sushmithaprathap
 */
public class Bill {

    //All the bill charges to all these classes cummaltively ---> labs, medicine, consultation, hospital charges
    int billID;
    Patient pat;
    Employee doc;
    Appointment appointment;
    double chargeTotal;
    String status; // available status should be - paid & unpaid
    //int invoiceNumber;
    private static int cnt = 1;
    private Enterprise enterprise;

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Bill() {
        billID = cnt;
        cnt++;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public Patient getPat() {
        return pat;
    }

    public void setPat(Patient pat) {
        this.pat = pat;
    }

    public Employee getDoc() {
        return doc;
    }

    public void setDoc(Employee doc) {
        this.doc = doc;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public double getChargeTotal() {
        return chargeTotal;
    }

    public void setChargeTotal(double chargeTotal) {
        this.chargeTotal = chargeTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return ("Bill" + this.getBillID());
    }

}
