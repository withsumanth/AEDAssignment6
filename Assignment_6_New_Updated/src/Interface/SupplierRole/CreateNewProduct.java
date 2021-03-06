/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SupplierRole;

import Business.Business;
import Business.Product;
import Business.Supplier;
import com.sun.xml.internal.ws.api.ha.HaInfo;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JAI JINENDRA
 */
public class CreateNewProduct extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewProduct
     */
    JPanel userProcessContainer;
    Business business;

    public CreateNewProduct(JPanel upc, Business b) {
        initComponents();
        userProcessContainer = upc;
        business = b;
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
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtAvail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTargetPrice = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create New Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 44, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Product Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 114, -1, 30));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 114, 215, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Product ID:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 154, 100, 30));

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 154, 213, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Actual Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 204, 110, 30));

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 204, 213, 30));

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("Add Product");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 361, -1, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 361, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Availability:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 290, 105, 31));
        add(txtAvail, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 292, 214, 31));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Target Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 245, 110, 30));

        txtTargetPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtTargetPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 245, 214, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        Product p = business.getProductCatalog().addProduct();
        p.setProdName(txtName.getText());
        p.setAvail(Integer.parseInt(txtAvail.getText()));
        String stringPrice = txtPrice.getText();
        if (stringPrice.isEmpty() == false) {
            int price = Integer.parseInt(stringPrice);
            p.setPrice(price);
        }
        JOptionPane.showMessageDialog(null, "Product added!", "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAvail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTargetPrice;
    // End of variables declaration//GEN-END:variables
}
