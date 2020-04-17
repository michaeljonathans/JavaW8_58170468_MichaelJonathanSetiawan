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
public class PerusahaanIFELSEIF {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        int penjualan;
        int uangjasa, totaluang;
        double uangkomisi;
        
        System.out.print("Masukan pendapatan sales  : Rp");
        penjualan = input.nextInt();
        
        System.out.println("");
        
        if (penjualan < 200000) {
            uangjasa = 10000;
            System.out.println("Uang jasa                 : Rp" + uangjasa);
            uangkomisi = 0.1 * (int) penjualan;
            System.out.println("Uang komisi               : Rp" + uangkomisi);
        } else if (penjualan <= 500000) {
            uangjasa = 20000;
            System.out.println("Uang jasa                 : Rp" + uangjasa);
            uangkomisi = 0.15 * (int) penjualan;
            System.out.println("Uang komisi               : Rp" + uangkomisi);
        } else {
            uangjasa = 30000;
            System.out.println("Uang jasa                 : Rp" + uangjasa);
            uangkomisi = 0.2 * (int) penjualan;
            System.out.println("Uang komisi               : Rp" + uangkomisi);
        }
        
        totaluang = uangjasa + (int) uangkomisi;
        System.out.println("Total uang salesman       : Rp" + totaluang);
    }
}
