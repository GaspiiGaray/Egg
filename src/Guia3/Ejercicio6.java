/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia3;
import java.util.Scanner;
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
        
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese el primer valor");
        num1=leer.nextInt();
        System.out.println("Ingrese el segundo valor");
         num2=leer.nextInt();
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        
        int opcion;
        System.out.println("Elija Opcion");
        opcion=leer.nextInt();
        int respuesta;
         
         
         
        switch(opcion){
            case 1:
               respuesta= num2+num1;
                System.out.println("La suma es"  +respuesta);
                   break;
            case 2:
                respuesta = num1-num2;
                System.out.println("La resta es"  +respuesta);
                    break;
            case 3:
                respuesta = num1*num2;
                System.out.println("La multiplicacion es"  +respuesta);
                  break;
            case 4:
                respuesta = num1/num2;
                System.out.println("La division es"  +respuesta);
                    break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                
               
  	 
   	
            
        } 
    }    }
    
    

