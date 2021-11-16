package com.dimas.pbo.modul7.latihan;
public class Car extends Vehicle{

    public Car() {
    }

    public Car(String name) {
        super(name);
    }
    
    public void onActivate(){
        System.out.println(this.getName() + " engine's has been started!");
    }
    
    public void onDeactivate(){
        System.out.println(this.getName() + " engine's has been stopped!");
    }
    
}
