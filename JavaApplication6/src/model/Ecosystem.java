/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Network.Network;
import model.Organization.Organization;
import model.Patient.PatientDirectory;
import model.Role.Role;
import model.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Suprith
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem ecosystem;
    private ArrayList<Network> networkArray;
    private PatientDirectory patDirectory;
    
    public static EcoSystem getInstance(){
        if(ecosystem==null){
            ecosystem=new EcoSystem();
            ecosystem.setPatDirectory(new PatientDirectory());
        }
        return ecosystem;
    }
    
    public Network createAddNetwork(){
        Network network=new Network();
        networkArray.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkArray=new ArrayList<>();
    }

    public ArrayList<Network> getNetworkArray() {
        return networkArray;
    }

    public void setNetworkArray(ArrayList<Network> networkArray) {
        this.networkArray = networkArray;
    }
    
    public boolean checkUserUnique(String userName){
        if(!this.getUserAcctDir().checkIfUsernameIsUnique(userName)){
            return false;
        }
        return true;
    }

    public PatientDirectory getPatDirectory() {
        return patDirectory;
    }

    public void setPatDirectory(PatientDirectory patDirectory) {
        this.patDirectory = patDirectory;
    }
}
