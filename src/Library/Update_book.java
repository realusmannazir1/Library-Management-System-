/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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
 * @author Zakir
 */
public class Update_book extends javax.swing.JFrame {
    
     ConnectionTest zak = new ConnectionTest();
   
               String url=zak.url;
               String user=zak.user;
             String passs=zak.password;
    
    private String image;
    /**
     * Creates new form Remove_book
     */
    public Update_book() {
        initComponents();
        table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name_field = new javax.swing.JTextField();
        update1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        aouthor_field = new javax.swing.JTextField();
        edition_field = new javax.swing.JTextField();
        upload = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        quantity_field = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        books_table = new javax.swing.JTable();
        refreshbutton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        book_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name_field.setBackground(new java.awt.Color(102, 102, 102));
        name_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name_field.setForeground(new java.awt.Color(255, 255, 255));
        name_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(name_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 260, 30));

        update1.setBackground(new java.awt.Color(102, 153, 255));
        update1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        update1.setText("Delete");
        update1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });
        getContentPane().add(update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 130, 50));

        jLabel4.setBackground(new java.awt.Color(0,0,0,0));
        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book name");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 120, 30));

        jLabel5.setBackground(new java.awt.Color(0,0,0,0));
        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Aouther name");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 130, 30));

        aouthor_field.setBackground(new java.awt.Color(102, 102, 102));
        aouthor_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aouthor_field.setForeground(new java.awt.Color(255, 255, 255));
        aouthor_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(aouthor_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 260, 30));

        edition_field.setBackground(new java.awt.Color(102, 102, 102));
        edition_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edition_field.setForeground(new java.awt.Color(255, 255, 255));
        edition_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(edition_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 260, 30));

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
        getContentPane().add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 110, 40));

        update.setBackground(new java.awt.Color(102, 153, 255));
        update.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        update.setText("UPDATE");
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 130, 50));

        jLabel8.setBackground(new java.awt.Color(0,0,0,0));
        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Edition");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 130, 30));

        jLabel11.setBackground(new java.awt.Color(0,0,0,0));
        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Quantity");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 120, 30));

        quantity_field.setBackground(new java.awt.Color(102, 102, 102));
        quantity_field.setForeground(new java.awt.Color(255, 255, 255));
        try {
            quantity_field.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        quantity_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantity_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(quantity_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 260, 30));

        books_table.setBackground(new java.awt.Color(0, 51, 102));
        books_table.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        books_table.setForeground(new java.awt.Color(255, 255, 255));
        books_table.setModel(new javax.swing.table.DefaultTableModel(
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
        books_table.setGridColor(new java.awt.Color(255, 255, 255));
        books_table.setSelectionBackground(new java.awt.Color(0, 0, 0));
        books_table.setShowGrid(true);
        jScrollPane1.setViewportView(books_table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 520, 540));

        refreshbutton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/OIP.jpeg"))); // NOI18N
        refreshbutton3.setText("Refresh");
        refreshbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbutton3ActionPerformed(evt);
            }
        });
        getContentPane().add(refreshbutton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 100, -1));

        jLabel3.setBackground(new java.awt.Color(0, 51, 102));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("                              Available Books");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 510, 30));

        jButton3.setText("search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 100, 30));

        book_id.setBackground(new java.awt.Color(102, 102, 102));
        book_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        book_id.setForeground(new java.awt.Color(255, 255, 255));
        book_id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        book_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_idActionPerformed(evt);
            }
        });
        getContentPane().add(book_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 260, 34));

        jLabel7.setBackground(new java.awt.Color(0,0,0,0));
        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Book ID");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 120, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0,140));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbutton3ActionPerformed
        // TODO add your handling code here:
        
        table();
    }//GEN-LAST:event_refreshbutton3ActionPerformed

    private void book_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_idActionPerformed

    private void name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_fieldActionPerformed

    private void quantity_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantity_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantity_fieldActionPerformed
private byte[] Imagebytes = null;
    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Image Files", "jpg", "jpeg", "png", "gif");

        fileChooser.setFileFilter(filter);

        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            // Resize image to fit the label
            /* Image img = null;
            img = icon.getImage().getScaledInstance(
            /*label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH );*/
            /*    label.setIcon(new ImageIcon(img));*/

            // Convert the selected image to a byte array for storage in database

            try {
                try (FileInputStream fis = new FileInputStream(selectedFile) // Use selectedFile here
                ) {
                    Imagebytes = fis.readAllBytes(); // Convert image file to byte array
                } // Convert image file to byte array
            } catch (IOException e) {
            }

            // Now, imageBytes can be used to store the image in your database
        }
    }//GEN-LAST:event_uploadActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        update();
        table();
        

    }//GEN-LAST:event_updateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        search_botton();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed

        // TODO add your handling code here:
        remove();
        table();
    }//GEN-LAST:event_update1ActionPerformed

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
            java.util.logging.Logger.getLogger(Update_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Update_book().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aouthor_field;
    private javax.swing.JTextField book_id;
    private javax.swing.JTable books_table;
    private javax.swing.JTextField edition_field;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name_field;
    private javax.swing.JFormattedTextField quantity_field;
    private javax.swing.JButton refreshbutton3;
    private javax.swing.JButton update;
    private javax.swing.JButton update1;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables

 final void table(){
          try {

              try (Connection con = DriverManager.getConnection(url,user,passs); Statement st1 = con.createStatement(); ResultSet rs = st1.executeQuery("SELECT book_id,book_name, author, edition, quantity FROM books")) {
                  
                  
                  books_table.setModel(DbUtils.resultSetToTableModel(rs));
                  
                  
                  
                  
              }

} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}
}
 
  void remove() {
    String id = book_id.getText();

    if (id.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a Book ID.");
        return;
    }

    try {
        // First, check if the book is issued
        try (Connection con = DriverManager.getConnection(url, user, passs)) {
            // First, check if the book is issued
            String checkQuery = "SELECT * FROM issue_books WHERE book_id = ?";
            try (PreparedStatement checkPst = con.prepareStatement(checkQuery)) {
                checkPst.setString(1, id);
                try (ResultSet rs = checkPst.executeQuery()) {
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Error: This book is currently issued!\nPlease return it before deletion.");
                    } else {
                        // If not issued, proceed to delete
                        String deleteQuery = "DELETE FROM books WHERE book_id = ?";
                        try (PreparedStatement deletePst = con.prepareStatement(deleteQuery)) {
                            deletePst.setString(1, id);
                            int rowsAffected = deletePst.executeUpdate();
                            
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "The book was deleted successfully!");
                                table();
                            } else {
                                JOptionPane.showMessageDialog(null, "No book found with the given ID.");
                            }
                        }
                    }
                }
            }
        }
        book_id.setText("");

    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
    }
}

private final ImageIcon defaultIcon = new ImageIcon("/icons/book.png");


void search_botton() {
    String bookid = book_id.getText().trim();

    if (bookid.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter Book ID.");
        return;
    }

    try (Connection con = DriverManager.getConnection(url,user,passs)) {
        String query = "SELECT book_id, book_name, author, edition, quantity, profile_pic FROM books WHERE book_id = ?";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, bookid);
            try (ResultSet rsa = pst.executeQuery()) {
                if (rsa.next()) {
                    name_field.setText(rsa.getString("book_name"));
                    aouthor_field.setText(rsa.getString("author"));
                    edition_field.setText(rsa.getString("edition"));
                    quantity_field.setText(rsa.getString("quantity"));
                    
                    Imagebytes = rsa.getBytes("profile_pic");
                    
                    if (Imagebytes != null && Imagebytes.length > 0) {
                        try {
                            label.setIcon(new ImageIcon(image));
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Error displaying image: " + e.getMessage());
                            label.setIcon(defaultIcon);
                        }
                    } else {
                        label.setIcon(defaultIcon);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Book not found!");
                    label.setIcon(defaultIcon);
                }
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        label.setIcon(defaultIcon);
    }
}

void update() {
    String bookId = book_id.getText().trim();
    String bookName = name_field.getText().trim();
    String author = aouthor_field.getText().trim();
    String edition = edition_field.getText().trim();
    String quantity = quantity_field.getText().trim();

    if (bookId.isEmpty() || bookName.isEmpty() || author.isEmpty() || edition.isEmpty() || quantity.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill all fields.");
        return;
    }

    // First, update the book details without the image
    String detailsQuery = "UPDATE books SET book_name = ?, author = ?, edition = ?, quantity = ? WHERE book_id = ?";
    try (Connection con = DriverManager.getConnection(url, user, passs)) {
        PreparedStatement pst = con.prepareStatement(detailsQuery);
        pst.setString(1, bookName);
        pst.setString(2, author);
        pst.setString(3, edition);
        pst.setString(4, quantity);
        pst.setString(5, bookId);
        int row = pst.executeUpdate();
        
        if (row > 0) {
            JOptionPane.showMessageDialog(this, "Book details updated successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Book not found or update failed.");
            return;
        }

        // If an image is provided, update the profile picture in a separate query
        if (Imagebytes != null ) {
            String imageQuery = "UPDATE books SET profile_pic = ? WHERE book_id = ?";
            PreparedStatement pstImage = con.prepareStatement(imageQuery);
            pstImage.setBytes(1, Imagebytes);
            pstImage.setString(2, bookId);

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
    aouthor_field.setText("");
    edition_field.setText("");
    quantity_field.setText("");
}




    private static class label {

        private static void setIcon(ImageIcon defaultIcon) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }




        public label() {
        }
    }

    private static class DbUtils {

        private static TableModel resultSetToTableModel(ResultSet rs) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }



        public DbUtils() {
        }
    }

}
        
  


