/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise.Lab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Suprith
 */
public class LabTestDirectory {

    private List<LabTest> labTestArray;

    public LabTestDirectory() {
        labTestArray = new ArrayList<>();

    }

    public List<LabTest> getLabTestArray() {
        return labTestArray;
    }

    public void setLabTestArray(List<LabTest> labTestArray) {
        this.labTestArray = labTestArray;
    }

    public LabTest addLabTest(LabTest labTest) {
        labTestArray.add(labTest);
        return labTest;
    }
}
