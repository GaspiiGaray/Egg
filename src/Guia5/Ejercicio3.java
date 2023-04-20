/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;
import java.util.Scanner;
/**
 *
 * @author gaspa
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese tamaño del vector");
        int n = leer.nextInt();

        int vector[] = new int[n];
        int i,unidad=0,decena=0,centena=0,mil=0,diezmil=0;

        for (i = 0; i < n - 1; i++) {
            vector[i] = (int) (Math.random() * 100000);
        }
        
        for (i = 0; i < n - 1; i++) {
            
            if (vector[i]>=0&&vector[i]<10)
                
                unidad++;
            if (vector[i]>=10&&vector[i]<100)
                
                decena++;
            if (vector[i]>=100&&vector[i]<1000)
                
                centena++;
            if (vector[i]>=1000&&vector[i]<10000)
                
                mil++;
            if (vector[i]>=10000&&vector[i]<100000)
                
                diezmil++;
        }
        
        System.out.println("numeros de 1 digito = "+unidad);
        System.out.println("numeros de 2 digito = "+decena);
        System.out.println("numeros de 3 digito = "+centena);
        System.out.println("numeros de 4 digito = "+mil);
        System.out.println("numeros de 5 digito = "+diezmil);
        
        for (i = 0; i < n - 1; i++) {
            System.out.println(vector[i]);
        }

        
    }
    
}
    

