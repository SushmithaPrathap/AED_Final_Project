/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise.Insurance;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sushmithaprathap
 */
public class InsuranceDirectory {

    List<InsDetails> insuranceDir;

    public InsuranceDirectory() {
        insuranceDir = new ArrayList<>();
    }

    public List<InsDetails> getInsuranceDetailsBySSN(String SSN) {
        List<InsDetails> list = new ArrayList<InsDetails>();
        for (InsDetails indt : insuranceDir) {
            if (indt.getSSNVar().equals(SSN)) {
                list.add(indt);
            }
        }

        return list;
    }

    public List<InsDetails> getInsuranceDir() {
        return insuranceDir;
    }

    public void setInsuranceDir(List<InsDetails> insuranceDir) {
        this.insuranceDir = insuranceDir;
    }
}
