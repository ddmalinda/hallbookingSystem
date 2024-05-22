/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookinghallsystem.modenClass;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author Dasith DM
 */
public class Payment {
private Booking booking;
private int invoiceNo;
private LocalDate paymentDay;
private LocalTime paymentTime;

    public Booking getBooking() {
        return booking;
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public LocalDate getPaymentDay() {
        return paymentDay;
    }

    public LocalTime getPaymentTime() {
        return paymentTime;
    }


public void calAdvance(){
    
}    
}
