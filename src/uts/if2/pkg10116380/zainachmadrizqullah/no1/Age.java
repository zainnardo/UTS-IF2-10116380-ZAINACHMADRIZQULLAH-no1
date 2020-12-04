/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10116380.zainachmadrizqullah.no1;

/**
*NAMA   : ZAIN ACHMAD RIZQULLAH
*KELAS  : PBO2
*NIM    : 10116380
*Deskripsi Program : UNTUK MENENTUKAN TANDA SESEORANG
 */
public class Age {
     private int yearBirth;
    private int yearNow;
    private final String red = "\u001B[31m";

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int hitungUmur() {
        return yearNow - yearBirth;
    }

    public String tandanyaKamu(int umur) {

        if (umur >= 0 && umur <= 5) {
            System.out.println("Tandanya kamu " + red + "LAGI LUCU - LUCUNYA");
        } else if (umur > 5 && umur <= 10) {
            System.out.println("Tandanya kamu " + red + "MASIH ANAK - ANAK");
        } else if (umur > 10 && umur <= 13) {
            System.out.println("Tandanya kamu " + red + "MASIH REMADJA");
        } else if (umur > 13 && umur <= 19) {
            System.out.println("Tandanya kamu " + red + "ALAY");
        } else if (umur > 19 && umur <= 29) {
            System.out.println("Tandanya kamu " + red + "LAGI GALAU NYARI JODOH");
        } else if (umur > 29 && umur <= 35) {
            System.out.println("Tandanya kamu " + red + "LAGI SIBUK NYARI UANG");
        } else if (umur > 35 && umur <= 150) {
            System.out.println("Tandanya kamu " + red + "SUDAH TUA");
        } else if (umur < 0 || umur > 150) {
            System.out.println("Tandanya kamu " + red + "TIDAK TERDETEKSI "
                    + "diKehidupan");
        }
        return red;
    }

    
}
