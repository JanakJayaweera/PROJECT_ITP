
package GUI.Internal.Order;

import Class.Design;
import java.awt.Color;

public class ViewDesign extends javax.swing.JInternalFrame {
   
    public ViewDesign() {
        initComponents();
        Design design = new Design(DesignDetails);
        design.tableLoad();
    }
    
    
    //setters
    public void setDesignID(String pDesignID){
        DesignIDLable.setText(pDesignID);
    }
    
    public void setDesignName(String pDesignName){
        DesignNameLable.setText(pDesignName);
    }
    
    public void setDesignFeatures(String pDesignFeatures){
        DesignFeaturesLable.setText(pDesignFeatures);
    }
    
    public void setDesignColor(String pDesignColor){
        DesignColorLable.setText(pDesignColor);
    }
    
    public void setDesignMaterial(String pDesignMaterial){
        DesignMaterialLable.setText(pDesignMaterial);
    }
    
    
    //getters
    public String getDesignID( ){
        return DesignIDLable.toString();
    }
    
    public String getDesignName(){
        return DesignNameLable.toString();
    }
    
    public String getDesignFeatures(){
        return DesignFeaturesLable.toString();
    }
    
    public String getDesignColor(){
        return DesignColorLable.toString();
    }
    
    public String getDesignMaterial(){
        return DesignMaterialLable.toString();
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
        jLabel13 = new javax.swing.JLabel();
        DesignIDLable = new javax.swing.JLabel();
        DesignNameLable = new javax.swing.JLabel();
        DesignFeaturesLable = new javax.swing.JLabel();
        DesignColorLable = new javax.swing.JLabel();
        DesignMaterialLable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DesignDetails = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Search = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        SearchTypeBox = new javax.swing.JComboBox<String>();
        SearchBox = new javax.swing.JTextField();
        SearchTypeV = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setTitle("View Design");
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
        jLabel9.setText("Design Details");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Design Features");

        DesignIDLable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DesignIDLable.setForeground(new java.awt.Color(51, 51, 51));
        DesignIDLable.setText("Design ID will appear here");

        DesignNameLable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DesignNameLable.setForeground(new java.awt.Color(51, 51, 51));
        DesignNameLable.setText("Design Name will appear here");

        DesignFeaturesLable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DesignFeaturesLable.setForeground(new java.awt.Color(51, 51, 51));
        DesignFeaturesLable.setText("Design Features will appear here");

        DesignColorLable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DesignColorLable.setForeground(new java.awt.Color(51, 51, 51));
        DesignColorLable.setText("Design Color will appear here");

        DesignMaterialLable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DesignMaterialLable.setForeground(new java.awt.Color(51, 51, 51));
        DesignMaterialLable.setText("Design Material will appear here");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DesignIDLable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DesignNameLable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DesignFeaturesLable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                            .addComponent(DesignColorLable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DesignMaterialLable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(DesignIDLable))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(DesignNameLable))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(DesignFeaturesLable))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DesignColorLable)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DesignMaterialLable)
                    .addComponent(jLabel6))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        DesignDetails.setAutoCreateRowSorter(true);
        DesignDetails.setBackground(new java.awt.Color(204, 204, 204));
        DesignDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Design ID", "Design Name", "Design Features", "Design Colour", "Design Materials"
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

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Search by");

        SearchTypeBox.setBackground(new java.awt.Color(102, 102, 102));
        SearchTypeBox.setForeground(new java.awt.Color(255, 255, 255));
        SearchTypeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select search type", "Design ID", "Design Name" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(SearchBox)
                                .addComponent(SearchTypeV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SearchTypeBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 230, Short.MAX_VALUE))))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(SearchTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(SearchTypeV, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(446, 446, 446))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
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
       
    }//GEN-LAST:event_DesignDetailsMouseClicked

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

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DesignColorLable;
    private javax.swing.JTable DesignDetails;
    private javax.swing.JLabel DesignFeaturesLable;
    private javax.swing.JLabel DesignIDLable;
    private javax.swing.JLabel DesignMaterialLable;
    private javax.swing.JLabel DesignNameLable;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchBox;
    private javax.swing.JComboBox<String> SearchTypeBox;
    private javax.swing.JLabel SearchTypeV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
