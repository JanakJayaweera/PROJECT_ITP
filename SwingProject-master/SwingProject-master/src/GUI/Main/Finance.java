/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Main;

import GUI.Internal.Finance.AddCheques;
import GUI.Internal.Finance.ViewRemoveChq;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author lahir
 */
public class Finance extends javax.swing.JFrame {

    /**
     * Creates new form sidePane
     */
    public Finance() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pane = new javax.swing.JPanel();
        chequeBtn = new javax.swing.JButton();
        isBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        chequeBtn2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        chequeBtn3 = new javax.swing.JButton();
        chequeBtn4 = new javax.swing.JButton();
        chequeBtn5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pane.setBackground(new java.awt.Color(0, 153, 153));
        pane.setPreferredSize(new java.awt.Dimension(284, 597));
        pane.setLayout(null);

        chequeBtn.setBackground(new java.awt.Color(30, 232, 232));
        chequeBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chequeBtn.setForeground(new java.awt.Color(51, 51, 51));
        chequeBtn.setText("Add/Update Cheques");
        chequeBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        chequeBtn.setPreferredSize(new java.awt.Dimension(53, 25));
        chequeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chequeBtnActionPerformed(evt);
            }
        });
        pane.add(chequeBtn);
        chequeBtn.setBounds(0, 157, 290, 25);

        isBtn.setBackground(new java.awt.Color(30, 232, 232));
        isBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        isBtn.setForeground(new java.awt.Color(51, 51, 51));
        isBtn.setText("Income Statement");
        isBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        isBtn.setMaximumSize(new java.awt.Dimension(53, 25));
        isBtn.setMinimumSize(new java.awt.Dimension(53, 25));
        isBtn.setPreferredSize(new java.awt.Dimension(53, 25));
        isBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isBtnActionPerformed(evt);
            }
        });
        pane.add(isBtn);
        isBtn.setBounds(0, 353, 290, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Manage Cheques");
        pane.add(jLabel1);
        jLabel1.setBounds(10, 120, 93, 15);

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        pane.add(jSeparator1);
        jSeparator1.setBounds(12, 141, 266, 10);

        chequeBtn2.setBackground(new java.awt.Color(30, 232, 232));
        chequeBtn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chequeBtn2.setForeground(new java.awt.Color(51, 51, 51));
        chequeBtn2.setText("Cheque Notifications");
        chequeBtn2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        chequeBtn2.setMaximumSize(new java.awt.Dimension(53, 25));
        chequeBtn2.setMinimumSize(new java.awt.Dimension(53, 25));
        chequeBtn2.setPreferredSize(new java.awt.Dimension(53, 25));
        chequeBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chequeBtn2ActionPerformed(evt);
            }
        });
        pane.add(chequeBtn2);
        chequeBtn2.setBounds(0, 207, 290, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Statements and Reports");
        pane.add(jLabel2);
        jLabel2.setBounds(12, 306, 134, 15);

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        pane.add(jSeparator2);
        jSeparator2.setBounds(12, 325, 266, 10);

        chequeBtn3.setBackground(new java.awt.Color(30, 232, 232));
        chequeBtn3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chequeBtn3.setForeground(new java.awt.Color(51, 51, 51));
        chequeBtn3.setText("Balance Sheet");
        chequeBtn3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        chequeBtn3.setMaximumSize(new java.awt.Dimension(53, 25));
        chequeBtn3.setMinimumSize(new java.awt.Dimension(53, 25));
        chequeBtn3.setPreferredSize(new java.awt.Dimension(53, 25));
        chequeBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chequeBtn3ActionPerformed(evt);
            }
        });
        pane.add(chequeBtn3);
        chequeBtn3.setBounds(0, 378, 290, 27);

        chequeBtn4.setBackground(new java.awt.Color(30, 232, 232));
        chequeBtn4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chequeBtn4.setForeground(new java.awt.Color(51, 51, 51));
        chequeBtn4.setText("Finance Report");
        chequeBtn4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        chequeBtn4.setPreferredSize(new java.awt.Dimension(53, 25));
        chequeBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chequeBtn4ActionPerformed(evt);
            }
        });
        pane.add(chequeBtn4);
        chequeBtn4.setBounds(0, 405, 290, 27);

        chequeBtn5.setBackground(new java.awt.Color(30, 232, 232));
        chequeBtn5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chequeBtn5.setForeground(new java.awt.Color(51, 51, 51));
        chequeBtn5.setText("Profit-Loss Report");
        chequeBtn5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        chequeBtn5.setPreferredSize(new java.awt.Dimension(53, 25));
        chequeBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chequeBtn5ActionPerformed(evt);
            }
        });
        pane.add(chequeBtn5);
        chequeBtn5.setBounds(0, 432, 290, 27);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Go to main functions window");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        pane.add(jLabel3);
        jLabel3.setBounds(12, 685, 182, 15);

        jButton1.setBackground(new java.awt.Color(30, 232, 232));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("View/Remove Cheques");
        jButton1.setToolTipText("");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setMaximumSize(new java.awt.Dimension(53, 25));
        jButton1.setMinimumSize(new java.awt.Dimension(53, 25));
        jButton1.setPreferredSize(new java.awt.Dimension(53, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pane.add(jButton1);
        jButton1.setBounds(0, 182, 290, 25);

        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FirstInterface.jpg"))); // NOI18N

        jDesktopPane1.setLayer(bgImage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1290, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bgImage, javax.swing.GroupLayout.PREFERRED_SIZE, 1290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bgImage)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chequeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chequeBtnActionPerformed
        AddCheques ch = new AddCheques();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(ch).setVisible(true);
    }//GEN-LAST:event_chequeBtnActionPerformed

    private void isBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isBtnActionPerformed

    private void chequeBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chequeBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chequeBtn2ActionPerformed

    private void chequeBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chequeBtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chequeBtn3ActionPerformed

    private void chequeBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chequeBtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chequeBtn4ActionPerformed

    private void chequeBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chequeBtn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chequeBtn5ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        mainFunctions mf = new mainFunctions();
        mf.setExtendedState(mainFunctions.MAXIMIZED_BOTH);
        mf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ViewRemoveChq vrc = new ViewRemoveChq();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(vrc).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Finance().setVisible(true);
                Finance sp = new Finance();
                sp.setTitle("Finance Management");
                sp.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JButton chequeBtn;
    private javax.swing.JButton chequeBtn2;
    private javax.swing.JButton chequeBtn3;
    private javax.swing.JButton chequeBtn4;
    private javax.swing.JButton chequeBtn5;
    private javax.swing.JButton isBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pane;
    // End of variables declaration//GEN-END:variables
}
