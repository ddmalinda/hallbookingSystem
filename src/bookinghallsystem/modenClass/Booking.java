/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookinghallsystem.modenClass;

/**
 *
 * @author Dasith DM
 */
public abstract class Booking {
    private Hall hall;
    private int bookingSheetNo;
    private Customer customer;

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public void setBookingSheetNo(int bookingSheetNo) {
        this.bookingSheetNo = bookingSheetNo;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Hall getHall() {
        return hall;
    }

    public int getBookingSheetNo() {
        return bookingSheetNo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Booking(Hall hall, int bookingSheetNo, Customer customer) {
        this.hall = hall;
        this.bookingSheetNo = bookingSheetNo;
        this.customer = customer;
    }

    public Booking() {
    }
    
protected abstract double calPayment();
    
}
