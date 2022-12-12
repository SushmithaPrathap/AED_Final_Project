/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import model.Enterprise.Hospital.Hospital;
import model.Enterprise.Insurance.Insurance;
import model.Enterprise.Lab.Lab;
import model.Enterprise.Pharmacy.Pharmacy;

import java.util.ArrayList;

/**
 *
 * @author sushmithaprathap
 */
public class EnterpriseDir {

    private ArrayList<Enterprise> enterpriseArray;

    public ArrayList<Enterprise> getEnterpriseArray() {
        return enterpriseArray;
    }

    public void setEnterpriseArray(ArrayList<Enterprise> enterpriseArray) {
        this.enterpriseArray = enterpriseArray;
    }

    public EnterpriseDir() {
        enterpriseArray = new ArrayList<Enterprise>();
    }

    //Create a new enterprise
    public Enterprise createAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new Hospital(name);
            enterpriseArray.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Pharmacy) {
            enterprise = new Pharmacy(name);
            enterpriseArray.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Lab) {
            enterprise = new Lab(name);
            enterpriseArray.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Insurance) {
            enterprise = new Insurance(name);
            enterpriseArray.add(enterprise);
        }
        return enterprise;
    }
}
