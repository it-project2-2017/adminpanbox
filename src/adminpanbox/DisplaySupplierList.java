/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminpanbox;

import beans.Employee;
import beans.Supplier;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matt
 */
public class DisplaySupplierList extends SwingWorker<Void, Supplier> {

    private final JTable table;
    private final ArrayList<Supplier> list;
    
    public DisplaySupplierList(JTable table, ArrayList<Supplier> list) {
        this.table = table;
        this.list = list;
    }
    
    @Override
    protected Void doInBackground() throws Exception {
        for(Supplier p : list) {
            publish(p);
        }
        return null;
    }
    
    @Override
    protected void process(List<Supplier> chunks) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
            for(Supplier list : chunks) {
                    dtm.addRow(new Object[]{list.getId(), list.getName(), "Sample", list.getAddress(), "Sample"});
            }
    }
    
}
