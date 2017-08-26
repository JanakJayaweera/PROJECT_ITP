/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Finance;

import Class.RecievedChq;
import DB.DBconnect;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author lahir
 */
public class Cheques extends javax.swing.JInternalFrame {

    /**
     * Creates new form checks
     */
    Connection con = null;
    static String x;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Cheques() {
        con = DBconnect.connect();
        initComponents();
        nonMove();
        showDate();
        recChqTableLoad();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        recievedChqPane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        recFromTF = new javax.swing.JTextField();
        idLbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        amtTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        postDate = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        recDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        recChqTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        paidChqPane = new javax.swing.JPanel();
        recievedChqPane2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        recFromTF2 = new javax.swing.JTextField();
        idLbl2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        amtTF2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        postDate2 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        dateLbl2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        recDate2 = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        recChqTable2 = new javax.swing.JTable();
        addBtn2 = new javax.swing.JButton();
        updateBtn2 = new javax.swing.JButton();
        clearBtn2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(76, 77, 78));
        setBorder(null);
        setTitle("Cheques");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1279, 720));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Cheque ID");

        jLabel1.setText("Recieved From");

        idLbl.setText("Cheque ID will assign automatically");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Amount");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Post-Date(YYYY-MM-DD)");

        postDate.setDateFormatString("YYYY-MM-d");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Date:");

        dateLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Recieved Date(YYYY-MM-DD)");

        recDate.setDateFormatString("YYYY-MM-d");

        recChqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Reciever's Name", "Amount", "Recieved Date", "Post-Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        recChqTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recChqTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(recChqTable);

        addBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout recievedChqPaneLayout = new javax.swing.GroupLayout(recievedChqPane);
        recievedChqPane.setLayout(recievedChqPaneLayout);
        recievedChqPaneLayout.setHorizontalGroup(
            recievedChqPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recievedChqPaneLayout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(jLabel7)
                .addGap(14, 14, 14)
                .addComponent(dateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(recievedChqPaneLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159)
                .addComponent(idLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(recievedChqPaneLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(147, 147, 147)
                .addComponent(recFromTF, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(recievedChqPaneLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(recievedChqPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(recievedChqPaneLayout.createSequentialGroup()
                        .addGroup(recievedChqPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(56, 56, 56)
                        .addGroup(recievedChqPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(postDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amtTF)
                            .addComponent(recDate, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(addBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearBtn))))
        );
        recievedChqPaneLayout.setVerticalGroup(
            recievedChqPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recievedChqPaneLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(recievedChqPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(dateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(recievedChqPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(recievedChqPaneLayout.createSequentialGroup()
                        .addGroup(recievedChqPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(recievedChqPaneLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(idLbl)))
                        .addGap(12, 12, 12)
                        .addGroup(recievedChqPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(recievedChqPaneLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1))
                            .addComponent(recFromTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(recievedChqPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(recievedChqPaneLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel5))
                            .addComponent(amtTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addComponent(recDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(recievedChqPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recievedChqPaneLayout.createSequentialGroup()
                        .addGroup(recievedChqPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(postDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addGroup(recievedChqPaneLayout.createSequentialGroup()
                        .addGroup(recievedChqPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn)
                            .addComponent(updateBtn)
                            .addComponent(clearBtn))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Recieved Cheques", recievedChqPane);

        paidChqPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Cheque ID");

        jLabel2.setText("Recieved From");

        idLbl2.setText("Cheque ID will assign automatically");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Amount");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Post-Date(YYYY-MM-DD)");

        postDate2.setDateFormatString("YYYY-MM-d");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Date:");

        dateLbl2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Recieved Date(YYYY-MM-DD)");

        recDate2.setDateFormatString("YYYY-MM-d");

        recChqTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Reciever's Name", "Amount", "Recieved Date", "Post-Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        recChqTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recChqTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(recChqTable2);

        addBtn2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addBtn2.setText("Add");
        addBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn2ActionPerformed(evt);
            }
        });

        updateBtn2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        updateBtn2.setText("Update");
        updateBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn2ActionPerformed(evt);
            }
        });

        clearBtn2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        clearBtn2.setText("Clear");
        clearBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout recievedChqPane2Layout = new javax.swing.GroupLayout(recievedChqPane2);
        recievedChqPane2.setLayout(recievedChqPane2Layout);
        recievedChqPane2Layout.setHorizontalGroup(
            recievedChqPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recievedChqPane2Layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(jLabel17)
                .addGap(14, 14, 14)
                .addComponent(dateLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(recievedChqPane2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159)
                .addComponent(idLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(recievedChqPane2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addGap(147, 147, 147)
                .addComponent(recFromTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(recievedChqPane2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(recievedChqPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(recievedChqPane2Layout.createSequentialGroup()
                        .addGroup(recievedChqPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18))
                        .addGap(56, 56, 56)
                        .addGroup(recievedChqPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(postDate2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amtTF2)
                            .addComponent(recDate2, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(addBtn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBtn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearBtn2))))
        );
        recievedChqPane2Layout.setVerticalGroup(
            recievedChqPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recievedChqPane2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(recievedChqPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(dateLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(30, 30, 30)
                .addGroup(recievedChqPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(recievedChqPane2Layout.createSequentialGroup()
                        .addGroup(recievedChqPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(recievedChqPane2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(idLbl2)))
                        .addGap(12, 12, 12)
                        .addGroup(recievedChqPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(recievedChqPane2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2))
                            .addComponent(recFromTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(recievedChqPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(recievedChqPane2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel15))
                            .addComponent(amtTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18))
                    .addComponent(recDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(recievedChqPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recievedChqPane2Layout.createSequentialGroup()
                        .addGroup(recievedChqPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(postDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addGroup(recievedChqPane2Layout.createSequentialGroup()
                        .addGroup(recievedChqPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn2)
                            .addComponent(updateBtn2)
                            .addComponent(clearBtn2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        paidChqPane.add(recievedChqPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Paid Cheques", paidChqPane);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        double num = Double.parseDouble(amtTF.getText());
 
        RecievedChq rc = new RecievedChq(recFromTF.getText(), recDate.getDate().toString(), postDate.getDate().toString(), num, recChqTable);
        
//        RecievedChq rc = new RecievedChq();
//        rc.setRecName(recFromTF.getText());
//        rc.setAmt(num);
//        rc.setRecDate(recDate.getDate().toString());
//        rc.setPostDate(postDate.getDate().toString());
//        rc.addRecChq();
          
        
        recChqTableLoad();
             
    }//GEN-LAST:event_addBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        recFromTF.setText("");
        amtTF.setText("");
        recDate.setCalendar(null);
        postDate.setCalendar(null);
        idLbl.setText("Cheque ID will assign automatically");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void recChqTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recChqTableMouseClicked
        //getting the selected data from the table to edit
        int row = recChqTable.getSelectedRow();
        
        String id = recChqTable.getValueAt(row, 0).toString();
        String recName = recChqTable.getValueAt(row, 1).toString();
        String amt = recChqTable.getValueAt(row, 2).toString();
        String recDateV = recChqTable.getValueAt(row, 3).toString();
        String postDateV = recChqTable.getValueAt(row, 4).toString();
        
        idLbl.setText(id);
        recFromTF.setText(recName);
        amtTF.setText(amt);
        
//        try {
//            Date date = new SimpleDateFormat("YYYY-MM-d").parse(recDateV);
//            recDate.setDate(date);
//            
//            Date date1 = new SimpleDateFormat("YYYY-MM-d").parse(postDateV);
//            postDate.setDate(date1);
//        } catch (ParseException ex) {
//            Logger.getLogger(Cheques.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Couldn't convert and set date to jdatechooser");
//        }
        
        
    }//GEN-LAST:event_recChqTableMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Do you really want to update?");
        
        if(x == 0)
        {
            int id = Integer.parseInt(idLbl.getText());
            String recName = recFromTF.getText();
            double amt = Double.parseDouble(amtTF.getText());
            
            String recDate1 = recDate.getDate().toString();
            String postDate1 = postDate.getDate().toString();
            
            String sql = "UPDATE recievedchq SET recName = '"+ recName +"', amt = '"+ amt +"', recDate = '"+ recDate1 +"', postDate = '"+ postDate1 +"' WHERE ID = '"+ id +"'";
            try {
                pst = con.prepareStatement(sql);
                pst.execute();
            } catch (SQLException ex) {
                Logger.getLogger(Cheques.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Couldn't update values to recievedchq");
            }
        }
        recChqTableLoad();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void recChqTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recChqTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_recChqTable2MouseClicked

    private void addBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtn2ActionPerformed

    private void updateBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtn2ActionPerformed

    private void clearBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtn2ActionPerformed

    public final void nonMove()
        {
            //make the jframe non-movable
        BasicInternalFrameUI frame = ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI());
        for(MouseListener listener: frame.getNorthPane().getMouseListeners())
        {
            frame.getNorthPane().removeMouseListener(listener);
        }
        }
    
    public void showDate()
    {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-d");
        dateLbl.setText(sdf.format(d));
    }

    public void recChqTableLoad()
        {           
            
            try{
            
                String sql = "SELECT ID,recName,amt,recDate,postDate FROM recievedchq";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                recChqTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            
            catch(SQLException e){
                System.out.println("Could not load from recievedchq");
            }
        }   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addBtn2;
    private javax.swing.JTextField amtTF;
    private javax.swing.JTextField amtTF2;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton clearBtn2;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel dateLbl2;
    private javax.swing.JLabel idLbl;
    private javax.swing.JLabel idLbl2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel paidChqPane;
    private com.toedter.calendar.JDateChooser postDate;
    private com.toedter.calendar.JDateChooser postDate2;
    private javax.swing.JTable recChqTable;
    private javax.swing.JTable recChqTable2;
    private com.toedter.calendar.JDateChooser recDate;
    private com.toedter.calendar.JDateChooser recDate2;
    private javax.swing.JTextField recFromTF;
    private javax.swing.JTextField recFromTF2;
    private javax.swing.JPanel recievedChqPane;
    private javax.swing.JPanel recievedChqPane2;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton updateBtn2;
    // End of variables declaration//GEN-END:variables
}
