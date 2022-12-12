/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise.Pharmacy;

import java.util.List;

/**
 *
 * @author Suprith
 */
public class PharmacyDir {

    List<Pharmacy> pharmacyArray;
    // pharmacy - CRUD operations

    public List<Pharmacy> getPharmacyArray() {
        return pharmacyArray;
    }

    public void setPharmacyArray(List<Pharmacy> pharmacyArray) {
        this.pharmacyArray = pharmacyArray;
    }
}
