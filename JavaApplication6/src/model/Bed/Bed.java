/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Bed;

import model.appointment.Appointment;
import model.Patient.Patient;

/**
 *
 * @author Suprith
 */
public class Bed {

    private int bedId;
    private BedType bedType;
    private Double amount;
    private BedStatus bedStatus;
    private static int cnt = 1;
    private Patient pat;
    private Appointment appointment;

    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        Bed.cnt = cnt;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public Patient getPat() {
        return pat;
    }

    public void setPat(Patient pat) {
        this.pat = pat;
    }

    public Bed() {
        this.bedId = cnt++;
        this.bedStatus = BedStatus.Available;
        this.bedType = BedType.Normal;
        this.amount = 1000.00;
        this.pat = null;
    }

    public int getBedId() {
        return bedId;
    }

    public void setBedId(int bedId) {
        this.bedId = bedId;
    }

    public BedType getBedType() {
        return bedType;
    }

    public void setBedType(BedType bedType) {
        this.bedType = bedType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public BedStatus getBedStatus() {
        return bedStatus;
    }

    public void setBedStatus(BedStatus bedStatus) {
        this.bedStatus = bedStatus;
    }

    public enum BedStatus {
        Available("Available"),
        Occupied("Occupied"),
        AssignedLaundry("Assigned Laundry");

        private String status;

        private BedStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return status;
        }

    }

    public enum BedType {
        Premium("Premium"),
        Normal("Normal");

        private String bedType;

        private BedType(String bedType) {
            this.bedType = bedType;
        }

        public String getBedType() {
            return bedType;
        }

        public void setBedType(String bedType) {
            this.bedType = bedType;
        }

        @Override
        public String toString() {
            return bedType;
        }

    }

    @Override
    public String toString() {
        return "Bed" + String.valueOf(this.bedId);
    }

    @Override
    public boolean equals(Object o) {
        Bed c = (Bed) o;
        return (this.bedId == (c.bedId) && this.bedType.equals(c.bedType));
    }

}
