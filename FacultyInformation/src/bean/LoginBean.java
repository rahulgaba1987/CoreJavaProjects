/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;


/**
 *
 * @author admin
 */
public class LoginBean {
    static String Username,Password;

    public static String getUsername() {
        return Username;
    }

    public static void setUsername(String Username) {
        LoginBean.Username = Username;
    }

    public static String getPassword() {
        return Password;
    }

    public static void setPassword(String Password) {
        LoginBean.Password = Password;
    }
    
    
}
