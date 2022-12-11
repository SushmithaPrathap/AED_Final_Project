/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Suprith
 */
public class Employee {

    private String nameVar;
    private int ID;
    private static int cnt = 1;
    private double visitCharge;
    private String phone;
    private String email;
    private String role;
    private String mobileCarrier;  //to send the welcome message to mobile number

    public Map<Date, ArrayList<Integer>> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<Date, ArrayList<Integer>> schedule) {
        this.schedule = schedule;
    }
    private Map<Date, ArrayList<Integer>> schedule;

    private TypeSpecialization specialization;

    public TypeSpecialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(TypeSpecialization specialization) {
        this.specialization = specialization;
    }

    public String getMobileCarrier() {
        return mobileCarrier;
    }

    public void setMobileCarrier(String mobileCarrier) {
        this.mobileCarrier = mobileCarrier;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getVisitCharge() {
        return visitCharge;
    }

    public void setVisitCharge(double visitCharge) {
        this.visitCharge = visitCharge;
    }

    public Employee() {
        ID = cnt;
        cnt++;
        schedule = new HashMap<>();
    }

    public int getID() {
        return ID;
    }

    public void setNameVar(String nameVar) {
        this.nameVar = nameVar;
    }

    public String getNameVar() {
        return nameVar;
    }

    @Override
    public String toString() {
        return nameVar;
    }

    public enum TypeSpecialization {
        MBBS("MBBS"),
        Surgeon("Surgeon"),
        MD("MD"),
        Physician("Physician");

        private String value;

        private TypeSpecialization(String value) {
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

    public void postSchedule(Date date, Integer time) {
        Map<Date, ArrayList<Integer>> scheduleArray = this.getSchedule();
        for (Map.Entry<Date, ArrayList<Integer>> schedule : scheduleArray.entrySet()) {

            if (schedule.getKey().equals(date)) {
                schedule.getValue().add(time);
                return;
            }
        }
        ArrayList<Integer> array = new ArrayList<>();
        array.add(time);
        scheduleArray.put(date, array);
    }

    public boolean checkAvailableSchedule(Date date, Integer time) {
        Map<Date, ArrayList<Integer>> schedules = this.getSchedule();
        for (Map.Entry<Date, ArrayList<Integer>> sch : schedules.entrySet()) {
            if (sch.getKey().equals(date)) {
                ArrayList<Integer> arr = sch.getValue();

                if (arr.contains(time)) {
                    return false;
                }
            }
        }
        return true;
    }
}
