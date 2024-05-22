/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookinghallsystem.modenClass;

/**
 *
 * @author Dasith DM
 */
public class Customer {
    private String name;
    private String phoneNo;
    private String idNo;
    private String addrees;
    private String email;
    private String titel;
    private Login login;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public void setAddrees(String addrees) {
        this.addrees = addrees;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
    

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getIdNo() {
        return idNo;
    }

    public String getAddrees() {
        return addrees;
    }

    public String getEmail() {
        return email;
    }

    public Login getLogin() {
        return login;
    }

    public String getTitel() {
        return titel;
    }
    
    
    public Customer(String name, String phoneNo, String idNo, String addrees, String email, String username,String password) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.idNo = idNo;
        this.addrees = addrees;
        this.email = email;
        this.login.setUsername(username);
        this.login.setPassword(password);
        
    }

    public Customer() {
    }
    
    
}
