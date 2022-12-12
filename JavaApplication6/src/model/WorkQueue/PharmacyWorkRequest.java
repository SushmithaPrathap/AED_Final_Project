/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

import model.appointment.Appointment;
import model.Employee.Employee;
import model.Medicine.Medicine;
import model.Patient.Patient;
import java.util.Map;

/**
 *
 * @author Suprith
 */
public class PharmacyWorkRequest extends WorkRequest {

    private Appointment appt;
    private Patient patient;
    private Employee doctor;
    private Map<Medicine, Double> medMap;

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

    public Map<Medicine, Double> getMedMap() {
        return medMap;
    }

    public void setMedMap(Map<Medicine, Double> medMap) {
        this.medMap = medMap;
    }

    public static int getCount() {
        return cnt;
    }

    public static void setCount(int cnt) {
        WorkRequest.cnt = cnt;
    }

    public Appointment getAppt() {
        return appt;
    }

    public void setAppt(Appointment appt) {
        this.appt = appt;
    }
}
