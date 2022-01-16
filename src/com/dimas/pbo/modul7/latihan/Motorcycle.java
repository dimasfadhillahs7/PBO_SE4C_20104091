package com.dimas.pbo.modul7.latihan;
public class Motorcycle extends Vehicle{

    public Motorcycle() {
    }

    public Motorcycle(String name) {
        super(name);
    }
    
        public void onActivate(){
        System.out.println(this.getName() + " engine's has been started!");
    }
    
    public void onDeactivate(){
        System.out.println(this.getName() + " engine's has been stopped!");
    }

    
}
