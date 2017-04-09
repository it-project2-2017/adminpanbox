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
@XmlRootElement(name="transactionList")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderList implements Serializable {
    @XmlElement(required=true)
    ArrayList<Order> list;

    public OrderList(){
    }
    public OrderList(ArrayList<Order> list){
        this.list = list;
    }
    public ArrayList<Order> getList() {
        return list;
    }

    public void setList(ArrayList<Order> list) {
        this.list = list;
    }
}
