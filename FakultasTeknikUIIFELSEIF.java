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
public class FakultasTeknikUIIFELSEIF {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        
        String x, nama;
        int nim, kodejurusan;
        double absensi, tugas, uts, uas, khs;
        double hasilabsensi, hasiltugas, hasiluts, hasiluas;
        char grade;
        
        System.out.println("            Universitas Indonesia           ");
        System.out.println("               Fakultas Teknik              ");
        System.out.println("--------------------------------------------");
        
        System.out.print("NIM               : ");
        nim = input.nextInt();
        x = input.nextLine();
        System.out.print("Nama Mahasiswa    : ");
        nama = input.nextLine();
        System.out.print("Kode Jurusan      : ");
        kodejurusan = input.nextInt();
        
        if (kodejurusan == 1) {
            System.out.println("Nama Jurusan      : Teknik Mesin");
        } else if (kodejurusan == 2) {
            System.out.println("Nama Jurusan      : Teknik Sipil");
        } else if (kodejurusan == 3) {
            System.out.println("Nama Jurusan      : Teknik Elektro");
        } else if (kodejurusan == 4) {
            System.out.println("Nama Jurusan      : Teknik Industri");
        } else {
            System.out.println("Angka yang anda masukkan salah!");
        }
        
        System.out.print("Nilai Absensi     : ");
        absensi = input.nextDouble();
        hasilabsensi = 0.2 * absensi;
        System.out.print("Nilai Tugas       : ");
        tugas = input.nextDouble();
        hasiltugas = 0.25 * tugas;
        System.out.print("Nilai UTS         : ");
        uts = input.nextDouble();
        hasiluts = 0.25 * uts;
        System.out.print("Nilai UAS         : ");
        uas = input.nextDouble();
        hasiluas = 0.3 * uas;
        
        System.out.println("--------------------------------------------");
        khs = hasilabsensi + hasiltugas + hasiluts + hasiluas;
        System.out.println("Nilai KHS         : " + khs);
        
        if(khs >= 60)
        {
            System.out.println("Keterangan  : lulus");
        } else {
            System.out.println("Keterangan  : tidak lulus");
        }
    }
}
