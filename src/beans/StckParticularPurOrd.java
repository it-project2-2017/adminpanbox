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
@XmlRootElement(name="stckparticularpurord")
@XmlAccessorType(XmlAccessType.FIELD)
public class StckParticularPurOrd implements Serializable {
    @XmlElement(required=true)
    private int sppoid;
    @XmlElement(required=true)
    private int particularsid;
    @XmlElement(required=true)
    private int suppid;
    @XmlElement(required=true)
    private int poid;
    @XmlElement(required=true)
    private int empid;
    @XmlElement
    private String supname;
    @XmlElement
    private String empname;
    @XmlElement
    private String stckparticularname;
    @XmlElement(required=true)
    private int qtyordered;
    @XmlElement
    private int qtydelivered;
    @XmlElement
    private String datedelivered;
    @XmlElement
    private int qtyreturned;
    @XmlElement
    private String datereturned;
    @XmlElement
    private int stckid;
    @XmlElement
    private int stckunitequivalent;
    @XmlElement
    private String status;

    public StckParticularPurOrd() {
    }
    
    public StckParticularPurOrd(int particularsid, int suppid, int poid, int empid,  int qtyordered) {
        this.particularsid = particularsid;
        this.suppid = suppid;
        this.poid = poid;
        this.empid = empid;
        this.qtyordered = qtyordered;
    }
    
    public int getQtyreturned() {
        return qtyreturned;
    }

    public void setQtyreturned(int qtyreturned) {
        this.qtyreturned = qtyreturned;
    }

    public String getDatereturned() {
        return datereturned;
    }

    public void setDatereturned(String datereturned) {
        this.datereturned = datereturned;
    }
    
    public int getSppoid() {
        return sppoid;
    }

    public void setSppoid(int sppoid) {
        this.sppoid = sppoid;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    
    public int getEmpid() {
        return empid;
    }
    
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    
    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }
    
    public String getSupname() {
        return supname;
    }

    public void setSupname(String supname) {
        this.supname = supname;
    }
    
    public int getParticularsid() {
        return particularsid;
    }

    public void setParticularsid(int particularsid) {
        this.particularsid = particularsid;
    }

    public String getStckparticularname() {
        return stckparticularname;
    }

    public void setStckparticularname(String stckparticularname) {
        this.stckparticularname = stckparticularname;
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

    public int getPoid() {
        return poid;
    }

    public void setPoid(int poid) {
        this.poid = poid;
    }

    public String getstckparticularname() {
        return stckparticularname;
    }

    public void setstckparticularname(String stckparticularname) {
        this.stckparticularname = stckparticularname;
    }

    public int getSuppid() {
        return suppid;
    }

    public void setSuppid(int suppid) {
        this.suppid = suppid;
    }
}