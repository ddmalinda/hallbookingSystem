/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookinghallsystem.connection;


import java.sql.*;


/**
 *
 * @author Dasith DM
 */
public class DatabaseConnection {
   public static Connection con=null;
   //private static Connection connection; 
    public static Connection getConnection(){
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hallbookingsystem","root","");
       } catch (Exception ex) {
           ex.printStackTrace();
       }
       return  con;
    }
    
}
