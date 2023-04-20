/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author gaspa
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cuatro numeros entre 1 y el 20");
        int num1=leer.nextInt(),num2=leer.nextInt(),num3=leer.nextInt(),num4=leer.nextInt();
        System.out.print(num1);
        for (int i = 0; i < num1;i++){
            
            System.out.print("*");
                }
                System.out.println("");
        System.out.print(num2);
        for (int i = 0; i < num2;i++){
          
            System.out.print("*");
        
        }
                System.out.println("");
        System.out.print(num3);
        for (int i = 0; i < num3;i++){
            
            System.out.print("*");
        
        }
                System.out.println("");
        System.out.print(num4);
        for (int i = 0; i < num4;i++){
            
            System.out.print("*");
       
        }
                System.out.println("");
    }
    
}
    
    

