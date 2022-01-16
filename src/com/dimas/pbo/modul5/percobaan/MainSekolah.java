package com.dimas.pbo.modul5.percobaan;
import com.dimas.pbo.modul5.percobaan.sekolah.*;
public class MainSekolah {
    public static void main(String[] args) {
        Kelas kelas = new Kelas (1001,"Kalkulus");
        kelas.setMhs(new Mahasiswa (9001,"Arpani"));

        
        System.out.println("Kode dan nama Kelas\t: "+kelas.getKodeKelas()+" "+ kelas.getNamaKelas());
        System.out.println("Nrp dan nama Mahasiswa\t: "+kelas.getMahasiswa().getNrp()+" "+kelas.getMahasiswa().getNama());
        
    }
}
