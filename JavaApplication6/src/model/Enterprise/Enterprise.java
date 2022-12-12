/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import model.Network.Network;
import model.Organization.Organization;
import model.Organization.OrganizationDirectory;

/**
 *
 * @author sushmithaprathap
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType typeEnterprise;
    private OrganizationDirectory orgDir;
    private Network network;

    public Network getNetwork() {
        return this.network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public OrganizationDirectory getOrgDir() {
        return orgDir;
    }

    public enum EnterpriseType {
        Hospital("Hospital"),
        Pharmacy("Pharmacy"),
        Lab("Lab"),
        Insurance("Insurance");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getTypeEnterprise() {
        return typeEnterprise;
    }

    public void setTypeEnterprise(EnterpriseType typeEnterprise) {
        this.typeEnterprise = typeEnterprise;
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.typeEnterprise = type;
        orgDir = new OrganizationDirectory();
    }

    @Override
    public String toString() {
        return this.getOrgName();
    }

}
