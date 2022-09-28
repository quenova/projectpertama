/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_pertama;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class project_pertama {
    public static void main(String[] args) {
        
    String nik, nama, tmplahir, tglahir, alamat;
        int usia;
        String jkel;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nik = ");
        nik = in.nextLine();
        System.out.print("Masukkan nama = ");
        nama = in.nextLine();
        System.out.print("Masukkan tempat lahir = ");
        tmplahir = in.nextLine ();
        System.out.print("Masukkan tanggal lahir = ");
        tglahir = in.nextLine ();
        System.out.print("Masukkan alamat = ");
        alamat = in.nextLine();
        System.out.print("Masukkan usia = ");
        usia = in.nextInt();
        System.out.print("Masukkan jenis kelamin [L/P] = ");
        jkel = in.next(); 
        System.out.println(" Identitas pribadi kamu = ");
        System.out.println("==========================");
        System.out.println("NIK = " +nik);
        System.out.println("Nama = " +nama);
        System.out.println("Tempat, Tanggal lahir = " +tmplahir + " "+tglahir);
        System.out.println("Alamat = " +alamat);
        System.out.println("Usia = " +usia);
        System.out.println("Jenis kelamin = " +jkel);
//        String nama = "nova";
//                int usia = 18;
//                String nik ="357097845";
//        String tmplahir = "malang",tglahir = "18-11-2004";
//                char jkel = 'p';
//                final double bb = 59.05;
//        System.out.println("Identitas Pribadi");
//        System.out.println("=================");
//        System.out.println("Nomor Induk Kependudukan = " + nik);
//        System.out.println("Nama : " + nama);
//        System.out.format("Tempat, Tanggal lahir : %s %s %n ",tmplahir,tglahir);
//        System.out.println("Jkelku : " + jkel);
//        System.out.println("Berat badan = " + bb);
        
    }
}
