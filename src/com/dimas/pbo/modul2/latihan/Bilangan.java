package com.dimas.pbo.modul2.latihan;

import java.util.Scanner;

public class Bilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int kasus,hasil,a,b,c;
        
        System.out.print("Berapa kasus yang ingin dihitung : ");
        kasus = input.nextInt();
        
        for (int i=1; i<=kasus; i++){
            System.out.print("Masukkan nilai A"+i+" : ");
            a = input.nextInt();
            System.out.print("Masukkan nilai B"+i+" : ");
            b = input.nextInt();
            System.out.print("Masukkan nilai C"+i+" : ");
            c = input.nextInt();
            hasil= a+b-c;
            System.out.println("Hasil dari A"+i+"+B"+i+"-C"+i+" adalah : "+hasil);
            System.out.println("");
            
        }
    }
}
