package GUI.Internal.ReturnStock;

 
 
import java.sql.SQLException; 
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.event.MouseListener;
import Class.*;
import DB.Execute_Query;
import net.proteanit.sql.DbUtils;
 


public class ManageReturnStock extends javax.swing.JInternalFrame {
 
        String rsID;
        String name;
        String quantity; 
        String type; 
        String osID;
        String addedDate; 
        ReturnStockItem item;
        ReturnStockProduct product;
        private Execute_Query eq;   
        
    public ManageReturnStock() {
 
        initComponents();
        nonMove();  
        item = new ReturnStockItem();
        product = new ReturnStockProduct();
        eq = new Execute_Query();
        table_load(); 
    }
    public void get_values()
    {
        rsID = rsIDLbl.getText();
        name = nameTxtBx.getText();
        quantity = quantityTxtBx.getText(); 
        type = typeCmbBx.getSelectedItem().toString();
        osID =  osIDTxtBx.getText();
        addedDate = yearbox.getSelectedItem().toString()+"-" + monthbox.getSelectedItem().toString() + "-" + daybox.getSelectedItem().toString();
    } 

    public void add_item()
    {        
        get_values();        
        item.addItem(name, quantity, type, addedDate);
        
        if(rsIDLbl.getText() == "Return Stock ID will assign automatically")
        {
            String query = "SELECT MAX(ReturnStkID) FROM return_stock";
            rsID = String.valueOf(eq.execute_output_query(query, "MAX(ReturnStkID)"));
        }
        product.addItem(rsID, osID);
    }
    
    public void update_item()
    {
        get_values();
        item.updateItem(rsID, name, quantity, type, addedDate);
        product.updateItem(rsID, osID);
    }

    public void delete_item()
    {
        get_values();
        item.deleteItem(rsID); 
        product.deleteItem(rsID);
    }
    
    public void reset()
    {
        rsIDLbl.setText("Return Stock ID will assign automatically");
        nameTxtBx.setText("");
        quantityTxtBx.setText("");
        osIDTxtBx.setText("");
        typeCmbBx.setSelectedIndex(0);
        daybox.setSelectedIndex(0);
        monthbox.setSelectedIndex(0);
        yearbox.setSelectedIndex(0);        
    }
    
    public void get_table_values()
    {   
        int row = Table1.getSelectedRow();
 
        rsID = Table1.getValueAt(row, 0).toString();
        name = Table1.getValueAt(row, 1).toString();
        type = Table1.getValueAt(row, 3).toString();
        quantity = Table1.getValueAt(row, 2).toString();
        osID = product.getOrderID(rsID, "OrderID");
        addedDate = Table1.getValueAt(row, 4).toString();
  
        rsIDLbl.setText(rsID);
        nameTxtBx.setText(name);
        typeCmbBx.setSelectedItem(type);
        quantityTxtBx.setText(quantity);
        osIDTxtBx.setText(osID);

        daybox.setSelectedItem(addedDate.subSequence(8, 10));
        monthbox.setSelectedItem(addedDate.subSequence(5, 7));
        yearbox.setSelectedItem(addedDate.subSequence(0, 4));  
    }
   
    public void table_load()
    {   
        String query = "SELECT * FROM return_stock;";
        Table1.setModel(DbUtils.resultSetToTableModel(eq.table_load(query)));
    }
    
    public final void nonMove(){
        BasicInternalFrameUI frame = ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI());
        for(MouseListener listener: frame.getNorthPane().getMouseListeners()){
            frame.getNorthPane().removeMouseListener(listener);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nameTxtBx = new javax.swing.JTextField();
        quantityTxtBx = new javax.swing.JTextField();
        osIDTxtBx = new javax.swing.JTextField();
        daybox = new javax.swing.JComboBox<>();
        monthbox = new javax.swing.JComboBox<>();
        yearbox = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        rsIDLbl = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();
        typeCmbBx = new javax.swing.JComboBox<>();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        proceedBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setTitle("Add Raw Material");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Item Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Item Type");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Quantity");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Supplier ID");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Added Date");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Add Raw Material to the System");

        quantityTxtBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTxtBxActionPerformed(evt);
            }
        });

        daybox.setBackground(new java.awt.Color(102, 102, 102));
        daybox.setForeground(new java.awt.Color(255, 255, 255));
        daybox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        monthbox.setBackground(new java.awt.Color(102, 102, 102));
        monthbox.setForeground(new java.awt.Color(255, 255, 255));
        monthbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        yearbox.setBackground(new java.awt.Color(102, 102, 102));
        yearbox.setForeground(new java.awt.Color(255, 255, 255));
        yearbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", " " }));

        addBtn.setBackground(new java.awt.Color(102, 102, 102));
        addBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Return Stock ID");

        rsIDLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rsIDLbl.setText("Return Stock ID will assign automatically");

        resetBtn.setBackground(new java.awt.Color(102, 102, 102));
        resetBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        typeCmbBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------Item Type------", "Defected Raw Materials", "Unwanted Raw Materials" }));

        updateBtn.setBackground(new java.awt.Color(102, 102, 102));
        updateBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(102, 102, 102));
        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        proceedBtn.setBackground(new java.awt.Color(102, 102, 102));
        proceedBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        proceedBtn.setForeground(new java.awt.Color(255, 255, 255));
        proceedBtn.setText("Proceed");
        proceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(87, 87, 87)
                        .addComponent(osIDTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(80, 80, 80)
                        .addComponent(daybox, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(monthbox, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yearbox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(proceedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantityTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rsIDLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 251, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(rsIDLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(typeCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(quantityTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(osIDTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7))
                    .addComponent(daybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(proceedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Table1.setAutoCreateRowSorter(true);
        Table1.setBackground(new java.awt.Color(204, 204, 204));
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Return Stock ID", "Item  Name", "Item Type", "Quantity", "Supplier/Order ID", "Added Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table1.setCellSelectionEnabled(true);
        Table1.setMaximumSize(new java.awt.Dimension(135, 70));
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table1);
        Table1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void quantityTxtBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTxtBxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTxtBxActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        add_item();         
        table_load(); 
        reset();
    }//GEN-LAST:event_addBtnActionPerformed

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        get_table_values();
    }//GEN-LAST:event_Table1MouseClicked

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        /*int result = JOptionPane.showConfirmDialog(null, "Are you sure updating with new details?");
        Driver d1 = new Driver(fnametxt.getText(),lnametxt.getText(),NICtxt.getText() ,drvlicencetxt.getText() ,daybox.getSelectedItem().toString()+"-"+monthbox.getSelectedItem().toString()+"-"+ yearbox.getSelectedItem().toString() , tptxt.getText() ,addresstxt.getText() ,emailtxt.getText(), Integer.parseInt(idLabel.getText()), result);
        tableLoad();
        */
        reset();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        update_item();
        table_load();
        reset();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        delete_item();
        table_load();
        reset();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void proceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBtnActionPerformed
        /*try{
            newRM.setVisible(true);
        }
        catch(Exception e){
            System.out.println(" Error : Displaying newRawMaterial : "+e);
        }
        */
 
 
    }//GEN-LAST:event_proceedBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JButton addBtn;
    private javax.swing.JComboBox<String> daybox;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> monthbox;
    private javax.swing.JTextField nameTxtBx;
    private javax.swing.JTextField osIDTxtBx;
    private javax.swing.JButton proceedBtn;
    private javax.swing.JTextField quantityTxtBx;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel rsIDLbl;
    private javax.swing.JComboBox<String> typeCmbBx;
    private javax.swing.JButton updateBtn;
    private javax.swing.JComboBox<String> yearbox;
    // End of variables declaration//GEN-END:variables
}
