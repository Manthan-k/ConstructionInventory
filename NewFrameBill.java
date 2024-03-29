/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import java.awt.FileDialog;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.util.*;
import java.time.LocalDateTime;
import java.sql.*;
import java.time.LocalDateTime;
import javafx.util.converter.LocalDateTimeStringConverter;
import javax.swing.table.DefaultTableModel;
//import net.proteanit.sql.DbUtils;
/**
 *
 * @author Dell
 */
public class NewFrameBill extends javax.swing.JFrame {

   // int cont = page2.counter;
    /**
     * Creates new form NewFrameBill
     */
    page2 obj = new page2();
    public NewFrameBill() {
        initComponents();
       
        
    }

     public NewFrameBill(int billno) {
        initComponents();
        billnoTF.setText(""+billno);
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        billnoTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        custTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        quantityTF = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        generateBill = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TotalTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        billTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("CONSTRUCTION INVENTORY MANAGEMENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jLabel2.setText("BILL NO :");

        billnoTF.setEditable(false);
        billnoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billnoTFActionPerformed(evt);
            }
        });

        jLabel3.setText("CUSTOMER NAME : ");

        jLabel4.setText("ID :");

        jLabel5.setText("QUANTITY : ");

        addButton.setText("ADD");
        addButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        clearButton.setText("CLEAR");
        clearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        updateButton.setText("UPDATE");
        updateButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product", "MRP", "Quantity", "Total"
            }
        ));
        BillTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BillTableMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(BillTable);
        if (BillTable.getColumnModel().getColumnCount() > 0) {
            BillTable.getColumnModel().getColumn(0).setHeaderValue("ID");
            BillTable.getColumnModel().getColumn(1).setHeaderValue("Product");
            BillTable.getColumnModel().getColumn(2).setHeaderValue("MRP");
            BillTable.getColumnModel().getColumn(3).setHeaderValue("Quantity");
            BillTable.getColumnModel().getColumn(4).setHeaderValue("Total");
        }

        generateBill.setText("GENERATE BILL");
        generateBill.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 3, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black)));
        generateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBillActionPerformed(evt);
            }
        });

        jButton2.setText("PRINT");
        jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 3, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TotalTF.setEditable(false);
        TotalTF.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(billnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custTF, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 31, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(generateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TotalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(billnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(custTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel4)
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(quantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TotalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        billTA.setEditable(false);
        billTA.setColumns(20);
        billTA.setRows(5);
        billTA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jScrollPane1.setViewportView(billTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void billnoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billnoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billnoTFActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
   
        idTF.setText("");
        quantityTF.setText("");
       
        
    }//GEN-LAST:event_clearButtonActionPerformed
public int tempTotal=0;
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
       DefaultTableModel model = (DefaultTableModel)BillTable.getModel();
        try{
            
           int tempId = Integer.parseInt(idTF.getText());
           int tempQuantity = Integer.parseInt(quantityTF.getText());
           String name=null;
           int mrp=0,stock=0;
           
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cim","root","root");
           
            String sql = "select prod_name,mrp,stock from prod_info where Id = ?";
            
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, tempId);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next())
            {
                name = rs.getString("prod_name");
                mrp = rs.getInt("mrp");
                stock = rs.getInt("stock");
            }
            
            stock = stock-tempQuantity;
            int total = tempQuantity*mrp;
            if(stock>0)
            {
                String sql1 = "update prod_info set stock=? where id=?";
                pstmt = con.prepareStatement(sql1);
                pstmt.setInt(1, stock);
                pstmt.setInt(2,tempId);
                pstmt.executeUpdate();
                
                
                
                model.addRow(new Object[]{tempId,name,mrp,tempQuantity,total});
                
              /*  int amt = tempTotal+total;
                tempTotal = total;
                
                
                TotalTF.setText(String.valueOf(amt));
                */
              setGrandTotal();
            }
            else{
                JOptionPane.showMessageDialog(null,"Sorry Not Available");
            }
            
            String sql3 = "insert into bill values(?,?,?,?,?)";
            pstmt = con.prepareStatement(sql3);
            pstmt.setInt(1, Integer.parseInt(billnoTF.getText()));
            pstmt.setString(2, name);
            pstmt.setInt(3, mrp);
            pstmt.setInt(4,Integer.parseInt(quantityTF.getText()));
            pstmt.setInt(5,total);
            pstmt.executeUpdate();
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void generateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateBillActionPerformed
        
      try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cim","root","root");
           
           String sql = "select *from bill where Invc_no=?";
           PreparedStatement pstmt = con.prepareStatement(sql);
           pstmt.setInt(1, Integer.parseInt(billnoTF.getText()));
           ResultSet rs = pstmt.executeQuery();
           int invc=0,mrp=0,quantity=0,total=0;
           String name=null;
           
           billTA.setText("-----------CONSTRUCTION INVENTORY MANAGEMENT----------\n\n"
                   + "------------------------------------------------------------------------------------------\n"
               +"       Bill no - " + obj.billno + "\tCustomer Name - "+custTF.getText()+"\n\n Name\t MRP\tQuantity\tTotal\n"
                        + "--------------------------------------------------------------------------------------\n"
                        );
           
           while(rs.next())
           {
              invc =rs.getInt("Invc_no");
              name = rs.getString("prod_name");
              mrp = rs.getInt("mrp");
              quantity = rs.getInt("quantity");
              total = rs.getInt("total");
              billTA.append(name+"\t "+mrp+"\t"+quantity+"\t"+total+"\n");
               }
         billTA.append("\n\t\t\t"+TotalTF.getText()+"\n\n\n\n\t\t    Sign");
        
          con.close();
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
        
    }//GEN-LAST:event_generateBillActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                        try
			{	
                            billTA.print();
                            page2.setInvoice();
                            
			}
			catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}       
    }//GEN-LAST:event_jButton2ActionPerformed

    int oldQuantity;
    int newQuantity,tableStock,billMrp,updatedTotal=0 ;
    String updProd = "";
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
    
        DefaultTableModel model = (DefaultTableModel)BillTable.getModel();
        int selected = BillTable.getSelectedRow();
        newQuantity = Integer.parseInt(model.getValueAt(selected, 3).toString());
        
        JOptionPane.showMessageDialog(null,"NEW QUANTITY " +newQuantity);
         int iId = Integer.parseInt(model.getValueAt(selected, 0).toString()); 
        
         JOptionPane.showMessageDialog(null, "ID WHICH IS BEEN UPDATED "+iId);
         JOptionPane.showMessageDialog(null, "OLD QUANTITY "+oldQuantity);
       
         try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cim","root","root");
         
           //retrieve stock from old table data
           
           String s1 ="select stock,mrp,prod_name from prod_info where Id = ?";
           PreparedStatement pst = con.prepareStatement(s1);
           pst.setInt(1, iId);
           ResultSet rs = pst.executeQuery();
           while(rs.next())
           {    
               tableStock = rs.getInt("stock");
               billMrp = rs.getInt("mrp");
               updProd = rs.getString("prod_name");
            }
           
            JOptionPane.showMessageDialog(null,"Table Stock before adding old stock" +tableStock);
            
            //ADD OLD STOCK TO PROD_INFO
            tableStock = tableStock + oldQuantity;
            String s2 = "update prod_info set stock="+tableStock+" where Id="+iId;
            PreparedStatement pst1 = con.prepareStatement(s2);
            pst1.executeUpdate();
            JOptionPane.showMessageDialog(null, "Table stock after adding old stock"+tableStock);
            
            //Remove new stock from table 
            tableStock = tableStock - newQuantity;
            String s3 = "update prod_info set stock="+tableStock+" where Id="+iId;
            PreparedStatement pst2 = con.prepareStatement(s3);
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(null,"Table stock after new stock removed" +tableStock);
                
                
            //UPDATE BILL TABLE
            updatedTotal = newQuantity*billMrp;
            String s4 = "update bill set quantity = ?,total = ? where prod_name = ?";
            PreparedStatement pst3 = con.prepareStatement(s4);
            pst3.setInt(1, newQuantity);
            pst3.setInt(2, updatedTotal);
            pst3.setString(3, updProd);
            pst3.executeUpdate();
            JOptionPane.showMessageDialog(null,"Updated total - " +updatedTotal);
            
            //Set grand total after update
            int val = Integer.parseInt(model.getValueAt(selected, 4).toString());
            model.setValueAt(updatedTotal, selected , 4);
          /*  int oldVal = Integer.parseInt(TotalTF.getText());
            oldVal = oldVal-val;
            int newVal = oldVal + updatedTotal;
            */setGrandTotal();
          con.close();
           
           
           
           JOptionPane.showMessageDialog(null, "Updated Successfully");
      }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void BillTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTableMouseClicked
                 DefaultTableModel model = (DefaultTableModel)BillTable.getModel();
        int selected = BillTable.getSelectedRow();
         oldQuantity = Integer.parseInt(model.getValueAt(selected, 3).toString());
         //JOptionPane.showMessageDialog(null, selected);
    }//GEN-LAST:event_BillTableMouseClicked

    private void BillTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTableMouseEntered
           // TODO add your handling code here:
    }//GEN-LAST:event_BillTableMouseEntered

       void setGrandTotal(){
            DefaultTableModel model = (DefaultTableModel)BillTable.getModel();
           int rc = model.getRowCount();
           int grandTotal = 0,Total = 0;
           for(int i=0;i<rc;i++)
           {
                Total = Integer.parseInt(model.getValueAt(i, 4).toString());
               grandTotal = grandTotal + Total;
               TotalTF.setText(String.valueOf(grandTotal));
           }
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
            java.util.logging.Logger.getLogger(NewFrameBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewFrameBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewFrameBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewFrameBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new NewFrameBill().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTable;
    private javax.swing.JTextField TotalTF;
    private javax.swing.JButton addButton;
    private javax.swing.JTextArea billTA;
    private javax.swing.JTextField billnoTF;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField custTF;
    private javax.swing.JButton generateBill;
    private javax.swing.JTextField idTF;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField quantityTF;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
