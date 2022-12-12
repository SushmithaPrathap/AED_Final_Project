/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Suprith
 */
public abstract class Role {

    public enum RoleType {
        Doctor("Doctor"),
        Nurse("Nurse"),
        LabTechnician("Lab Technician"),
        Receptionist("Receptionist"),
        Patient("Patient"),
        MedicalStoreHead("Medical Store Head"),
        PharmacyHead("Pharmacy Head"),
        LabHead("Lab Head"),
        HospitalHead("Hospital Head"),
        LaundryHead("Laundy Head");

        private String roleValue;

        private RoleType(String value) {
            this.roleValue = value;
        }

        public String getRoleValue() {
            return roleValue;
        }

        @Override
        public String toString() {
            return roleValue;
        }
    }

    public abstract JPanel postWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business
    );

    public abstract String roleValue();

    @Override
    public String toString() {
        return this.roleValue(); 
    }

}
