/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UserAccount;

import model.Employee.Employee;
import model.Role.Role;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author sushmithaprathap
 */
public class UserAccount {

    protected String userName;
    protected String password;
    protected String name;
    protected String email;
    protected Role role;
    protected long phone;
    private Employee emp;
    private WorkQueue wq;

    public UserAccount() {
        wq = new WorkQueue();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmp() {
        return emp;
    }

    public WorkQueue getWq() {
        return wq;
    }

    @Override
    public String toString() {
        return userName;
    }

}
