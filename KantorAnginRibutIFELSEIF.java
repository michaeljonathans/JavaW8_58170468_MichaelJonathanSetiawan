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
public class KantorAnginRibutIFELSEIF {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        String nama;
        int golongan, tahunkerja;
        int gajipokok, masakerja, bonuskaryawan, gajikaryawan;
        
        System.out.println("               PT. Angin Ribut               ");
        System.out.println("      Jl. Sulawesi No. 29, Jakarta Utara     ");
        System.out.println("---------------------------------------------");
        
        System.out.print("Masukkan nama karyawan                : ");
        nama = input.nextLine();
        System.out.print("Masukkan golongan karyawan [1/2/3/4]  : ");
        golongan = input.nextInt();
        System.out.print("Masukkan tahun kerja karyawan         : ");
        tahunkerja = input.nextInt();
        
        if (golongan == 1) {
            gajipokok = 1500000;
        } else if (golongan == 2) {
            gajipokok = 1200000;
        } else if (golongan == 3) {
            gajipokok = 1000000;
        } else if (golongan == 4) {
            gajipokok = 700000;
        } else {
            gajipokok = 0;
        }
        
        masakerja = 2020 - tahunkerja;
        
        if (masakerja >= 5) {
            bonuskaryawan = 800000;
        } else {
            bonuskaryawan = 0;
        }
        
        gajikaryawan = golongan + bonuskaryawan;
        
        System.out.println("");
        
        System.out.println("Laporan Gaji Karyawan");
        System.out.println("Golongan karyawan                     : " + golongan);
        System.out.println("Gaji pokok karyawan                   : " + gajipokok);
        System.out.println("Tahun masuk karyawan                  : " + tahunkerja);
        System.out.println("Masa kerja karyawan                   : " + masakerja);
        System.out.println("Bonus karyawan                        : " + bonuskaryawan);
        System.out.println("Gaji karyawan                         : " + gajikaryawan);  
    }
}
