/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.appointment;

import model.Employee.Employee;
import model.Patient.Patient;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sushmithaprathap
 */
public class AppointmentDirectory {

    private int cnt = 11;
    List<Appointment> apptList;
    //private Prescription prescription;
    List<Prescription> prescriptionArary;
    List<PatientHistoryDetails> patientHistoryArray;

    public AppointmentDirectory() {
        apptList = new ArrayList<>();
        prescriptionArary = new ArrayList<>();
        patientHistoryArray = new ArrayList<>();

    }

    public List<Appointment> getApptList() {
        return apptList;
    }

    public void setApptList(List<Appointment> apptList) {
        this.apptList = apptList;
    }

    public List<Prescription> getPrescriptionArary() {
        return prescriptionArary;
    }

    public void setPrescriptionArary(List<Prescription> prescriptionArary) {
        this.prescriptionArary = prescriptionArary;
    }

    public List<PatientHistoryDetails> getPatientHistoryArray() {
        return patientHistoryArray;
    }

    public void setPatientHistoryArray(List<PatientHistoryDetails> patientHistoryArray) {
        this.patientHistoryArray = patientHistoryArray;
    }

    //update appt
    void updateAppointment(Appointment app) {

    }

    //delete the appt
    void deleteAppointment(Appointment app) {
        apptList.remove(app);
    }

    //find Appointment by patient and date passed
    Appointment findAppointment(Patient patient, Date date) {
        Appointment app = null;

        return app;
    }

    //find and return the List of Appointments by patient
    List<Appointment> findAppointmentByPat(Patient patient) {
        List<Appointment> app = null;
        return app;
    }

    public Appointment postAppointment(Patient patient, Employee doctor, Date appointmetDate, String appointmentType) {
        Appointment appt = new Appointment(cnt++);
        appt.setDate(appointmetDate);
        appt.setDoc(doctor);
        appt.setType(appointmentType);
        appt.setPatient(patient);
        appt.setStatus(Appointment.AppointmentStatus.New.getValue());
        patient.getApptDir().getApptList().add(appt);
        return appt;
    }

    public Appointment postLabAppointment(Patient patient, Employee doctor, Date appointmetDate, String appointmentType) {
        Appointment appt = new Appointment(cnt++);
        appt.setDate(appointmetDate);
        appt.setDoc(doctor);
        appt.setType(appointmentType);
        appt.setPatient(patient);
        appt.setStatus(Appointment.AppointmentStatus.New.getValue());
        patient.getLabApptDir().getApptList().add(appt);
        return appt;
    }

    public Prescription postPrescription() {
        Prescription prescription = new Prescription();
        prescriptionArary.add(prescription);
        return prescription;
    }

    public AppointmentDirectory postAppDir() {
        AppointmentDirectory appointmentDirectory = new AppointmentDirectory();
        return appointmentDirectory;
    }
}
