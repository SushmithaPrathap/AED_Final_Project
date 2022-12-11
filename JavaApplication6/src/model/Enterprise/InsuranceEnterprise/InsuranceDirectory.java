/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise.InsuranceEnterprise;

import model.Enterprise.HospitalEnterprise.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sushmithaprathap
 */
public class InsuranceDirectory {
    
    List<InsuranceDetails> insuranceDir ;
    
    
    
    public InsuranceDirectory(){
     insuranceDir = new ArrayList<>();
    }
    
    public List<InsuranceDetails> getInsuranceDetailsBySSN(String SSN){
         List<InsuranceDetails> list = new  ArrayList<InsuranceDetails>();
        for(InsuranceDetails indt: insuranceDir)
        {
            if(indt.getSSN().equals(SSN))
            {
                list.add(indt);
            }
        }
        
        return list;
    } 

    public List<InsuranceDetails> getInsuranceDir() {
        return insuranceDir;
    }

    public void setInsuranceDir(List<InsuranceDetails> insuranceDir) {
        this.insuranceDir = insuranceDir;
    }
    
    
}
