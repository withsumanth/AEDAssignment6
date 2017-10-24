/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdminLogin.Revenue;

import Business.Business;
import Business.Market;
import Business.Order;
import Business.OrderList;
import Business.Product;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumanth
 */
public class ProductSalesRevenueJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProductSalesRevenueJPanel
     */
    JPanel userProcessContainer;
    Business business;
    public ProductSalesRevenueJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business =business;
        salesRevenue();
    }
    
    public void salesRevenue(){
        ArrayList<OrderList> listOfOrders = business.getMasterOrderCatalog().getOrderList();
        List <String> allMarkets = new ArrayList();
        double totalPrice=0;
        for(OrderList ol:listOfOrders){
            for(Order o:ol.getOrderList()){
                allMarkets.add(o.getMarket().getMarketName());
            }
        }
        allMarkets = allMarkets.stream().distinct().collect(Collectors.toList());
        marketNameBox.removeAllItems();
        for (String s : allMarkets) {
            marketNameBox.addItem(s);
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

        marketNameBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodJTable = new javax.swing.JTable();
        revenueTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add(marketNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 230, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("       Product sales revenues by market");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 310, 50));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        prodJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(prodJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 290, 120));

        revenueTxt.setEnabled(false);
        add(revenueTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 120, 30));

        jLabel2.setText("Revenue of the market :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 160, 30));

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 130, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String marketName = (String)marketNameBox.getSelectedItem();
        ArrayList<OrderList> listOfOrders = business.getMasterOrderCatalog().getOrderList();
        ArrayList<Product> prodList = new ArrayList();
        double price = 0;
        for(OrderList ol:listOfOrders){
            for(Order o:ol.getOrderList()){
                if(o.getMarket().getMarketName().equals(marketName)){
                    prodList.add(o.getProduct());
                    price = price +(o.getQuantity()*o.getSalesPrice());
                }
            }
        }
        revenueTxt.setText(String.valueOf(price));
        DefaultTableModel model = (DefaultTableModel) prodJTable.getModel();
        model.setRowCount(0);
        for (Product p : prodList) {
            Object row[] = new Object[1];
            row[0] = p;
            model.addRow(row);
        }
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox marketNameBox;
    private javax.swing.JTable prodJTable;
    private javax.swing.JTextField revenueTxt;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}
