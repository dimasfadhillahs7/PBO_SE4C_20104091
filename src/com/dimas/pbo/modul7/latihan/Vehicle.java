package com.dimas.pbo.modul7.latihan;
public class Vehicle {
    private String name;
    private boolean isOn = false;
    
    public Vehicle() {
        this.name = "A Vehicle";
        System.out.println(this.name + " has been bought");
    }

    public Vehicle(String name) {
        this.name = name;
        System.out.println(this.name + " has been bought");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void activate() {
        this.isOn = true;
        System.out.println(this.getName() + ", start the engine!");
        this.onActivate();
    }
    
    public void deactivate() {
        this.isOn = false;
        System.out.println(this.getName() + ", stop the engine!");
        this.onDeactivate();
    }
    
    public void onActivate(){}
    public void onDeactivate(){}
    
    
    
    
}

