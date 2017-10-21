/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author JAI JINENDRA
 */
public class SalesPersonDirectory {

    private ArrayList<SalesPerson> salespersonDir;

    public SalesPersonDirectory() {
        salespersonDir = new ArrayList<SalesPerson>();
    }

    public ArrayList<SalesPerson> getSalespersonDir() {
        return salespersonDir;
    }

    public void setSalespersonDir(ArrayList<SalesPerson> salespersonDir) {
        this.salespersonDir = salespersonDir;
    }
    
    public SalesPerson isValidUser(String userName, String password){
        for(SalesPerson s:salespersonDir){
            if(s.getSalesUserName().equals(userName) && s.getSalesPassword().toString().equals(password.toString()) && s.getSalesAccountStatus().equals("Active")){
                return s;
            }
        }
        return null;
    }
}
