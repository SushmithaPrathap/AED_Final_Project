/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

import model.appointment.Appointment;
import model.Enterprise.Lab.LabTest;
import model.Patient.Patient;

/**
 *
 * @author Suprith
 */
public class LabTechWorkRequest extends WorkRequest{

    private Patient patient;
    private Appointment appt;
    private LabTest labTest;

    public LabTest getLabTest() {
        return labTest;
    }

    public void setLabTest(LabTest labTest) {
        this.labTest = labTest;
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
