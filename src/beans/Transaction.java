package beans;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gina PC
 */
@XmlRootElement(name="transaction")
@XmlAccessorType(XmlAccessType.FIELD)
public class Transaction implements Serializable {
    @XmlElement(required=true)
    Date date;
    @XmlElement(required=true)
    int ordid;
    @XmlElement(required=true)
    int qty;
    @XmlElement(required=true)
    String status;
    @XmlElement(required=true)
    int price;
    @XmlElement(required=true)
    int prodid;
    @XmlElement(required=true)
    String prodname;
    
    public Transaction() {
    }
    
    public Transaction(Date date, int ordid, int qty, String status, int price, int prodid, String prodname) {
        this.date = date;
        this.ordid = ordid;
        this.qty = qty;
        this.status = status;
        this.price = price;
        this.prodid = prodid;
        this.prodname = prodname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getOrdid() {
        return ordid;
    }

    public void setOrdid(int ordid) {
        this.ordid = ordid;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProdid() {
        return prodid;
    }

    public void setProdid(int prodid) {
        this.prodid = prodid;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }
}
