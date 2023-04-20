/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author gaspa
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo 
 * y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        
       
        
        System.out.println("Ingrese cantidad de integrantes");
             
        Scanner leer= new Scanner(System.in);
        
        int num=leer.nextInt();
        
        String[] nombres = new String[num];
        
        
        for (int i=0;i<num;i++){
            
            System.out.println("Ingrese nombre del compa "+(i+1));
            nombres[i]=leer.next();

    }
    
    for (int i=0;i<num;i++){
        
        System.out.println("Compañero "+(i+1)+" : "+nombres[i]);
    }

}

}
    

