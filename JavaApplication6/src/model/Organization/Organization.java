/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Bill.Bill;
import model.Bill.BillDirectory;
import model.Employee.Employee;
import model.Employee.PersonDirectory;
import model.Patient.Patient;
import model.Patient.PatientDirectory;
import model.Role.Role;
import model.UserAccount.UserAccount;
import model.UserAccount.UserAccountDirectory;
import model.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Suprith
 */
public abstract class Organization {

    private String name;
    private String location;
    private WorkQueue workQueue;
    private PersonDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PatientDirectory patientDirectory;
    private BillDirectory billDirectory;
    //private BedManagementDepartment 
    private int organizationID;
    private static int counter=1;
    
    public enum Type{
        Admin("Admin"),
        //Doctor("Doctor"),        
        Dental("Dental Department"),
        ENT("ENT Department"),
        CovidCenter("Covid-19 Treatment Department"),
        MedicalStore("Medical Store Department"),
        BedManagement("Bed Management Department"),
        //Laundry("Laundry Service Department"),
        Pathology("Pathology Department"),
        Radiology("Radiology Department"),
        //Inventory("Inventory Management Department"),
        UrgentCare("Urgent Care Department"),
        Cardiology("Cardiology Department"),
        Billing("Billing Department"),
        Lab("Lab"),
        Insurance("Insurance"),
        Other("Other Department");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        patientDirectory = new PatientDirectory();
        if(patientDirectory.getPatientList() == null){
            patientDirectory.setPatientList(new ArrayList<Patient>());
        }
        billDirectory = new BillDirectory();
        if(billDirectory.getBillList() == null){
            billDirectory.setBillList(new ArrayList<Bill>());
        }
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public PersonDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public BillDirectory getBillDirectory() {
        return billDirectory;
    }

    public void setBillDirectory(BillDirectory billDirectory) {
        this.billDirectory = billDirectory;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
    public void removeAllUserAccount(){
        for(UserAccount ua : userAccountDirectory.getUserAccountList())
        {
            this.userAccountDirectory.removeUserAccount(ua);
        }
        
    } 
    
    public void removeAllEmployee(){
                 for(Employee ua : employeeDirectory.getEmployeeList())
        {
            this.employeeDirectory.removeEmployee(ua);
        }    
                }
    
}
