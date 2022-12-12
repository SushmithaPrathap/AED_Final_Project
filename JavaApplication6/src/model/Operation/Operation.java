/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Operation;

/**
 *
 * @author sushmithaprathap
 */
import model.Bed.Bed;
import model.Employee.Employee;
import model.Patient.Patient;

public class Operation {

    private int opNo;
    private String opDate;
    private String opDesc;
    private double opAmount;
    private String status; //status should be --> -by doc, success on-going, scheduled- 
    // by nurse after bed confirmation
    private String oprType;
    private Patient patient;
    private Employee doc;
    private Employee person;  // for nurse??
    private static int cnt = 0;
    private Bed assignedBed;

    public String getOprType() {
        return oprType;
    }

    public void setOprType(String oprType) {
        this.oprType = oprType;
    }

    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        Operation.cnt = cnt;
    }

    public Bed getAssignedBed() {
        return assignedBed;
    }

    public void setAssignedBed(Bed assignedBed) {
        this.assignedBed = assignedBed;
    }

    public Operation() {
        this.opNo = ++cnt;
        this.status = "New";
        this.assignedBed = null;
    }

    public String getOpDate() {
        return opDate;
    }

    public void setOpDate(String opDate) {
        this.opDate = opDate;
    }

    public String getOpDesc() {
        return opDesc;
    }

    public void setOpDesc(String opDesc) {
        this.opDesc = opDesc;
    }

    public double getOpAmount() {
        return opAmount;
    }

    public void setOpAmount(double opAmount) {
        this.opAmount = opAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public int getOpNo() {
        return opNo;
    }

    public void setOpNo(int opNo) {
        this.opNo = opNo;
    }

    public Employee getPerson() {
        return person;
    }

    public void setPerson(Employee person) {
        this.person = person;
    }

    public enum OperationType {
        Surgery("Surgery"),
        Biopsy("Biospy"),
        Skin("Skin"),
        Cataract("Cataract"),
        Heart("Heart"),
        Lung("Lung"),
        Kidney("Kidney"),
        Hernia("Hernia"),
        Fracture("Fracture"),
        General("General"),
        Other("Other");

        private String value;

        private OperationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum OperationStatus {
        WaitingConfirmation("Waiting Confirmation"),
        BedAssigned("Bed Assigned"),
        Completed("Completed"),
        Other("Other");

        private String statValue;

        private OperationStatus(String value) {
            this.statValue = value;
        }

        public String getStatValue() {
            return statValue;
        }

        @Override
        public String toString() {
            return statValue;
        }
    }

}
