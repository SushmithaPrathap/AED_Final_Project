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
public class MedicineDir {

    List<Medicine> medsArray;

    public List<Medicine> getMedsArray() {
        return medsArray;
    }

    public void setMedsArray(List<Medicine> medsArray) {
        this.medsArray = medsArray;
    }

    public MedicineDir() {
        medsArray = new ArrayList<>();
    }

}
