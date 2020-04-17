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
public class MenentukanJumlahHari {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        int tahun, bulan;
        
        System.out.print("Masukkan tahun    : ");
        tahun = input.nextInt();
        System.out.print("Masukkan bulan    : ");
        bulan = input.nextInt();
        
        switch(bulan){
            case 1:
                System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 31 hari"); 
                break;
            case 2:
                if(((tahun % 4 == 0) && (tahun % 100 != 0)) || (tahun % 400 == 0)){
                    System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 29 hari");
                } else {
                    System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 28 hari");
                }
            case 3:
                System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 31 hari"); 
                break;
            case 4:
                System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 30 hari"); 
                break;
            case 5:
                System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 31 hari"); 
                break;
            case 6:
                System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 30 hari"); 
                break;
            case 7:
                System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 31 hari"); 
                break;
            case 8:
                System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 31 hari"); 
                break;
            case 9:
                System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 30 hari"); 
                break;
            case 10:
                System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 31 hari"); 
                break;
            case 11:
                System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 30 hari"); 
                break;
            case 12:
                System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 31 hari"); 
                break;
            default:
                System.out.println("Jumlah bulan hanya ada 12 dalam setahun!");
        }
    }
}
