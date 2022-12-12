/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise.InsuranceEnterprise;

import model.Employee.Employee;
import model.Patient.Patient;

import java.util.Date;

/**
 *
 * @author sushmithaprathap
 */
public class InsDetails {

    private String insDetId;
    private Patient patient;
    private Date createdDate;
    private Date validDate;
    private String type;
    private String SSNVar;

    private Employee insDealer;

    public Employee getInsDealer() {
        return insDealer;
    }

    public void setInsDealer(Employee insDealer) {
        this.insDealer = insDealer;
    }

    public String getSSNVar() {
        return SSNVar;
    }

    public void setSSNVar(String SSNVar) {
        this.SSNVar = SSNVar;
    }
    static int count = 10020;

    public InsDetails() {
        this.insDetId = "INSUR" + count++;
        this.createdDate = new Date();
    }

    @Override
    public String toString() {
        return this.insDetId;
    }

    public String getInsDetId() {
        return insDetId;
    }

    public void setInsDetId(String insDetId) {
        this.insDetId = insDetId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    private double price;
}
