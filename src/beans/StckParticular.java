package beans;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gina PC
 */
@XmlRootElement(name="particulars")
@XmlAccessorType(XmlAccessType.FIELD)
public class StckParticular implements Serializable {
    @XmlElement(required=true)
    private int id;
    @XmlElement(required=true)
    private int stckid;
    @XmlElement(required=true)
    private String particularsname;
    @XmlElement(required=true)
    private double stckunitequivalent;
    @XmlElement(required=true)
    private int supid;
    @XmlElement(required=true)
    private String unit;
    
    public StckParticular() {
    }
    
    public StckParticular(int stckid, String particularsname, double stckunitequivalent, int supid, String unit) {
        this.stckid = stckid;
        this.particularsname = particularsname;
        this.stckunitequivalent = stckunitequivalent;
        this.supid = supid;
        this.unit = unit;
    }
    
    
    public int getSupid() {
        return supid;
    }

    public void setSupid(int supid) {
        this.supid = supid;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    public int getSupplierid() {
        return supid;
    }

    public void setSupplierid(int supplierid) {
        this.supid = supid;
    }
    
    public int getStckid() {
        return stckid;
    }

    public void setStckid(int stckid) {
        this.stckid = stckid;
    }

    public String getParticularsname() {
        return particularsname;
    }

    public void setParticularsname(String particularsname) {
        this.particularsname = particularsname;
    }

    public double getStckunitequivalent() {
        return stckunitequivalent;
    }

    public void setStckunitequivalent(double stckunitequivalent) {
        this.stckunitequivalent = stckunitequivalent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}