/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIFIX.Model;

/**
 *
 * @author Irfani Yusuf
 */
public class Akun {
    private String username ; 
    private String password ; 

    public Akun(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Akun() {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
