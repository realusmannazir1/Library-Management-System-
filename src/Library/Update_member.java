
package Library;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

//import net.proteanit.sql.DbUtils;

/**
 *
 * @author uk078
 */
public class Update_member extends javax.swing.JFrame {

     ConnectionTest zak = new ConnectionTest();
   
               String url=zak.url;
               String user=zak.user;
             String passs=zak.password;

    /**
     *
     */
    public Update_member() {
        initComponents();
        table();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name_field = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fname_field = new javax.swing.JTextField();
        gender_field = new javax.swing.JComboBox<>();
        contect_field = new javax.swing.JFormattedTextField();
        cnic_field = new javax.swing.JFormattedTextField();
        department_field = new javax.swing.JComboBox<>();
        semister_field = new javax.swing.JComboBox<>();
        address_field = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        upload = new javax.swing.JButton();
        refreshbutton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        std_table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        std_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name_field.setBackground(new java.awt.Color(102, 102, 102));
        name_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name_field.setForeground(new java.awt.Color(255, 255, 255));
        name_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(name_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 270, 30));

        jLabel9.setBackground(new java.awt.Color(0,0,0,0));
        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("name");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 100, 30));

        jLabel14.setBackground(new java.awt.Color(0,0,0,0));
        jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Address");
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 130, 30));

        jLabel12.setBackground(new java.awt.Color(0,0,0,0));
        jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Semister");
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 130, 30));

        jLabel11.setBackground(new java.awt.Color(0,0,0,0));
        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Department");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 130, 30));

        jLabel8.setBackground(new java.awt.Color(0,0,0,0));
        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CNIC NO");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 130, 30));

        jLabel13.setBackground(new java.awt.Color(0,0,0,0));
        jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Contect NO");
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 130, 30));

        jLabel15.setBackground(new java.awt.Color(0,0,0,0));
        jLabel15.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Gender");
        jLabel15.setOpaque(true);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 100, 30));

        jLabel10.setBackground(new java.awt.Color(0,0,0,0));
        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("F/name");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 100, 30));

        fname_field.setBackground(new java.awt.Color(102, 102, 102));
        fname_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fname_field.setForeground(new java.awt.Color(255, 255, 255));
        fname_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(fname_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 270, 30));

        gender_field.setBackground(new java.awt.Color(102, 102, 102));
        gender_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gender_field.setForeground(new java.awt.Color(255, 255, 255));
        gender_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        getContentPane().add(gender_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 270, 30));

        contect_field.setBackground(new java.awt.Color(102, 102, 102));
        contect_field.setForeground(new java.awt.Color(255, 255, 255));
        try {
            contect_field.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(contect_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 270, 30));

        cnic_field.setBackground(new java.awt.Color(102, 102, 102));
        cnic_field.setForeground(new java.awt.Color(255, 255, 255));
        try {
            cnic_field.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(cnic_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 270, 30));

        department_field.setBackground(new java.awt.Color(102, 102, 102));
        department_field.setForeground(new java.awt.Color(255, 255, 255));
        department_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cmputer Science", "Data Science", "Software Engineerin", "CyberSecurity", "Information Technology" }));
        getContentPane().add(department_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 270, 30));

        semister_field.setBackground(new java.awt.Color(102, 102, 102));
        semister_field.setForeground(new java.awt.Color(255, 255, 255));
        semister_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));
        getContentPane().add(semister_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 270, 30));

        address_field.setBackground(new java.awt.Color(102, 102, 102));
        address_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        address_field.setForeground(new java.awt.Color(255, 255, 255));
        address_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        address_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(address_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 270, 40));

        update.setBackground(new java.awt.Color(102, 153, 255));
        update.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        update.setText("UPDATE");
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, 140, 60));

        upload.setBackground(new java.awt.Color(0, 102, 255));
        upload.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        upload.setForeground(new java.awt.Color(255, 255, 255));
        upload.setText("Upload ");
        upload.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        getContentPane().add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 110, 40));

        refreshbutton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/OIP.jpeg"))); // NOI18N
        refreshbutton3.setText("Refresh");
        refreshbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbutton3ActionPerformed(evt);
            }
        });
        getContentPane().add(refreshbutton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 110, -1));

        std_table.setBackground(new java.awt.Color(0, 51, 102));
        std_table.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        std_table.setForeground(new java.awt.Color(255, 255, 255));
        std_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        std_table.setGridColor(new java.awt.Color(255, 255, 255));
        std_table.setSelectionBackground(new java.awt.Color(0, 0, 0));
        std_table.setShowGrid(true);
        jScrollPane1.setViewportView(std_table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 510, 670));

        jLabel3.setBackground(new java.awt.Color(0, 51, 102));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("                              All Members");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 510, 30));

        jButton3.setText("search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 100, 30));

        std_id.setBackground(new java.awt.Color(102, 102, 102));
        std_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        std_id.setForeground(new java.awt.Color(255, 255, 255));
        std_id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        std_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_idActionPerformed(evt);
            }
        });
        getContentPane().add(std_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 210, 34));

        jLabel7.setBackground(new java.awt.Color(0,0,0,0));
        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Student ID");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 174, 30));

        delete.setBackground(new java.awt.Color(102, 153, 255));
        delete.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        delete.setText("DELETE");
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 140, 60));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0,100));
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbutton3ActionPerformed
      
        
       table();
    }//GEN-LAST:event_refreshbutton3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

       search_botton();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void std_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_std_idActionPerformed
private byte[] Imagebytes = null;
    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Image Files", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);

        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());

    
            /*  Image img;
            img = icon.getImage().getScaledInstance(
            label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(img));*/
           
            try {
                try (FileInputStream fis = new FileInputStream(selectedFile)) {
                    Imagebytes = fis.readAllBytes();
                }
            } catch (IOException e) {
            }

        }

    }//GEN-LAST:event_uploadActionPerformed

    private void address_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_fieldActionPerformed
       
    }//GEN-LAST:event_address_fieldActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        Delete();
        
        table();
    

    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        update();
    }//GEN-LAST:event_updateActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new Update_member().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_field;
    private javax.swing.JFormattedTextField cnic_field;
    private javax.swing.JFormattedTextField contect_field;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> department_field;
    private javax.swing.JTextField fname_field;
    private javax.swing.JComboBox<String> gender_field;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name_field;
    private javax.swing.JButton refreshbutton3;
    private javax.swing.JComboBox<String> semister_field;
    private javax.swing.JTextField std_id;
    private javax.swing.JTable std_table;
    private javax.swing.JButton update;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables

 final void table(){
          try {

              try (Connection con = DriverManager.getConnection(url, user, passs); Statement st = con.createStatement()) {
                  
                  
                  ResultSet rsa = st.executeQuery("SELECT std_id,name,fname,department FROM members");
                  std_table.setModel(DbUtils.resultSetToTableModel(rsa));
                  
                  
                  
                  
              }

} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}
}
 
  void Delete(){
  
        try {
    String id = std_id.getText(); 
    
            try (Connection con = DriverManager.getConnection(url,user,passs)) {
                String query = "DELETE FROM members WHERE std_id = ?";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, id);
            
            
            int rowsAffected = pst.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "The student was removed successfully!");
                table();
                
            } else {
                JOptionPane.showMessageDialog(null, "No student found with the given ID.");
            }
            std_id.setText("");
        }
            }
} catch (HeadlessException | SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: The Student have bowrred books.First clear the borrow record");
}
  }
    
 void search_botton() {
    String stdid = std_id.getText().trim();
    if (stdid.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter Student ID.");
        return;
    }

    try (Connection con = DriverManager.getConnection(url,user,passs)) {
        String query = "SELECT std_id, name, fname, gender, contact, cnic, department, semister, address, profile_pic FROM members WHERE std_id = ?";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, stdid);
            try (ResultSet rsa = pst.executeQuery()) {
                if (rsa.next()) {
                    name_field.setText(rsa.getString("name"));
                    fname_field.setText(rsa.getString("fname"));
                    gender_field.setSelectedItem(rsa.getString("gender"));
                    contect_field.setText(rsa.getString("contact"));
                    cnic_field.setText(rsa.getString("cnic"));
                    department_field.setSelectedItem(rsa.getString("department"));
                    semister_field.setSelectedItem(rsa.getString("semister"));
                    address_field.setText(rsa.getString("address"));
                    
                    Imagebytes = rsa.getBytes("profile_pic");
                    if (Imagebytes != null && Imagebytes.length > 0) {
                        try {
                            ImageIcon imageIcon = new ImageIcon(Imagebytes);
                            String image = null;
                            /*Image image = imageIcon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);*/
                            label.setIcon(new ImageIcon(image));
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Error displaying image: " + e.getMessage());
                            label.setIcon(null);
                        }
                    } else {
                        label.setIcon(null);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Student not found!");
                }
            }
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}

 
 
 void update() {
      String stdid = std_id.getText();              
     String name = name_field.getText();
    String fname = fname_field.getText();
    String gender = gender_field.getSelectedItem().toString();
    String contact = contect_field.getText();
    String cnic = cnic_field.getText();
    String department = department_field.getSelectedItem().toString();
    String semister = semister_field.getSelectedItem().toString();
    String address = address_field.getText();

    if (name.isEmpty() || fname.isEmpty() || contact.isEmpty() || cnic.isEmpty() || address.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill all fields.");
        
    }

    String query = "update members set name=?, fname=?, gender=?, contact=?, cnic=?, department=?, semister=?, address=? where std_id=?";
        
    try (Connection con = DriverManager.getConnection(url, user, passs)) {
       PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, name);
        pst.setString(2, fname);
        pst.setString(3, gender);
        pst.setString(4, contact);
        pst.setString(5, cnic);
        pst.setString(6, department);
        pst.setString(7, semister);
        pst.setString(8, address);
        pst.setString(9, stdid);
        
       
        int row = pst.executeUpdate();
        
        if (row > 0) {
            JOptionPane.showMessageDialog(this, "Student details updated successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Student not found or update failed.");
            return;
        }

        
        if (Imagebytes != null ) {
            String imageQuery = "UPDATE members SET profile_pic = ? WHERE std_id = ?";
            PreparedStatement pstImage = con.prepareStatement(imageQuery);
            pstImage.setBytes(1, Imagebytes);
            pstImage.setString(2, stdid);

            int imageRow = pstImage.executeUpdate();
            if (imageRow > 0) {
                JOptionPane.showMessageDialog(this, "Profile picture updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update profile picture.");
            }
        }

        // Clear fields and refresh the UI
        clearFields();
        search_botton();  // Re-fetch the book details to reflect the changes

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
    }
}

 private void clearFields() {
    name_field.setText("");
    address_field.setText("");
    fname_field.setText("");
    contect_field.setText("");
    cnic_field.setText("");
    address_field.setText("");
    gender_field.setSelectedIndex(0);
    department_field.setSelectedIndex(0);
    semister_field.setSelectedIndex(0);
}

 /*private static class label {
 
 private static void setIcon(ImageIcon imageIcon) {
 throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
 }
 
 public label() {
 }
 }*/

    private static class DbUtils {

        private static TableModel resultSetToTableModel(ResultSet rsa) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public DbUtils() {
        }
    }

}
