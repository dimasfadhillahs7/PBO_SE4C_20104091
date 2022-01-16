package com.dimas.pbo.modul2.latihan;
public class AnakAyam {
    public static void main(String[] args) {
        int anakAyam=10;
        
        while (anakAyam!=0){
            System.out.println("");
            System.out.println("Anak ayam turun "+anakAyam);
            anakAyam--;
            if (anakAyam==0){
                System.out.println("Mati 1 tinggal Induknya");
            }
            else{
            System.out.println("Mati 1 tinggal "+ anakAyam);        
            }
        }
    }
}
