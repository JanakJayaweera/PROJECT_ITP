
package GUI.Internal.Order;

import Class.Design;
import java.awt.Color;

public class AddUpdateRemoveDesign extends javax.swing.JInternalFrame {
   
    public AddUpdateRemoveDesign() {
        
        initComponents();
        Design design = new Design(DesignDetails);
        design.tableLoad();
        
    }
    
    
    //setters
    public void setDesignID(String pDesignID){
        DesignIDBox.setText(pDesignID);
    }
    
    public void setDesignName(String pDesignName){
        DesignNameBox.setText(pDesignName);
    }
    
    public void setDesignFeatures(String pDesignFeatures){
        DesignFeaturesBox.setText(pDesignFeatures);
    }
    
    public void setDesignColor(String pDesignColor){
        DesignColorBox.setText(pDesignColor);
    }
    
    public void setDesignMaterial(String pDesignMaterial){
        DesignMaterialBox.setText(pDesignMaterial);
    }
    
    
    public void setUnitPrice(String pUnitPrice){
        UnitPriceBox.setText(pUnitPrice);
    }
    
    //getters
    public String getDesignID( ){
        return DesignIDBox.toString();
    }
    
    public String getDesignName(){
        return DesignNameBox.toString();
    }
    
    public String getDesignFeatures(){
        return DesignFeaturesBox.toString();
    }
    
    public String getDesignColor(){
        return DesignColorBox.toString();
    }
    
    public String getDesignMaterial(){
        return DesignMaterialBox.toString();
    }
    
    public String getUnitPrice(){
        return UnitPriceBox.toString();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        DesignIDBox = new javax.swing.JTextField();
        DesignColorBox = new javax.swing.JTextField();
        DesignMaterialBox = new javax.swing.JTextField();
        AddDesign = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        UpdateDesign = new javax.swing.JButton();
        DesignNameBox = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        DesignFeaturesBox = new javax.swing.JTextField();
        UpdateDesign1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Search = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        SearchTypeBox = new javax.swing.JComboBox<String>();
        SearchBox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        SearchTypeV = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        UnitPriceBox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DesignDetails = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setTitle(" Add / Update / Remove Design ");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Design ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Design Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Design Material");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Design Color");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Register Design to the system");

        DesignIDBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DesignIDBoxMouseClicked(evt);
            }
        });

        DesignColorBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DesignColorBoxMouseClicked(evt);
            }
        });

        DesignMaterialBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DesignMaterialBoxMouseClicked(evt);
            }
        });

        AddDesign.setBackground(new java.awt.Color(102, 102, 102));
        AddDesign.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddDesign.setForeground(new java.awt.Color(255, 255, 255));
        AddDesign.setText("Add");
        AddDesign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDesignActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(102, 102, 102));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        UpdateDesign.setBackground(new java.awt.Color(102, 102, 102));
        UpdateDesign.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdateDesign.setForeground(new java.awt.Color(255, 255, 255));
        UpdateDesign.setText("Update");
        UpdateDesign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDesignActionPerformed(evt);
            }
        });

        DesignNameBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DesignNameBoxMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Design Features");

        DesignFeaturesBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DesignFeaturesBoxMouseClicked(evt);
            }
        });

        UpdateDesign1.setBackground(new java.awt.Color(102, 102, 102));
        UpdateDesign1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdateDesign1.setForeground(new java.awt.Color(255, 255, 255));
        UpdateDesign1.setText("Remove");
        UpdateDesign1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDesign1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Search Design");

        Search.setBackground(new java.awt.Color(102, 102, 102));
        Search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(102, 102, 102));
        Reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 255, 255));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        SearchTypeBox.setBackground(new java.awt.Color(102, 102, 102));
        SearchTypeBox.setForeground(new java.awt.Color(255, 255, 255));
        SearchTypeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select search type", "Design ID", "Design Name" }));

        SearchBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBoxMouseClicked(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Search by");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SearchBox)
                            .addComponent(SearchTypeBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SearchTypeV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator2))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(5, 5, 5)
                .addComponent(SearchTypeV, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Unit Price");

        UnitPriceBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UnitPriceBoxMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DesignColorBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                            .addComponent(DesignFeaturesBox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DesignNameBox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DesignIDBox)
                            .addComponent(DesignMaterialBox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UnitPriceBox, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(AddDesign, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(UpdateDesign, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UpdateDesign1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(DesignIDBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(DesignNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DesignFeaturesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DesignColorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DesignMaterialBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(UnitPriceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateDesign1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateDesign, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddDesign, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        DesignDetails.setAutoCreateRowSorter(true);
        DesignDetails.setBackground(new java.awt.Color(204, 204, 204));
        DesignDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Design ID", "Design Name", "Design Features", "Design Colour", "Design Materials", "Unit Price"
            }
        ));
        DesignDetails.setCellSelectionEnabled(true);
        DesignDetails.setMaximumSize(new java.awt.Dimension(135, 70));
        DesignDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DesignDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DesignDetails);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Add / UpdateRetailer");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void DesignDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesignDetailsMouseClicked
        int row = DesignDetails.getSelectedRow();
        
        String id = DesignDetails.getValueAt(row, 0).toString();
        setDesignID(DesignDetails.getValueAt(row, 0).toString());
        setDesignName(DesignDetails.getValueAt(row, 1).toString());
        setDesignFeatures(DesignDetails.getValueAt(row, 2).toString());
        setDesignColor(DesignDetails.getValueAt(row, 3).toString());
        setDesignMaterial(DesignDetails.getValueAt(row, 4).toString());
        setUnitPrice(DesignDetails.getValueAt(row, 5).toString());
       
    }//GEN-LAST:event_DesignDetailsMouseClicked

    private void UpdateDesignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDesignActionPerformed
        Design design2 = new Design(DesignIDBox.getText(), DesignNameBox.getText(), DesignFeaturesBox.getText(), DesignColorBox.getText(), DesignMaterialBox.getText() , Integer.parseInt(UnitPriceBox.getText()));
        design2.updateDesign();
        Design design = new Design(DesignDetails);
        design.tableLoad();
    }//GEN-LAST:event_UpdateDesignActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        setDesignID("");
        setDesignName("");
        setDesignFeatures("");
        setDesignColor("");
        setDesignMaterial("");
        setUnitPrice("");

    }//GEN-LAST:event_ClearActionPerformed

    private void AddDesignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDesignActionPerformed
        
        if(DesignIDBox.getText().equals("")||DesignNameBox.getText().equals("")||DesignFeaturesBox.getText().equals("")||DesignColorBox.getText().equals("")||DesignMaterialBox.getText().equals("")||UnitPriceBox.getText().equals("")){
            if (DesignIDBox.getText().equals("")){
                DesignIDBox.setForeground(Color.red);
                DesignIDBox.setText("*Enter design ID");
            }
            if (DesignNameBox.getText().equals("")){
                DesignNameBox.setForeground(Color.red);
                DesignNameBox.setText("*Enter design name");
            }
            if (DesignFeaturesBox.getText().equals("")){
                DesignFeaturesBox.setForeground(Color.red);
                DesignFeaturesBox.setText("*Enter design features");
            }
            if (DesignColorBox.getText().equals("")){
                DesignColorBox.setForeground(Color.red);
                DesignColorBox.setText("*Enter design color");
            }
            if (DesignMaterialBox.getText().equals("")){
                DesignMaterialBox.setForeground(Color.red);
                DesignMaterialBox.setText("*Enter design material");
            }
            if (UnitPriceBox.getText().equals("")){
                UnitPriceBox.setForeground(Color.red);
                UnitPriceBox.setText("*Enter design material");
            }
        }else{
            Design design1 = new Design(DesignIDBox.getText(),DesignNameBox.getText(), DesignFeaturesBox.getText(), DesignColorBox.getText(), DesignMaterialBox.getText(), Integer.parseInt(UnitPriceBox.getText()));
            Design design = new Design(DesignDetails);
            design.tableLoad();
            DesignIDBox.setForeground(Color.black);
            DesignNameBox.setForeground(Color.black);
            DesignFeaturesBox.setForeground(Color.black);
            DesignColorBox.setForeground(Color.black);
            DesignMaterialBox.setForeground(Color.black);
            UnitPriceBox.setForeground(Color.black);
        }
    }//GEN-LAST:event_AddDesignActionPerformed

    private void UpdateDesign1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDesign1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateDesign1ActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        Design design = new Design(DesignDetails);
        design.tableLoad();
        SearchTypeBox.setSelectedItem("Select search type");
        SearchBox.setText("");
        SearchTypeV.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        if(SearchBox.getText().equals("*Enter the search key")){
                SearchBox.setText("");
        }
        
        if(SearchTypeBox.getSelectedItem()== "Select search type" || SearchBox.getText().equals("")){
            SearchTypeV.setText("");
            SearchBox.setForeground(Color.BLACK);
            if(SearchTypeBox.getSelectedItem()== "Select search type"){
                SearchTypeV.setForeground(Color.red);
                SearchTypeV.setText("*Select the search type");
            }
            
            if(SearchBox.getText().equals("")){
                SearchBox.setForeground(Color.red);
                SearchBox.setText("*Enter the search key");
            }
            
        }else{
            Design design1 = new Design();
            design1.searchDesign(DesignDetails, (SearchTypeBox.getSelectedItem()=="Design Name")?1:2, SearchBox.getText());
            SearchTypeV.setText("");
            SearchBox.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_SearchActionPerformed

    private void SearchBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBoxMouseClicked
        SearchBox.setText("");
    }//GEN-LAST:event_SearchBoxMouseClicked

    private void DesignIDBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesignIDBoxMouseClicked
        setDesignID("");
    }//GEN-LAST:event_DesignIDBoxMouseClicked

    private void DesignNameBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesignNameBoxMouseClicked
        setDesignName("");
    }//GEN-LAST:event_DesignNameBoxMouseClicked

    private void DesignFeaturesBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesignFeaturesBoxMouseClicked
        setDesignFeatures("");
    }//GEN-LAST:event_DesignFeaturesBoxMouseClicked

    private void DesignColorBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesignColorBoxMouseClicked
        setDesignColor("");
    }//GEN-LAST:event_DesignColorBoxMouseClicked

    private void DesignMaterialBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesignMaterialBoxMouseClicked
        setDesignMaterial("");
    }//GEN-LAST:event_DesignMaterialBoxMouseClicked

    private void UnitPriceBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UnitPriceBoxMouseClicked
        setUnitPrice("");
    }//GEN-LAST:event_UnitPriceBoxMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDesign;
    private javax.swing.JButton Clear;
    private javax.swing.JTextField DesignColorBox;
    private javax.swing.JTable DesignDetails;
    private javax.swing.JTextField DesignFeaturesBox;
    private javax.swing.JTextField DesignIDBox;
    private javax.swing.JTextField DesignMaterialBox;
    private javax.swing.JTextField DesignNameBox;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchBox;
    private javax.swing.JComboBox<String> SearchTypeBox;
    private javax.swing.JLabel SearchTypeV;
    private javax.swing.JTextField UnitPriceBox;
    private javax.swing.JButton UpdateDesign;
    private javax.swing.JButton UpdateDesign1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
