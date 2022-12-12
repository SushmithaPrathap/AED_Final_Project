/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

/**
 *
 * @author sushmithaprathap
 */
import model.Role.NurseRole;
import model.Role.Role;
import model.Bed.BedDir;

import java.util.ArrayList;

public class BedMgmtDept extends Organization {

    private BedDir bedArray;
    private int bedCnt;

    public int getBedCnt() {
        return bedCnt;
    }

    public void setBedCnt(int bedCnt) {
        this.bedCnt = bedCnt;
    }

    public BedDir getBedArray() {
        return bedArray;
    }

    public void setBedArray(BedDir bedArray) {
        this.bedArray = bedArray;
    }

    public BedDir getCreatedBedList(int count) {
        this.bedArray = new BedDir(count);
        this.bedCnt = count * 2;
        return bedArray;
    }

    public void addBed(int cnt) {
        this.bedArray.CreateBeds(cnt);
    }

    public BedMgmtDept() {
        super(Organization.Type.BedManagement.getValue());
    }

    @Override
    public ArrayList<Role> getRoleSupported() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NurseRole());
        return roles;
    }

}
