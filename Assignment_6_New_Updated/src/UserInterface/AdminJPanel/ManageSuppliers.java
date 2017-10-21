package UserInterface.AdminJPanel;

import Business.Supplier;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JAI JINENDRA
 */
public class ManageSuppliers extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    public ManageSuppliers(JPanel upc, SupplierDirectory sd) {
        initComponents();
        userProcessContainer = upc;
        supplierDirectory = sd;
        refreshTable();
    }
  
    public void refreshTable(){
        int rowCount = supplierTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) supplierTable.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (Supplier s : supplierDirectory.getSupplierlist()) {
            Object row[] = new Object[1];
            row[0] = s;
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        supplierTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnAddSupplier = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        salespersonTable = new javax.swing.JTable();
        btnremovesales = new javax.swing.JButton();
        btnviewSalesPerson = new javax.swing.JButton();
        btnAddSalesPerson = new javax.swing.JButton();

        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Supplier Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(supplierTable);

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnView.setText("View Supplier");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnAddSupplier.setText("Add Supplier");
        btnAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplierActionPerformed(evt);
            }
        });

        salespersonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "SalesPerson Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(salespersonTable);

        btnremovesales.setText("Remove");
        btnremovesales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremovesalesActionPerformed(evt);
            }
        });

        btnviewSalesPerson.setText("View SalesPerson");
        btnviewSalesPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewSalesPersonActionPerformed(evt);
            }
        });

        btnAddSalesPerson.setText("Add SalesPerson");
        btnAddSalesPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSalesPersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnremovesales)
                                .addGap(26, 26, 26)
                                .addComponent(btnviewSalesPerson)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddSalesPerson))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRemove)
                                .addGap(26, 26, 26)
                                .addComponent(btnView)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddSupplier)))))
                .addContainerGap(381, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove)
                    .addComponent(btnView)
                    .addComponent(btnAddSupplier))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnremovesales)
                    .addComponent(btnviewSalesPerson)
                    .addComponent(btnAddSalesPerson))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSupplierActionPerformed

        AddSupplier as = new AddSupplier(userProcessContainer, supplierDirectory);
        userProcessContainer.add("AddSupplier", as);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddSupplierActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        int row = supplierTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Supplier s = (Supplier)supplierTable.getValueAt(row,0);
        ViewSupplier vs = new ViewSupplier(userProcessContainer, s);
        userProcessContainer.add("ViewSupplier", vs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        int row = supplierTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Supplier s = (Supplier) supplierTable.getValueAt(row, 0);
        supplierDirectory.removeSupplier(s);
        refreshTable();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnremovesalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremovesalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnremovesalesActionPerformed

    private void btnviewSalesPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewSalesPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnviewSalesPersonActionPerformed

    private void btnAddSalesPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSalesPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddSalesPersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSalesPerson;
    private javax.swing.JButton btnAddSupplier;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnremovesales;
    private javax.swing.JButton btnviewSalesPerson;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable salespersonTable;
    private javax.swing.JTable supplierTable;
    // End of variables declaration//GEN-END:variables

}
