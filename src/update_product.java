/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import bill.connectiondb;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class update_product extends javax.swing.JFrame {

    /**
     * Creates new form update_product
     */
    public update_product() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_product_id = new javax.swing.JLabel();
        txt_pid = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_product_name = new javax.swing.JLabel();
        lbl_rate = new javax.swing.JLabel();
        lbl_description = new javax.swing.JLabel();
        lbl_activate = new javax.swing.JLabel();
        txt_product_name = new javax.swing.JTextField();
        txt_rate = new javax.swing.JTextField();
        txt_description = new javax.swing.JTextField();
        txt_activate = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btn_update = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_cancle = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Update Product");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 20, 203, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, 580, 10));

        lbl_product_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_product_id.setText("Product ID");
        getContentPane().add(lbl_product_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 107, -1, -1));

        txt_pid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 104, 145, -1));

        btn_search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 103, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 146, 580, -1));

        lbl_product_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_product_name.setText("Product Name");
        getContentPane().add(lbl_product_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 182, -1, -1));

        lbl_rate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_rate.setText("Rate");
        getContentPane().add(lbl_rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 227, -1, -1));

        lbl_description.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_description.setText("Description");
        getContentPane().add(lbl_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 274, -1, -1));

        lbl_activate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_activate.setText("Activate");
        getContentPane().add(lbl_activate, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 324, -1, -1));

        txt_product_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txt_product_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 181, 250, -1));

        txt_rate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txt_rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 226, 250, -1));

        txt_description.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txt_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 273, 250, -1));

        txt_activate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txt_activate, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 323, 250, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 362, 580, 10));

        btn_update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_update.setForeground(new java.awt.Color(51, 0, 102));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 390, -1, -1));

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(51, 0, 102));
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 390, -1, -1));

        btn_cancle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cancle.setForeground(new java.awt.Color(51, 0, 102));
        btn_cancle.setText("Cancel");
        btn_cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancle, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 390, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, -10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancleActionPerformed
        // TODO add your handling code here:
       setVisible(false);
    }//GEN-LAST:event_btn_cancleActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new update_product().setVisible(true);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        String pId=txt_pid.getText();
        try
        {
            Connection conn = connectiondb.getCon();
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery("select from product where pId='"+pId+"'");
            
            if(res.next())
            {
                txt_product_name.setText(res.getString(2));
                txt_rate.setText(res.getString(3));
                txt_description.setText(res.getString(4));
                txt_activate.setText(res.getString(5));
                txt_pid.setEditable(false);
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Product Id does not exist!" );
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        String pId=txt_pid.getText();
        String pName=txt_product_name.getText();
        String rate=txt_rate.getText();
        String description=txt_description.getText();
        String activate=txt_activate.getText();
        
        try
        {
            Connection conn=connectiondb.getCon();
            Statement stat=conn.createStatement();
            stat.executeUpdate("update product set pName='"+pName+"',rate='"+rate+"',description='"+description+"',activate='"+activate+"'where pId='"+pId+"'");
            JOptionPane.showMessageDialog(null, "Successfully Updated!");
            setVisible(false);
            new update_product().setVisible(true);
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

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
            java.util.logging.Logger.getLogger(update_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new update_product().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancle;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_activate;
    private javax.swing.JLabel lbl_description;
    private javax.swing.JLabel lbl_product_id;
    private javax.swing.JLabel lbl_product_name;
    private javax.swing.JLabel lbl_rate;
    private javax.swing.JTextField txt_activate;
    private javax.swing.JTextField txt_description;
    private javax.swing.JTextField txt_pid;
    private javax.swing.JTextField txt_product_name;
    private javax.swing.JTextField txt_rate;
    // End of variables declaration//GEN-END:variables

    private static class setVisible {

        public setVisible(boolean b) {
        }
    }
}
