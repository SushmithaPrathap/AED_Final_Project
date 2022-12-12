/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise.Pharmacy;

import model.Enterprise.Enterprise;
import model.Medicine.Medicine;
import model.Medicine.MedicineDirectory;
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
    MedicineDirectory medicineArray;

    public MedicineDirectory getMedicineArray() {
        return medicineArray;
    }

    public void setMedicineArray(MedicineDirectory medicineArray) {
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
        medicineArray = new MedicineDirectory();
        popMedicineListForNewPharmacy();
    }

    @Override
    public ArrayList<Role> getRoleSupported() {
        return null;
    }

    void popMedicineListForNewPharmacy() {
        try {
            if (medicineArray.getMedicineList().isEmpty()) {
                //add preloaded medicines

                Medicine medVar = new Medicine();
                medicineArray.getMedicineList().add(medVar);

                String storeDate = "2024-12-30";
                SimpleDateFormat formatterVar = new SimpleDateFormat("yyyy-MM-dd");
                Date date1 = formatterVar.parse(storeDate);
                //Select --> form --> Liquid, Tablet, Gel, Injection, Other
                medVar.setValues("Benadryl", date1, "2", 300.00, 550, "Liquid");
                medVar = new Medicine();
                medicineArray.getMedicineList().add(medVar);
                medVar.setValues("Multi Vitamin", date1, "4", 300.00, 350, "Tablet");
                medVar = new Medicine();
                medicineArray.getMedicineList().add(medVar);
                medVar.setValues("Flu Injection", date1, "5", 300.00, 400, "Injection");
                medVar = new Medicine();
                medicineArray.getMedicineList().add(medVar);
                medVar.setValues("ABC Gel", date1, "1", 320.00, 40, "Gel");

            }

        } catch (Exception ex) {
            System.out.println("Error occured in craeting medicine in pharmacy");
        }
    }

}
