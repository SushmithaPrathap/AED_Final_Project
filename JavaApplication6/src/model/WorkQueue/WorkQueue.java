/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author yash
 */
public class WorkQueue {

    private ArrayList<WorkRequest> workRequestArray;

    public WorkQueue() {
        workRequestArray = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestArray() {
        return workRequestArray;
    }
}
