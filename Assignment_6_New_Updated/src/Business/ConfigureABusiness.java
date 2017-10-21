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
public class ConfigureABusiness {

    public static Business business;

    public static Business CreateAdminUser() {
        business = new Business();
        AdminLogin admin = business.getAdminLoginDirectory().addAdmin();
        admin.setAdminUserName("john");
        admin.setAccountStatus("Active");
        admin.setAdminPassword(business.getPassEncryption().encrypt("1"));
        return business;
    }
}
