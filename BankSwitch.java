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
public class BankSwitch {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        int pilih, saldoawal = 100000;
        int ceksaldo, setoruang, saldoanda, tarikuang, sisasaldo;
        
        System.out.println("Menu ATM");
        System.out.println("1. Cek saldo");
        System.out.println("2. Setor uang");
        System.out.println("3. Tarik uang");
        
        System.out.println("");
        
        System.out.print("Pilih menu            : ");
        pilih = input.nextInt();
        
        System.out.println("");
        
        switch (pilih) {
            case 1:
                ceksaldo = saldoawal;
                System.out.println("Saldo anda             : " + ceksaldo);
                break;
            case 2:
                System.out.print("Jumlah uang anda yang akan disetor: ");
                setoruang = input.nextInt();
                
                saldoanda = saldoawal + setoruang;
                System.out.println("Saldo anda            : " + saldoanda);
                break;
            case 3:
                System.out.print("Tarik uang sebesar    : ");
                tarikuang = input.nextInt();
                
                if (saldoawal < tarikuang) {
                    System.out.println("Maaf, saldo anda tidak mencukupi");
                } else {
                    sisasaldo = saldoawal - tarikuang;
                    System.out.println("Sisa saldo anda    : " + sisasaldo);
                }
                break;
            default:
                System.out.println("Angka yang anda masukkan salah!");
        }
    }
}
