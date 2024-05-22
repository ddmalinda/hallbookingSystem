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
public class AdminConnection {

    public void addCusDetails(Customer customer) {
        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "insert into customer(idNo,phoneNo,address,email,name) values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, customer.getIdNo());            
            ps.setString(2, customer.getPhoneNo());
            ps.setString(3, customer.getAddrees());
            ps.setString(4, customer.getEmail());
            ps.setString(5, customer.getName());
            
            int rowC = ps.executeUpdate();
            
            if(rowC >0){
                //JOptionPane.showMessageDialog(null, "Signup successfully.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Signup unsuccessful.");
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
