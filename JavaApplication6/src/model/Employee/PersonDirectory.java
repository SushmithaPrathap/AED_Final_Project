/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yash
 */
public class PersonDirectory {

    private ArrayList<Employee> employeeArray;

    public PersonDirectory() {
        employeeArray = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeArray() {
        return employeeArray;
    }

    public Employee postEmployee(String name) {
        Employee employee = new Employee();
        employee.setNameVar(name);
        employeeArray.add(employee);
        return employee;
    }

    public void deleteEmployee(Employee e) {
        employeeArray.remove(e);
    }

    public List<Employee> getDoctorList() {
        List<Employee> doctorArray = null;
        if (employeeArray != null || !(employeeArray.isEmpty())) {
            for (Employee emp : employeeArray) {
                //match a doctor role
                if (emp.getRole().equals("Doctor Role")) {
                    doctorArray.add(emp);
                }

            }
        }
        return doctorArray;
    }

    public List<Employee> getNurseList() {
        List<Employee> nurseArray = null;
        if (employeeArray != null || !(employeeArray.isEmpty())) {
            for (Employee emp : employeeArray) {
                //match a doctor role
                if (emp.getRole().equals("Nurse Role")) {
                    nurseArray.add(emp);
                }
            }
        }
        return nurseArray;
    }
}
