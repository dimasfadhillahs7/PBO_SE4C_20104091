/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dimas.pbo.modul3.percobaan;

/**
 *
 * @author ASUS
 */
public class TesTabungan {
    
    public static void main(String args[]) {
        Tabungan t=new Tabungan(5000); 
        System.out.println("Saldo awal Tabungan Anda : "+t.saldo);
        t.ambilUang(1500);
        System.out.println("Jumlah uang yang diambil : 1500");
        System.out.println("Saldo Tabungan Anda sekarang adalah: " + t.saldo);
    }
}
