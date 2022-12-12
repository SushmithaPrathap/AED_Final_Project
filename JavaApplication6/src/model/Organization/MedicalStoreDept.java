/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Medicine.MedicineDir;
import model.appointment.Prescription;
import model.Role.PharmacyWorkerRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Suprith
 */
public class MedicalStoreDept extends Organization {

    MedicineDir medicineArray;
    String pharmacyPaersonName;
    Prescription prescriptionVar;

    public MedicalStoreDept() {
        super(Organization.Type.MedicalStore.getValueVar());
    }

    //@Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacyWorkerRole());
        //roles.add(new WorkerRole());
        return roles;
    }

    public void generateBill(Prescription prescription) {
        //generates bill for medicines bought at the store
    }
}
