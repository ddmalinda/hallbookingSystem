/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookinghallsystem.modenClass;

/**
 *
 * @author Dasith DM
 */
public class Hall {
    private int capacities;
    private double pricePeyDay;
    private boolean isAvalibilty;
    private int hallNo;
    private String hallName;

    public void setCapacities(int capacities) {
        this.capacities = capacities;
    }

    public void setPricePeyDay(double pricePeyDay) {
        this.pricePeyDay = pricePeyDay;
    }

    public void setIsAvalibilty(boolean isAvalibilty) {
        this.isAvalibilty = isAvalibilty;
    }
    
    public void setHallNo(int hallNo) {
        this.hallNo = hallNo;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }
    

    public int getCapacities() {
        return capacities;
    }

    public double getPricePeyDay() {
        return pricePeyDay;
    }

    public String getHallName() {
        return hallName;
    }
    

    public boolean isIsAvalibilty() {
        return isAvalibilty;
    }

    public int getHallNo() {
        return hallNo;
    }

    public Hall(int capacities, double pricePeyDay, boolean isAvalibilty, int hallNo, String hallName) {
        this.capacities = capacities;
        this.pricePeyDay = pricePeyDay;
        this.isAvalibilty = isAvalibilty;
        this.hallNo = hallNo;
        this.hallName = hallName;
    }

   

    public Hall() {
    }
    
    
}
