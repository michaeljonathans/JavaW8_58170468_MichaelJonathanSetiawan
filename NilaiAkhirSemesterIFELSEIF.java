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
public class NilaiAkhirSemesterIFELSEIF {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama;
        double absensi, tugas, uts, uas, khs;
        double hasilabsensi, hasiltugas, hasiluts, hasiluas;
        char grade;
        
        System.out.println("Institut Binis dan Informatika Kwik Kian Gie");
        System.out.println("             Nilai Akhir Semester           ");
        System.out.println("--------------------------------------------");
        System.out.println("        Jurusan: Teknik Informatika         ");
        
        System.out.print("Nama Mahasiswa    : ");
        nama = input.nextLine();
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
        
        if(khs >= 80) {
            grade = 'A';
        } else if (khs >= 66) {
            grade = 'B';
        } else if (khs >= 56) {
            grade = 'C';
        } else if (khs >= 46) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        
        System.out.println("Grade             : " + grade);
    }
}
