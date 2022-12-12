/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Bed;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yash
 */
public class BedDir {

    List<Bed> listBed;

    public List<Bed> getListBed() {
        return listBed;
    }

    public void setListBed(List<Bed> listBed) {
        this.listBed = listBed;
    }
    static int cnt = 1;

    public BedDir(int count) {
        listBed = new ArrayList<Bed>();
        //create new beds
        for (int i = 0; i < count; i++) {
            Bed bed = new Bed();
            listBed.add(bed);
        }

        for (int i = 0; i < count; i++) {
            Bed bed = new Bed();
            bed.setBedType(Bed.BedType.Premium);
            listBed.add(bed);
        }
    }

    //add new beds
    public void CreateBeds(int count) {
        for (int i = 0; i < count; i++) {
            Bed bed = new Bed();
            listBed.add(bed);
        }
    }

    //create a new bed
    Bed postBed() {
        Bed bed = new Bed();//null;
        //bed.setBedID();
        return bed;
    }

    //update the bed status
    void updateBedStatus(Bed bed, Bed.BedStatus bedStatus) {
        bed.setBedStatus(bedStatus);
    }

    //search all the beds available in listBed
    List<Bed> getAvailableBeds() {
        List<Bed> availableBedList = null;
        for (Bed bed : listBed) {
            if (bed.getBedStatus().equals(Bed.BedStatus.Available)) {
                availableBedList.add(bed);

            }
        }
        return availableBedList;
        // return null;
    }

    //search the bed by the id passed
    Bed getBedbyID(int id) {
        Bed bed = null;
        for (Bed bedA : listBed) {
            if (bedA.getBedId() == id) {
                bed = bedA;//bedA
                break;
            }
        }
        return bed;
    }
}
