

package GUI.Internal.Driver;

import Class.Delivery;
import Class.Vehicle;
import DB.DBconnect;
import Validation.deliveryValidation;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;



public class updateDelivery extends javax.swing.JInternalFrame {

   Connection con = null;
   PreparedStatement pst = null;
   ResultSet rs = null;
   
    public updateDelivery() {
        initComponents();
        nonMove();
        con = DBconnect.connect();
        tableLoad();
        
    }

    public final void nonMove()
        {
            //make the jframe non-movable
        BasicInternalFrameUI frame = ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI());
        for(MouseListener listener: frame.getNorthPane().getMouseListeners())
        {
            frame.getNorthPane().removeMouseListener(listener);
        }
        }
    
    public void tableLoad(){
    //Initial Load table method 
        try{
            String sql = "SELECT deliveryID,orderID,driverID,customer,product,quantity,address,driverName,driverTP,vehicleID,vehicleNumber FROM deliveryallocation WHERE status = 'Delivering'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            Table1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void tableLoad2(int pid){
    //For Search button act
        
        try{
            String sql2 = "SELECT deliveryID,orderID,driverID,customer,product,quantity,address,driverName,driverTP,vehicleID,vehicleNumber FROM deliveryallocation WHERE status = 'Delivering' AND deliveryID = '"+pid+"' ";
            pst = con.prepareStatement(sql2);
            rs = pst.executeQuery();
            Table1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupStatus = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dIDtxt = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        completedRB = new javax.swing.JRadioButton();
        cancelledRB = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        metertxt = new javax.swing.JTextField();
        fCosttxt = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        orderidLabel = new javax.swing.JLabel();
        deliveryIDlbl = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        orderIDlbl = new javax.swing.JLabel();
        driverIDlbl = new javax.swing.JLabel();
        vehicleIDlbl = new javax.swing.JLabel();

        setTitle("Update Delivery Status");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Delivery ID");

        search.setBackground(new java.awt.Color(102, 102, 102));
        search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        Table1.setBackground(new java.awt.Color(204, 204, 204));
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Delivery ID", "Order ID", "Driver ID", "Customer Name", "Product", "Quantity", "Address", "Driver Name", "Driver TP No.", "Vehicle ID", "Vehicle Number"
            }
        ));
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Select delivery status");

        completedRB.setBackground(new java.awt.Color(0, 204, 153));
        buttonGroupStatus.add(completedRB);
        completedRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        completedRB.setText("Completed");

        cancelledRB.setBackground(new java.awt.Color(255, 0, 51));
        buttonGroupStatus.add(cancelledRB);
        cancelledRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelledRB.setText("Cancelled");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Meter Reading");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Fuel cost (Rs.)");

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idLabel.setText("Delivery ID");

        orderidLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        orderidLabel.setText("Vehicle ID");

        deliveryIDlbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deliveryIDlbl.setText("Select an ongoing delivery from the table");

        Reset.setBackground(new java.awt.Color(102, 102, 102));
        Reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 255, 255));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(102, 102, 102));
        Update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Order ID");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Driver ID");

        orderIDlbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        orderIDlbl.setText("Select an ongoing delivery from the table");

        driverIDlbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        driverIDlbl.setText("Select an ongoing delivery from the table");

        vehicleIDlbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vehicleIDlbl.setText("Select an ongoing delivery from the table");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1)
                        .addGap(66, 66, 66)
                        .addComponent(dIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(search))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Reset)
                                .addGap(18, 18, 18)
                                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(completedRB, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(cancelledRB))
                            .addComponent(fCosttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(metertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLabel)
                            .addComponent(orderidLabel)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderIDlbl)
                            .addComponent(driverIDlbl)
                            .addComponent(vehicleIDlbl)
                            .addComponent(deliveryIDlbl)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Reset, Update, search});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelledRB, completedRB});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(completedRB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelledRB))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel)
                            .addComponent(deliveryIDlbl))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(metertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(fCosttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(orderIDlbl))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(driverIDlbl))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderidLabel)
                            .addComponent(vehicleIDlbl))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Reset, Update, search});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cancelledRB, completedRB});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked

        int row = Table1.getSelectedRow();
        
        String deliveryID = Table1.getValueAt(row, 0).toString();
        String orderID = Table1.getValueAt(row, 1).toString();
        String driverID = Table1.getValueAt(row, 2).toString();
        String vehicleID = Table1.getValueAt(row, 9).toString();
        
        deliveryIDlbl.setText(deliveryID);
        orderIDlbl.setText(orderID);
        driverIDlbl.setText(driverID);
        vehicleIDlbl.setText(vehicleID);
        
    }//GEN-LAST:event_Table1MouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        int dID = Integer.parseInt(dIDtxt.getText());
        tableLoad2(dID);
    }//GEN-LAST:event_searchActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        dIDtxt.setText("");
        metertxt.setText("");
        fCosttxt.setText("");
        deliveryIDlbl.setText("Select an ongoing delivery from the table");
        orderIDlbl.setText("Select an ongoing delivery from the table");
        driverIDlbl.setText("Select an ongoing delivery from the table");
        vehicleIDlbl.setText("Select an ongoing delivery from the table");
    }//GEN-LAST:event_ResetActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        int vehicleID = Integer.parseInt(vehicleIDlbl.getText());
        Vehicle v = new Vehicle(vehicleID);
        
        deliveryValidation dV = new deliveryValidation();
        
        if(v.getMeterRead()>0 && dV.meterValidation(metertxt.getText()) && dV.numberTextBox(fCosttxt.getText())){
           int meterRead = Integer.parseInt(metertxt.getText());
           
            if(dV.meterReadValidation(v.getMeterRead() ,meterRead)){
                completedRB.setActionCommand("Delivered");
                cancelledRB.setActionCommand("Cancelled");
                String dStatus = buttonGroupStatus.getSelection().getActionCommand();
        
                int result = JOptionPane.showConfirmDialog(null, "Are you sure the details entered are correct?\nIf 'yes' click 'ok'\nIf 'no' click 'cancel'");
        
                Delivery updateD = new Delivery(Integer.parseInt(deliveryIDlbl.getText()),Integer.parseInt(orderIDlbl.getText()),Integer.parseInt(driverIDlbl.getText()),Integer.parseInt(vehicleIDlbl.getText()),result,Integer.parseInt(fCosttxt.getText()),Integer.parseInt(metertxt.getText()),dStatus);
                JOptionPane.showMessageDialog(null, "Delivery details Successfully updated!");
                tableLoad();
            }
            else{
                metertxt.setForeground(Color.red);
                metertxt.setText("Meter read is less than previous read!");
            }
        }
        else{
            if(dV.meterValidation(metertxt.getText()) == false){
                metertxt.setForeground(Color.red);
                metertxt.setText("Invalid value!");
            }
            if(dV.numberTextBox(fCosttxt.getText()) == false){
                fCosttxt.setForeground(Color.red);
                fCosttxt.setText("Invalid value!");
            }
        }
    }//GEN-LAST:event_UpdateActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JTable Table1;
    private javax.swing.JButton Update;
    private javax.swing.ButtonGroup buttonGroupStatus;
    private javax.swing.JRadioButton cancelledRB;
    private javax.swing.JRadioButton completedRB;
    private javax.swing.JTextField dIDtxt;
    private javax.swing.JLabel deliveryIDlbl;
    private javax.swing.JLabel driverIDlbl;
    private javax.swing.JTextField fCosttxt;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField metertxt;
    private javax.swing.JLabel orderIDlbl;
    private javax.swing.JLabel orderidLabel;
    private javax.swing.JButton search;
    private javax.swing.JLabel vehicleIDlbl;
    // End of variables declaration//GEN-END:variables
}
