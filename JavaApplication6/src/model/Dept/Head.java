package model.Dept;

import model.Bed.Bed;
import model.Organization.Organization;
import model.Role.Role.RoleType;
import java.util.List;

/**
 *
 * @author Suprith
 */
public class Head {

    private RoleType typeStaff;
    private List<Bed> listBed;
    private List<Organization> listOrg;

    public RoleType getTypeStaff() {
        return typeStaff;
    }

    public void setTypeStaff(RoleType typeStaff) {
        this.typeStaff = typeStaff;
    }

    public List<Bed> getListBed() {
        return listBed;
    }

    public void setListBed(List<Bed> listBed) {
        this.listBed = listBed;
    }

    public List<Organization> getListOrg() {
        return listOrg;
    }

    public void setListOrg(List<Organization> listOrg) {
        this.listOrg = listOrg;
    }
}
