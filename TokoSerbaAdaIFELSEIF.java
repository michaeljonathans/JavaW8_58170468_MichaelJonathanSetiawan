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
public class TokoSerbaAdaIFELSEIF {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        String nama;
        int harga, jumlah, uang;
        double diskon = 0;
        int subtotal, totalbayar, totalkembalian;
        
        System.out.println("               TOKO SERBA ADA               ");
        System.out.println("Jl. Bantar Gebang No. 23, Bekasi, Jawa Barat");
        System.out.println("--------------------------------------------");
        
        System.out.print("Nama barang       : ");
        nama = input.nextLine();
        System.out.print("Harga barang      : ");
        harga = input.nextInt();
        System.out.print("Jumlah beli       : ");
        jumlah = input.nextInt();
        
        System.out.println("-------------------------------------------");
        
        subtotal = harga * jumlah;
        System.out.println("Sub total         : " + subtotal);
        
        if(subtotal > 500000) {
            diskon = (int) subtotal * 0.1;
        } else if (subtotal >= 300000) {
            diskon = (int) subtotal * 0.06;
        } else if (subtotal >= 150000) {
            diskon = (int) subtotal * 0.03;
        } else if (subtotal >= 100000) {
            diskon = (int) subtotal *0.01;
        } else {
            diskon = 0;
        }
        
        System.out.println("Diskon            : " + diskon);
        
        System.out.println("-------------------------------------------");
        
        totalbayar = (int) (subtotal - diskon);
        System.out.println("Total bayar       : " + totalbayar);
        System.out.print("Uang bayar        : ");
        uang = input.nextInt();
        
        System.out.println("-------------------------------------------");
        totalkembalian = uang - totalbayar;
        System.out.println("Uang kembali      : " + totalkembalian);
    }
}
