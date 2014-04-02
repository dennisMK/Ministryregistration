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
public class Qualification extends Teacher implements Serializable {
    
    @Id
    private String FileNo;
    private String name,year,institution;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
    
    
}
