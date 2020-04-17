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
public class JurusanPilihanMahasiswa {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        int nim;
        String x, nama;
        int pilih;
        
        System.out.print("NIM               : ");
        nim = input.nextInt();
        x = input.nextLine();
        System.out.print("Nama Mahasiswa    : ");
        nama = input.nextLine();
        
        System.out.println("");
        
        System.out.println("Pilihan Jurusan: ");
        System.out.println("1. Sistem Informasi");
        System.out.println("2. Teknik Industri");
        System.out.println("3. Teknik Informatika");
        
        System.out.println("");
        
        System.out.print("Masukkan pilihan  : ");
        pilih = input.nextInt();
        
        System.out.println("");
        
        switch (pilih) {
            case 1:
                System.out.println(nama + " dengan NIM " + nim + " memilih jurusan Sistem Informasi");
                break;
            case 2:
                System.out.println(nama + " dengan NIM " + nim + " memilih jurusan Teknik Industri");
                break;
            case 3:
                System.out.println(nama + " dengan NIM " + nim + " memilih jurusan Teknik Informatika");
                break;
            default:
                System.out.println("Angka yang anda masukkan salah!");
        }
    }
}
