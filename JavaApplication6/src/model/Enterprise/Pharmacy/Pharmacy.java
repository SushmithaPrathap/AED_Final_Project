/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise.Pharmacy;

import model.Enterprise.Enterprise;
import model.Medicine.Medicine;
import model.Medicine.MedicineDir;
import model.Role.Role;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author Suprith
 */
public class Pharmacy extends Enterprise {

    //int id;
    //String name;
    Map<Medicine, Integer> medicineInventory;   /// medicine,quantity
    MedicineDir medicineArray;

    public MedicineDir getMedicineArray() {
        return medicineArray;
    }

    public void setMedicineArray(MedicineDir medicineArray) {
        this.medicineArray = medicineArray;
    }

    public Map<Medicine, Integer> getMedicineListQuanity() {
        return medicineInventory;
    }

    public void setMedicineQuanity(Map<Medicine, Integer> medicineListquanity) {
        this.medicineInventory = medicineListquanity;
    }

    public Pharmacy(String name) {
        super(name, EnterpriseType.Pharmacy);
        medicineArray = new MedicineDir();
        popMedicineListForNewPharmacy();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    void popMedicineListForNewPharmacy() {
        try {
            if (medicineArray.getMedsArray().isEmpty()) {
                //add preloaded medicines

                Medicine medVar = new Medicine();
                medicineArray.getMedsArray().add(medVar);

                String storeDate = "2024-12-30";
                SimpleDateFormat formatterVar = new SimpleDateFormat("yyyy-MM-dd");
                Date date1 = formatterVar.parse(storeDate);
                //Select --> form --> Liquid, Tablet, Gel, Injection, Other
                medVar.setAllValues("Benadryl", date1, "2", 300.00, 550, "Liquid");
                medVar = new Medicine();
                medicineArray.getMedsArray().add(medVar);
                medVar.setAllValues("Multi Vitamin", date1, "4", 300.00, 350, "Tablet");
                medVar = new Medicine();
                medicineArray.getMedsArray().add(medVar);
                medVar.setAllValues("Flu Injection", date1, "5", 300.00, 400, "Injection");
                medVar = new Medicine();
                medicineArray.getMedsArray().add(medVar);
                medVar.setAllValues("ABC Gel", date1, "1", 320.00, 40, "Gel");

            }

        } catch (Exception ex) {
            System.out.println("Error occured in craeting medicine in pharmacy");
        }
    }

}
