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
public class SalesPerson {
    
    private String SalesPersonName;
    public int SalespersonId;
    public String SalesPersonaddress;
    public String SalesPersonemail;

    public String getSalesPersonName() {
        return SalesPersonName;
    }

    public void setSalesPersonName(String SalesPersonName) {
        this.SalesPersonName = SalesPersonName;
    }

    public int getSalespersonId() {
        return SalespersonId;
    }

    public void setSalespersonId(int SalespersonId) {
        this.SalespersonId = SalespersonId;
    }

    public String getSalesPersonaddress() {
        return SalesPersonaddress;
    }

    public void setSalesPersonaddress(String SalesPersonaddress) {
        this.SalesPersonaddress = SalesPersonaddress;
    }

    public String getSalesPersonemail() {
        return SalesPersonemail;
    }

    public void setSalesPersonemail(String SalesPersonemail) {
        this.SalesPersonemail = SalesPersonemail;
    }
    
}
