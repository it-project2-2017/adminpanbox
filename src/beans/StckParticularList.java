/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
@XmlRootElement(name="userList")
@XmlAccessorType(XmlAccessType.FIELD)
public class StckParticularList implements Serializable {
    @XmlElement(required=true)
    ArrayList<StckParticular> list;

    public StckParticularList(){
    }
    public StckParticularList(ArrayList<StckParticular> list){
        this.list = list;
    }
    public ArrayList<StckParticular> getList() {
        return list;
    }

    public void setList(ArrayList<StckParticular> list) {
        this.list = list;
    }
}
