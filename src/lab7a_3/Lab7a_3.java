/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7a_3;

/**
 *
 * @author andro
 */
public class Lab7a_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Car car = new Car("Ford", 4);
        SportsCar sportsCar = new SportsCar("Lamborghini", 12);

        System.out.println("Car Manufacturer Name : " + car.manufacturerName);
        System.out.println("Car cylinderNumber : " + car.cylinderNumber);

        System.out.println("Sports Car Manufacturer Name : " + sportsCar.manufacturerName);
        System.out.println("Sports Car cylinderNumber : " + sportsCar.cylinderNumber);

    }

}

class Vehicle {

    String manufacturerName;
    int cylinderNumber;

    Vehicle(String manufacturerName, int cylinderNumber) {
        this.manufacturerName = manufacturerName;
        this.cylinderNumber = cylinderNumber;
    }

    void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    void setCyclinderNumber(int cylinderNumber) {
        this.cylinderNumber = cylinderNumber;
    }

    String getManufacturerName() {
        return manufacturerName;
    }

    int getCylinderNumber() {
        return cylinderNumber;
    }
}

class Truck extends Vehicle {

    private double loadCapacity;
    private int towingCapacity;

    Truck(String manufacturerName, int cylinderNumber, double loadCapacity, int towingCapacity) {
        super(manufacturerName, cylinderNumber);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }

    void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    double getLoadCapacity() {
        return loadCapacity;
    }

    double getTowingCapacity() {
        return towingCapacity;
    }
}

class Car extends Vehicle {

    Car(String manufacturerName, int cylinderNumber) {
        super(manufacturerName, cylinderNumber);
    }

}

class SportsCar extends Car {

    SportsCar(String manufacturerName, int cylinderNumber) {
        super(manufacturerName, cylinderNumber);
    }

}
