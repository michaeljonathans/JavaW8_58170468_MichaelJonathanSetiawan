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
public class PeryataanIFELSEIF {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        int skorUjian; 
        char grade;
        
        System.out.print("Nilai Ujian   : ");
        skorUjian = input.nextInt();
        
        if (skorUjian >= 90) {
            grade = 'A';
        } else if (skorUjian >= 80) {
            grade = 'B';
        } else if (skorUjian >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        
        System.out.print("Nilai         : " + grade);
    }
}
