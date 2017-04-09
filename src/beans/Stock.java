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
@XmlRootElement(name="stock")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stock implements Serializable {
    @XmlElement(required=true)
    private int id;
    @XmlElement(required=true)
    private String stockName;
    @XmlElement(required=true)
    private double qty;
    @XmlElement
    private String unit;
    @XmlElement
    private int reorderpt;
    @XmlElement
    private int reorderqty;

    public Stock() {
    }
    
    public Stock(int id, String stockName) {
        this.id = id;
        this.stockName = stockName;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getReorderpt() {
        return reorderpt;
    }

    public void setReorderpt(int reorderpt) {
        this.reorderpt = reorderpt;
    }

    public int getReorderqty() {
        return reorderqty;
    }

    public void setReorderqty(int reorderqty) {
        this.reorderqty = reorderqty;
    }
    
    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }
    
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    
    
}