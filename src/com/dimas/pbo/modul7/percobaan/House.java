package com.dimas.pbo.modul7.percobaan;
public class House {
    public static void main(String[] args) {
        
        TV tv = new TV("TV");
        AC ac = new AC("AC");
        Electronics lamp = new Electronics("Lamp");
        Electronics device = new Electronics();
        System.out.println("");

        tv.activate();
        ac.activate();
        lamp.activate();
        device.activate();
        System.out.println("");

        device.deactivate();
        lamp.deactivate();
        ac.deactivate();
        tv.deactivate();
       
    }
}