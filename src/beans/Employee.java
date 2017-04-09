/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gina PC
 */
@XmlRootElement(name="employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee implements Serializable {

    @XmlElement(required = true)
    private int id;
    @XmlElement(required = true)
    private String name;
    @XmlElement
    private String address;
    @XmlElement
    private String position;
    @XmlElement
    private int contact;
    @XmlElement
    private String datehired;
    
    public Employee() {
    }

    public Employee(String name, String address, String position, int contact, String datehired) {
        this.name = name;
        this.address = address;
        this.position = position;
        this.contact = contact;
        this.datehired = datehired;
    }
    
    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getDatehired() {
        return datehired;
    }

    public void setDatehired(String datehired) {
        this.datehired = datehired;
    }
    
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
