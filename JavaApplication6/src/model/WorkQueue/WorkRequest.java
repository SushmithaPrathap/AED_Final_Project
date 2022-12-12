/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

import model.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Suprith
 */
public class WorkRequest {

    private int wReqId;    
    private String msg;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date reqDate;
    private Date resDate;
    static int cnt =1;
    
    public WorkRequest(){
        reqDate = new Date();
        wReqId=cnt++;
    }

    
    public int getwReqId() {
        return wReqId;
    }

    public void setwReqId(int wReqId) {
        this.wReqId = wReqId;
    }
    
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public Date getResDate() {
        return resDate;
    }

    public void setResDate(Date resDate) {
        this.resDate = resDate;
    }
    
    @Override 
    public String toString(){
        return String.valueOf(this.wReqId);
    }
    
}
