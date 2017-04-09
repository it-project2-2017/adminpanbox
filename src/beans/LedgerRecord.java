/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gina PC
 */
@XmlRootElement(name="ledgerrecord")
@XmlAccessorType(XmlAccessType.FIELD)
    public class LedgerRecord implements Serializable {
        @XmlElement(required = true)
        private int stckid;
        @XmlElement(required = true)
        private String date;
        @XmlElement(required = true)
        private int reference;
        @XmlElement
        private double qtypurchased;
        @XmlElement
        private double qtyused;
        @XmlElement
        private double qtyadjusted;
        @XmlElement
        private String reason;
        @XmlElement
        private double qtyleft;
    
    public LedgerRecord() {
    }    
        
    public LedgerRecord(int stckid, String date, int reference) {
        this.stckid = stckid;
        this.date = date;
        this.reference = reference;
    }
    
    public int getStckid() {
        return stckid;
    }

    public void setStckid(int stckid) {
        this.stckid = stckid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public double getQtypurchased() {
        return qtypurchased;
    }

    public void setQtypurchased(double qtypurchased) {
        this.qtypurchased = qtypurchased;
    }

    public double getQtyused() {
        return qtyused;
    }

    public void setQtyused(double qtyused) {
        this.qtyused = qtyused;
    }

    public double getQtyadjusted() {
        return qtyadjusted;
    }

    public void setQtyadjusted(double qtyadjusted) {
        this.qtyadjusted = qtyadjusted;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public double getQtyleft() {
        return qtyleft;
    }

    public void setQtyleft(double qtyleft) {
        this.qtyleft = qtyleft;
    }
}