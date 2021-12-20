/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dimas.pbo.modul9.percobaan;

/**
 *
 * @author ASUS
 */
public class Percobaan3 {
    public static void main(String[] args) {
        int c = 10;
        int[] d = new int[5];
        
        try {
            System.out.println(c/10);
            System.out.println(d[10]);
        }
        
        catch(ArithmeticException e){
            System.out.println("Terjadi kesalahan aritmatika!");
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Indeks array melebihi batas maksimal!");
        }
        
        catch(Exception e){
            System.out.println("terjadi sebuah error!");
        }
    }
}
