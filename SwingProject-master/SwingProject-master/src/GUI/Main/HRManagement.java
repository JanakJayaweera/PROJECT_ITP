/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Main;


import GUI.Internal.Employee.Salary;
import GUI.Internal.Employee.addUpdateEmployee;
import GUI.Internal.Employee.addupdateAttendance;
import GUI.Internal.Employee.addupdateJobDetails;
import GUI.Internal.Employee.viewRemoveEmployee;
import GUI.Internal.Employee.viewRemoveJob;
import GUI.Internal.Employee.viewremoveAttendance;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JPanel;

///ghhjghjghj

/**
 *
 * @author lahir
 */
public class HRManagement extends javax.swing.JFrame {
    
    public HRManagement() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addEmpBtn = new javax.swing.JButton();
        viewEmpBtn = new javax.swing.JButton();
        addJobBtn = new javax.swing.JButton();
        viewJobBtn = new javax.swing.JButton();
        addAttendanceBtn = new javax.swing.JButton();
        viewAttendanceBtn = new javax.swing.JButton();
        empreportBtn = new javax.swing.JButton();
        projectBtn = new javax.swing.JButton();
        attendanceBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        calSalBtn = new javax.swing.JButton();
        DesktopPane = new javax.swing.JDesktopPane();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(76, 77, 78));

        sidePanel.setBackground(new java.awt.Color(255, 102, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Go to Main functions window");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        addEmpBtn.setBackground(new java.awt.Color(255, 118, 163));
        addEmpBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addEmpBtn.setForeground(new java.awt.Color(51, 51, 51));
        addEmpBtn.setText("Add / Update Employee");
        addEmpBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addEmpBtn.setMaximumSize(new java.awt.Dimension(53, 25));
        addEmpBtn.setMinimumSize(new java.awt.Dimension(53, 25));
        addEmpBtn.setPreferredSize(new java.awt.Dimension(53, 25));
        addEmpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmpBtnMouseClicked(evt);
            }
        });
        addEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpBtnActionPerformed(evt);
            }
        });

        viewEmpBtn.setBackground(new java.awt.Color(255, 118, 163));
        viewEmpBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewEmpBtn.setForeground(new java.awt.Color(51, 51, 51));
        viewEmpBtn.setText("View / Remove Employee");
        viewEmpBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        viewEmpBtn.setMaximumSize(new java.awt.Dimension(53, 25));
        viewEmpBtn.setMinimumSize(new java.awt.Dimension(53, 25));
        viewEmpBtn.setPreferredSize(new java.awt.Dimension(53, 25));
        viewEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEmpBtnActionPerformed(evt);
            }
        });

        addJobBtn.setBackground(new java.awt.Color(255, 118, 163));
        addJobBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addJobBtn.setForeground(new java.awt.Color(51, 51, 51));
        addJobBtn.setText("Add / Update Job");
        addJobBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addJobBtn.setMaximumSize(new java.awt.Dimension(53, 25));
        addJobBtn.setMinimumSize(new java.awt.Dimension(53, 25));
        addJobBtn.setPreferredSize(new java.awt.Dimension(53, 25));
        addJobBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addJobBtnMouseClicked(evt);
            }
        });
        addJobBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJobBtnActionPerformed(evt);
            }
        });

        viewJobBtn.setBackground(new java.awt.Color(255, 118, 163));
        viewJobBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewJobBtn.setForeground(new java.awt.Color(51, 51, 51));
        viewJobBtn.setText("View / Remove Job");
        viewJobBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        viewJobBtn.setMaximumSize(new java.awt.Dimension(53, 25));
        viewJobBtn.setMinimumSize(new java.awt.Dimension(53, 25));
        viewJobBtn.setPreferredSize(new java.awt.Dimension(53, 25));
        viewJobBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJobBtnActionPerformed(evt);
            }
        });

        addAttendanceBtn.setBackground(new java.awt.Color(255, 118, 163));
        addAttendanceBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addAttendanceBtn.setForeground(new java.awt.Color(51, 51, 51));
        addAttendanceBtn.setText("Add / Update Attendance");
        addAttendanceBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addAttendanceBtn.setMaximumSize(new java.awt.Dimension(53, 25));
        addAttendanceBtn.setMinimumSize(new java.awt.Dimension(53, 25));
        addAttendanceBtn.setPreferredSize(new java.awt.Dimension(53, 25));
        addAttendanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAttendanceBtnActionPerformed(evt);
            }
        });

        viewAttendanceBtn.setBackground(new java.awt.Color(255, 118, 163));
        viewAttendanceBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewAttendanceBtn.setForeground(new java.awt.Color(51, 51, 51));
        viewAttendanceBtn.setText("View / Remove Attendance");
        viewAttendanceBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        viewAttendanceBtn.setMaximumSize(new java.awt.Dimension(53, 25));
        viewAttendanceBtn.setMinimumSize(new java.awt.Dimension(53, 25));
        viewAttendanceBtn.setPreferredSize(new java.awt.Dimension(53, 25));
        viewAttendanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAttendanceBtnActionPerformed(evt);
            }
        });

        empreportBtn.setBackground(new java.awt.Color(255, 118, 163));
        empreportBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        empreportBtn.setForeground(new java.awt.Color(51, 51, 51));
        empreportBtn.setText("List of Employees");
        empreportBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        empreportBtn.setMaximumSize(new java.awt.Dimension(53, 25));
        empreportBtn.setMinimumSize(new java.awt.Dimension(53, 25));
        empreportBtn.setPreferredSize(new java.awt.Dimension(53, 25));
        empreportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empreportBtnActionPerformed(evt);
            }
        });

        projectBtn.setBackground(new java.awt.Color(255, 118, 163));
        projectBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        projectBtn.setForeground(new java.awt.Color(51, 51, 51));
        projectBtn.setText("Project History of an Employee");
        projectBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        projectBtn.setMaximumSize(new java.awt.Dimension(53, 25));
        projectBtn.setMinimumSize(new java.awt.Dimension(53, 25));
        projectBtn.setPreferredSize(new java.awt.Dimension(53, 25));

        attendanceBtn.setBackground(new java.awt.Color(255, 118, 163));
        attendanceBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        attendanceBtn.setForeground(new java.awt.Color(51, 51, 51));
        attendanceBtn.setText("Attendance & Salary Payment");
        attendanceBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        attendanceBtn.setMaximumSize(new java.awt.Dimension(53, 25));
        attendanceBtn.setMinimumSize(new java.awt.Dimension(53, 25));
        attendanceBtn.setPreferredSize(new java.awt.Dimension(53, 25));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Manage Employee");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Manage Job Details");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Manage Attendance");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Generate Reports");

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Calculate Salary");

        jSeparator5.setBackground(new java.awt.Color(102, 102, 102));

        calSalBtn.setBackground(new java.awt.Color(255, 118, 163));
        calSalBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calSalBtn.setForeground(new java.awt.Color(51, 51, 51));
        calSalBtn.setText("Calculate Salary");
        calSalBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        calSalBtn.setMaximumSize(new java.awt.Dimension(53, 25));
        calSalBtn.setMinimumSize(new java.awt.Dimension(53, 25));
        calSalBtn.setPreferredSize(new java.awt.Dimension(53, 25));
        calSalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calSalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(sidePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addComponent(addEmpBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(viewEmpBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addJobBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewJobBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addAttendanceBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewAttendanceBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(empreportBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(projectBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(attendanceBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))))
                    .addComponent(calSalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator5))
                .addGap(19, 19, 19))
        );

        sidePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addAttendanceBtn, addEmpBtn, addJobBtn, attendanceBtn, empreportBtn, projectBtn, viewAttendanceBtn, viewEmpBtn, viewJobBtn});

        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(addEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(viewEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(addJobBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(viewJobBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(addAttendanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(viewAttendanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(calSalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(empreportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(projectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(attendanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(28, 28, 28))
        );

        DesktopPane.setBackground(new java.awt.Color(76, 77, 78));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FirstInterface.jpg"))); // NOI18N

        DesktopPane.setLayer(backgroundImage, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

    private void addEmpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmpBtnMouseClicked
        
          
            
            
        
    }//GEN-LAST:event_addEmpBtnMouseClicked

    private void viewEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEmpBtnActionPerformed
        
        DesktopPane.removeAll();
        viewRemoveEmployee vre = new viewRemoveEmployee();
        DesktopPane.add(vre).setVisible(true);
           
            
        
    }//GEN-LAST:event_viewEmpBtnActionPerformed

    private void addJobBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addJobBtnMouseClicked
           
    }//GEN-LAST:event_addJobBtnMouseClicked

    private void viewJobBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJobBtnActionPerformed

        DesktopPane.removeAll();
        viewRemoveJob vrj = new viewRemoveJob();
        DesktopPane.add(vrj).setVisible(true);
        
    }//GEN-LAST:event_viewJobBtnActionPerformed

    private void addEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpBtnActionPerformed
       
            DesktopPane.removeAll();
            addUpdateEmployee aue = new addUpdateEmployee();
            DesktopPane.add(aue).setVisible(true);
    }//GEN-LAST:event_addEmpBtnActionPerformed

    private void addAttendanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAttendanceBtnActionPerformed
                
            DesktopPane.removeAll();
            addupdateAttendance aua = new addupdateAttendance();
            DesktopPane.add(aua).setVisible(true);
    }//GEN-LAST:event_addAttendanceBtnActionPerformed

    private void viewAttendanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAttendanceBtnActionPerformed

            DesktopPane.removeAll();
            viewremoveAttendance vra = new viewremoveAttendance();
            DesktopPane.add(vra).setVisible(true);
         
    }//GEN-LAST:event_viewAttendanceBtnActionPerformed

    private void empreportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empreportBtnActionPerformed
            
    }//GEN-LAST:event_empreportBtnActionPerformed

    private void addJobBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJobBtnActionPerformed
       
            DesktopPane.removeAll();
            addupdateJobDetails ud = new addupdateJobDetails();
            DesktopPane.add(ud).setVisible(true);
            
    }//GEN-LAST:event_addJobBtnActionPerformed

    private void calSalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calSalBtnActionPerformed
        
            DesktopPane.removeAll();
            Salary sal = new Salary();
            DesktopPane.add(sal).setVisible(true);
        
    }//GEN-LAST:event_calSalBtnActionPerformed

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
            java.util.logging.Logger.getLogger(HRManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HRManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HRManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HRManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        // Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                
                
                int appWidth = (int)screenSize.getWidth() + 80;
                int appHeight = (int)screenSize.getHeight() -20;
                
                HRManagement mainApp = new HRManagement();
                mainApp.setPreferredSize(new java.awt.Dimension(appWidth, appHeight));
                mainApp.setExtendedState(mainApp.MAXIMIZED_BOTH);
                mainApp.setVisible(true);
                
                //mainApp.pack();
                
                //new deliveryHandling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JButton addAttendanceBtn;
    private javax.swing.JButton addEmpBtn;
    private javax.swing.JButton addJobBtn;
    private javax.swing.JButton attendanceBtn;
    private javax.swing.JPanel background;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton calSalBtn;
    private javax.swing.JButton empreportBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton projectBtn;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JButton viewAttendanceBtn;
    private javax.swing.JButton viewEmpBtn;
    private javax.swing.JButton viewJobBtn;
    // End of variables declaration//GEN-END:variables
}
