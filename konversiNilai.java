/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class konversiNilai {
    public static void main(String[] args) {
        String nim, nama, prodi, matkul;
        int nilai;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan NIM = ");
        nim = masukan.nextLine();
        System.out.print("Masukan Nama = ");
        nama = masukan.nextLine();
        System.out.println("Matakuliah = ");
        matkul = masukan.nextLine();
        System.out.println("Masukan Nilai Angka = ");
        nilai = masukan.nextInt();
        System.out.println("=====Hasil Pengolahan Data=====");
        //====mengambil Jurusan dari NIM
        prodi = nim.substring(3,5);
        System.out.println("Program Studi");
        switch (prodi) {
            case "52":
            System.out.println("Program Studi = S-1 Teknologi Informasi");
            break;
            case "51":
            System.out.println("Program Studi = S-1 Sistem Informasi");
            break;
            case "39":
            System.out.println("Program Studi = D3 Sistem Informasi");
            break;
            default:
            System.out.println("Program Studi Tidak Ditemukan");
            break;       
        }
//        if (prodi.equals("52")) {
//            System.out.println("Program Studi = S-1 Teknologi Informasi");
//        }else if (prodi.equals("51")){
//            System.out.println("Program Studi = S-1 Sistem Informasi");
//        }else if (prodi.equals("39")) {
//            System.out.println("Program Studi = D3 Sistem Informasi");
//        }else {
//            System.out.println("Program Studi Tidak Ditemukan");
//        }
   
    }
}
