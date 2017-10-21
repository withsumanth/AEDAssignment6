/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author JAI JINENDRA
 */
public class configureABusiness {

    public SupplierDirectory sd;
    public SalesPersonDirectory spd;
    public Supplier s;
    

    public void configureABusiness(SupplierDirectory sd, SalesPersonDirectory spd) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        this.sd = sd;
        this.spd = spd;

        String password = null;
        s = sd.addSupplier();
        s.setPersonId(sd.supplierId());
        
        
    }

}
