/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

import model.appointment.Appointment;
import model.Patient.Patient;

/**
 *
 * @author Suprith
 */
public class DoctorWorkRequest extends WorkRequest{

    //private String testResult;
     private Appointment appt;

    private Patient patient;

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
    
    public DoctorWorkRequest(){
        //appointment = new Appointment();
    }
    
    
}
