/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7a_1;

/**
 *
 * @author andro
 */
public class Lab7a_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CruseShip cruseShip = new CruseShip("Titanic", "1989", 1000);
        CargoShip cargoShip = new CargoShip("Enigma", "1990", 19010);
        
        cruseShip.print();
        cargoShip.print();

        Ship ship = new CargoShip("Enigma", "1990", 19010);
        ship.print();
    }

}

class Ship {

    String name;
    String year;

    Ship(String name, String year) {
        this.name = name;
        this.year = year;
    }

    void setName(String name) {
        this.name = name;
    }

    void setYear(String year) {
        this.year = year;
    }

    String getName() {
        return name;
    }

    String getYear() {
        return year;
    }

    void print() {
        System.out.println("Name : " + name);
        System.out.println("Year : " + year);
    }

}

class CargoShip extends Ship {

    int cargoCapacity;

    CargoShip(String name, String year, int cargoCapacity) {
        super(name, year);
        this.cargoCapacity = cargoCapacity;
    }

    void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    void print() {
        System.out.println("Name : " + name);
        System.out.println("Cargo Capacity : " + cargoCapacity);
    }

}

class CruseShip extends Ship {

    int maxPassengers;

    CruseShip(String name, String year, int maxPassengers) {
        super(name, year);
        this.maxPassengers = maxPassengers;
    }

    void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    void print() {
        System.out.println("Name : " + name);
        System.out.println("Max Passengers : " + maxPassengers);
    }

}
