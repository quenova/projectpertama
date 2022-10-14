/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpertama;

/**
 *
 * @author Noval
 */
public class Tugas_Perulangan {   
    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println("Tugas Perulangan E for");
        System.out.println("==========================");
        for (int a=5; a>=1; a--){
               for (int b=a; b<=4; b++){
               System.out.print("*");    
               }
               for (int c=1; c<=1; c++) {
               System.out.print("0");                  
               }
               for (int d=a-1; d>=1; d--) {
                   System.out.print("*");
           }
               System.out.println("");
           }
    }
}
