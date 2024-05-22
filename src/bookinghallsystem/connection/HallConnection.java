/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookinghallsystem.connection;

import bookinghallsystem.modenClass.Hall;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Dasith DM
 */
public class HallConnection {

    public void addHallDetails(Hall hall) {
        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "insert into hall(hallNo, pricePeyDay, capacities, hallName, isAvalibility) values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, hall.getHallNo());            
            ps.setDouble(2,hall.getPricePeyDay() );
            ps.setInt(3, hall.getCapacities());
            ps.setString(4, hall.getHallName());
            ps.setBoolean(5, hall.isIsAvalibilty());
            
            int rowC = ps.executeUpdate();
            
            if(rowC >0){
                JOptionPane.showMessageDialog(null, "Add successful ");
            }
            else{
                JOptionPane.showMessageDialog(null, "Add unsuccessful.");
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
