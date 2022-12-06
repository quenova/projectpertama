/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

/**
 *
 * @author User
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hasil = rekursif(4);
        System.out.print(hasil);
    }
    
    public static Integer rekursif(int n){
{
    if (n==0)
        return 1;
    else
        return n * rekursif(n-1);
    
}
    }
}
