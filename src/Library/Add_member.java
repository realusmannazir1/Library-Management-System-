
package Library;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Zakir
 */
public class Add_member extends javax.swing.JFrame {

   
    public Add_member() {
        initComponents();
       
      
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        fname_field = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        department_field = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        contect_field = new javax.swing.JFormattedTextField();
        cnic_field = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        gender_field = new javax.swing.JComboBox<>();
        address_field = new javax.swing.JTextField();
        semister_field = new javax.swing.JComboBox<>();
        name_field = new javax.swing.JTextField();
        Addbutton = new javax.swing.JButton();
        upload = new javax.swing.JButton();
        main_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADD MEMBER");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fname_field.setBackground(new java.awt.Color(102, 102, 102));
        fname_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fname_field.setForeground(new java.awt.Color(255, 255, 255));
        fname_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel2.add(fname_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 270, 30));

        jLabel9.setBackground(new java.awt.Color(0,0,0,0));
        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("name");
        jLabel9.setOpaque(true);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 100, 30));

        jLabel10.setBackground(new java.awt.Color(0,0,0,0));
        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("F/name");
        jLabel10.setOpaque(true);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 100, 30));

        jLabel11.setBackground(new java.awt.Color(0,0,0,0));
        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Department");
        jLabel11.setOpaque(true);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 130, 30));

        department_field.setBackground(new java.awt.Color(102, 102, 102));
        department_field.setForeground(new java.awt.Color(255, 255, 255));
        department_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cmputer Science", "Data Science", "Software Engineerin", "CyberSecurity", "Information Technology" }));
        jPanel2.add(department_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 270, 30));

        jLabel12.setBackground(new java.awt.Color(0,0,0,0));
        jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Semister");
        jLabel12.setOpaque(true);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 130, 30));

        jLabel13.setBackground(new java.awt.Color(0,0,0,0));
        jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Contect NO");
        jLabel13.setOpaque(true);
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 130, 30));

        jLabel14.setBackground(new java.awt.Color(0,0,0,0));
        jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Address");
        jLabel14.setOpaque(true);
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 130, 30));

        contect_field.setBackground(new java.awt.Color(102, 102, 102));
        contect_field.setForeground(new java.awt.Color(255, 255, 255));
        try {
            contect_field.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(contect_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 270, 30));

        cnic_field.setBackground(new java.awt.Color(102, 102, 102));
        cnic_field.setForeground(new java.awt.Color(255, 255, 255));
        try {
            cnic_field.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(cnic_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 270, 30));

        jLabel7.setBackground(new java.awt.Color(0,0,0,0));
        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CNIC NO");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 130, 30));

        jLabel15.setBackground(new java.awt.Color(0,0,0,0));
        jLabel15.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Gender");
        jLabel15.setOpaque(true);
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 100, 30));

        gender_field.setBackground(new java.awt.Color(102, 102, 102));
        gender_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gender_field.setForeground(new java.awt.Color(255, 255, 255));
        gender_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        jPanel2.add(gender_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 270, 30));

        address_field.setBackground(new java.awt.Color(102, 102, 102));
        address_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        address_field.setForeground(new java.awt.Color(255, 255, 255));
        address_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        address_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_fieldActionPerformed(evt);
            }
        });
        jPanel2.add(address_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 270, 40));

        semister_field.setBackground(new java.awt.Color(102, 102, 102));
        semister_field.setForeground(new java.awt.Color(255, 255, 255));
        semister_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));
        jPanel2.add(semister_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 270, 30));

        name_field.setBackground(new java.awt.Color(102, 102, 102));
        name_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name_field.setForeground(new java.awt.Color(255, 255, 255));
        name_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel2.add(name_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 270, 30));

        Addbutton.setText("ADD");
        Addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(Addbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 130, 40));

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
        jPanel2.add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 110, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 680));

        main_label.setBackground(new java.awt.Color(0, 0, 0,144));
        main_label.setOpaque(true);
        getContentPane().add(main_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void address_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_fieldActionPerformed

    private void AddbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbuttonActionPerformed
      
          
                
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
        return;
    }
    ConnectionTest zak = new ConnectionTest();
   
     String url=zak.url;
     String user=zak.user;
     String passs=zak.password;

    try {
         try (Connection con = DriverManager.getConnection(url,user,passs)) {
             String query = "INSERT INTO members (name, fname, gender, contact, cnic, department, semister, address, profile_pic) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?)";
             
             PreparedStatement pst = con.prepareStatement(query);
             pst.setString(1, name);
             pst.setString(2, fname);
             pst.setString(3, gender);
             pst.setString(4, contact);
             pst.setString(5, cnic);
             pst.setString(6, department);
             pst.setString(7, semister);
             pst.setString(8, address);
             pst.setBytes(9, imageBytes);
             
             int row = pst.executeUpdate();
             if (row > 0) {
                 JOptionPane.showMessageDialog(null, "Member added successfully!");
                 clearFields();
                 
                 
                 Dashboard ref=new Dashboard();
                 ref.refresh();
             } else {
                 JOptionPane.showMessageDialog(null, "Failed to add member.");
             }}
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
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


        public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(() -> {
                new Add_member().setVisible(true); // <-- 'this' reference error
            });
        // TODO add your handling code here:
    }//GEN-LAST:event_AddbuttonActionPerformed
byte[] imageBytes = null;
    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
JFileChooser fileChooser = new JFileChooser();
FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "Image Files", "jpg", "jpeg", "png", "gif");
fileChooser.setFileFilter(filter);

int result = fileChooser.showOpenDialog(null);

if (result == JFileChooser.APPROVE_OPTION) {
    File selectedFile = fileChooser.getSelectedFile();
    ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());

    // Resize image to fit the label



    // Convert the selected image to a byte array for storage in database
    
    try {
        try (FileInputStream fis = new FileInputStream(selectedFile) // Use selectedFile here
        ) {
            imageBytes = fis.readAllBytes();  // Convert image file to byte array
        } // Convert image file to byte array
    } catch (IOException e) {
    }
    

    // Now, imageBytes can be used to store the image in your database
}

   
    }//GEN-LAST:event_uploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbutton;
    private javax.swing.JTextField address_field;
    private javax.swing.JFormattedTextField cnic_field;
    private javax.swing.JFormattedTextField contect_field;
    private javax.swing.JComboBox<String> department_field;
    private javax.swing.JTextField fname_field;
    private javax.swing.JComboBox<String> gender_field;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel main_label;
    private javax.swing.JTextField name_field;
    private javax.swing.JComboBox<String> semister_field;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables

    private static class lable {

        private static void setIcon(ImageIcon imageIcon) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public lable() {
        }
    }

    private static class label {

        private static void setIcon(ImageIcon imageIcon) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public label() {
        }
    }

 
 



}