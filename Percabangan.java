/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class Percabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//      int angka =3;
      Scanner masukan = new Scanner(System.in);
        System.out.println("Masukan Angka");
      int angka = masukan.nextInt();
      if (angka%2==0){
          System.out.println("Angka "+ angka + "adalah");
          System.out.println("Bilangan Genap");
      } else {
          System.out.println("Angka "+ angka + "adalah");
          System.out.println("Bilangan Ganjil");
      }
  String hasil;
    hasil = angka%2==0? "Bolangan Genap":"Bilangan Ganjil";
        System.out.println("hasil");
    }
  
    
}
