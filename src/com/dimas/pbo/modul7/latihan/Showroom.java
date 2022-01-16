package com.dimas.pbo.modul7.latihan;
public class Showroom {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle truck = new Vehicle("Truck");
        Car avanza = new Car("Avanza");
        Motorcycle supra = new Motorcycle ("Supra");
        System.out.println("");
        
        vehicle.activate();
        truck.activate();
        avanza.activate();
        supra.activate();
        System.out.println("");
        
        vehicle.deactivate();
        truck.deactivate();
        avanza.deactivate();
        supra.deactivate();
    }

    
}
