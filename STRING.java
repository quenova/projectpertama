/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembanding;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class STRING {

   
     public static void main(String[] args) {
   
         String huruf, hasil = " ";
         Scanner scanner = new Scanner(System.in);
    
         System.out.print("Masukan : ");
         huruf = scanner.nextLine();
         
         int jumlah = huruf.length();
         int jumlahHuruf = jumlah - 1;
         
         for (int i = 0; i < jumlah; i++){
             hasil = hasil + huruf.charAt(jumlahHuruf); jumlahHuruf--;
         }
         System.out.println("Hasil : " +hasil);
  
     }
     }
