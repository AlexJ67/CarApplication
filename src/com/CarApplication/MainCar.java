 package com.CarApplication;
 
 class MainCar {
public static void main(String[] arguments) {
        Car myCar = new Car("Lic1", "Mazda", "Blue");
        myCar.printCar();
        Car myOldCar = new Car("Lic2", "Mazda", "Red");
        myOldCar.printCar();
    }
}