/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ministryRegistration.models;

import java.io.Serializable;
import javax.persistence.Id;

/**
 *
 * @author mushabe
 */
public class TeacherDetail extends Teacher implements Serializable {
    
    @Id
    private String FileNo;
    
    private String maritualStatus,heir;
    private int noOfChildren;

    public String getMaritualStatus() {
        return maritualStatus;
    }

    public void setMaritualStatus(String maritualStatus) {
        this.maritualStatus = maritualStatus;
    }

    public String getHeir() {
        return heir;
    }

    public void setHeir(String heir) {
        this.heir = heir;
    }

    public int getNoOfChildren() {
        return noOfChildren;
    }

    public void setNoOfChildren(int noOfChildren) {
        this.noOfChildren = noOfChildren;
    }
    
    
}
