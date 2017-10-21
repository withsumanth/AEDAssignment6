/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JAI JINENDRA
 */
public class SupplierDirectory {
    private static int supplierId=0;
    private String supplierName;

    private List<Supplier> supplierDir;
    public SupplierDirectory() {
    
        supplierDir = new ArrayList<Supplier>();
    }

    public static int getSupplierId() {
        return supplierId;
    }

    public static void setSupplierId(int supplierId) {
        SupplierDirectory.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public List<Supplier> getSupplierDir() {
        return supplierDir;
    }

    public void setSupplierDir(List<Supplier> supplierDir) {
        this.supplierDir = supplierDir;
    }
    
    public Supplier addSupplier(){
        Supplier s = new Supplier();
        supplierDir.add(s);
        return s;
    }
    
    public void removeSupplier(Supplier s){
        supplierDir.remove(s);
    }
    
    public Supplier searchSupplier(String keyword){
        for (Supplier supplier : supplierDir) {
            if(supplier.getSuppName().equals(keyword)){
                return supplier;
            }
        }
        return null;
    }
    
    public int supplierId() {
        supplierId++;
        return supplierId;
    }
    
    public Supplier isValidUser(String userName, String password){
        for(Supplier s:supplierDir){
            if(s.getSuppUserName().equals(userName) && s.getSuppPassword().toString().equals(password.toString()) && s.getSuppAccStatus().equals("Active")){
                return s;
            }
        }
        return null;
    }
}
