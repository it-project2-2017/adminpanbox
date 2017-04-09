package beans;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.sql.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gina PC
 */
@XmlRootElement(name="stckpurord")
@XmlAccessorType(XmlAccessType.FIELD)
public class StckPurOrd implements Serializable {
    @XmlElement(required=true)
    private int stksid;
    @XmlElement(required=true)
    private int suppid;
    @XmlElement(required=true)
    private int poid;
    @XmlElement(required=true)
    private String stckname;
    @XmlElement(required=true)
    private int qtyordered;
    @XmlElement
    private int qtydelivered;
    @XmlElement
    private String datedelivered;

       
    public StckPurOrd(int stksid, int suppid, int poid, int qtyordered) {
        this.stksid = stksid;
        this.suppid = suppid;
        this.poid = poid;
        this.qtyordered = qtyordered;
    }
    
    public int getQtyordered() {
        return qtyordered;
    }
    
    public void setQtyordered(int qtyordered) {
        this.qtyordered = qtyordered;
    }

    public int getQtydelivered() {
        return qtydelivered;
    }

    public void setQtydelivered(int qtydelivered) {
        this.qtydelivered = qtydelivered;
    }

    public String getDatedelivered() {
        return datedelivered;
    }

    public void setDatedelivered(String datedelivered) {
        this.datedelivered = datedelivered;
    }
    
    public StckPurOrd() {
    }
       
    public int getStksid() {
        return stksid;
    }

    public void setStksid(int stksid) {
        this.stksid = stksid;
    }

    public int getPoid() {
        return poid;
    }

    public void setPoid(int poid) {
        this.poid = poid;
    }

    public String getStckname() {
        return stckname;
    }

    public void setStckname(String stckname) {
        this.stckname = stckname;
    }

    public int getSuppid() {
        return suppid;
    }

    public void setSuppid(int suppid) {
        this.suppid = suppid;
    }
}