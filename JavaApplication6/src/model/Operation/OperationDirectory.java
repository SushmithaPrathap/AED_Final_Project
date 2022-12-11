/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Operation;

/**
 *
 * @author sushmithaprathap
 */
import model.Employee.Employee;
import model.Patient.Patient;

import java.util.List;

public class OperationDirectory {

    List<Operation> operationlist;

    //add
    //update
    //searchbyOperationdate
    //delete-cancel
    public List<Operation> getOperationlist() {
        return operationlist;
    }

    public void setOperationlist(List<Operation> operationlist) {
        this.operationlist = operationlist;
    }

    public Operation addOperation() {
        Operation operation = new Operation();
        operationlist.add(operation);
        return operation;

    }

    public Operation searchOperationbyDate(String date) {
        for (Operation operation : operationlist) {
            if (operation.getOperationDate() == date) {
                return operation;
            }
        }
        return null;
    }

    public void updateOperation(int operationNumber, String operationDate, String operationDescription, double operationCharge, String status, Patient patient, Employee doctor) {
        for (Operation operation : operationlist) {
            if (operation.getOperationNumber() == (operationNumber)) {
                operation.setOperationDate(operationDate);
                operation.setOperationDescription(operationDescription);
                operation.setOperationCharge(operationCharge);
                operation.setStatus(status);
                operation.setPatient(patient);
                operation.setDoctor(doctor);

            }
        }
    }

    public void cancelOperation(Operation operation) {
        operationlist.remove(operation);
    }

}
