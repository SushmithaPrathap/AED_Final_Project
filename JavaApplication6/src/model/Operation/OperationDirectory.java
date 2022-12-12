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

    List<Operation> operationArray;
//Crud for operations and search and delete

    public List<Operation> getOperationArray() {
        return operationArray;
    }

    public void setOperationArray(List<Operation> operationArray) {
        this.operationArray = operationArray;
    }

    public Operation postOperation() {
        Operation operation = new Operation();
        operationArray.add(operation);
        return operation;

    }

    public Operation findOperationbyDate(String date) {
        for (Operation op : operationArray) {
            if (op.getOpDate() == date) {
                return op;
            }
        }
        return null;
    }

    public void updateOperation(int operationNumber, String operationDate, String operationDescription, double operationCharge, String status, Patient patient, Employee doctor) {
        for (Operation operation : operationArray) {
            if (operation.getOpNo() == (operationNumber)) {
                operation.setOpDate(operationDate);
                operation.setOpDesc(operationDescription);
                operation.setOpAmount(operationCharge);
                operation.setStatus(status);
                operation.setPatient(patient);
                operation.setDoc(doctor);

            }
        }
    }

    public void deleteOperation(Operation operation) {
        operationArray.remove(operation);
    }

}
