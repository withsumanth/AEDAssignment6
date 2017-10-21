/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author JAI JINENDRA
 */
public class Supplier {
    private String suppName;
    private String suppUserName;
    private String suppPassword;
    private String suppAccStatus;
    private Product product;
    
    public Supplier() {
        product = new Product();
    }

    public String getSuppAccStatus() {
        return suppAccStatus;
    }

    public void setSuppAccStatus(String suppAccStatus) {
        this.suppAccStatus = suppAccStatus;
    }

    public String getSuppUserName() {
        return suppUserName;
    }

    public void setSuppUserName(String suppUserName) {
        this.suppUserName = suppUserName;
    }

    public String getSuppPassword() {
        return suppPassword;
    }

    public void setSuppPassword(String suppPassword) {
        this.suppPassword = suppPassword;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public String getSuppName() {
        return suppName;
    }

    public void setSuppName(String suppName) {
        this.suppName = suppName;
    }

    @Override
    public String toString() {
        return suppName; //To change body of generated methods, choose Tools | Templates.
    }
}
