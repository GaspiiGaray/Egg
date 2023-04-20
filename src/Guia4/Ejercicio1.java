/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia4;
import java.util.Scanner;
/**
 *
 * @author gaspa
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        System.out.println("Elija la opcion deseada");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-multiplicar");
        System.out.println("4-Dividir");
        int opcion=leer.nextInt();
        switch(opcion){
            case 1:
                System.out.println("La suma es  "+suma(num1, num2));
                break;
            case 2:
                System.out.println("La resta es  "+resta(num1, num2));
                break;
            case 3:
                System.out.println("La multiplicacion es  "+multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println("La division es  "+division(num1, num2));
                break;
        }
    }
   public static int suma(int num1,int num2){
       int suma=num1+num2;
       return suma;
             
   }
   public static int resta(int num1,int num2){
       int resta=num1-num2;
       return resta;
   }    
   public static int multiplicacion(int num1,int num2){
       int multiplicacion=num1*num2;
       return multiplicacion; 
   }    
   public static double division(int num1,int num2){
       double division=num1/num2;
       return division;   
   }   
}
    
    

