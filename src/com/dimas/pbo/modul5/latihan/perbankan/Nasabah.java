package com.dimas.pbo.modul5.latihan.perbankan;
public class Nasabah {
    private String namaAwal, namaAkhir;
    private Tabungan tabungan;
    
    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }
    
    public String getNamaAwal(){
        return this.namaAwal;
    }
    
    public String getNamaAkhir(){
        return this.namaAkhir;
    }
    
    public Tabungan getTabungan(){
        return this.tabungan;
    }
    
    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
    
}
