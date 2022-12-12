/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Network;

import model.Enterprise.EnterpriseDir;

/**
 *
 * @author sushmithaprathap
 */
public class Network {

    private String name;
    private EnterpriseDir enterpriseDir;

    public Network() {
        enterpriseDir = new EnterpriseDir();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDir getEnterpriseDir() {
        return enterpriseDir;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {

        // typecast o to Complex so that we can compare data members  
        Network c = (Network) o;
        return (this.name.equals(c.name));
    }
}
