
package Library;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class issue_book extends javax.swing.JFrame {

   ConnectionTest zak = new ConnectionTest();
   
               String url=zak.url;
               String user=zak.user;
             String passs=zak.password;
    
    public issue_book() {
        initComponents();
        table();
     

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        return_date = new javax.swing.JFormattedTextField();
        std_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        refreshbutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        std_field = new javax.swing.JTextField();
        refreshbutton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        book_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        book_name = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        std_table = new javax.swing.JTable();
        lan = new javax.swing.JLabel();
        refreshbutton1 = new javax.swing.JButton();
        refreshbutton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        books_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ISSUE BOOK");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        return_date.setBackground(new java.awt.Color(102, 102, 102));
        return_date.setForeground(new java.awt.Color(255, 255, 255));
        try {
            return_date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(return_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 140, 40));

        std_id.setBackground(new java.awt.Color(102, 102, 102));
        std_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        std_id.setForeground(new java.awt.Color(255, 255, 255));
        std_id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(std_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 190, 30));

        jLabel7.setBackground(new java.awt.Color(0,0,0,0));
        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Book ID");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 120, 30));

        jButton2.setText("search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 100, 30));

        refreshbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/OIP.jpeg"))); // NOI18N
        refreshbutton.setText("Refresh");
        refreshbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(refreshbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 110, 30));

        jLabel6.setBackground(new java.awt.Color(0,0,0,0));
        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Return Date(yyyy/mm/dd)");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 190, 30));

        std_field.setEditable(false);
        std_field.setBackground(new java.awt.Color(102, 102, 102));
        std_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        std_field.setForeground(new java.awt.Color(255, 255, 255));
        std_field.setText("the student name will be show here....");
        std_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        std_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(std_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 370, 30));

        refreshbutton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/OIP.jpeg"))); // NOI18N
        refreshbutton3.setText("Refresh");
        refreshbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbutton3ActionPerformed(evt);
            }
        });
        getContentPane().add(refreshbutton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 110, 30));

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton1.setText("ISSUE");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 140, 60));

        jButton3.setText("search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 100, 30));

        jLabel5.setBackground(new java.awt.Color(0,0,0,0));
        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Isuue date will be automatically genaret");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 360, 30));

        book_id.setBackground(new java.awt.Color(102, 102, 102));
        book_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        book_id.setForeground(new java.awt.Color(255, 255, 255));
        book_id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        book_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_idActionPerformed(evt);
            }
        });
        getContentPane().add(book_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 240, 30));

        jLabel3.setBackground(new java.awt.Color(0, 51, 102));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("                            All Available Books");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 500, 30));

        jLabel4.setBackground(new java.awt.Color(0,0,0,0));
        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Student ID");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 130, 30));

        book_name.setEditable(false);
        book_name.setBackground(new java.awt.Color(102, 102, 102));
        book_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        book_name.setForeground(new java.awt.Color(255, 255, 255));
        book_name.setText("the book name will be show here....");
        book_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(book_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 370, 30));

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
        jScrollPane2.setViewportView(std_table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 500, 220));

        lan.setBackground(new java.awt.Color(0, 51, 102));
        lan.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        lan.setForeground(new java.awt.Color(255, 255, 255));
        lan.setText("                              All Available Students");
        lan.setOpaque(true);
        getContentPane().add(lan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 500, 30));

        refreshbutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/OIP.jpeg"))); // NOI18N
        refreshbutton1.setText("Refresh");
        refreshbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbutton1ActionPerformed(evt);
            }
        });
        getContentPane().add(refreshbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 110, 30));

        refreshbutton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/OIP.jpeg"))); // NOI18N
        refreshbutton2.setText("Refresh");
        refreshbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbutton2ActionPerformed(evt);
            }
        });
        getContentPane().add(refreshbutton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 110, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 30, 500, 220));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0,144));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void book_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_idActionPerformed
       

    }//GEN-LAST:event_book_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    issue();
     Dashboard ref=new Dashboard();
                ref.refresh();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String stdid=std_id.getText();
       
       
        try {
           try (Connection con = DriverManager.getConnection(url,user,passs)) {
               String query = "SELECT name FROM members WHERE std_id=?";
               try (PreparedStatement pst = con.prepareStatement(query)) {
                   pst.setString(1, stdid);
                   
                   try (ResultSet rsa = pst.executeQuery()) {
                       String stdName;
                       
                       if (rsa.next()) {
                           stdName = rsa.getString("name");
                           
                           std_field.setText("the student name is "+stdName);
                       }
                   }
               }
           }
    
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void refreshbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbuttonActionPerformed

        member_refresh();
      
    }//GEN-LAST:event_refreshbuttonActionPerformed

    private void std_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_fieldActionPerformed
       
    }//GEN-LAST:event_std_fieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

      search_botton();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void refreshbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbutton2ActionPerformed
    }//GEN-LAST:event_refreshbutton2ActionPerformed

    private void refreshbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbutton3ActionPerformed
           book_refresh();
        
    }//GEN-LAST:event_refreshbutton3ActionPerformed

    private void refreshbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbutton1ActionPerformed
        
    }//GEN-LAST:event_refreshbutton1ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new issue_book().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField book_id;
    private javax.swing.JTextField book_name;
    private javax.swing.JTable books_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lan;
    private javax.swing.JButton refreshbutton;
    private javax.swing.JButton refreshbutton1;
    private javax.swing.JButton refreshbutton2;
    private javax.swing.JButton refreshbutton3;
    private javax.swing.JFormattedTextField return_date;
    private javax.swing.JTextField std_field;
    private javax.swing.JTextField std_id;
    private javax.swing.JTable std_table;
    // End of variables declaration//GEN-END:variables

  final void table(){
          try {

              try (Connection con = DriverManager.getConnection(url,user,passs)) {
                  Statement st2;
                  try (Statement st1 = con.createStatement()) {
                      st2 = con.createStatement();
                      ResultSet rsa;
                      try (ResultSet rs = st1.executeQuery("SELECT book_id,book_name,author,edition,quantity FROM books")) {
                          books_table.setModel(DbUtils.resultSetToTableModel(rs));
                          rsa = st2.executeQuery("SELECT std_id,name,department,semister FROM members");
                          std_table.setModel(DbUtils.resultSetToTableModel(rsa));
                      }
                      rsa.close();
                  }
                  st2.close();
              }

} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}


}
  void member_refresh(){
  
            try{
             

            DefaultTableModel model = (DefaultTableModel) std_table.getModel();
            model.setRowCount(0);

            Connection con = DriverManager.getConnection(url, user,passs);
            Statement st = con.createStatement();
            ResultSet rs= st.executeQuery("SELECT std_id,name,department,semister FROM members");
            std_table.setModel(DbUtils.resultSetToTableModel(rs));
           
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);

        }
  }
  
  
  void book_refresh(){
            try{
             

            DefaultTableModel model = (DefaultTableModel) books_table.getModel();
            model.setRowCount(0);

            Connection con = DriverManager.getConnection(url,user,passs);
            Statement st = con.createStatement();
            ResultSet rs= st.executeQuery("SELECT * FROM books");
            books_table.setModel(DbUtils.resultSetToTableModel(rs));
           
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);

        }
  }
  void search_botton(){
  
     String stdid=book_id.getText();
        try {
         try (Connection con = DriverManager.getConnection(url,user,passs)) {
             String query = "SELECT book_name,quantity FROM books WHERE book_id=?";
             try (PreparedStatement pst = con.prepareStatement(query)) {
                 pst.setString(1, stdid);
                 
                 try (ResultSet rsa = pst.executeQuery()) {
                     String stdName;
                     
                     if (rsa.next()) {
                         stdName = rsa.getString("book_name");
                         rsa.getInt("quantity");
                         
                         book_name.setText("the book name is "+stdName);
                     }
                     else{
                         JOptionPane.showMessageDialog(null, "The id dosn't exist!");
                     }
                 }
             }
         }
    
} catch (HeadlessException | SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}
  }
  
   @SuppressWarnings("ConvertToTryWithResources")
  void issue() {
    try {
        String bookid = book_id.getText().trim();
        String stdid = std_id.getText().trim();
        String date = return_date.getText().trim();

        if (bookid.isEmpty() || stdid.isEmpty() || date.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
            return;
        }

        Connection con = DriverManager.getConnection(url,user,passs);

        String checkQuery = "SELECT quantity FROM books WHERE book_id = ?";
        PreparedStatement checkPst = con.prepareStatement(checkQuery);
        checkPst.setString(1, bookid);
        ResultSet rs = checkPst.executeQuery();

        if (rs.next()) {
            @SuppressWarnings("LocalVariableHidesMemberVariable")
            int quantity = rs.getInt("quantity");

            if (quantity > 0) {
                String query = "INSERT INTO issue_books (std_id, book_id, return_date, issue_date) VALUES (?, ?, ?, curdate());";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, stdid);
                pst.setString(2, bookid);
                pst.setString(3, date);

                int row = pst.executeUpdate();
                if (row > 0) {
                    quantity--;

                    String updateQuery = "UPDATE books SET quantity = ? WHERE book_id = ?";
                    PreparedStatement updatePst = con.prepareStatement(updateQuery);
                    updatePst.setInt(1, quantity);
                    updatePst.setString(2, bookid);
                    updatePst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Book issued successfully!");
                    book_id.setText("");
                    std_id.setText("");
                    return_date.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to issue book.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient books!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Book ID not found.");
        }

        con.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid input! Please enter valid numbers.");
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
