package beans;

import java.io.Serializable;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gina PC
 */
@XmlRootElement(name="ReturnStockList")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReturnStockList implements Serializable {
    @XmlElement(required=true)
    ArrayList<ReturnStock> list;

    public ReturnStockList(){
    }
    public ReturnStockList(ArrayList<ReturnStock> list){
        this.list = list;
    }
    public ArrayList<ReturnStock> getList() {
        return list;
    }

    public void setList(ArrayList<ReturnStock> list) {
        this.list = list;
    }
}
