/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookinghallsystem.modenClass;

import java.time.LocalDate;

/**
 *
 * @author Dasith DM
 */
public class OneDay extends Booking {
    private LocalDate theDay;

    public void setTheDay(LocalDate theDay) {
        this.theDay = theDay;
    }

    public LocalDate getTheDay() {
        return theDay;
    }

    public OneDay(LocalDate theDay, Hall hall, int bookingSheetNo, Customer customer) {
        super(hall, bookingSheetNo, customer);
        this.theDay = theDay;
    }

    public OneDay() {
        
    }
    

    @Override
    protected double calPayment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
