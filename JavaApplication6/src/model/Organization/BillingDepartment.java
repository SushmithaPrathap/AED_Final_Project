/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

/**
 *
 * @author sushmithaprathap
 */
import model.appointment.Appointment;
import model.Bill.Bill;
import model.Employee.Employee;
import model.Patient.Patient;
import model.Role.ReceptionistRole;
import model.Role.Role;

import java.util.ArrayList;
import java.util.Date;

public class BillingDepartment extends Organization {

    String billingId;
    String billIssuer;
    Patient patient;
    Employee doctor;
    Appointment appointment;
    Bill bill;
    String paymentStatus;
    String paymentMode;

    public BillingDepartment() {
        super(Organization.Type.Billing.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ReceptionistRole());
        return roles;
    }

    Bill processBilling(Date date) {

        return bill;
    }

    public void generateInvoice(Date date, Patient patient) {
        //generate invoice
    }

    public void selectPaymentMode() {
        //choose a payment mode
    }
}
