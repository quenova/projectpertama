/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibo;

/**
 *
 * @author User
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 5; i++) {
        int hasil = fiboRekursif(i);
        System.out.print(hasil + " ");
        }
    }
    
    public static Integer fiboRekursif(int n) {
        if (n == 0) {
        return 0;
    }
        if (n == 1) {
        return 1;
    }
        return fiboRekursif(n - 1) + fiboRekursif(n - 2);
    }
    
}
