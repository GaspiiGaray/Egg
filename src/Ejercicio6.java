
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gaspa
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
         Scanner numero= new Scanner(System.in);
        
          int num1;
          int num2;
          
        System.out.println("Ingrese el primer valor");
       num1 = numero.nextInt();
        System.out.println("Ingrese el segundo numero");
       num2 = numero.nextInt();
        
        if (num1>25 & num2>25) {
             System.out.println("Ambos numeros son mayores");
        } else {
            if (num1>25) {
                System.out.println("El numero uno es el mayor");
            } else {
                if (num2>25)
                     System.out.println("El numero dos es el mayor");
            }
              {
              
            }
             
        }
    }
    }
    

