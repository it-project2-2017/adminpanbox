/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminpanbox;

import beans.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matt
 */
public class DisplayEmployees extends SwingWorker<Void, Employee> {

    private final JTable table;
    private final ArrayList<Employee> list;
    
    public DisplayEmployees(JTable table, ArrayList<Employee> list) {
        this.table = table;
        this.list = list;
    }
    
    @Override
    protected Void doInBackground() throws Exception {
        for(Employee p : list) {
            publish(p);
        }
        return null;
    }
    
    @Override
    protected void process(List<Employee> chunks) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
            for(Employee list : chunks) {
                    dtm.addRow(new Object[]{list.getId(), list.getName(), list.getPosition(), list.getDatehired()});
            }
    }
    
}
