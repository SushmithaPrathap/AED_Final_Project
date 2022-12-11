/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Medicine;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yash
 */
public class MedicineDirectory {

    List<Medicine> medicineList;

    public List<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(List<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    public MedicineDirectory() {
        medicineList = new ArrayList<>();
    }

}
