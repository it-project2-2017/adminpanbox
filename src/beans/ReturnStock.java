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
@XmlRootElement(name="returnstock")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReturnStock implements Serializable {
    @XmlElement(required=true)
    private int returnid;
    @XmlElement(required=true)
    private int qtyreturned;
    @XmlElement(required=true)
    private int sppoid;
    @XmlElement
    private int qtydelivered;
    @XmlElement
    private int stckparticularid;
    @XmlElement
    private String stckparticularname;
    @XmlElement
    private String supname;
    @XmlElement
    private int stckunitequivalent;
    @XmlElement
    private int stckid;
    
    public ReturnStock() {
    }
    
    public int getStckid() {
        return stckid;
    }

    public void setStckid(int stckid) {
        this.stckid = stckid;
    }
    
    public int getStckunitequivalent() {
        return stckunitequivalent;
    }

    public void setStckunitequivalent(int stckunitequivalent) {
        this.stckunitequivalent = stckunitequivalent;
    }
    
    public String getSupname() {
        return supname;
    }

    public void setSupname(String supname) {
        this.supname = supname;
    }
    
    public int getStckparticularid() {
        return stckparticularid;
    }

    public void setStckparticularid(int stckparticularid) {
        this.stckparticularid = stckparticularid;
    }

    public String getStckparticularname() {
        return stckparticularname;
    }

    public void setStckparticularname(String stckparticularname) {
        this.stckparticularname = stckparticularname;
    }
    
    public int getReturnid() {
        return returnid;
    }

    public void setReturnid(int returnid) {
        this.returnid = returnid;
    }

    public int getQtyreturned() {
        return qtyreturned;
    }

    public void setQtyreturned(int qtyreturned) {
        this.qtyreturned = qtyreturned;
    }

    public int getSppoid() {
        return sppoid;
    }

    public void setSppoid(int sppoid) {
        this.sppoid = sppoid;
    }

    public int getQtydelivered() {
        return qtydelivered;
    }

    public void setQtydelivered(int qtydelivered) {
        this.qtydelivered = qtydelivered;
    }

    public ReturnStock(int qtyreturned, int sppoid) {
        this.qtyreturned = qtyreturned;
        this.sppoid = sppoid;
    }
}