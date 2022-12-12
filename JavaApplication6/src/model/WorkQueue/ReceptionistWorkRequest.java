/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

import model.appointment.Appointment;
import model.Employee.Employee;
import model.Patient.Patient;

/**
 *
 * @author sushmithaprathap
 */
public class ReceptionistWorkRequest extends WorkRequest {

    private Appointment appt;
    private Patient patient;
    private Employee doc;

    public Appointment getAppt() {
        return appt;
    }

    public void setAppt(Appointment appt) {
        this.appt = appt;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Employee getDoc() {
        return doc;
    }

    public void setDoc(Employee doc) {
        this.doc = doc;
    }

}
