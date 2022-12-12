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

//    String billId;
//    String billIssuer;
//    Patient patient;
//    Employee doctor;
//    Appointment appointment;
    Bill billVar;
//    String paymentStatus;
//    String paymentMode;

    public BillingDepartment() {
        super(Organization.Type.Billing.getValue());
    }

    @Override
    public ArrayList<Role> getRoleSupported() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ReceptionistRole());
        return roles;
    }

    Bill processBilling(Date date) {

        return billVar;
    }

    public void createInvoice(Date date, Patient patient) {
        //craete an invoice
    }

    public void selectPaymentMode() {
        //select a payment mode
    }
}
