 package com.CarApplication;

 /**
 * Car Application
 * Car.java
 * Purpose: Maintain car information for the city.
 *
 * @author Alex Judkowicz
 * @version 1.0 09-Jan-2016
 */
   public class Car {
    private String licensePlate = "";
    private String Maker = "";
    private String Color = "";
    
 /**
 * Populate a Car object with the received parameters.
 *
 * @param licensePlate string that represents the car license plate
 * @param Maker string that represents the car maker
 * @param Color string that represents the car color
 */
    public Car (String licensePlate, String Maker, String Color) {
        this.setLicensePlate(licensePlate);
        this.setMaker(Maker);
        this.setColor(Color);
    }
/**
 * Set the car license plate property value
 *
 * @param licensePlate string that represents the car license plate
  */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
/**
 * Set the car maker property
 *
 * @param Maker string that represents the car maker property value
  */    
    public void setMaker(String Maker) {
        this.Maker = Maker;
    }
/**
 * Set the car color property
 *
 * @param Color string that represents the color maker property value
  */        
    public void setColor(String Color) {
        this.Color = Color;
    }
 /**
 * Get the car license plate property
 *
  * @return the car license plate property
 */        
    public String getLicensePlate() {
        return this.licensePlate;
    }
/**
 * Get the car color property
 *
  * @return the car color property
 */            
    public String getColor() {
        return this.Color;
    }
/**
 * Get the car maker property
 *
  * @return the car maker property
 */            
    public String getMaker() {
        return this.Maker;
    }
        
 /**
 * Print on the console the car properties
 *
 */            
    public void printCar() {
        System.out.println("LicensePlate: " + this.getLicensePlate()); 
        System.out.println("Maker: " + this.getMaker()); 
        System.out.println("Color: " + this.getColor()); 
    }
}