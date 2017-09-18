
package GUI.Main;


import GUI.Internal.Order.AddUpdateRemoveDesign;
import GUI.Internal.Order.ViewDesign;
import GUI.Internal.Order.ViewRetailer;
import GUI.Internal.Order.addUpdateRetailer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JPanel;


public class OrderHandling extends javax.swing.JFrame {
    
    public OrderHandling() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        AddUpdateRetailer = new javax.swing.JButton();
        ViewRetailer = new javax.swing.JButton();
        PlaceUpdateOrder = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        AddUpdateRemoveDesign = new javax.swing.JButton();
        ViewDesign = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        DesktopPane = new javax.swing.JDesktopPane();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(76, 77, 78));

        sidePanel.setBackground(new java.awt.Color(0, 185, 185));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Go to main functions window");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        AddUpdateRetailer.setBackground(new java.awt.Color(7, 140, 145));
        AddUpdateRetailer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddUpdateRetailer.setForeground(new java.awt.Color(51, 51, 51));
        AddUpdateRetailer.setText("Add / Update Retailer");
        AddUpdateRetailer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddUpdateRetailer.setMaximumSize(new java.awt.Dimension(53, 25));
        AddUpdateRetailer.setMinimumSize(new java.awt.Dimension(53, 25));
        AddUpdateRetailer.setPreferredSize(new java.awt.Dimension(53, 25));
        AddUpdateRetailer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddUpdateRetailerMouseClicked(evt);
            }
        });
        AddUpdateRetailer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUpdateRetailerActionPerformed(evt);
            }
        });

        ViewRetailer.setBackground(new java.awt.Color(7, 140, 145));
        ViewRetailer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ViewRetailer.setForeground(new java.awt.Color(51, 51, 51));
        ViewRetailer.setText("View Retailer");
        ViewRetailer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ViewRetailer.setMaximumSize(new java.awt.Dimension(53, 25));
        ViewRetailer.setMinimumSize(new java.awt.Dimension(53, 25));
        ViewRetailer.setPreferredSize(new java.awt.Dimension(53, 25));
        ViewRetailer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRetailerActionPerformed(evt);
            }
        });

        PlaceUpdateOrder.setBackground(new java.awt.Color(0, 153, 153));
        PlaceUpdateOrder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PlaceUpdateOrder.setForeground(new java.awt.Color(51, 51, 51));
        PlaceUpdateOrder.setText("Place / Update Order");
        PlaceUpdateOrder.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PlaceUpdateOrder.setMaximumSize(new java.awt.Dimension(53, 25));
        PlaceUpdateOrder.setMinimumSize(new java.awt.Dimension(53, 25));
        PlaceUpdateOrder.setPreferredSize(new java.awt.Dimension(53, 25));
        PlaceUpdateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceUpdateOrderActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setText("Update Order Status");
        jButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton6.setMaximumSize(new java.awt.Dimension(53, 25));
        jButton6.setMinimumSize(new java.awt.Dimension(53, 25));
        jButton6.setPreferredSize(new java.awt.Dimension(53, 25));

        jButton7.setBackground(new java.awt.Color(0, 153, 153));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 51, 51));
        jButton7.setText("Cancel Order");
        jButton7.setToolTipText("");
        jButton7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton7.setMaximumSize(new java.awt.Dimension(53, 25));
        jButton7.setMinimumSize(new java.awt.Dimension(53, 25));
        jButton7.setPreferredSize(new java.awt.Dimension(53, 25));

        jButton8.setBackground(new java.awt.Color(0, 153, 153));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 51, 51));
        jButton8.setText("View Order");
        jButton8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton8.setMaximumSize(new java.awt.Dimension(53, 25));
        jButton8.setMinimumSize(new java.awt.Dimension(53, 25));
        jButton8.setPreferredSize(new java.awt.Dimension(53, 25));

        jButton9.setBackground(new java.awt.Color(0, 153, 153));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(51, 51, 51));
        jButton9.setText("Purchase Order");
        jButton9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton9.setMaximumSize(new java.awt.Dimension(53, 25));
        jButton9.setMinimumSize(new java.awt.Dimension(53, 25));
        jButton9.setPreferredSize(new java.awt.Dimension(53, 25));

        AddUpdateRemoveDesign.setBackground(new java.awt.Color(0, 153, 153));
        AddUpdateRemoveDesign.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddUpdateRemoveDesign.setForeground(new java.awt.Color(51, 51, 51));
        AddUpdateRemoveDesign.setText("Add / Update / Remove Design");
        AddUpdateRemoveDesign.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddUpdateRemoveDesign.setMaximumSize(new java.awt.Dimension(53, 25));
        AddUpdateRemoveDesign.setMinimumSize(new java.awt.Dimension(53, 25));
        AddUpdateRemoveDesign.setPreferredSize(new java.awt.Dimension(53, 25));
        AddUpdateRemoveDesign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUpdateRemoveDesignActionPerformed(evt);
            }
        });

        ViewDesign.setBackground(new java.awt.Color(0, 153, 153));
        ViewDesign.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ViewDesign.setForeground(new java.awt.Color(51, 51, 51));
        ViewDesign.setText("View Design");
        ViewDesign.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ViewDesign.setMaximumSize(new java.awt.Dimension(53, 25));
        ViewDesign.setMinimumSize(new java.awt.Dimension(53, 25));
        ViewDesign.setPreferredSize(new java.awt.Dimension(53, 25));
        ViewDesign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDesignActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 153, 153));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(51, 51, 51));
        jButton12.setText("Report 1");
        jButton12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton12.setMaximumSize(new java.awt.Dimension(53, 25));
        jButton12.setMinimumSize(new java.awt.Dimension(53, 25));
        jButton12.setPreferredSize(new java.awt.Dimension(53, 25));

        jButton13.setBackground(new java.awt.Color(0, 153, 153));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(51, 51, 51));
        jButton13.setText("Report 2");
        jButton13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton13.setMaximumSize(new java.awt.Dimension(53, 25));
        jButton13.setMinimumSize(new java.awt.Dimension(53, 25));
        jButton13.setPreferredSize(new java.awt.Dimension(53, 25));

        jButton14.setBackground(new java.awt.Color(0, 153, 153));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton14.setForeground(new java.awt.Color(51, 51, 51));
        jButton14.setText("Report 3");
        jButton14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton14.setMaximumSize(new java.awt.Dimension(53, 25));
        jButton14.setMinimumSize(new java.awt.Dimension(53, 25));
        jButton14.setPreferredSize(new java.awt.Dimension(53, 25));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Manage Retailer");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Manage Order");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Manage Delivey");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Generate Reports");

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(sidePanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2))
                        .addComponent(AddUpdateRetailer, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                        .addComponent(ViewRetailer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PlaceUpdateOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddUpdateRemoveDesign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ViewDesign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator2)
                        .addComponent(jSeparator3)
                        .addComponent(jSeparator4))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addGap(19, 19, 19))
        );

        sidePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddUpdateRemoveDesign, AddUpdateRetailer, PlaceUpdateOrder, ViewDesign, ViewRetailer, jButton12, jButton13, jButton14, jButton6, jButton7, jButton8, jButton9});

        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(AddUpdateRetailer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ViewRetailer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(PlaceUpdateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(AddUpdateRemoveDesign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ViewDesign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(28, 28, 28))
        );

        DesktopPane.setBackground(new java.awt.Color(76, 77, 78));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FirstInterface.jpg"))); // NOI18N

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPaneLayout.createSequentialGroup()
                .addComponent(backgroundImage)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DesktopPane.setLayer(backgroundImage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(DesktopPane))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DesktopPane)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        mainFunctions mf = new mainFunctions();
        mf.setExtendedState(mainFunctions.MAXIMIZED_BOTH);
        mf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void AddUpdateRetailerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddUpdateRetailerMouseClicked
      
    }//GEN-LAST:event_AddUpdateRetailerMouseClicked

    private void ViewRetailerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewRetailerActionPerformed
             DesktopPane.removeAll();
             ViewRetailer VR = new ViewRetailer();
             DesktopPane.add(VR).setVisible(true);
    }//GEN-LAST:event_ViewRetailerActionPerformed

    private void AddUpdateRetailerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUpdateRetailerActionPerformed
            DesktopPane.removeAll();
            addUpdateRetailer AUR = new addUpdateRetailer();
            DesktopPane.add(AUR).setVisible(true);
    }//GEN-LAST:event_AddUpdateRetailerActionPerformed

    private void AddUpdateRemoveDesignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUpdateRemoveDesignActionPerformed
            DesktopPane.removeAll();
            AddUpdateRemoveDesign AURD = new AddUpdateRemoveDesign();
            DesktopPane.add(AURD).setVisible(true);
            
    }//GEN-LAST:event_AddUpdateRemoveDesignActionPerformed

    private void PlaceUpdateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceUpdateOrderActionPerformed
            /*DesktopPane.removeAll();
            PlaceUpdateOrder AUD = new PlaceUpdateOrder();
            DesktopPane.add(AUD).setVisible(true);*/
    }//GEN-LAST:event_PlaceUpdateOrderActionPerformed

    private void ViewDesignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDesignActionPerformed
            DesktopPane.removeAll();
            ViewDesign VD = new ViewDesign();
            DesktopPane.add(VD).setVisible(true);
    }//GEN-LAST:event_ViewDesignActionPerformed

    public void setColor(JPanel panel)
    {
        panel.setBackground(new Color(54,33,89));
    }
    
    public void resetColor(JPanel panel)
    {
        panel.setBackground(new Color(85,65,118));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderHandling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderHandling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderHandling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderHandling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                
                
                int appWidth = (int)screenSize.getWidth() + 80;
                int appHeight = (int)screenSize.getHeight() -20;
                
                OrderHandling mainApp = new OrderHandling();
                mainApp.setPreferredSize(new java.awt.Dimension(appWidth, appHeight));
                mainApp.setExtendedState(mainApp.MAXIMIZED_BOTH);
                mainApp.setVisible(true);
                
                //mainApp.pack();
                
                //new deliveryHandling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUpdateRemoveDesign;
    private javax.swing.JButton AddUpdateRetailer;
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JButton PlaceUpdateOrder;
    private javax.swing.JButton ViewDesign;
    private javax.swing.JButton ViewRetailer;
    private javax.swing.JPanel background;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
