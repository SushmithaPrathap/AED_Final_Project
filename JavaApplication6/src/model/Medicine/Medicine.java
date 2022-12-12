/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Medicine;

import java.util.Date;

/**
 *
 * @author yash
 */
public class Medicine {

    int medId;
    String name;
    Date dateExpiry;
    String dosage;
    double amount;
    int quan;
    String type; //tyoe should --> liquid, tablet, gel
    static int cnt = 1;

    public Medicine() {
        this.medId = cnt++;
    }

    public int getQuan() {
        return quan;
    }

    public void setQuan(int quan) {
        this.quan = quan;
    }

    public int getMedId() {
        return medId;
    }

    public void setMedId(int medId) {
        this.medId = medId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateExpiry() {
        return dateExpiry;
    }

    public void setDateExpiry(Date dateExpiry) {
        this.dateExpiry = dateExpiry;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAllValues(String name, Date date1, String dosage, double price, int quantity, String type) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.setDosage(dosage);
        this.setDateExpiry(date1);
        this.setName(name);
        this.setAmount(price);
        this.setQuan(quantity);
        this.setType(type);
    }

    @Override
    public String toString() {
        return "Med " + String.valueOf(this.getMedId()) + " " + this.getName();
    }

}
