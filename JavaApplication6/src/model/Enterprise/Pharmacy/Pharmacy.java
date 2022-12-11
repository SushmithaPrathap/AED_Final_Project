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
public class Pharmacy extends Enterprise{
    //int id;
    //String name;
    Map<Medicine,Integer> medicineListInventory;   /// medicine,quantity
    MedicineDirectory medicineList;

    public MedicineDirectory getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(MedicineDirectory medicineList) {
        this.medicineList = medicineList;
    }

    public Map<Medicine, Integer> getMedicineListquanity() {
        return medicineListInventory;
    }

    public void setMedicineListquanity(Map<Medicine, Integer> medicineListquanity) {
        this.medicineListInventory = medicineListquanity;
    }

    
    public Pharmacy(String name){
        super(name,EnterpriseType.Pharmacy);
        medicineList = new MedicineDirectory();
        populateMedicineListForNewPharmacy();
        
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    void populateMedicineListForNewPharmacy(){
    try{
    if(medicineList.getMedicineList().isEmpty())
    {
        //add medicines----> preloaded
        
        Medicine med = new Medicine();
        medicineList.getMedicineList().add(med);
        
        
        String sDate = "2022-12-30";
        SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-MM-dd");
        Date date1=formatter1.parse(sDate);
        //Select, Liquid, Tablet, Gel, Injection, Other
        med.setValues("Benadryl",date1, "2",300.00,250,"Liquid");
        med = new Medicine();
        medicineList.getMedicineList().add(med);
        med.setValues("Multi Vitamin",date1, "2",300.00,250,"Tablet");
        med = new Medicine();
        medicineList.getMedicineList().add(med);
        med.setValues("Flu Injection",date1, "2",300.00,250,"Injection");
        med = new Medicine();
        medicineList.getMedicineList().add(med);
        med.setValues("ABC Gel",date1, "2",320.00,20,"Gel");
        
        
        
    }
        
        
        }
    
    
    catch(Exception ex)
    {
        System.out.println("Exception occured in medicine creation in pharmacy");
    }
}
    
}
