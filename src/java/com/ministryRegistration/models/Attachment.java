/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ministryRegistration.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author mushabe
 */
@Entity (name="Attachment")
public class Attachment implements Serializable  {
    
    @Id
    private int id;
    
    private String identifier,name,type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
