/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Sumanth
 */
public class Business {
    private ProductCatalog productCatalog;
    private SalesPersonDirectory salespersonDir;
    private SupplierDirectory supplierDir;
    private PasswordEncryption passEncryption;
    private AdminLoginDirectory adminLoginDirectory;
    
    public Business(){
        productCatalog = new ProductCatalog();
        salespersonDir = new SalesPersonDirectory();
        supplierDir = new SupplierDirectory();
        passEncryption = new  PasswordEncryption();
        adminLoginDirectory = new AdminLoginDirectory();
    }

    public AdminLoginDirectory getAdminLoginDirectory() {
        return adminLoginDirectory;
    }

    public void setAdminLoginDirectory(AdminLoginDirectory adminLoginDirectory) {
        this.adminLoginDirectory = adminLoginDirectory;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public SalesPersonDirectory getSalespersonDir() {
        return salespersonDir;
    }

    public void setSalespersonDir(SalesPersonDirectory salespersonDir) {
        this.salespersonDir = salespersonDir;
    }

    public SupplierDirectory getSupplierDir() {
        return supplierDir;
    }

    public void setSupplierDir(SupplierDirectory supplierDir) {
        this.supplierDir = supplierDir;
    }

    public PasswordEncryption getPassEncryption() {
        return passEncryption;
    }

    public void setPassEncryption(PasswordEncryption passEncryption) {
        this.passEncryption = passEncryption;
    }
    
}
