package beans;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gina PC
 */
@XmlRootElement(name="prodstck")
@XmlAccessorType(XmlAccessType.FIELD)
public class Prodstck implements Serializable {
    @XmlElement(required=true)
    private int prdctid;
    @XmlElement(required=true)
    private int stckid;
    @XmlElement(required=true)
    private int qty;
    
    public Prodstck() {
    }
    
    public Prodstck(int prdctid, int stckid, int qty) {
        this.prdctid = prdctid;
        this.stckid = stckid;
        this.qty = qty;
    }
    
    public int getPrdctid() {
        return prdctid;
    }

    public void setPrdctid(int prdctid) {
        this.prdctid = prdctid;
    }

    public int getStckid() {
        return stckid;
    }

    public void setStckid(int stckid) {
        this.stckid = stckid;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}