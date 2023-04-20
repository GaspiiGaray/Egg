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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        String respuesta;
         
        do {
            System.out.println("Ingresar nombre");
            String nombre =leer.next();
            System.out.println("Ingresar edad");
            int edad = leer.nextInt();
            mayor(nombre, edad);
            System.out.println("Desea seguir cargando?");
            respuesta = leer.next();
        }while(!respuesta.equals("no"));    
         
    }
    
    public static void mayor(String nombre,int edad){
        if (edad>=18){
            System.out.println(nombre+" de "+edad+" año de edad es mayor de edad");
        }else{
            System.out.println(nombre+" de "+edad+" años de edad es menor de edad");
        }
        
    }
    }
    

