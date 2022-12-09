/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Employee;

/**
 *
 * @author raunak
 */
public class UserAccount {

    private String username;
    private String password;
    private Employee employee;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return username;
    }

}
