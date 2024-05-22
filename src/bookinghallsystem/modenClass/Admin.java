/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookinghallsystem.modenClass;

import java.awt.Component;

/**
 *
 * @author Dasith DM
 */
public class Admin {
    private Login login;
   

    public Admin() {
        this.login.setPassword("admin"); 
        this.login.setUsername("admin");
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
    
    
   
    
   
 
}
