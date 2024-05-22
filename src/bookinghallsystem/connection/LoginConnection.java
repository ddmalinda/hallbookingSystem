/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookinghallsystem.connection;

import bookinghallsystem.modenClass.Login;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Dasith DM
 */
public class LoginConnection {

    public void addLoginDetails(Login login) {
        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "insert into login(userName,password) values(?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, login.getUsername());
            ps.setString(2, login.getPassword());
            
            int rowC = ps.executeUpdate();
            
            if(rowC >0){
               // JOptionPane.showMessageDialog(null, "Registration is SUCCESSEFUL!!!!!!!!");
            }
            else{
                JOptionPane.showMessageDialog(null, "PEALSE CHEK USERNAME AND PASSWORD");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
