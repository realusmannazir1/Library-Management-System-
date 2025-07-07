/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Library;

/**
 *
 * @author Zakir
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class return_book extends javax.swing.JFrame {

       ConnectionTest zak = new ConnectionTest();
   
               String url=zak.url;
               String user=zak.user;
             String passs=zak.password;

    public return_book() {
        initComponents();
         try{
             

             
            Connection con = DriverManager.getConnection(url,user,passs);
            Statement st = con.createStatement();
           ResultSet rsa = st.executeQuery("""
                                           SELECT borrow_id ,members.std_id, members.name ,books.book_name,issue_date,return_date FROM
                                            members
                                           inner join issue_books on members.std_id = issue_books.std_id
                                           inner join books on books.book_id = issue_books.book_id;""");
         std_table.setModel(DbUtils.resultSetToTableModel(rsa));
           
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);

        }
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        book_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        search_botton = new javax.swing.JButton();
        refreshbutton = new javax.swing.JButton();
        search_field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        std_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("the return date will be automatically genrated.");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 310, 30));

        book_id.setBackground(new java.awt.Color(102, 102, 102));
        book_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        book_id.setForeground(new java.awt.Color(255, 255, 255));
        book_id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        book_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_idActionPerformed(evt);
            }
        });
        getContentPane().add(book_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 160, 30));

        jLabel7.setBackground(new java.awt.Color(0,0,0,0));
        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Record ID");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 130, 30));

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton1.setText("RETURN");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 150, 60));

        label1.setBackground(new java.awt.Color(0, 0, 0,0));
        label1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Search A Book By (ID OR Name)");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 290, 30));
        label1.getAccessibleContext().setAccessibleName("Search Student By (ID OR Name)");

        search_botton.setText("search");
        search_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_bottonActionPerformed(evt);
            }
        });
        getContentPane().add(search_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 160, 30));

        refreshbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/OIP.jpeg"))); // NOI18N
        refreshbutton.setText("Refresh");
        refreshbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(refreshbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 160, -1));

        search_field.setBackground(new java.awt.Color(102, 102, 102));
        search_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search_field.setForeground(new java.awt.Color(255, 255, 255));
        search_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        search_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(search_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 170, 30));

        jLabel3.setBackground(new java.awt.Color(0, 51, 102));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("                                                    All Available Books");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 690, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 690, 460));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0,144));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_fieldActionPerformed
       

    }//GEN-LAST:event_search_fieldActionPerformed

    private void search_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_bottonActionPerformed
       DefaultTableModel model = (DefaultTableModel) std_table.getModel();
            model.setRowCount(0);
        String search=search_field.getText();
        try {
           try (Connection con = DriverManager.getConnection(url,user,passs)) {
               Statement st = con.createStatement();
               String query = """
                                  SELECT borrow_id ,members.std_id, members.name ,books.book_name,issue_date,return_date
                                   FROM members
                                  inner join issue_books on members.std_id = issue_books.std_id
                                  inner join books on books.book_id = issue_books.book_id WHERE members.name LIKE '""" + search + "%' OR members.std_id = '" + search + "'";
               ResultSet rs = st.executeQuery(query);
               
               
               std_table.setModel(DbUtils.resultSetToTableModel(rs));
               
               
               
               
               
               
               
               book_id.setText("");
           }
    
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}

    }//GEN-LAST:event_search_bottonActionPerformed

       @SuppressWarnings("UseSpecificCatch")
    private void refreshbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbuttonActionPerformed

            try{
             

            DefaultTableModel model = (DefaultTableModel) std_table.getModel();
            model.setRowCount(0);

            Connection con = DriverManager.getConnection(url,user,passs);
            Statement st = con.createStatement();
            ResultSet rsa = st.executeQuery("""
                                            SELECT borrow_id ,members.std_id, members.name ,books.book_name,issue_date,return_date FROM
                                             members
                                            inner join issue_books on members.std_id = issue_books.std_id
                                            inner join books on books.book_id = issue_books.book_id;""");
            std_table.setModel(DbUtils.resultSetToTableModel(rsa));
           
        }
            catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_refreshbuttonActionPerformed

    private void book_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_idActionPerformed

    }//GEN-LAST:event_book_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        returnb();

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new return_book().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField book_id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JButton refreshbutton;
    private javax.swing.JButton search_botton;
    private javax.swing.JTextField search_field;
    private javax.swing.JTable std_table;
    // End of variables declaration//GEN-END:variables


  
  void returnb() {
    try {
      int bid = Integer.parseInt(book_id.getText().trim());

        if (bid<=0) {
            JOptionPane.showMessageDialog(this, "Please fill the field");
            
        }

        try (Connection con = DriverManager.getConnection(url,user,passs)) {
            String checkQuery = "SELECT book_id FROM issue_books WHERE borrow_id = ?";
            PreparedStatement checkPst = con.prepareStatement(checkQuery);
            checkPst.setInt(1, bid);
            ResultSet rs = checkPst.executeQuery();
            
            if (rs.next()) {
                String bookid = rs.getString("book_id");
                
                String deleteQuery = "DELETE FROM issue_books WHERE borrow_id = ?";
                PreparedStatement pst = con.prepareStatement(deleteQuery);
                pst.setInt(1, bid);
                
                int row = pst.executeUpdate();
                if (row > 0) {
                    JOptionPane.showMessageDialog(null, "Book Returned successfully!");
                    
                    String insertQuery = "INSERT INTO return_book (borrow_id, return_date) VALUES (?, curdate())";
                    PreparedStatement pt = con.prepareStatement(insertQuery);
                    pt.setInt(1, bid);
                    pt.executeUpdate();
                    
                    String updateQuery = "UPDATE books SET quantity = quantity + 1 WHERE book_id = ?";
                    PreparedStatement updatePst = con.prepareStatement(updateQuery);
                    updatePst.setString(1, bookid);
                    updatePst.executeUpdate();
                    
                    book_id.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to return the book.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid borrow ID. No record found.");
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
    }
}

    private static class DbUtils {

        @SuppressWarnings("unused")
        private static TableModel resultSetToTableModel() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static TableModel resultSetToTableModel(@SuppressWarnings("unused") ResultSet rsa) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public DbUtils() {
        }
    }


}
