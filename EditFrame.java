/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dell
 */
public class EditFrame extends javax.swing.JFrame {

    /**
     * Creates new form EditFrame
     */
    public EditFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UpdatePanel = new javax.swing.JPanel();
        itemname = new javax.swing.JLabel();
        nameTextfield = new javax.swing.JTextField();
        price = new javax.swing.JLabel();
        priceTextfield = new javax.swing.JTextField();
        mrp = new javax.swing.JLabel();
        mrpTextfield = new javax.swing.JTextField();
        stock = new javax.swing.JLabel();
        stockTextfield = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        IdTextfield = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("BUNTY SASTE PATIL CONSTRUCTION PVT LTD.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UpdatePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(102, 102, 255), new java.awt.Color(102, 102, 255), new java.awt.Color(102, 102, 255)));
        UpdatePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemname.setText("Product Name : ");
        UpdatePanel.add(itemname, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 70, -1, -1));
        UpdatePanel.add(nameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 67, 190, -1));

        price.setText("Product Price : ");
        UpdatePanel.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 108, -1, -1));
        UpdatePanel.add(priceTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 105, 95, -1));

        mrp.setText("MRP : ");
        UpdatePanel.add(mrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 146, -1, -1));
        UpdatePanel.add(mrpTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 143, 95, -1));

        stock.setText("Stock : ");
        UpdatePanel.add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 184, -1, -1));
        UpdatePanel.add(stockTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 181, 95, -1));

        AddButton.setText("Update");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        UpdatePanel.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel3.setText("Product ID :");
        UpdatePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 32, -1, -1));
        UpdatePanel.add(IdTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 29, 95, -1));

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        UpdatePanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(UpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cim","root","root");
            String sql = "update prod_info set prod_name=?,price=?,mrp=?,stock=? where Id=?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            
            pstmt.setString(1,nameTextfield.getText());
            pstmt.setInt(2, Integer.parseInt(priceTextfield.getText()));
            pstmt.setInt(3, Integer.parseInt(mrpTextfield.getText()));
            pstmt.setInt(4, Integer.parseInt(stockTextfield.getText()));
            pstmt.setInt(5, Integer.parseInt(IdTextfield.getText()));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Product Updated Successfully");
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_AddButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try{
            int tempId = Integer.parseInt(IdTextfield.getText());
            
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cim","root","root");
            String sql = "select *from prod_info where Id = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, tempId);
            ResultSet rs = pstmt.executeQuery();
            
            int one,three = 0,four = 0,five = 0;
            String two = null;
            String sone,sthree,sfour,sfive;
            while(rs.next()){
                 one = rs.getInt("Id");
                 two = rs.getString("prod_name");
                 three = rs.getInt("price");
                 four = rs.getInt("mrp");
                 five = rs.getInt("stock");
                
            }
            sthree = String.valueOf(three) ;
            sfour = String.valueOf(four);
            sfive = String.valueOf(five);
            
            nameTextfield.setText(two);
            priceTextfield.setText(sthree);
            mrpTextfield.setText(sfour);
            stockTextfield.setText(sfive);
            
            
            con.close();
            
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(EditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField IdTextfield;
    private javax.swing.JPanel UpdatePanel;
    private javax.swing.JLabel itemname;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mrp;
    private javax.swing.JTextField mrpTextfield;
    private javax.swing.JTextField nameTextfield;
    private javax.swing.JLabel price;
    private javax.swing.JTextField priceTextfield;
    private javax.swing.JLabel stock;
    private javax.swing.JTextField stockTextfield;
    // End of variables declaration//GEN-END:variables
}
