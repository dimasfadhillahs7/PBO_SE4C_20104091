/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dimas.pbo.modul9.percobaan;
public class Percobaan2 {
    public static void main(String[] args) {
        int b = 10;
        
        try {
            System.out.println(b/0);
        }
        
        catch(ArithmeticException e){
            System.out.println("Error: Tidak bisa membagi bilangan dengan angka 0!");
        }
    }
}
