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
public class CustomerDirectory {

    private ArrayList<Customer> customerCatalogue;

    public ArrayList<Customer> getCustomerCatalogue() {
        return customerCatalogue;
    }

    public void setCustomerCatalogue(ArrayList<Customer> customerCatalogue) {
        this.customerCatalogue = customerCatalogue;
    }

    public CustomerDirectory() {
        customerCatalogue = new ArrayList<Customer>();

    }

}
