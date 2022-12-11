/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import model.Enterprise.HospitalEnterprise.Hospital;
import model.Enterprise.InsuranceEnterprise.Insurance;
import model.Enterprise.LabEnterprise.Lab;
import model.Enterprise.Pharmacy.Pharmacy;
import java.util.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author sushmithaprathap
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new Hospital(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Pharmacy){
            enterprise=new Pharmacy(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Lab){
            enterprise=new Lab(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Insurance){
            enterprise=new Insurance(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
}
