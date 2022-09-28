/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_pertama;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class Aritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner(System.in);
        int jam, menit , detik, konversi;
        System.out.print("Berapa detik yang ingin anda konversikan : ");
        konversi = input.nextInt();
        
        jam  = konversi/3600;
        menit= (konversi%3600)/60;
        detik= (konversi%3600)%60;
        
        System.out.println("konversi dari : "+konversi+" detik, Adalah : ");
        System.out.println(jam+" jam, "+menit+" menit, "+detik+" detik");
 
        
        
        
        
        
       
                
                
    }
    
}
