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
public class PersonDirectory {

    private ArrayList<Person> personArray;

    public PersonDirectory() {
        personArray = new ArrayList();
    }

    public ArrayList<Person> getEmployeeList() {
        return personArray;
    }

    public Person postEmployee(String name) {
        Person emp = new Person();
        emp.setName(name);
        personArray.add(emp);
        return emp;
    }
}
