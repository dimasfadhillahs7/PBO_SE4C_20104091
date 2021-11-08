package com.dimas.pbo.modul5.percobaan.sekolah;
public class Mahasiswa {
    private int nrp;
    private String nama;
    
    public Mahasiswa(int nrp, String nama) {
        this.nrp=nrp;
        this.nama=nama;
    }    
    public int getNrp(){
        return this.nrp;
    }
    
    public String getNama(){
        return this.nama;
    }

}
