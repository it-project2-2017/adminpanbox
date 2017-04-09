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
@XmlRootElement(name="transactionList")
@XmlAccessorType(XmlAccessType.FIELD)
public class TransactionList implements Serializable {
    @XmlElement(required=true)
    ArrayList<Transaction> list;
    
    public TransactionList(){
    }
    public TransactionList(ArrayList<Transaction> list){
        this.list = list;
    }
    public ArrayList<Transaction> getList() {
        return list;
    }

    public void setList(ArrayList<Transaction> list) {
        this.list = list;
    }
}