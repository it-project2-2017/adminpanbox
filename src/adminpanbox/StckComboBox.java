/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminpanbox;

import beans.Stock;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class StckComboBox extends SwingWorker<Void, Stock>{
    
    private final JComboBox combobox;
    private final ArrayList<Stock> list;

    public StckComboBox(JComboBox combobox , ArrayList<Stock> list) {
        this.combobox = combobox;
        this.list = list;
    }
    
    

    @Override
    protected Void doInBackground() throws Exception {
        for(Stock s : list) {
            publish(s);
        }
        return null;
    }

    @Override
    protected void process(List<Stock> chunks) {
        combobox.removeAllItems();
        JComboBox<Stock> comboBox = new JComboBox<Stock>();
        comboBox.setModel(combobox.getModel());
        for(Stock s : chunks) {
            combobox.addItem(s.getStockName());
        }
    }
}