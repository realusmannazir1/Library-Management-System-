package Library;

import javax.swing.*;
import java.sql.*;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        
        initComponents();
        
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        password_field = new javax.swing.JPasswordField();
        username_field = new javax.swing.JTextField();
        username_label = new javax.swing.JLabel();
        main_login_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zakir");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_label.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        login_label.setForeground(new java.awt.Color(255, 255, 255));
        login_label.setText("Login");
        getContentPane().add(login_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 100, 40));

        password_label.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        password_label.setForeground(new java.awt.Color(255, 255, 255));
        password_label.setText("Password");
        getContentPane().add(password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 80, -1));

        password_field.setBackground(new java.awt.Color(153, 153, 255));
        password_field.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 190, 30));

        username_field.setBackground(new java.awt.Color(153, 153, 255));
        username_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username_field.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(username_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 190, 30));

        username_label.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        username_label.setForeground(new java.awt.Color(255, 255, 255));
        username_label.setText("Username");
        getContentPane().add(username_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 80, -1));

        main_login_label.setBackground(new java.awt.Color(0, 0, 0,120));
        main_login_label.setToolTipText("");
        main_login_label.setOpaque(true);
        getContentPane().add(main_login_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 270, 370));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0,100));
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 10, true));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 892, 503));

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/full-moon-above-the-trees-at-night.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 10, true));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 892, 503));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_fieldActionPerformed
 
    @SuppressWarnings("unused")
    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        
    String name = username_field.getText();
    String pass = password_field.getText();
    String newname = null;
   

    if (name.isEmpty() || pass.isEmpty() ) {
        JOptionPane.showMessageDialog(this, "Please fill all fields.");
        
        return;
        
    }
   ConnectionTest zak = new ConnectionTest();
   
     String url=zak.url;
     String user=zak.user;
     String passs=zak.password;
                
        
       
           try {
               
              
        try (Connection con = DriverManager.getConnection(url,user,passs)) {
            String query = "SELECT username FROM admin WHERE username = ? and password=?";
            
            PreparedStatement pst = con.prepareStatement(query);
            
            pst.setString(1, name);
            pst.setString(2, pass);
            
            ResultSet rs = pst.executeQuery();
            
            
            // Not used here, but available for another column if needed
            
            
            if (rs.next()) {
                
                newname = rs.getString("username"); // Removed extra ')'
                
            }
        }

    
               } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
           if(newname==null)
           {
                  JOptionPane.showMessageDialog(null, "invalid user name or password");
                  clearFields();
           
           
           }
         
           else
             {
               if(newname.equals(name)){
                 new Dashboard().setVisible(true);
                    this.dispose();
                  }
               else{
                        JOptionPane.showMessageDialog(null, "invalid user name or password");
                        clearFields();
                        }
                          
            
              }
                 
 
    }//GEN-LAST:event_login_buttonActionPerformed
    private void clearFields() {
    username_field.setText("");
    password_field.setText("");
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login_label;
    private javax.swing.JLabel main_login_label;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JLabel password_label;
    private javax.swing.JTextField username_field;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables

    @SuppressWarnings("unused")
    void //<editor-fold defaultstate="collapsed" desc="comment">
        setVisable
//</editor-fold>
(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
