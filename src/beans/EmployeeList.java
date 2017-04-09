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
@XmlRootElement(name="employeeList")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeList implements Serializable {
    @XmlElement(required=true)
    ArrayList<Employee> list;

    public EmployeeList(){
    }
    public EmployeeList(ArrayList<Employee> list){
        this.list = list;
    }
    public ArrayList<Employee> getList() {
        return list;
    }

    public void setList(ArrayList<Employee> list) {
        this.list = list;
    }
}
