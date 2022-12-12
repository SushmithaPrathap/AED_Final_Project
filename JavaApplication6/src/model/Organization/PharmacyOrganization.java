/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Medicine.MedicineDirectory;

/**
 *
 * @author Suprith
 */
public class PharmacyOrganization {

    MedicineDirectory medicineDir;

    public PharmacyOrganization() {
        medicineDir = new MedicineDirectory();
    }
}
