/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise.LabEnterprise;

import model.Employee.Employee;
import model.Patient.Patient;
import java.util.Date;

/**
 *
 * @author Suprith
 */
public class Report {
    int id;
    Date date;
    Patient patient;
    Employee doctor;
    LabTechnician labTech;
    Lab lab;
    
}