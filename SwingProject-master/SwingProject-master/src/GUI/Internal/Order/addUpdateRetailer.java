
package GUI.Internal.Order;

import Class.OrderHandlingValidation;
import Class.Retailer;
import java.awt.Color;



public class addUpdateRetailer extends javax.swing.JInternalFrame {
    
    public addUpdateRetailer() {
        initComponents();
        Retailer retailer = new Retailer(RetailerDetails);
        retailer.tableLoad();
    }
    
    
    
    //setters
    public void setidLabel(String pidLabel){
        idLabel.setText(pidLabel);
    }
    
    public void setNameBox(String pNameBox){
        NameBox.setText(pNameBox);
    }
    
    public void setTypeBox(String pTypeBox){
        TypeBox.setSelectedItem(pTypeBox);
    }
    
    public void setTelephoneNo1Box(String pTelephoneNo1Box){
        TelephoneNo1Box.setText(pTelephoneNo1Box);
    }
    
    public void setTelephoneNo2Box(String pTelephoneNo2Box){
        TelephoneNo2Box.setText(pTelephoneNo2Box);
    }
    
    public void setFaxNoBox(String pFaxNoBox){
        FaxNoBox.setText(pFaxNoBox);
    }
    
    public void setAddressBox(String pAddressBox){
        AddressBox.setText(pAddressBox);
    }
    
    public void setEmailBox(String pEmailBox){
        EmailBox.setText(pEmailBox);
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        NameBox = new javax.swing.JTextField();
        TelephoneNo2Box = new javax.swing.JTextField();
        AddressBox = new javax.swing.JTextField();
        EmailBox = new javax.swing.JTextField();
        TypeBox = new javax.swing.JComboBox<String>();
        AddRetailer = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        UpdateRetailer = new javax.swing.JButton();
        TelephoneNo1Box = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        FaxNoBox = new javax.swing.JTextField();
        SearchTypeV1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RetailerDetails = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        SearchBox = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        SearchTypeBox = new javax.swing.JComboBox<String>();
        SearchTypeV = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setTitle(" Add / Update Retailer");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Telephone Number");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("E-mail Address");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Type");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Address");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Retailer Details");

        NameBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NameBoxMouseClicked(evt);
            }
        });

        TelephoneNo2Box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelephoneNo2BoxMouseClicked(evt);
            }
        });

        AddressBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddressBoxMouseClicked(evt);
            }
        });

        EmailBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailBoxMouseClicked(evt);
            }
        });

        TypeBox.setBackground(new java.awt.Color(102, 102, 102));
        TypeBox.setForeground(new java.awt.Color(255, 255, 255));
        TypeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select the retailer type", "Company", "Person" }));

        AddRetailer.setBackground(new java.awt.Color(102, 102, 102));
        AddRetailer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddRetailer.setForeground(new java.awt.Color(255, 255, 255));
        AddRetailer.setText("Add");
        AddRetailer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRetailerActionPerformed(evt);
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

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Retailer ID");

        idLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        idLabel.setText("Retailer ID will assign automatically");

        UpdateRetailer.setBackground(new java.awt.Color(102, 102, 102));
        UpdateRetailer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdateRetailer.setForeground(new java.awt.Color(255, 255, 255));
        UpdateRetailer.setText("Update");
        UpdateRetailer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateRetailerActionPerformed(evt);
            }
        });

        TelephoneNo1Box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelephoneNo1BoxMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Fax Number");

        FaxNoBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FaxNoBoxMouseClicked(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(SearchTypeV1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(AddRetailer, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(UpdateRetailer, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(EmailBox, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddressBox, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FaxNoBox, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TelephoneNo1Box, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TelephoneNo2Box, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(NameBox, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TypeBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 52, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(52, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(idLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchTypeV1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TelephoneNo1Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelephoneNo2Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FaxNoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8))
                    .addComponent(AddressBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6))
                    .addComponent(EmailBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddRetailer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateRetailer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        RetailerDetails.setAutoCreateRowSorter(true);
        RetailerDetails.setBackground(new java.awt.Color(204, 204, 204));
        RetailerDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Retailer ID", "Name", "Type", "Telephone No. 1", "Telephone No. 2", "Fax No.", "Address", "Email Address"
            }
        ));
        RetailerDetails.setCellSelectionEnabled(true);
        RetailerDetails.setMaximumSize(new java.awt.Dimension(135, 70));
        RetailerDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetailerDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(RetailerDetails);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        SearchBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBoxMouseClicked(evt);
            }
        });

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

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Search by");

        SearchTypeBox.setBackground(new java.awt.Color(102, 102, 102));
        SearchTypeBox.setForeground(new java.awt.Color(255, 255, 255));
        SearchTypeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Search Type", "Retailer Name", "Retailer ID" }));
        SearchTypeBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchTypeBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchBox)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(SearchTypeV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(SearchTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(SearchTypeV, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Search Retailer");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(608, 608, 608))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Add / UpdateRetailer");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void RetailerDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetailerDetailsMouseClicked
        int row = RetailerDetails.getSelectedRow();
      
        setidLabel(RetailerDetails.getValueAt(row, 0).toString());
        setNameBox(RetailerDetails.getValueAt(row, 1).toString());
        setTypeBox(RetailerDetails.getValueAt(row, 2).toString());
        setTelephoneNo1Box(RetailerDetails.getValueAt(row, 3).toString());
        setTelephoneNo2Box(RetailerDetails.getValueAt(row, 4).toString());
        setFaxNoBox(RetailerDetails.getValueAt(row, 5).toString());
        setAddressBox(RetailerDetails.getValueAt(row, 6).toString());
        setEmailBox(RetailerDetails.getValueAt(row, 7).toString());
   
    }//GEN-LAST:event_RetailerDetailsMouseClicked

    private void FaxNoBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FaxNoBoxMouseClicked
        setFaxNoBox("");
    }//GEN-LAST:event_FaxNoBoxMouseClicked

    private void TelephoneNo1BoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelephoneNo1BoxMouseClicked
        setTelephoneNo1Box("");
    }//GEN-LAST:event_TelephoneNo1BoxMouseClicked

    private void UpdateRetailerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateRetailerActionPerformed
        
        
        OrderHandlingValidation OHV = new OrderHandlingValidation();
        SearchTypeV1.setText("");
        NameBox.setForeground(Color.black);
        TelephoneNo1Box.setForeground(Color.black);
        TelephoneNo2Box.setForeground(Color.black);
        FaxNoBox.setForeground(Color.black);
        AddressBox.setForeground(Color.black);
        EmailBox.setForeground(Color.black);
        
        
        if(NameBox.getText().equals("")||TypeBox.getSelectedItem() == "Select the retailer type"||TelephoneNo1Box.getText().equals("")||TelephoneNo2Box.getText().equals("")||FaxNoBox.getText().equals("")||AddressBox.getText().equals("")||EmailBox.getText().equals("")  ||NameBox.getText().equals("*Enter name")||TelephoneNo1Box.getText().equals("*Enter telephone no")||TelephoneNo2Box.getText().equals("*Enter telephone no")||FaxNoBox.getText().equals("*Enter fax no")||AddressBox.getText().equals("*Enter address")||EmailBox.getText().equals("*Enter email")){
            if(NameBox.getText().equals("")||NameBox.getText().equals("*Enter name")){
                NameBox.setForeground(Color.red);
                NameBox.setText("*Enter name");
            }
            if(TypeBox.getSelectedItem() == "Select the retailer type"){
                SearchTypeV1.setForeground(Color.red);
                SearchTypeV1.setText("*Enter the search type");
            }
            if(TelephoneNo1Box.getText().equals("")||TelephoneNo1Box.getText().equals("*Enter telephone no")){
                TelephoneNo1Box.setForeground(Color.red);
                TelephoneNo1Box.setText("*Enter telephone no");
            }
            if(TelephoneNo2Box.getText().equals("")||TelephoneNo2Box.getText().equals("*Enter telephone no")){
                TelephoneNo2Box.setForeground(Color.red);
                TelephoneNo2Box.setText("*Enter telephone no");
            }
            if(FaxNoBox.getText().equals("")||FaxNoBox.getText().equals("*Enter fax no")){
                FaxNoBox.setForeground(Color.red);
                FaxNoBox.setText("*Enter fax no");
            }
            if(AddressBox.getText().equals("")||AddressBox.getText().equals("*Enter address")){
                AddressBox.setForeground(Color.red);
                AddressBox.setText("*Enter address");
            }
            if(EmailBox.getText().equals("")||EmailBox.getText().equals("*Enter email")){
                EmailBox.setForeground(Color.red);
                EmailBox.setText("*Enter email");
            }
            
        }else{
            
            NameBox.setForeground(Color.black);
            TelephoneNo1Box.setForeground(Color.black);
            TelephoneNo2Box.setForeground(Color.black);
            FaxNoBox.setForeground(Color.black);
            AddressBox.setForeground(Color.black);
            EmailBox.setForeground(Color.black);
            
            if(OHV.telephoneValidation(TelephoneNo1Box.getText()) && OHV.telephoneValidation(TelephoneNo2Box.getText()) && OHV.telephoneValidation(FaxNoBox.getText()) && OHV.emailValidation(EmailBox.getText())){
        
                Retailer retailer2 = new Retailer(Integer.parseInt(idLabel.getText()), NameBox.getText(), (TypeBox.getSelectedItem()).toString(), TelephoneNo1Box.getText(), TelephoneNo2Box.getText(), FaxNoBox.getText(), AddressBox.getText(), EmailBox.getText());
                retailer2.updateRetailer();
                Retailer retailer = new Retailer(RetailerDetails);
                retailer.tableLoad();
                TelephoneNo1Box.setForeground(Color.black);
                TelephoneNo2Box.setForeground(Color.black);
                FaxNoBox.setForeground(Color.black);
                EmailBox.setForeground(Color.black);
        
            }else{
                if (OHV.telephoneValidation(TelephoneNo1Box.getText())==false){
                    TelephoneNo1Box.setForeground(Color.red);
                    TelephoneNo1Box.setText("Invalid telephone number!");
                }
            
                if (OHV.telephoneValidation(TelephoneNo2Box.getText())==false){
                    TelephoneNo2Box.setForeground(Color.red);
                    TelephoneNo2Box.setText("Invalid telephone number!");
                }
            
                if (OHV.telephoneValidation(FaxNoBox.getText())==false){
                    FaxNoBox.setForeground(Color.red);
                    FaxNoBox.setText("Invalid fax number!");
                }
            
                if (OHV.emailValidation(EmailBox.getText())==false){
                    EmailBox.setForeground(Color.red);
                    EmailBox.setText("Invalid email address!");
                }
            }
        }
        
    }//GEN-LAST:event_UpdateRetailerActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        setidLabel("Retailer ID will assign automatically");
        setNameBox("");
        setTypeBox("Select the retailer type");
        setTelephoneNo1Box("");
        setTelephoneNo2Box("");
        setFaxNoBox("");
        setAddressBox("");
        setEmailBox("");
        SearchTypeV1.setText("");
        
        NameBox.setForeground(Color.black);
        TelephoneNo1Box.setForeground(Color.black);
        TelephoneNo2Box.setForeground(Color.black);
        FaxNoBox.setForeground(Color.black);
        AddressBox.setForeground(Color.black);
        EmailBox.setForeground(Color.black);
    }//GEN-LAST:event_ClearActionPerformed

    private void AddRetailerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRetailerActionPerformed
        OrderHandlingValidation OHV = new OrderHandlingValidation();
        SearchTypeV1.setText("");
        NameBox.setForeground(Color.black);
        TelephoneNo1Box.setForeground(Color.black);
        TelephoneNo2Box.setForeground(Color.black);
        FaxNoBox.setForeground(Color.black);
        AddressBox.setForeground(Color.black);
        EmailBox.setForeground(Color.black);
        
        
        if(NameBox.getText().equals("")||TypeBox.getSelectedItem() == "Select the retailer type"||TelephoneNo1Box.getText().equals("")||TelephoneNo2Box.getText().equals("")||FaxNoBox.getText().equals("")||AddressBox.getText().equals("")||EmailBox.getText().equals("")  ||NameBox.getText().equals("*Enter name")||TelephoneNo1Box.getText().equals("*Enter telephone no")||TelephoneNo2Box.getText().equals("*Enter telephone no")||FaxNoBox.getText().equals("*Enter fax no")||AddressBox.getText().equals("*Enter address")||EmailBox.getText().equals("*Enter email")){
            if(NameBox.getText().equals("")||NameBox.getText().equals("*Enter name")){
                NameBox.setForeground(Color.red);
                NameBox.setText("*Enter name");
            }
            if(TypeBox.getSelectedItem() == "Select the retailer type"){
                SearchTypeV1.setForeground(Color.red);
                SearchTypeV1.setText("*Enter the search type");
            }
            if(TelephoneNo1Box.getText().equals("")||TelephoneNo1Box.getText().equals("*Enter telephone no")){
                TelephoneNo1Box.setForeground(Color.red);
                TelephoneNo1Box.setText("*Enter telephone no");
            }
            if(TelephoneNo2Box.getText().equals("")||TelephoneNo2Box.getText().equals("*Enter telephone no")){
                TelephoneNo2Box.setForeground(Color.red);
                TelephoneNo2Box.setText("*Enter telephone no");
            }
            if(FaxNoBox.getText().equals("")||FaxNoBox.getText().equals("*Enter fax no")){
                FaxNoBox.setForeground(Color.red);
                FaxNoBox.setText("*Enter fax no");
            }
            if(AddressBox.getText().equals("")||AddressBox.getText().equals("*Enter address")){
                AddressBox.setForeground(Color.red);
                AddressBox.setText("*Enter address");
            }
            if(EmailBox.getText().equals("")||EmailBox.getText().equals("*Enter email")){
                EmailBox.setForeground(Color.red);
                EmailBox.setText("*Enter email");
            }
            
        }else{
            
            NameBox.setForeground(Color.black);
            TelephoneNo1Box.setForeground(Color.black);
            TelephoneNo2Box.setForeground(Color.black);
            FaxNoBox.setForeground(Color.black);
            AddressBox.setForeground(Color.black);
            EmailBox.setForeground(Color.black);
            
            if(OHV.telephoneValidation(TelephoneNo1Box.getText()) && OHV.telephoneValidation(TelephoneNo2Box.getText()) && OHV.telephoneValidation(FaxNoBox.getText()) && OHV.emailValidation(EmailBox.getText())){
        
                Retailer retailer1 =new Retailer(NameBox.getText(), (TypeBox.getSelectedItem()).toString(), TelephoneNo1Box.getText(), TelephoneNo2Box.getText(), FaxNoBox.getText(), AddressBox.getText(), EmailBox.getText());
                retailer1.addRetailer();
                Retailer retailer = new Retailer(RetailerDetails);
                retailer.tableLoad();
                TelephoneNo1Box.setForeground(Color.black);
                TelephoneNo2Box.setForeground(Color.black);
                FaxNoBox.setForeground(Color.black);
                EmailBox.setForeground(Color.black);
        
            }else{
                if (OHV.telephoneValidation(TelephoneNo1Box.getText())==false){
                    TelephoneNo1Box.setForeground(Color.red);
                    TelephoneNo1Box.setText("Invalid telephone number!");
                }
            
                if (OHV.telephoneValidation(TelephoneNo2Box.getText())==false){
                    TelephoneNo2Box.setForeground(Color.red);
                    TelephoneNo2Box.setText("Invalid telephone number!");
                }
            
                if (OHV.telephoneValidation(FaxNoBox.getText())==false){
                    FaxNoBox.setForeground(Color.red);
                    FaxNoBox.setText("Invalid fax number!");
                }
            
                if (OHV.emailValidation(EmailBox.getText())==false){
                    EmailBox.setForeground(Color.red);
                    EmailBox.setText("Invalid email address!");
                }
            }
        }
        
        
        
        
    }//GEN-LAST:event_AddRetailerActionPerformed

    private void EmailBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailBoxMouseClicked
        setEmailBox("");
    }//GEN-LAST:event_EmailBoxMouseClicked

    private void AddressBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddressBoxMouseClicked
        setAddressBox("");
    }//GEN-LAST:event_AddressBoxMouseClicked

    private void TelephoneNo2BoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelephoneNo2BoxMouseClicked
        setTelephoneNo2Box("");
    }//GEN-LAST:event_TelephoneNo2BoxMouseClicked

    private void NameBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameBoxMouseClicked
        setNameBox("");
    }//GEN-LAST:event_NameBoxMouseClicked

    private void SearchBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBoxMouseClicked
        SearchBox.setText("");
    }//GEN-LAST:event_SearchBoxMouseClicked

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        if(SearchBox.getText().equals("*Enter the search key")){
                SearchBox.setText("");
        }
        
        if(SearchTypeBox.getSelectedItem()== "Select Search Type" || SearchBox.getText().equals("")){
            SearchTypeV.setText("");
            SearchBox.setForeground(Color.BLACK);
            if(SearchTypeBox.getSelectedItem()== "Select Search Type"){
                SearchTypeV.setForeground(Color.red);
                SearchTypeV.setText("*Select the search type");
            }
            
            if(SearchBox.getText().equals("")){
                SearchBox.setForeground(Color.red);
                SearchBox.setText("*Enter the search key");
            }
            
        }else{
            Retailer r1 = new Retailer();
            r1.searchRetailer(RetailerDetails, (SearchTypeBox.getSelectedItem()=="Retailer Name")?1:2, SearchBox.getText());
            SearchTypeV.setText("");
            SearchBox.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        Retailer retailer = new Retailer(RetailerDetails);
        retailer.tableLoad();
        SearchTypeBox.setSelectedItem("Select Search Type");
        SearchBox.setText("");
        SearchTypeV.setText("");
    }//GEN-LAST:event_ResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRetailer;
    private javax.swing.JTextField AddressBox;
    private javax.swing.JButton Clear;
    private javax.swing.JTextField EmailBox;
    private javax.swing.JTextField FaxNoBox;
    private javax.swing.JTextField NameBox;
    private javax.swing.JButton Reset;
    private javax.swing.JTable RetailerDetails;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchBox;
    private javax.swing.JComboBox<String> SearchTypeBox;
    private javax.swing.JLabel SearchTypeV;
    private javax.swing.JLabel SearchTypeV1;
    private javax.swing.JTextField TelephoneNo1Box;
    private javax.swing.JTextField TelephoneNo2Box;
    private javax.swing.JComboBox<String> TypeBox;
    private javax.swing.JButton UpdateRetailer;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
