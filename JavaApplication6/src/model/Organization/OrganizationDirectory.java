/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Suprith
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationArray;

    public OrganizationDirectory() {
        organizationArray = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationArray() {
        return organizationArray;
    }
    
    public Organization addOrganization(Type type){
        Organization org = null;
        if (type.getValueVar().equals(Type.Dental.getValueVar())){
            org = new GeneralOrganization(Type.Dental.getValueVar());
            organizationArray.add(org);
        }
        else if (type.getValueVar().equals(Type.Pathology.getValueVar())){
            org = new PathologyOrganization();//GeneralOrganization(Type.Pathology.getValue());
            organizationArray.add(org);
        }
        else if (type.getValueVar().equals(Type.Billing.getValueVar())){
            org = new BillingDepartment();
            organizationArray.add(org);
        }
        else if (type.getValueVar().equals(Type.BedManagement.getValueVar())){
            org = new BedMgmtDept();
            organizationArray.add(org);
        }
        else if (type.getValueVar().equals(Type.Cardiology.getValueVar())){
            org = new GeneralOrganization(Type.Cardiology.getValueVar());
            organizationArray.add(org);    
        }    
        else if (type.getValueVar().equals(Type.ENT.getValueVar())){
            org = new GeneralOrganization(Type.ENT.getValueVar());
            organizationArray.add(org);   
        }
        else if (type.getValueVar().equals(Type.CovidCenter.getValueVar())){
            org = new GeneralOrganization(Type.CovidCenter.getValueVar());
            organizationArray.add(org);   
        }
        else if (type.getValueVar().equals(Type.UrgentCare.getValueVar())){
            org = new GeneralOrganization(Type.UrgentCare.getValueVar());
            organizationArray.add(org);   
        }
        else if (type.getValueVar().equals(Type.Radiology.getValueVar())){
            org = new RadiologyOrganization();//GeneralOrganization(Type.Radiology.getValue());
            organizationArray.add(org);   
        }
        else if (type.getValueVar().equals(Type.MedicalStore.getValueVar())){
            org = new MedicalStoreDept();
            organizationArray.add(org);   
        }
        
        else if (type.getValueVar().equals(Type.Insurance.getValueVar())){
            org = new InsuranceOrganization();
            organizationArray.add(org);
        }
        
        return org;
    }
}