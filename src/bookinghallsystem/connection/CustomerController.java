/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookinghallsystem.connection;

import bookinghallsystem.modenClass.Customer;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Dasith DM
 */
public class CustomerController {

    public void addCusDetails(Customer customer) {
        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "insert into customer(idNo,phoneNo,address,email,name,titel) values(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, customer.getIdNo());            
            ps.setString(2, customer.getPhoneNo());
            ps.setString(3, customer.getAddrees());
            ps.setString(4, customer.getEmail());
            ps.setString(5, customer.getName());
            ps.setString(6, customer.getTitel());
            
            int rowC = ps.executeUpdate();
            
            if(rowC >0){
                JOptionPane.showMessageDialog(null, "Registration is SUCCESSEFUL!!!!!!!!");
            }
            else{
                JOptionPane.showMessageDialog(null, "REGISTATION IS FAILD!! PLEASE try again..!!!!");
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
