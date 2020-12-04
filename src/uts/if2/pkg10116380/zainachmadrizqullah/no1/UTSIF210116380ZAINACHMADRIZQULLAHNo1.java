/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10116380.zainachmadrizqullah.no1;

import java.util.Scanner;

/**
*NAMA   : ZAIN ACHMAD RIZQULLAH
*KELAS  : PBO2
*NIM    : 10116380
*Deskripsi Program : UNTUK MENENTUKAN TANDA SESEORANG
 */
public class UTSIF210116380ZAINACHMADRIZQULLAHNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        Age mal1 = new Age(2018);
        System.out.print("Masukkan Tahun Lahir : ");
        mal1.setYearBirth(baca.nextInt());
        System.out.println("");
        System.out.println("===Hasil Perhitungan Umur===");
        System.out.println("Tahun Lahir Anda : " + mal1.getYearBirth());
        System.out.println("Hari ini Tahun : " + mal1.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah : " + mal1.hitungUmur() + " Tahun");
        mal1.tandanyaKamu(mal1.hitungUmur());
        
    
    }
    
}
