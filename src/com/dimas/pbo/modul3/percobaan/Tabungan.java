package com.dimas.pbo.modul3.percobaan;
public class Tabungan {
    
    public int saldo;
    
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public void ambilUang(int jumlah){
        saldo -= jumlah;
        
    }
}
