package com.dimas.pbo.modul5.percobaan.sekolah;
public class Kelas {
    private int kodekelas; 
    private String namakelas; 
    private Mahasiswa mahasiswa;
    
    public Kelas(int kode, String nama){
        this.kodekelas=kode;
        this.namakelas=nama;
    }
     
    public void setMhs (Mahasiswa mhs) {
        this.mahasiswa=mhs;
    }
    
    public int getKodeKelas(){
        return this.kodekelas;
    }
    
    public String getNamaKelas(){
        return this.namakelas;
    }
    
    public Mahasiswa getMahasiswa(){
        return this.mahasiswa;
    }

}
