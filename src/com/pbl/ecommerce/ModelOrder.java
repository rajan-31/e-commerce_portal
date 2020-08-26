package com.pbl.ecommerce;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author 1bestcsharp.blogspot.com
 */

public class ModelOrder extends AbstractTableModel {

    private String[] columns;
    private Object[][] rows;
    
    public ModelOrder(){}
    
    public ModelOrder(Object[][] data, String[] columnName){
    
        this.rows = data;
        this.columns = columnName;
    }

    
    public Class getColumnClass(int column){
// 4 is the index of the column image
        if(column == 4){
            return Icon.class;
        }
        else{
            return getValueAt(0,column).getClass();
        }
    }
    
    
    public int getRowCount() {
     return this.rows.length;
    }

    public int getColumnCount() {
     return this.columns.length;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
    
    return this.rows[rowIndex][columnIndex];
    }
    public String getColumnName(int col){
        return this.columns[col];
    }


}
