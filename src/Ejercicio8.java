/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author gaspa
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su nota");
        int nota = leer.nextInt();
        
        while (nota>10 || nota<0 ) { 
            
        System.out.println("Su nota no es valida, ingrese nuevamente");
        nota= leer.nextInt();}
        System.out.println("Su nota ingresada es correcta");
    }
    
}
