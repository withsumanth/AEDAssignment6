/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdminLogin;

import Business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sumanth
 */
public class ManageRevenueJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRevenueJPanel
     */
    JPanel userProcessContainer;
    Business business;
    ManageRevenueJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
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
        btnBack = new javax.swing.JButton();
        revenueComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Monitor Sales Performance");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 310, 50));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        revenueComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Revenue totals for Xerox", "Product sales revenues by market", "Top 10 sales persons by revenues broken down by market", "Sales persons with consist above target sales", "Sales person with below total order target sales", "Top 3 products consistently sold above market target price", "Gap between target and actual" }));
        revenueComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                revenueComboBoxItemStateChanged(evt);
            }
        });
        add(revenueComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 500, 50));

        jLabel2.setText("Select Option");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 94, 120, 50));

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 100, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void revenueComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_revenueComboBoxItemStateChanged
        
    }//GEN-LAST:event_revenueComboBoxItemStateChanged

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        if(revenueComboBox.getSelectedItem()=="Revenue totals for Xerox"){
            //totalRevenue();
        }else if(revenueComboBox.getSelectedItem()=="Product sales revenues by market"){
                
        }else if(revenueComboBox.getSelectedItem()=="Top 10 sales persons by revenues broken down by market"){
                
        }else if(revenueComboBox.getSelectedItem()=="Sales persons with consist above target sales"){
                
        }else if(revenueComboBox.getSelectedItem()=="Sales person with below total order target sales"){
                
        }else if(revenueComboBox.getSelectedItem()=="Top 3 products consistently sold above market target price"){
                
        }else if(revenueComboBox.getSelectedItem()=="Gap between target and actual"){
                
        }
    }//GEN-LAST:event_searchBtnActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> revenueComboBox;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}