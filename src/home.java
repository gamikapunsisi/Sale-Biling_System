
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class home extends javax.swing.JFrame {
    public int x=0;

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        btn_new_product.setVisible(false);
        btn_update_product.setVisible(false);
        btn_product_details.setVisible(false);
        btn_delete_product.setVisible(false);
        btn_bill.setVisible(false);
        btn_logout.setVisible(false);
        btn_close_app.setVisible(false);
        lbl_new_product.setVisible(false);
        lbl_update_product.setVisible(false);
        lbl_product_details.setVisible(false);
        lbl_delete_product.setVisible(false);
        lbl_billing.setVisible(false);
        lbl_logout.setVisible(false);
        lbl_close_app.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_new_product = new javax.swing.JLabel();
        lbl_update_product = new javax.swing.JLabel();
        lbl_product_details = new javax.swing.JLabel();
        lbl_delete_product = new javax.swing.JLabel();
        lbl_billing = new javax.swing.JLabel();
        lbl_logout = new javax.swing.JLabel();
        lbl_close_app = new javax.swing.JLabel();
        btn_arrow = new javax.swing.JButton();
        btn_new_product = new javax.swing.JButton();
        btn_update_product = new javax.swing.JButton();
        btn_product_details = new javax.swing.JButton();
        btn_delete_product = new javax.swing.JButton();
        btn_bill = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_close_app = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1350, 775));
        setMinimumSize(new java.awt.Dimension(1350, 775));
        setPreferredSize(new java.awt.Dimension(1350, 775));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_new_product.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_new_product.setText("New Product");
        getContentPane().add(lbl_new_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 98, -1, -1));

        lbl_update_product.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_update_product.setText("Update Product");
        getContentPane().add(lbl_update_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 98, -1, -1));

        lbl_product_details.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_product_details.setText("Product Details");
        getContentPane().add(lbl_product_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 98, -1, -1));

        lbl_delete_product.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_delete_product.setText("Delete Product");
        getContentPane().add(lbl_delete_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 98, -1, -1));

        lbl_billing.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_billing.setText("Billing");
        getContentPane().add(lbl_billing, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 98, -1, -1));

        lbl_logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_logout.setText("LogOut");
        getContentPane().add(lbl_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 98, -1, -1));

        lbl_close_app.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_close_app.setText("Close Application");
        getContentPane().add(lbl_close_app, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 98, -1, -1));

        btn_arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/14.jpg"))); // NOI18N
        btn_arrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_arrowMouseClicked(evt);
            }
        });
        getContentPane().add(btn_arrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, 60));

        btn_new_product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/7.jpg"))); // NOI18N
        btn_new_product.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                btn_new_productComponentShown(evt);
            }
        });
        btn_new_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_productActionPerformed(evt);
            }
        });
        getContentPane().add(btn_new_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 60, 60));

        btn_update_product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.jpg"))); // NOI18N
        btn_update_product.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                btn_update_productComponentShown(evt);
            }
        });
        btn_update_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_productActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 70, -1));

        btn_product_details.setIcon(new javax.swing.ImageIcon(getClass().getResource("/12.jpg"))); // NOI18N
        btn_product_details.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                btn_product_detailsComponentShown(evt);
            }
        });
        btn_product_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_product_detailsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_product_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 60, 60));

        btn_delete_product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.jpg"))); // NOI18N
        btn_delete_product.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                btn_delete_productComponentShown(evt);
            }
        });
        btn_delete_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_productActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 60, 50));

        btn_bill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/17.jpg"))); // NOI18N
        btn_bill.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                btn_billComponentShown(evt);
            }
        });
        btn_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_billActionPerformed(evt);
            }
        });
        getContentPane().add(btn_bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 70, -1));

        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/9.jpg"))); // NOI18N
        btn_logout.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                btn_logoutComponentShown(evt);
            }
        });
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 60, 60));

        btn_close_app.setIcon(new javax.swing.ImageIcon(getClass().getResource("/15.jpg"))); // NOI18N
        btn_close_app.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                btn_close_appComponentShown(evt);
            }
        });
        btn_close_app.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_close_appActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close_app, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, 70, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bill.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        int b = JOptionPane.showConfirmDialog(null,"Do you want to logout?","select",JOptionPane.YES_NO_OPTION);
        if(b==0)
        {
            setVisible(false);
            new login().setVisible(true);
            
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_arrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_arrowMouseClicked
        // TODO add your handling code here:
        if(x==0)
        {
            try
            {
                Thread.sleep(250);
                btn_new_product.setVisible(true);
                lbl_new_product.setVisible(true);
                
                
            } catch (InterruptedException ex) {
                
            }
                
        }
        else
        {
        btn_new_product.setVisible(false);
        btn_update_product.setVisible(false);
        btn_product_details.setVisible(false);
        btn_delete_product.setVisible(false);
        btn_bill.setVisible(false);
        btn_logout.setVisible(false);
        btn_close_app.setVisible(false);
        lbl_new_product.setVisible(false);
        lbl_update_product.setVisible(false);
        lbl_product_details.setVisible(false);
        lbl_delete_product.setVisible(false);
        lbl_billing.setVisible(false);
        lbl_logout.setVisible(false);
        lbl_close_app.setVisible(false);
        x=0;
        }
    }//GEN-LAST:event_btn_arrowMouseClicked

    private void btn_close_appActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_close_appActionPerformed
        // TODO add your handling code here:
        int b = JOptionPane.showConfirmDialog(null,"Do you want to close application?","select",JOptionPane.YES_NO_OPTION);
        if (b==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_close_appActionPerformed

    private void btn_new_productComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn_new_productComponentShown
        // TODO add your handling code here:
        try
            {
                Thread.sleep(250);
                btn_update_product.setVisible(true);
                lbl_update_product.setVisible(true);
                
                
            } catch (InterruptedException ex) {
                
            }
    }//GEN-LAST:event_btn_new_productComponentShown

    private void btn_update_productComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn_update_productComponentShown
        // TODO add your handling code here:
        try
            {
                Thread.sleep(250);
                btn_product_details.setVisible(true);
                lbl_product_details.setVisible(true);
                
                
            } catch (InterruptedException ex) {
                
            }
    }//GEN-LAST:event_btn_update_productComponentShown

    private void btn_product_detailsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn_product_detailsComponentShown
        // TODO add your handling code here:
        try
            {
               Thread.sleep(250);
                btn_delete_product.setVisible(true);
                lbl_delete_product.setVisible(true);
                
                
            } catch (InterruptedException ex) {
                
            }
    }//GEN-LAST:event_btn_product_detailsComponentShown

    private void btn_delete_productComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn_delete_productComponentShown
        // TODO add your handling code here:
        try
            {
                Thread.sleep(250);
                btn_bill.setVisible(true);
                lbl_billing.setVisible(true);
                
            } catch (InterruptedException ex) {
                
            }
    }//GEN-LAST:event_btn_delete_productComponentShown

    private void btn_billComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn_billComponentShown
        // TODO add your handling code here:
        try
            {
                Thread.sleep(250);
                btn_logout.setVisible(true);
                lbl_logout.setVisible(true);
                
                
            } catch (InterruptedException ex) {
                
            }
    }//GEN-LAST:event_btn_billComponentShown

    private void btn_logoutComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn_logoutComponentShown
        // TODO add your handling code here:
        try
            {
                 Thread.sleep(250);
                btn_close_app.setVisible(true);
                lbl_close_app.setVisible(true);
                x=1;
                
                
            } catch (InterruptedException ex) {
                
            }
    }//GEN-LAST:event_btn_logoutComponentShown

    private void btn_close_appComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn_close_appComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_close_appComponentShown

    private void btn_new_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_productActionPerformed
        // TODO add your handling code here:
        new new_product().setVisible(true);
    }//GEN-LAST:event_btn_new_productActionPerformed

    private void btn_update_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_productActionPerformed
        // TODO add your handling code here:
        new update_product().setVisible(true);
    }//GEN-LAST:event_btn_update_productActionPerformed

    private void btn_product_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_product_detailsActionPerformed
        // TODO add your handling code here:
         new product_details().setVisible(true);
    }//GEN-LAST:event_btn_product_detailsActionPerformed

    private void btn_delete_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_productActionPerformed
        // TODO add your handling code here:
        new delete_product().setVisible(true);
    }//GEN-LAST:event_btn_delete_productActionPerformed

    private void btn_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_billActionPerformed
        // TODO add your handling code here:
       new final_bill().setVisible(true); 
        
    }//GEN-LAST:event_btn_billActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_arrow;
    private javax.swing.JButton btn_bill;
    private javax.swing.JButton btn_close_app;
    private javax.swing.JButton btn_delete_product;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_new_product;
    private javax.swing.JButton btn_product_details;
    private javax.swing.JButton btn_update_product;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_billing;
    private javax.swing.JLabel lbl_close_app;
    private javax.swing.JLabel lbl_delete_product;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_new_product;
    private javax.swing.JLabel lbl_product_details;
    private javax.swing.JLabel lbl_update_product;
    // End of variables declaration//GEN-END:variables
}
