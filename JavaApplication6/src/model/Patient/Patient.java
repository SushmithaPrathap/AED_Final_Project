/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Patient;

import model.appointment.AppointmentDirectory;
import model.appointment.PatientHistoryDetails;
import model.Employee.Employee;
import model.Enterprise.Insurance.Insurance;
import model.Enterprise.Lab.LabTestDirectory;
import model.Location.Location;
import model.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author sushmithaprathap
 */
public class Patient extends Employee {

    AppointmentDirectory appointmentDir;
    AppointmentDirectory labApptDir;
    LabTestDirectory labTestDir;
    String patSex;
    private Location addressVar;
    private String bloodGrp;
    private String insId;
    private Insurance insVar;
    private ArrayList<PatientHistoryDetails> patHistoryDetails;
    private String ssnVar;
    //String phoneNum;

    public AppointmentDirectory getLabApptDir() {
        return labApptDir;
    }

    public void setLabApptDir(AppointmentDirectory labApptDir) {
        this.labApptDir = labApptDir;
    }

    public String getSsnVar() {
        return ssnVar;
    }

    public void setSsnVar(String ssnVar) {
        this.ssnVar = ssnVar;
    }

    public Patient() {
        super();
        this.patHistoryDetails = new ArrayList<>();
        this.appointmentDir = new AppointmentDirectory();
        this.labApptDir = new AppointmentDirectory();
        this.labTestDir = new LabTestDirectory();
    }

    public ArrayList<PatientHistoryDetails> getPatHistoryDetails() {
        return patHistoryDetails;
    }

    public void setPatHistoryDetails(ArrayList<PatientHistoryDetails> patHistoryDetails) {
        this.patHistoryDetails = patHistoryDetails;
    }

    public String getInsId() {
        return insId;
    }

    public Insurance getInsVar() {
        return insVar;
    }

    public void setInsVar(Insurance insVar) {
        this.insVar = insVar;
    }

    public void setInsId(String insId) {
        this.insId = insId;
    }

    private UserAccount userAcc;

    public UserAccount getUserAcc() {
        return userAcc;
    }

    public void setUserAcc(UserAccount userAcc) {
        this.userAcc = userAcc;
    }

    public void createNewApptDir() {
        appointmentDir = new AppointmentDirectory();
    }

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }

    public Location getAddressVar() {
        return addressVar;
    }

    public void setAddressVar(Location addressVar) {
        this.addressVar = addressVar;
    }

    public AppointmentDirectory getAppointmentDir() {
        return appointmentDir;
    }

    public void setAppointmentDir(AppointmentDirectory appointmentDir) {
        this.appointmentDir = appointmentDir;
    }

    public LabTestDirectory getLabTestDir() {
        return labTestDir;
    }

    public void setLabTestDir(LabTestDirectory labTestDir) {
        this.labTestDir = labTestDir;
    }

    public String getPatSex() {
        return patSex;
    }

    public void setPatSex(String patSex) {
        this.patSex = patSex;
    }

//    void bookAppointment(Appointment app) {
//
//    }
//    Appointment viewAppointment(Date date) {
//        Appointment app = null;
//        return app;
//    }
//    void rescheduleAppointment(Appointment app) {
//        //update the appointment
//        //
//    }
//    Bill viewBills(Appointment app) {
//        Bill b = null;
//        return b;
//    }
    @Override
    public String toString() {
        return this.getNameVar();
    }
}
