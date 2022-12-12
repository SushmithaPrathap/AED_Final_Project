/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UserAccount;

import model.Employee.Employee;
import model.Role.Role;

import java.util.ArrayList;

/**
 *
 * @author sushmithaprathap
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountArray;

    public UserAccountDirectory() {
        userAccountArray = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountArray() {
        return userAccountArray;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount userAcc : userAccountArray) {
            if (userAcc.getUserName().equals(username) && userAcc.getPassword().equals(password)) {
                return userAcc;
            }
        }
        return null;
    }

    public UserAccount postUserAcc(String username, String password, Employee employee, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setEmp(employee);
        userAccount.setRole(role);
        userAccountArray.add(userAccount);
        return userAccount;
    }

    public boolean checkIfUserNameIsUnique(String userName) {
        for (UserAccount userAcc : userAccountArray) {
            if (userAcc.getUserName().equals(userName)) {
                return false;
            }
        }
        return true;
    }

    public void deleteUserAccount(UserAccount uAcc) {
        userAccountArray.remove(uAcc);
    }

    public UserAccount getUserAccByEmp(Employee emp) {
        for (UserAccount userAcc : userAccountArray) {
            if (userAcc.getEmp().equals(emp)) {
                return userAcc;
            }
        }
        return null;
    }
}
