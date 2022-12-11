/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Person;

import java.util.ArrayList;

/**
 *
 * @author sushmithaprathap
 */
public class EmployeeDirectory {

    private ArrayList<Person> personList;

    public EmployeeDirectory() {
        personList = new ArrayList();
    }

    public ArrayList<Person> getEmployeeList() {
        return personList;
    }

    public Person createEmployee(String name) {
        Person employee = new Person();
        employee.setName(name);
        personList.add(employee);
        return employee;
    }
}
