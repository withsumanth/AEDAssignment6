/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdminLogin;

import Business.AdminLogin;
import Business.Business;
import Business.Supplier;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumanth
 */
public class ManageSupplierJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSupplierJPanel
     */
    private JPanel userProcessContainer;
    Business business;
    AdminLogin admin;
    boolean check = false;
    
    ManageSupplierJPanel(JPanel userProcessContainer, Business business, AdminLogin admin) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.admin = admin;
        if(business.getSupplierDir().getSupplierDir().size()==0){
            addAllSuppliers();
        }
        populateJTable();
    }
    
    public void populateJTable() {
        DefaultTableModel tabMod = (DefaultTableModel) supplierTable.getModel();
        tabMod.setRowCount(0);
        for (Supplier ad : business.getSupplierDir().getSupplierDir()) {
            Object row[] = new Object[4];
            row[0] = ad;
            row[1] = ad.getSuppUserName();
            row[2] = ad.getSuppPassword();
            row[3] = ad.getSuppAccStatus();
            tabMod.addRow(row);
        }
    }
    
    public void addAllSuppliers(){
        String csvFile = "Supplier.csv";
	        BufferedReader bufferedReader = null;
	        String line = "";
	        String cvsSplitBy = ",";
	        try {
	            bufferedReader = new BufferedReader(new FileReader(csvFile));
                    ArrayList<String[]> dataCsvArr = new ArrayList();
                    int count = 0;
	            while ((line = bufferedReader.readLine()) != null) {
	                String[] dataFromCsv = line.split(cvsSplitBy);
                        dataCsvArr.add(count,dataFromCsv);
                        count++;
	            }
                    for(int i=1;i<dataCsvArr.size();i++){
                        Supplier suppDet = business.getSupplierDir().addSupplier();
                        String valuesOfArray[] = dataCsvArr.get(i);
                        suppDet.setSuppName(valuesOfArray[0]);
                        suppDet.setSuppUserName(valuesOfArray[1]);
                        suppDet.setSuppPassword(business.getPassEncryption().encrypt(valuesOfArray[2]));
                        suppDet.setSuppAccStatus(valuesOfArray[3]);
                        suppDet.setSuppRole("Supplier");
                    }
	            bufferedReader.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	  } catch (IOException ex) {
               Logger.getLogger(ManageSupplierJPanel.class.getName()).log(Level.SEVERE, null, ex);
           }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        delSuppBtn = new javax.swing.JButton();
        updSuppBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        supplierSearchTable = new javax.swing.JTable();
        searchBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        searchUserNameTxt = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier Name", "Supplier UserName", "Password", "Account Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(supplierTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 720, 210));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("           Manage Suppliers");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 200, 40));

        delSuppBtn.setText("Delete");
        delSuppBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delSuppBtnActionPerformed(evt);
            }
        });
        add(delSuppBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        updSuppBtn.setText("Update");
        updSuppBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updSuppBtnActionPerformed(evt);
            }
        });
        add(updSuppBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, -1, -1));

        supplierSearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier Name", "Supplier UserName", "Password", "Account Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(supplierSearchTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 730, 110));

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));

        jLabel2.setText("Enter Username");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 140, 40));
        add(searchUserNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 170, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void delSuppBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delSuppBtnActionPerformed
         int selectedRow = supplierTable.getSelectedRow();
        if(selectedRow>=0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to delete the account details", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                Supplier supplier = (Supplier) supplierTable.getValueAt(selectedRow,0);
                business.getSupplierDir().removeSupplier(supplier);
                populateJTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please Select Any Row","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_delSuppBtnActionPerformed

    private void updSuppBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updSuppBtnActionPerformed
         int selectedRow = supplierTable.getSelectedRow();
        if(selectedRow>=0){
        Supplier supplier = (Supplier) supplierTable.getValueAt(selectedRow, 0);
        UpdateSupplierJPanel panel = new UpdateSupplierJPanel(userProcessContainer,business,supplier);
        userProcessContainer.add("UpdateSupplierJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please Select Any Row");
        }

    }//GEN-LAST:event_updSuppBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.setAutoscrolls(true);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        DefaultTableModel tabMod = (DefaultTableModel) supplierSearchTable.getModel();
        tabMod.setRowCount(0);
        String searchUserName = searchUserNameTxt.getText();
        if(searchUserName.trim().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter UserName for search");
            return;
        }
        Supplier foundSupplier = business.getSupplierDir().searchSupplier(searchUserName);
        if(foundSupplier==null){
            JOptionPane.showMessageDialog(null, "UserName entered is invalid");
            return;
        }
        Object row[] = new Object[4];
        row[0] = foundSupplier;
        row[1] = foundSupplier.getSuppUserName();
        row[2] = foundSupplier.getSuppPassword();
        row[3] = foundSupplier.getSuppAccStatus();
        tabMod.addRow(row);
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton delSuppBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchUserNameTxt;
    private javax.swing.JTable supplierSearchTable;
    private javax.swing.JTable supplierTable;
    private javax.swing.JButton updSuppBtn;
    // End of variables declaration//GEN-END:variables
}
