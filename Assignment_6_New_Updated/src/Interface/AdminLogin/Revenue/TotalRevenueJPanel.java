/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdminLogin.Revenue;

import Business.Business;
import Business.Order;
import Business.OrderList;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Sumanth
 */
public class TotalRevenueJPanel extends javax.swing.JPanel {

    /**
     * Creates new form totalRevenueJPanel
     */
    
    JPanel userProcessContainer;
    Business business;
    public TotalRevenueJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business =business;
        ArrayList<OrderList> listOfOrders = business.getMasterOrderCatalog().getOrderList();
        double totalPrice=0;
        double actualPrice=0;
        double targetPrice=0;
        for(OrderList ol:listOfOrders){
            for(Order o:ol.getOrderList()){
                totalPrice = totalPrice+(o.getQuantity()*o.getSalesPrice());
                actualPrice = actualPrice + ((o.getProduct().getPrice()) * o.getQuantity());
                targetPrice = targetPrice + ((o.getProduct().getPrice()*1.2) * o.getQuantity());
            }
        }
        double gapPrice = targetPrice - actualPrice;
        revenueTxt.setText(String.valueOf(totalPrice));
        actPriceTxt.setText(String.valueOf(actualPrice));
        targPriceTxt.setText(String.valueOf(targetPrice));
        gapPriceTxt.setText(String.valueOf(gapPrice));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        revenueTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        targPriceTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        actPriceTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        gapPriceTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        revenueTxt.setEnabled(false);
        revenueTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revenueTxtActionPerformed(evt);
            }
        });
        add(revenueTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 140, 40));

        jLabel3.setText("Total Revenue:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 100, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("                           Total Revenue");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 310, 50));

        targPriceTxt.setEnabled(false);
        targPriceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targPriceTxtActionPerformed(evt);
            }
        });
        add(targPriceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 140, 40));

        jLabel4.setText("Target Price");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, 40));

        actPriceTxt.setEnabled(false);
        actPriceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actPriceTxtActionPerformed(evt);
            }
        });
        add(actPriceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 140, 40));

        jLabel5.setText("Actual Price");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 100, 40));

        gapPriceTxt.setEnabled(false);
        gapPriceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gapPriceTxtActionPerformed(evt);
            }
        });
        add(gapPriceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 140, 40));

        jLabel6.setText("Gap Price");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 100, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void revenueTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revenueTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_revenueTxtActionPerformed

    private void targPriceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targPriceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_targPriceTxtActionPerformed

    private void actPriceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actPriceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actPriceTxtActionPerformed

    private void gapPriceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gapPriceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gapPriceTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actPriceTxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField gapPriceTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField revenueTxt;
    private javax.swing.JTextField targPriceTxt;
    // End of variables declaration//GEN-END:variables
}
