package model;

import model.Employee.Employee;
import model.Enterprise.Enterprise;
import model.Enterprise.Hospital.Hospital;
import model.Enterprise.Insurance.Insurance;
import model.Enterprise.Lab.Lab;
import model.Enterprise.Pharmacy.Pharmacy;
import model.Location.Location;
import model.Organization.BedMgmtDept;
import model.Organization.Organization;
import model.Patient.Patient;
import model.Role.AdminRole;
import model.Role.DoctorRole;
import model.Role.InsuranceDealerRole;
import model.Role.LabTechnicianRole;
import model.Role.NurseRole;
import model.Role.PatientRole;
import model.Role.PharmacyWorkerRole;
import model.Role.ReceptionistRole;
import model.Role.SystemAdminRole;
import model.UserAccount.UserAccount;
import com.github.javafaker.Faker;
import java.util.Locale;
import java.util.Random;

/**
 *
 * @author Suprith
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Add a network
        //Add an enterprise
        //Create some dummy organizations
        //Create some dummy employees 
        //Add user account
        
        
        Employee employee = new Employee();//system.getEmployeeDirectory().postEmployee("sysadmin");
        
        UserAccount userAcc = system.getUserAcctDir().postUserAcc("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        String [] bloodGroup = {"A+","A-","B+","B-","O+","O-","AB+","AB-"};
        String bgVar;
        String[] genderArray = {"Male","Female","Other"};
        String genderVar;
        
        // Boston Network
        System.err.println("Boston Network");
        system.createAddNetwork().setName("Boston");
        
            // Boston Insurance - Enterprise
            System.err.println("Boston Blue Cross Insurance");
            Enterprise Ie = new Insurance("Boston Blue Cross Insurance");
            
                Organization o;
                Employee emp1 = new Employee();
                UserAccount user1 = new UserAccount();
                String ssnVar;
                String insID;
                
                Faker fakerAdmin = new Faker(Locale.US, new Random(0));
                String firstName = fakerAdmin.name().firstName().replaceAll("'", "");
                String lastName = fakerAdmin.name().lastName().replaceAll("'", "");
                String name = firstName + " " + lastName;
                String userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                
                emp1 = Ie.getEmpDir().postEmployee(name);
                emp1.setRole("Head Role");
                user1 = Ie.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new AdminRole());
                user1.setEmp(emp1);
                System.out.println("Head: " + userName);
            
                System.out.println("Insurance Organization");
                o = Ie.getOrgDir().addOrganization(Organization.Type.Insurance);
                    
                    for(int i = 41; i<=45; i++) 
                    {
                        Faker faker = new Faker(Locale.US, new Random(i));
  
                        //int id = faker.number().numberBetween(1000, 10000);
                        firstName = faker.name().firstName().replaceAll("'", "");
                        lastName = faker.name().lastName().replaceAll("'", "");
                        name = firstName + " " + lastName;
                        userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                        String email = "mithaarshi78@gmail.com";
                        String phone = faker.phoneNumber().phoneNumber().replaceAll("\\(","").replaceAll("\\)","")
                    .   replaceAll(" ","").replaceAll("-","").replaceAll("\\.","").replaceAll("x", "").substring(0, 10);
                        //int officeNo = faker.number().numberBetween(1, 999);
                    
                        System.out.println("Insurance Dealer: "  + userName);
                        emp1 =  o.getEmpDir().postEmployee(name);
                        emp1.setRole((new InsuranceDealerRole()).roleValue());
                        emp1.setSpecialization(Employee.TypeSpecialization.Physician);
                        emp1.setVisitCharge(20);
                        user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new InsuranceDealerRole());

                        user1.setEmp(emp1);
                        emp1.setEmail(email);
                        emp1.setPhone("5085099183");
                        emp1.setMobileCarrier("@tmomail.net");
                        
                    }
//            System.out.println();
            system.getNetworkArray().get(0).getEnterpriseDir().getEnterpriseArray().add(Ie) ;

        
            // Boston Hospital - Enterprise
            System.err.println("Boston BIDMC Hospital");
            Enterprise e = new Hospital("Boston BIDMC Hospital");
                
                // ENT Organization
                fakerAdmin = new Faker(Locale.US, new Random(40));
                
                firstName = fakerAdmin.name().firstName().replaceAll("'", "");
                lastName = fakerAdmin.name().lastName().replaceAll("'", "");
                name = firstName + " " + lastName;
                userName = firstName.toLowerCase() + "." + lastName.toLowerCase();

                
                emp1 = e.getEmpDir().postEmployee(name);
                emp1.setRole("Head Role");
                user1 = e.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new AdminRole());
                user1.setEmp(emp1);
                System.out.println("Head: " + userName);
                
                System.out.println("ENT Organization");
                o = e.getOrgDir().addOrganization(Organization.Type.ENT);
                
                for(int i = 1; i<=21; i++) 
                {
                    Faker faker = new Faker(Locale.US, new Random(i));
  
                    //int id = faker.number().numberBetween(1000, 10000);
                    firstName = faker.name().firstName().replaceAll("'", "");
                    lastName = faker.name().lastName().replaceAll("'", "");
                    name = firstName + " " + lastName;
                    userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                    String emailVar = "mithaarshi78@gmail.com";
                    String phoneVar = faker.phoneNumber().phoneNumber().replaceAll("\\(","").replaceAll("\\)","")
                    .replaceAll(" ","").replaceAll("-","").replaceAll("\\.","").replaceAll("x", "").substring(0, 10);
                    //int officeNo = faker.number().numberBetween(1, 999);
                    if(i <=5)
                    {
                        System.out.println("Doctor: " + userName);
                        emp1 =  o.getEmpDir().postEmployee(name);
                        emp1.setRole((new DoctorRole()).roleValue());
                        emp1.setSpecialization(Employee.TypeSpecialization.Physician);
                        emp1.setVisitCharge(20);
                        user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new DoctorRole());
                    }
                    else if(i <= 10)
                    {
                        System.out.println("Nurse: " + userName);
                        emp1 =  o.getEmpDir().postEmployee(name);
                        emp1.setRole((new NurseRole()).roleValue());
                        user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new NurseRole());
                    }
                    else if(i == 11)
                    {
                        System.out.println("Receptionist: " + userName);
                        emp1 =  o.getEmpDir().postEmployee(name);
                        emp1.setRole((new ReceptionistRole()).roleValue());
                        user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new ReceptionistRole());
                    }
                    else
                    {
                        
                        bgVar = bloodGroup[faker.number().numberBetween(0, 8)];
                        genderVar = genderArray[faker.number().numberBetween(0, 3)];
                        ssnVar = String.valueOf(faker.number().numberBetween(123456789l, 999999999l));
                        insID = "BST" + String.valueOf(faker.number().numberBetween(12345678l, 99999999l));
                        System.out.println("Patient: " + userName);
                        Location locationPoint = new Location();
                        locationPoint.setStt(faker.address().streetAddress());
                        locationPoint.setState(faker.address().state());
                        locationPoint.setCity(faker.address().cityName());
                        user1 = system.getUserAcctDir().postUserAcc(userName, "Sam123!!", null, new PatientRole());
                        emp1= system.getPatDirectory().createPatient(name, "5085099183", genderVar, bgVar, user1, locationPoint, "email",(Insurance)Ie,insID , ssnVar);
                        e.getPatDirectory().getPatientArray().add((Patient)emp1);
                        Ie.getPatDirectory().getPatientArray().add((Patient)emp1);
                    }
                    
                    user1.setEmp(emp1);
                    emp1.setEmail(emailVar);
                    emp1.setPhone("5085099183");
                    emp1.setMobileCarrier("@tmomail.net");
                
                }
                System.out.println();
                
                System.out.println("Cardiology Organization");
                o = e.getOrgDir().addOrganization(Organization.Type.Cardiology);
                
                for(int i = 100; i<=121; i++) 
                {
                    Faker faker = new Faker(Locale.US, new Random(i));
  
                    firstName = faker.name().firstName().replaceAll("'", "");
                    lastName = faker.name().lastName().replaceAll("'", "");
                    name = firstName + " " + lastName;
                    userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                    String emailVar = "mithaarshi78@gmail.com";
                    String phoneVar = faker.phoneNumber().phoneNumber().replaceAll("\\(","").replaceAll("\\)","")
                    .replaceAll(" ","").replaceAll("-","").replaceAll("\\.","").replaceAll("x", "").substring(0, 10);
                    
                    if(i <=105)
                    {
                        System.out.println("Doctor: " + userName);
                        emp1 =  o.getEmpDir().postEmployee(name);
                        emp1.setRole((new DoctorRole()).roleValue());
                        emp1.setSpecialization(Employee.TypeSpecialization.Physician);
                        emp1.setVisitCharge(20);
                        user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new DoctorRole());
                    }
                    else if(i <= 110)
                    {
                        System.out.println("Nurse: " + userName);
                        emp1 =  o.getEmpDir().postEmployee(name);
                        emp1.setRole((new NurseRole()).roleValue());
                        user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new NurseRole());
                    }
                    else if(i == 111)
                    {
                        System.out.println("Receptionist: " + userName);
                        emp1 =  o.getEmpDir().postEmployee(name);
                        emp1.setRole((new ReceptionistRole()).roleValue());
                        user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new ReceptionistRole());
                    }
                    else
                    {
                        bgVar = bloodGroup[faker.number().numberBetween(0, 8)];
                        genderVar = genderArray[faker.number().numberBetween(0, 3)];
                        ssnVar = String.valueOf(faker.number().numberBetween(123456789l, 999999999l));
                        insID = "BST" + String.valueOf(faker.number().numberBetween(12345678l, 99999999l));
                        
                        System.out.println("Patient: " + userName);
                        Location locationPoint = new Location();
                        locationPoint.setStt(faker.address().streetAddress());
                        locationPoint.setState(faker.address().state());
                        locationPoint.setCity(faker.address().cityName());
                        user1 = system.getUserAcctDir().postUserAcc(userName, "Sam123!!", null, new PatientRole());
                        emp1= system.getPatDirectory().createPatient(name, "5085099183", genderVar, bgVar, user1, locationPoint, emailVar,(Insurance)Ie,insID,ssnVar);
                        e.getPatDirectory().getPatientArray().add((Patient)emp1);
                        Ie.getPatDirectory().getPatientArray().add((Patient)emp1);
                    }
                    
                    user1.setEmp(emp1);
                    emp1.setEmail(emailVar);
                    emp1.setPhone("5085099183");
                    emp1.setMobileCarrier("@tmomail.net");
                }
                
                System.out.println();
                
                System.out.println("BedManagement Organization");
                o = e.getOrgDir().addOrganization(Organization.Type.BedManagement);
                BedMgmtDept bo = ((BedMgmtDept)o);
                bo.getCreatedBedList(23);
                
                
                System.out.println("Billing Organization");
                o = e.getOrgDir().addOrganization(Organization.Type.Billing);
                //((BillingDepartment)o).generateInvoice(date, patient);
                
         
            system.getNetworkArray().get(0).getEnterpriseDir().getEnterpriseArray().add(e) ;
        
        
            // Boston Lab - Enterprise
            System.err.println("Boston WestPac Lab");
            e = new Lab("Boston WestPac Lab");
            
                fakerAdmin = new Faker(Locale.US, new Random(1000));
                
                firstName = fakerAdmin.name().firstName().replaceAll("'", "");
                lastName = fakerAdmin.name().lastName().replaceAll("'", "");
                name = firstName + " " + lastName;
                userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                
                emp1 = e.getEmpDir().postEmployee(name);
                emp1.setRole("Head Role");
                user1 = e.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new AdminRole());
                user1.setEmp(emp1);
                System.out.println("Head: " + userName);
                
                    System.out.println("Pathology Organization");
                    o = e.getOrgDir().addOrganization(Organization.Type.Pathology);
                    
                    for(int i = 22; i<=26; i++) 
                    {
                        Faker faker = new Faker(Locale.US, new Random(i));
  
                        //int id = faker.number().numberBetween(1000, 10000);
                        firstName = faker.name().firstName().replaceAll("'", "");
                        lastName = faker.name().lastName().replaceAll("'", "");
                        name = firstName + " " + lastName;
                        userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                        String emailVar = "mithaarshi78@gmail.com";
                        String phoneVar = faker.phoneNumber().phoneNumber().replaceAll("\\(","").replaceAll("\\)","")
                    .   replaceAll(" ","").replaceAll("-","").replaceAll("\\.","").replaceAll("x", "").substring(0, 10);
                        //int officeNo = faker.number().numberBetween(1, 999);
                    
                        if(i<26)
                        {
                            System.out.println("Lab Technician: " + userName);
                            emp1 =  o.getEmpDir().postEmployee(name);
                            emp1.setRole((new LabTechnicianRole()).roleValue());
                            emp1.setSpecialization(Employee.TypeSpecialization.Physician);
                            emp1.setVisitCharge(20);
                            user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new LabTechnicianRole());
                        }
                        else
                        {
                            System.out.println("Receptionist: " + userName);
                            emp1 =  o.getEmpDir().postEmployee(name);
                            emp1.setRole((new ReceptionistRole()).roleValue());
                            user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new ReceptionistRole());
                        }
                    
                        user1.setEmp(emp1);
                        emp1.setEmail(emailVar);
                        emp1.setPhone("5085099183");
                        emp1.setMobileCarrier("@tmomail.net");
                        
                        
                        
                    }
                    System.out.println();
                    
                    
                        
                
                    System.out.println("Radiology Organization");
                    o = e.getOrgDir().addOrganization(Organization.Type.Radiology);
                    
                    for(int i = 27; i<=32; i++) 
                    {
                        Faker faker = new Faker(Locale.US, new Random(i));
  
                        //int id = faker.number().numberBetween(1000, 10000);
                        firstName = faker.name().firstName().replaceAll("'", "");
                        lastName = faker.name().lastName().replaceAll("'", "");
                        name = firstName + " " + lastName;
                        userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                        String emailVar = "mithaarshi78@gmail.com";
                        String phoneVar = faker.phoneNumber().phoneNumber().replaceAll("\\(","").replaceAll("\\)","")
                    .   replaceAll(" ","").replaceAll("-","").replaceAll("\\.","").replaceAll("x", "").substring(0, 10);
                        //int officeNo = faker.number().numberBetween(1, 999);
                    
                        if(i<32)
                        {
                            System.out.println("Lab Technician: "  + userName);
                            emp1 =  o.getEmpDir().postEmployee(name);
                            emp1.setRole((new LabTechnicianRole()).roleValue());
                            emp1.setSpecialization(Employee.TypeSpecialization.Physician);
                            emp1.setVisitCharge(20);
                            user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new LabTechnicianRole());
                        }
                        else
                        {
                            System.out.println("Receptionist: " + userName);
                            emp1 =  o.getEmpDir().postEmployee(name);
                            emp1.setRole((new ReceptionistRole()).roleValue());
                            user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new ReceptionistRole());
                        }
                        
                        user1.setEmp(emp1);
                        emp1.setEmail(emailVar);
                        emp1.setPhone("5085099183");
                        emp1.setMobileCarrier("@tmomail.net");
                        
                    }
                    
                    System.out.println();
        
            system.getNetworkArray().get(0).getEnterpriseDir().getEnterpriseArray().add(e) ;
        
            // Boston Pharmacy - Enterprise
            System.err.println("Boston CVS Pharmacy");
            e = new Pharmacy("Boston CVS Pharmacy");
            
                fakerAdmin = new Faker(Locale.US, new Random(33));
                
                firstName = fakerAdmin.name().firstName().replaceAll("'", "");
                lastName = fakerAdmin.name().lastName().replaceAll("'", "");
                name = firstName + " " + lastName;
                userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                
                emp1 = e.getEmpDir().postEmployee(name);
                emp1.setRole("Head Role");
                user1 = e.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new AdminRole());
                user1.setEmp(emp1);
                System.out.println("Head: " + userName);
            
                System.out.println("Medical Store Organization");
                o = e.getOrgDir().addOrganization(Organization.Type.MedicalStore);
                    
                    for(int i = 34; i<=39; i++) 
                    {
                        Faker faker = new Faker(Locale.US, new Random(i));
  
                        //int id = faker.number().numberBetween(1000, 10000);
                        firstName = faker.name().firstName().replaceAll("'", "");
                        lastName = faker.name().lastName().replaceAll("'", "");
                        name = firstName + " " + lastName;
                        userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                        String emailVar = "mithaarshi78@gmail.com";
                        String phoneVar = faker.phoneNumber().phoneNumber().replaceAll("\\(","").replaceAll("\\)","")
                    .   replaceAll(" ","").replaceAll("-","").replaceAll("\\.","").replaceAll("x", "").substring(0, 10);
                        //int officeNo = faker.number().numberBetween(1, 999);
                    
                        System.out.println("Pharmacy Worker: "  + userName);
                        emp1 =  o.getEmpDir().postEmployee(name);
                        emp1.setRole((new PharmacyWorkerRole()).roleValue());
                        user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new PharmacyWorkerRole());

                        user1.setEmp(emp1);
                        emp1.setEmail(emailVar);
                        emp1.setPhone("5085099183");
                        emp1.setMobileCarrier("@tmomail.net");
                        
                    }
                    
                    System.out.println();
        
            system.getNetworkArray().get(0).getEnterpriseDir().getEnterpriseArray().add(e) ;
             
            
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        // Seattle Network
        System.err.println("Seattle Network");
        system.createAddNetwork().setName("Seattle");
        
            // Seattle Insurance - Enterprise
            System.err.println("Seattle Aetna Insurance");
            Ie = new Insurance("Seattle Aetna Insurance");
            
                fakerAdmin = new Faker(Locale.US, new Random(86));
                
                firstName = fakerAdmin.name().firstName().replaceAll("'", "");
                lastName = fakerAdmin.name().lastName().replaceAll("'", "");
                name = firstName + " " + lastName;
                userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                
                emp1 = Ie.getEmpDir().postEmployee(name);
                emp1.setRole("Head Role");
                user1 = Ie.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new AdminRole());
                user1.setEmp(emp1);
                System.out.println("Head: " + userName);
            
                System.out.println("Insurance Organization");
                o = Ie.getOrgDir().addOrganization(Organization.Type.Insurance);
                    
                    for(int i = 87; i<=92; i++) 
                    {
                        Faker faker = new Faker(Locale.US, new Random(i));
  
                        //int id = faker.number().numberBetween(1000, 10000);
                        firstName = faker.name().firstName().replaceAll("'", "");
                        lastName = faker.name().lastName().replaceAll("'", "");
                        name = firstName + " " + lastName;
                        userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                        String emailVar = "mithaarshi78@gmail.com";
                        String phoneVar = faker.phoneNumber().phoneNumber().replaceAll("\\(","").replaceAll("\\)","")
                    .   replaceAll(" ","").replaceAll("-","").replaceAll("\\.","").replaceAll("x", "").substring(0, 10);
                        //int officeNo = faker.number().numberBetween(1, 999);
                    
                        System.out.println("Insurance Dealer: " + userName);
                        emp1 =  o.getEmpDir().postEmployee(name);
                        emp1.setRole((new InsuranceDealerRole()).roleValue());
                        emp1.setSpecialization(Employee.TypeSpecialization.Physician);
                        emp1.setVisitCharge(20);
                        user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new InsuranceDealerRole());
                    
                        user1.setEmp(emp1);
                        emp1.setEmail(emailVar);
                        emp1.setPhone("5085099183");
                        emp1.setMobileCarrier("@tmomail.net");
                        
                    }
        
            System.out.println();
            system.getNetworkArray().get(1).getEnterpriseDir().getEnterpriseArray().add(Ie) ;
        
            // Boston Hospital - Enterprise
            System.err.println("Seattle Grey-Sloan Hospital");
            e = new Hospital("Seattle Grey-Sloan Hospital");
                
                // Denyal Organization
                
                fakerAdmin = new Faker(Locale.US, new Random(46));
                firstName = fakerAdmin.name().firstName().replaceAll("'", "");
                lastName = fakerAdmin.name().lastName().replaceAll("'", "");
                name = firstName + " " + lastName;
                userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                
                emp1 = e.getEmpDir().postEmployee(name);
                emp1.setRole("Head Role");
                user1 = e.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new AdminRole());
                user1.setEmp(emp1);
                System.out.println("Head: " + userName);
                
                System.out.println("Dental Organization");
                o = e.getOrgDir().addOrganization(Organization.Type.Dental);
                
                for(int i = 47; i<=68; i++) 
                {
                    Faker faker = new Faker(Locale.US, new Random(i));
  
                    //int id = faker.number().numberBetween(1000, 10000);
                    firstName = faker.name().firstName().replaceAll("'", "");
                    lastName = faker.name().lastName().replaceAll("'", "");
                    name = firstName + " " + lastName;
                    userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                    String emailVar = "mithaarshi78@gmail.com";
                    String phoneVar = faker.phoneNumber().phoneNumber().replaceAll("\\(","").replaceAll("\\)","")
                    .replaceAll(" ","").replaceAll("-","").replaceAll("\\.","").replaceAll("x", "").substring(0, 10);
                    //int officeNo = faker.number().numberBetween(1, 999);
                    if(i <=52)
                    {
                        System.out.println("Doctor: " + userName);
                        emp1 =  o.getEmpDir().postEmployee(name);
                        emp1.setRole((new DoctorRole()).roleValue());
                        emp1.setSpecialization(Employee.TypeSpecialization.Physician);
                        emp1.setVisitCharge(20);
                        user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new DoctorRole());
                    }
                    else if(i <= 57)
                    {
                        System.out.println("Nurse: " + userName);
                        emp1 =  o.getEmpDir().postEmployee(name);
                        emp1.setRole((new NurseRole()).roleValue());
                        user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new NurseRole());
                    }
                    else if(i == 58)
                    {
                        System.out.println("Receptionist: " + userName);
                        emp1 =  o.getEmpDir().postEmployee(name);
                        emp1.setRole((new ReceptionistRole()).roleValue());
                        user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new ReceptionistRole());
                    }
                    else
                    {
                        
                        bgVar = bloodGroup[faker.number().numberBetween(0, 8)];
                        genderVar = genderArray[faker.number().numberBetween(0, 3)];
                        ssnVar = String.valueOf(faker.number().numberBetween(123456789l, 999999999l));
                        insID = "SEA" + String.valueOf(faker.number().numberBetween(12345678l, 99999999l));
                        
                        System.out.println("Patient: " + userName);
                        Location locationPoint = new Location();
                        locationPoint.setStt(faker.address().streetAddress());
                        locationPoint.setState(faker.address().state());
                        locationPoint.setCity(faker.address().cityName());
                        user1 = system.getUserAcctDir().postUserAcc(userName, "Sam123!!", null, new PatientRole());
                        emp1= system.getPatDirectory().createPatient(name, "5085099183", genderVar, bgVar, user1, locationPoint, emailVar,(Insurance)Ie, insID , ssnVar);
                        e.getPatDirectory().getPatientArray().add((Patient)emp1);
                        Ie.getPatDirectory().getPatientArray().add((Patient)emp1);
                    }
                    
                    user1.setEmp(emp1);
                    emp1.setEmail(emailVar);
                    emp1.setPhone("5085099183");
                    emp1.setMobileCarrier("@tmomail.net");
                
                }
                
                System.out.println("CovidCenter Organization");
                o = e.getOrgDir().addOrganization(Organization.Type.CovidCenter);
                
                for(int i = 200; i<=221; i++) 
                {
                    Faker faker = new Faker(Locale.US, new Random(i));
  
                    //int id = faker.number().numberBetween(1000, 10000);
                    firstName = faker.name().firstName().replaceAll("'", "");
                    lastName = faker.name().lastName().replaceAll("'", "");
                    name = firstName + " " + lastName;
                    userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                    String emailVar = "mithaarshi78@gmail.com";
                    String phoneVar = faker.phoneNumber().phoneNumber().replaceAll("\\(","").replaceAll("\\)","")
                    .replaceAll(" ","").replaceAll("-","").replaceAll("\\.","").replaceAll("x", "").substring(0, 10);
                    //int officeNo = faker.number().numberBetween(1, 999);
                    if(i <=205)
                    {
                        System.out.println("Doctor: " + userName);
                        emp1 =  o.getEmpDir().postEmployee(name);
                        emp1.setRole((new DoctorRole()).roleValue());
                        emp1.setSpecialization(Employee.TypeSpecialization.Physician);
                        emp1.setVisitCharge(20);
                        user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new DoctorRole());
                    }
                    else if(i <= 210)
                    {
                        System.out.println("Nurse: " + userName);
                        emp1 =  o.getEmpDir().postEmployee(name);
                        emp1.setRole((new NurseRole()).roleValue());
                        user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new NurseRole());
                    }
                    else if(i == 211)
                    {
                        System.out.println("Receptionist: " + userName);
                        emp1 =  o.getEmpDir().postEmployee(name);
                        emp1.setRole((new ReceptionistRole()).roleValue());
                        user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new ReceptionistRole());
                    }
                    else
                    {
                        bgVar = bloodGroup[faker.number().numberBetween(0, 8)];
                        genderVar = genderArray[faker.number().numberBetween(0, 3)];
                        ssnVar = String.valueOf(faker.number().numberBetween(123456789l, 999999999l));
                        insID = "SEA" + String.valueOf(faker.number().numberBetween(12345678l, 99999999l));
                        
                        System.out.println("Patient: " + userName);
                        Location locationPoint = new Location();
                        locationPoint.setStt(faker.address().streetAddress());
                        locationPoint.setState(faker.address().state());
                        locationPoint.setCity(faker.address().cityName());
                        user1 = system.getUserAcctDir().postUserAcc(userName, "Sam123!!", null, new PatientRole());
                        emp1= system.getPatDirectory().createPatient(name, "5085099183", genderVar, bgVar, user1, locationPoint, emailVar,(Insurance)Ie,insID , ssnVar);
                        e.getPatDirectory().getPatientArray().add((Patient)emp1);
                        Ie.getPatDirectory().getPatientArray().add((Patient)emp1);
                    }
                    
                    user1.setEmp(emp1);
                    emp1.setEmail(emailVar);
                    emp1.setPhone("5085099183");
                    emp1.setMobileCarrier("@tmomail.net");
                }
                System.out.println();
                
                System.out.println("BedManagement Organization");
                o = e.getOrgDir().addOrganization(Organization.Type.BedManagement);
                bo = ((BedMgmtDept)o);
                bo.getCreatedBedList(43);
                
                System.out.println();
                System.out.println("Billing Organization");
                o = e.getOrgDir().addOrganization(Organization.Type.Billing);
                
            
            system.getNetworkArray().get(1).getEnterpriseDir().getEnterpriseArray().add(e) ;
        
        
            // Seattle Lab - Enterprise
            System.err.println("Seattle WestPac Lab");
            e = new Lab("Seattle WestPac Lab");
            
                fakerAdmin = new Faker(Locale.US, new Random(69));
                
                firstName = fakerAdmin.name().firstName().replaceAll("'", "");
                lastName = fakerAdmin.name().lastName().replaceAll("'", "");
                name = firstName + " " + lastName;
                userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                
                emp1 = e.getEmpDir().postEmployee(name);
                emp1.setRole("Head Role");
                user1 = e.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new AdminRole());
                user1.setEmp(emp1);
                System.out.println("Head: " + userName);
                
                    System.out.println("Pathology Organization");
                    o = e.getOrgDir().addOrganization(Organization.Type.Pathology);
                    
                    for(int i = 70; i<=74; i++) 
                    {
                        Faker faker = new Faker(Locale.US, new Random(i));
  
                        //int id = faker.number().numberBetween(1000, 10000);
                        firstName = faker.name().firstName().replaceAll("'", "");
                        lastName = faker.name().lastName().replaceAll("'", "");
                        name = firstName + " " + lastName;
                        userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                        String emailVar = "mithaarshi78@gmail.com";
                        String phoneVar = faker.phoneNumber().phoneNumber().replaceAll("\\(","").replaceAll("\\)","")
                    .   replaceAll(" ","").replaceAll("-","").replaceAll("\\.","").replaceAll("x", "").substring(0, 10);
                        //int officeNo = faker.number().numberBetween(1, 999);
                        
                        if(i<74)
                        {
                            System.out.println("Lab Technician: " + userName);
                            emp1 =  o.getEmpDir().postEmployee(name);
                            emp1.setRole((new LabTechnicianRole()).roleValue());
                            emp1.setSpecialization(Employee.TypeSpecialization.Physician);
                            emp1.setVisitCharge(20);
                            user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new LabTechnicianRole());
                        }
                        else
                        {
                            System.out.println("Receptionist: " + userName);
                            emp1 =  o.getEmpDir().postEmployee(name);
                            emp1.setRole((new ReceptionistRole()).roleValue());
                            user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new ReceptionistRole());
                        }

                        user1.setEmp(emp1);
                        emp1.setEmail(emailVar);
                        emp1.setPhone("5085099183");
                        emp1.setMobileCarrier("@tmomail.net");
                        
                    }
                    System.out.println();
                    
                
                    System.out.println("Radiology Organization");
                    o = e.getOrgDir().addOrganization(Organization.Type.Radiology);
                    
                    for(int i = 75; i<=79; i++) 
                    {
                        Faker faker = new Faker(Locale.US, new Random(i));
  
                        //int id = faker.number().numberBetween(1000, 10000);
                        firstName = faker.name().firstName().replaceAll("'", "");
                        lastName = faker.name().lastName().replaceAll("'", "");
                        name = firstName + " " + lastName;
                        userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                        String emailVar = "mithaarshi78@gmail.com";
                        String phoneVar = faker.phoneNumber().phoneNumber().replaceAll("\\(","").replaceAll("\\)","")
                    .   replaceAll(" ","").replaceAll("-","").replaceAll("\\.","").replaceAll("x", "").substring(0, 10);
                        //int officeNo = faker.number().numberBetween(1, 999);
                    
                        if(i<79)
                        {
                            System.out.println("Lab Technician: " + userName);
                            emp1 =  o.getEmpDir().postEmployee(name);
                            emp1.setRole((new LabTechnicianRole()).roleValue());
                            emp1.setSpecialization(Employee.TypeSpecialization.Physician);
                            emp1.setVisitCharge(20);
                            user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new LabTechnicianRole());
                        }
                        else
                        {
                            System.out.println("Receptionist: " + userName);
                            emp1 =  o.getEmpDir().postEmployee(name);
                            emp1.setRole((new ReceptionistRole()).roleValue());
                            user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new ReceptionistRole());
                        }
                    
                        user1.setEmp(emp1);
                        emp1.setEmail(emailVar);
                        emp1.setPhone("5085099183");
                        emp1.setMobileCarrier("@tmomail.net");
                        
                    }
            System.out.println();
        
            system.getNetworkArray().get(1).getEnterpriseDir().getEnterpriseArray().add(e) ;
        
            // Seattle Pharmacy - Enterprise
            System.err.println("Seattle Walgreens Pharmacy");
            e = new Pharmacy("Seattle Walgreens Pharmacy");
            
                fakerAdmin = new Faker(Locale.US, new Random(80));
                
                firstName = fakerAdmin.name().firstName().replaceAll("'", "");
                lastName = fakerAdmin.name().lastName().replaceAll("'", "");
                name = firstName + " " + lastName;
                userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                
                emp1 = e.getEmpDir().postEmployee(name);
                emp1.setRole("Head Role");
                user1 = e.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new AdminRole());
                user1.setEmp(emp1);
                System.out.println("Head: " + userName);
            
                System.out.println("Medical Store Organization");
                o = e.getOrgDir().addOrganization(Organization.Type.MedicalStore);
                    
                    for(int i = 81; i<=85; i++) 
                    {
                        Faker faker = new Faker(Locale.US, new Random(i));
  
                        //int id = faker.number().numberBetween(1000, 10000);
                        firstName = faker.name().firstName().replaceAll("'", "");
                        lastName = faker.name().lastName().replaceAll("'", "");
                        name = firstName + " " + lastName;
                        userName = firstName.toLowerCase() + "." + lastName.toLowerCase();
                        String emailVar = "mithaarshi78@gmail.com";
                        String phoneVar = faker.phoneNumber().phoneNumber().replaceAll("\\(","").replaceAll("\\)","")
                    .   replaceAll(" ","").replaceAll("-","").replaceAll("\\.","").replaceAll("x", "").substring(0, 10);
                        //int officeNo = faker.number().numberBetween(1, 999);
                    
                        System.out.println("Pharmacy Worker: " + userName);
                        emp1 =  o.getEmpDir().postEmployee(name);
                        emp1.setRole((new PharmacyWorkerRole()).roleValue());
                        emp1.setSpecialization(Employee.TypeSpecialization.Physician);
                        emp1.setVisitCharge(20);
                        user1 = o.getUserAcctDir().postUserAcc(userName, "Sam123!!", employee, new PharmacyWorkerRole());
                        
                        user1.setEmp(emp1);
                        emp1.setEmail(emailVar);
                        emp1.setPhone("5085099183");
                        emp1.setMobileCarrier("@tmomail.net");
                        
                    }
            System.out.println();
            system.getNetworkArray().get(1).getEnterpriseDir().getEnterpriseArray().add(e) ;

        return system;
    }
    
}
