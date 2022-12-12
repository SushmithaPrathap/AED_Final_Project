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

    private String orgName;
    private String orgLocation;
    private WorkQueue orgWq;
    private PersonDirectory empDir;
    private UserAccountDirectory userAcctDir;
    private PatientDirectory patientDir;
    private BillDirectory billDirectory;
    private int orgId;
    private static int cnt = 1;

    public enum Type {
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

        private String valueVar;

        private Type(String value) {
            this.valueVar = value;
        }

        public String getValueVar() {
            return valueVar;
        }
    }

    public Organization(String name) {
        this.orgName = name;
        orgWq = new WorkQueue();
        empDir = new PersonDirectory();
        userAcctDir = new UserAccountDirectory();
        patientDir = new PatientDirectory();
        if (patientDir.getPatientArray() == null) {
            patientDir.setPatientArray(new ArrayList<Patient>());
        }
        billDirectory = new BillDirectory();
        if (billDirectory.getListBill() == null) {
            billDirectory.setListBill(new ArrayList<Bill>());
        }
        orgId = cnt;
        ++cnt;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAcctDir() {
        return userAcctDir;
    }

    public int getOrgId() {
        return orgId;
    }

    public PersonDirectory getEmpDir() {
        return empDir;
    }

    public String getOrgName() {
        return orgName;
    }

    public WorkQueue getOrgWq() {
        return orgWq;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void setOrgWq(WorkQueue orgWq) {
        this.orgWq = orgWq;
    }

    public PatientDirectory getPatDirectory() {
        return patientDir;
    }

    public void setPatDirectory(PatientDirectory patientDirectory) {
        this.patientDir = patientDirectory;
    }

    public BillDirectory getBillDirectory() {
        return billDirectory;
    }

    public void setBillDirectory(BillDirectory billDirectory) {
        this.billDirectory = billDirectory;
    }

    @Override
    public String toString() {
        return orgName;
    }

    public void deleteUserAccount() {
        for (UserAccount userAcc : userAcctDir.getUserAccountList()) {
            this.userAcctDir.removeUserAccount(userAcc);
        }

    }

    public void deleteAllEmployee() {
        for (Employee emp : empDir.getEmployeeArray()) {
            this.empDir.deleteEmployee(emp);
        }
    }
}
