/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seleksi;

/**
 * Michael Jonathan Setiawan
 * 58170468
 */

import java.util.Scanner;
public class LuasdanKelilingPersegiPanjang {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        double panjang, lebar;
        int pilih;
        double luas, keliling;
        
        System.out.println("Menghitung Luas dan Keliling Persegi Panjang");
        System.out.print("Masukkan panjang                  : ");
        panjang = input.nextDouble();
        System.out.print("Masukkan lebar                    : ");
        lebar = input.nextDouble();
        
        System.out.println("");
        
        System.out.println("Pilihan: ");
        System.out.println("1. Luas Persegi Panjang");
        System.out.println("2. Keliling Persegi Panjang");
        
        System.out.println("");
        
        System.out.print("Masukkan pilihan                  : ");
        pilih = input.nextInt();
        
        switch (pilih) {
            case 1:
                luas = panjang * lebar;
                System.out.print("Luas Persegi Panjang              : " + luas);
                break;
            case 2:
                keliling = 2 * (panjang + lebar);
                System.out.println("Keliling Persegi Panjang        : " + keliling);
                break;
            default:
                System.out.println("Angka yang anda masukkan salah!");
        }
    }
}
