/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Patient;

//import Business.Appointment.Appointment;
//import Business.Appointment.AppointmentDirectory;
//import Business.Appointment.PatientHistoryDetails;
//import Business.Bill.Bill;
//import Business.Employee.Employee;
//import Business.Enterprise.InsuranceEnterprise.Insurance;
//import Business.Enterprise.LabEnterprise.LabTestDirectory;
//import Business.Location.Location;
//import Business.UserAccount.UserAccount;
//import java.util.ArrayList;
//import java.util.Date;

/**
 *
 * @author sushmithaprathap
 */
public class Patient {
//        LabTestDirectory labTestList;
    String patientSex;
    //private String address;
//    private Location address;
    private String bloodGroup;
    //private String emailId;
    private String insuranceId;
//    private Insurance insuranceE;
//    private ArrayList<PatientHistoryDetails> patHistorydtls;
    private String SSN;
    
//     public AppointmentDirectory getLabAppointmentDirectory() {
//        return labAppointmentDirectory;
//    }
//
//    public void setLabAppointmentDirectory(AppointmentDirectory labAppointmentDirectory) {
//        this.labAppointmentDirectory = labAppointmentDirectory;
//    }
//    
    
//     public Patient()
//    {
//        super();
//        this.patHistorydtls= new ArrayList<>();
//        this.appointmentDirectory = new AppointmentDirectory();
//        this.labAppointmentDirectory = new AppointmentDirectory();
//        this.labTestList = new LabTestDirectory();
//    }
//    


    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
    }

//    public Location getAddress() {
//        return address;
//    }
//
//    public void setAddress(Location address) {
//        this.address = address;
//    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }
    
//     private UserAccount userAccount;
//
//    public UserAccount getUserAccount() {
//        return userAccount;
//    }
//
//    public void setUserAccount(UserAccount userAccount) {
//        this.userAccount = userAccount;
//    }

//    public void createNewAppointmentDirectory(){
//    appointmentDirectory = new AppointmentDirectory();
//}
//   
    
//     public AppointmentDirectory getAppointmentDirectory() {
//        return appointmentDirectory;
//    }
//
//    public void setAppointmentDirectory(AppointmentDirectory appointmentDirectory) {
//        this.appointmentDirectory = appointmentDirectory;
//    }
    
//      public LabTestDirectory getLabTestList() {
//        return labTestList;
//    }
//
//    public void setLabTestList(LabTestDirectory labTestList) {
//        this.labTestList = labTestList;
//    }
//    
//    public Insurance getInsuranceE() {
//        return insuranceE;
//    }
//
//    public void setInsuranceE(Insurance insuranceE) {
//        this.insuranceE = insuranceE;
//    }

//    public ArrayList<PatientHistoryDetails> getPatHistorydtls() {
//        return patHistorydtls;
//    }
//
//    public void setPatHistorydtls(ArrayList<PatientHistoryDetails> patHistorydtls) {
//        this.patHistorydtls = patHistorydtls;
//    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    
}
