package Library;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.swing.*;
public final class Dashboard extends javax.swing.JFrame {

   ConnectionTest zak = new ConnectionTest();
   
     String url=zak.url;
     String user=zak.user;
     String passs=zak.password;
    void refresh(){
    totles();
    totleb();
    totlei();
    totler();
    totled();
    }
   public Dashboard() {
    initComponents();
    totles();
    totleb();
    totlei();
    totler();
    refresh();
    totled();
   
      
           
    setExtendedState(JFrame.MAXIMIZED_BOTH);
}
   

   


    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        refreshbutton4 = new javax.swing.JButton();
        refreshbutton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tootled = new javax.swing.JTextField();
        tootle7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tootler = new javax.swing.JTextField();
        tootle6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tootlei = new javax.swing.JTextField();
        tootle2 = new javax.swing.JTextField();
        tootleb = new javax.swing.JTextField();
        tootle = new javax.swing.JTextField();
        tootle1 = new javax.swing.JTextField();
        tootleb11 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        add_member_buttom = new javax.swing.JButton();
        add_member_buttom1 = new javax.swing.JButton();
        add_member_buttom2 = new javax.swing.JButton();
        add_member_buttom3 = new javax.swing.JButton();
        add_member_buttom4 = new javax.swing.JButton();
        add_member_buttom5 = new javax.swing.JButton();
        add_member_buttom6 = new javax.swing.JButton();
        add_member_buttom7 = new javax.swing.JButton();
        add_member_buttom9 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        add_member_buttom8 = new javax.swing.JButton();
        tootle3 = new javax.swing.JTextField();
        tootle4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Deshboard");
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshbutton4.setText("      Logout");
        refreshbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbutton4ActionPerformed(evt);
            }
        });
        getContentPane().add(refreshbutton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 100, 30));

        refreshbutton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/OIP.jpeg"))); // NOI18N
        refreshbutton3.setText("Refresh");
        refreshbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbutton3ActionPerformed(evt);
            }
        });
        getContentPane().add(refreshbutton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel7.setText("       Overdue Books");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 480, 240, 40));

        tootled.setEditable(false);
        tootled.setBackground(new java.awt.Color(0,0,0,0));
        tootled.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        tootled.setForeground(new java.awt.Color(255, 255, 153));
        tootled.setBorder(null);
        tootled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tootledActionPerformed(evt);
            }
        });
        getContentPane().add(tootled, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 530, 100, 100));

        tootle7.setEditable(false);
        tootle7.setBackground(new java.awt.Color(0, 102, 102));
        tootle7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        tootle7.setForeground(new java.awt.Color(255, 255, 153));
        tootle7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        tootle7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tootle7ActionPerformed(evt);
            }
        });
        getContentPane().add(tootle7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 480, 240, 150));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel6.setText("         Returned Books");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 240, 40));

        tootler.setEditable(false);
        tootler.setBackground(new java.awt.Color(0,0,0,0));
        tootler.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        tootler.setForeground(new java.awt.Color(255, 255, 153));
        tootler.setBorder(null);
        tootler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tootlerActionPerformed(evt);
            }
        });
        getContentPane().add(tootler, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 100, 100));

        tootle6.setEditable(false);
        tootle6.setBackground(new java.awt.Color(153, 102, 255));
        tootle6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        tootle6.setForeground(new java.awt.Color(255, 255, 153));
        tootle6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        tootle6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tootle6ActionPerformed(evt);
            }
        });
        getContentPane().add(tootle6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 240, 150));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel2.setText("     Total Issued Books");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 140, 240, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel4.setText("          Total Books");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 240, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel3.setText("         Total Student");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 240, 40));

        tootlei.setEditable(false);
        tootlei.setBackground(new java.awt.Color(0,0,0,0));
        tootlei.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        tootlei.setForeground(new java.awt.Color(255, 255, 153));
        tootlei.setBorder(null);
        tootlei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tootleiActionPerformed(evt);
            }
        });
        getContentPane().add(tootlei, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 200, 90, 90));

        tootle2.setEditable(false);
        tootle2.setBackground(new java.awt.Color(153, 153, 0));
        tootle2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        tootle2.setForeground(new java.awt.Color(255, 255, 153));
        tootle2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        tootle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tootle2ActionPerformed(evt);
            }
        });
        getContentPane().add(tootle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 140, 240, 150));

        tootleb.setEditable(false);
        tootleb.setBackground(new java.awt.Color(0,0,0,0));
        tootleb.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        tootleb.setForeground(new java.awt.Color(255, 255, 153));
        tootleb.setBorder(null);
        tootleb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tootlebActionPerformed(evt);
            }
        });
        getContentPane().add(tootleb, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, 100, 90));

        tootle.setEditable(false);
        tootle.setBackground(new java.awt.Color(0,0,0,0));
        tootle.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        tootle.setForeground(new java.awt.Color(255, 255, 153));
        tootle.setBorder(null);
        tootle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tootleActionPerformed(evt);
            }
        });
        getContentPane().add(tootle, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 100, 90));

        tootle1.setEditable(false);
        tootle1.setBackground(new java.awt.Color(153, 0, 0));
        tootle1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        tootle1.setForeground(new java.awt.Color(255, 255, 153));
        tootle1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        tootle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tootle1ActionPerformed(evt);
            }
        });
        getContentPane().add(tootle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 240, 150));

        tootleb11.setEditable(false);
        tootleb11.setBackground(new java.awt.Color(0, 153, 255));
        tootleb11.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        tootleb11.setForeground(new java.awt.Color(255, 255, 153));
        tootleb11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        tootleb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tootleb11ActionPerformed(evt);
            }
        });
        getContentPane().add(tootleb11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 240, 150));

        jLabel1.setBackground(new java.awt.Color(10, 0, 0,180));
        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                              Library Managment System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1120, 70));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,144));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1120, 70));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_member_buttom.setBackground(new java.awt.Color(51, 153, 255));
        add_member_buttom.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        add_member_buttom.setText("UPDATE BOOKS");
        add_member_buttom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_member_buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_member_buttomActionPerformed(evt);
            }
        });
        jPanel1.add(add_member_buttom, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 160, 40));

        add_member_buttom1.setBackground(new java.awt.Color(51, 153, 255));
        add_member_buttom1.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        add_member_buttom1.setText("ADD MEMBER");
        add_member_buttom1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_member_buttom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_member_buttom1ActionPerformed(evt);
            }
        });
        jPanel1.add(add_member_buttom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 160, 40));

        add_member_buttom2.setBackground(new java.awt.Color(51, 153, 255));
        add_member_buttom2.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        add_member_buttom2.setText("ADD BOOKS");
        add_member_buttom2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_member_buttom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_member_buttom2ActionPerformed(evt);
            }
        });
        jPanel1.add(add_member_buttom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 160, 40));

        add_member_buttom3.setBackground(new java.awt.Color(51, 153, 255));
        add_member_buttom3.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        add_member_buttom3.setText("ISSUE BOOKS");
        add_member_buttom3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_member_buttom3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_member_buttom3ActionPerformed(evt);
            }
        });
        jPanel1.add(add_member_buttom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 160, 40));

        add_member_buttom4.setBackground(new java.awt.Color(51, 153, 255));
        add_member_buttom4.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        add_member_buttom4.setText("RETURN BOOKS");
        add_member_buttom4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_member_buttom4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_member_buttom4ActionPerformed(evt);
            }
        });
        jPanel1.add(add_member_buttom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 160, 40));

        add_member_buttom5.setBackground(new java.awt.Color(51, 153, 255));
        add_member_buttom5.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        add_member_buttom5.setText("SHOW ALL MEMBERS");
        add_member_buttom5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_member_buttom5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_member_buttom5ActionPerformed(evt);
            }
        });
        jPanel1.add(add_member_buttom5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 160, 40));

        add_member_buttom6.setBackground(new java.awt.Color(51, 153, 255));
        add_member_buttom6.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        add_member_buttom6.setText("SHOW ALL BOOKS");
        add_member_buttom6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_member_buttom6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_member_buttom6ActionPerformed(evt);
            }
        });
        jPanel1.add(add_member_buttom6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 160, 40));

        add_member_buttom7.setBackground(new java.awt.Color(51, 153, 255));
        add_member_buttom7.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        add_member_buttom7.setText("UPDATE MEMBER");
        add_member_buttom7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_member_buttom7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_member_buttom7ActionPerformed(evt);
            }
        });
        jPanel1.add(add_member_buttom7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 160, 40));

        add_member_buttom9.setBackground(new java.awt.Color(51, 153, 255));
        add_member_buttom9.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        add_member_buttom9.setText("SHOW RECORD");
        add_member_buttom9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_member_buttom9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_member_buttom9ActionPerformed(evt);
            }
        });
        jPanel1.add(add_member_buttom9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 790));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0,100));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 1120, 720));

        add_member_buttom8.setBackground(new java.awt.Color(51, 153, 255));
        add_member_buttom8.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        add_member_buttom8.setText("RETURN BOOKS");
        add_member_buttom8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_member_buttom8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_member_buttom8ActionPerformed(evt);
            }
        });
        getContentPane().add(add_member_buttom8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 160, 40));

        tootle3.setEditable(false);
        tootle3.setBackground(new java.awt.Color(153, 0, 0));
        tootle3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        tootle3.setForeground(new java.awt.Color(255, 255, 153));
        tootle3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        tootle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tootle3ActionPerformed(evt);
            }
        });
        getContentPane().add(tootle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 240, 150));

        tootle4.setEditable(false);
        tootle4.setBackground(new java.awt.Color(0,0,0,12));
        tootle4.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        tootle4.setForeground(new java.awt.Color(255, 255, 153));
        tootle4.setBorder(null);
        tootle4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tootle4ActionPerformed(evt);
            }
        });
        getContentPane().add(tootle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 100, 90));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel5.setText("         Tottle Student");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 240, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tootleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tootleActionPerformed
        // TODO add your handling code here:
        totles();
    }//GEN-LAST:event_tootleActionPerformed

    private void tootleb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tootleb11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tootleb11ActionPerformed

    private void tootleiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tootleiActionPerformed
        // TODO add your handling code here:
        totlei();
    }//GEN-LAST:event_tootleiActionPerformed

    private void tootle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tootle1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tootle1ActionPerformed

    private void tootlebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tootlebActionPerformed
        // TODO add your handling code here:
        totleb();
    }//GEN-LAST:event_tootlebActionPerformed

    private void tootle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tootle2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tootle2ActionPerformed

    private void tootle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tootle3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tootle3ActionPerformed

    private void tootle4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tootle4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tootle4ActionPerformed

    private void tootlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tootlerActionPerformed
        // TODO add your handling code here:
        totler();
    }//GEN-LAST:event_tootlerActionPerformed

    private void tootle6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tootle6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tootle6ActionPerformed

    private void tootledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tootledActionPerformed
        // TODO add your handling code here:
        totled();
    }//GEN-LAST:event_tootledActionPerformed

    private void tootle7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tootle7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tootle7ActionPerformed

    private void refreshbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbutton3ActionPerformed
        refresh();
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshbutton3ActionPerformed

    private void add_member_buttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_member_buttomActionPerformed

        // TODO add your handling code here:
        new Update_book().setVisible(true);
    }//GEN-LAST:event_add_member_buttomActionPerformed

    private void add_member_buttom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_member_buttom1ActionPerformed
        // TODO add your handling code here:
        new Add_member().setVisible(true);
    }//GEN-LAST:event_add_member_buttom1ActionPerformed

    private void add_member_buttom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_member_buttom2ActionPerformed
        // TODO add your handling code here:
        new Add_book().setVisible(true);
    }//GEN-LAST:event_add_member_buttom2ActionPerformed

    private void add_member_buttom3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_member_buttom3ActionPerformed
        // TODO add your handling code here:
         new issue_book().setVisible(true);
    }//GEN-LAST:event_add_member_buttom3ActionPerformed

    private void add_member_buttom4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_member_buttom4ActionPerformed
        // TODO add your handling code here:
        new return_book().setVisible(true);
    }//GEN-LAST:event_add_member_buttom4ActionPerformed

    private void add_member_buttom5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_member_buttom5ActionPerformed
        // TODO add your handling code here:
          new Show_all_member().setVisible(true);
    }//GEN-LAST:event_add_member_buttom5ActionPerformed

    private void add_member_buttom6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_member_buttom6ActionPerformed
        // TODO add your handling code here:
        new Show_all_books().setVisible(true);
    }//GEN-LAST:event_add_member_buttom6ActionPerformed

    private void add_member_buttom7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_member_buttom7ActionPerformed
        // TODO add your handling code here:
         new Update_member().setVisible(true);
    }//GEN-LAST:event_add_member_buttom7ActionPerformed

    private void add_member_buttom8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_member_buttom8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_member_buttom8ActionPerformed

    private void add_member_buttom9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_member_buttom9ActionPerformed
        // TODO add your handling code here:
        new borrow_record().setVisible(true);
    }//GEN-LAST:event_add_member_buttom9ActionPerformed

    private void refreshbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbutton4ActionPerformed
        Login loginPage = new Login();
        loginPage.setVisible(true);
        this.dispose();

        
    }//GEN-LAST:event_refreshbutton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_member_buttom;
    private javax.swing.JButton add_member_buttom1;
    private javax.swing.JButton add_member_buttom2;
    private javax.swing.JButton add_member_buttom3;
    private javax.swing.JButton add_member_buttom4;
    private javax.swing.JButton add_member_buttom5;
    private javax.swing.JButton add_member_buttom6;
    private javax.swing.JButton add_member_buttom7;
    private javax.swing.JButton add_member_buttom8;
    private javax.swing.JButton add_member_buttom9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton refreshbutton3;
    private javax.swing.JButton refreshbutton4;
    private javax.swing.JTextField tootle;
    private javax.swing.JTextField tootle1;
    private javax.swing.JTextField tootle2;
    private javax.swing.JTextField tootle3;
    private javax.swing.JTextField tootle4;
    private javax.swing.JTextField tootle6;
    private javax.swing.JTextField tootle7;
    private javax.swing.JTextField tootleb;
    private javax.swing.JTextField tootleb11;
    private javax.swing.JTextField tootled;
    private javax.swing.JTextField tootlei;
    private javax.swing.JTextField tootler;
    // End of variables declaration//GEN-END:variables

  
    void totles(){
         try {
             try (Connection con = DriverManager.getConnection(url,user,passs)) {
                 Statement st = con.createStatement();
                 String query = "SELECT count(std_id) as t FROM members";
                 ResultSet rs = st.executeQuery(query);
                 
                 String stdName;
                 
                 if (rs.next()) {
                     stdName = rs.getString("t");
                     
                     tootle.setText("   "+stdName);
                 }        }
    
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}
    }
    
     void totleb(){
         try {
             try (Connection con = DriverManager.getConnection(url, user,passs)) {
                 Statement st = con.createStatement();
                 String query = "SELECT count(book_id) as t FROM books";
                 ResultSet rs = st.executeQuery(query);
                 
                 String stdName;
                 
                 if (rs.next()) {
                     stdName = rs.getString("t");
                     
                     tootleb.setText("   "+stdName);
                 }        }
    
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}
    }
     
      
     void totler(){
         try {
             try (Connection con = DriverManager.getConnection(url,user, passs)) {
                 Statement st = con.createStatement();
                 String query = "SELECT count(borrow_id) as t FROM return_book";
                 ResultSet rs = st.executeQuery(query);
                 
                 String stdName;
                 
                 if (rs.next()) {
                     stdName = rs.getString("t");
                     
                     tootler.setText("  "+stdName);
                 }        }
    
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}
    }
     
     
     
      void totled(){
         try {
             try (Connection con = DriverManager.getConnection(url, user,passs)) {
                 Statement st = con.createStatement();
                 String query = "SELECT count(borrow_id) as t FROM issue_books where return_date < curdate(); ";
                 ResultSet rs = st.executeQuery(query);
                 
                 String stdName;
                 
                 if (rs.next()) {
                     stdName = rs.getString("t");
                     
                     tootled.setText("  "+stdName);
                 }        }
    
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}
    }
      
      
      
        void totlei(){
         try {
             try (Connection con = DriverManager.getConnection(url, user,passs)) {
                 Statement st = con.createStatement();
                 String query = "SELECT count(borrow_id) as t FROM issue_books";
                 ResultSet rs = st.executeQuery(query);
                 
                 String stdName;
                 
                 if (rs.next()) {
                     stdName = rs.getString("t");
                     
                     tootlei.setText("  "+stdName);
                 }        }
    
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}
    }
}
