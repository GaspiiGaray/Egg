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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Cuantos euros desea convertir?");
        int num = leer.nextInt();
        System.out.println("a 1.libras");
        System.out.println("a 2.dolares");
        System.out.println("a 3.yenes");

        int opciones = leer.nextInt();
        
        switch (opciones) {
            case 1: 
                System.out.println("Sus euros son "+libras(num)+" libras");
                break;
            case 2: 
                System.out.println("Sus euros son "+dolares(num)+" dolares");
                break;
            case 3:
                System.out.println("Sus euros son "+yenes(num)+" yenes");
                break;
        }

    }
    public static double libras(int num){
        double libras = (num * 0.86);
        return libras;
        
    }
    public static double dolares(int num){
        double dolares = (num * 1.28611);
        return dolares;
    }
    
    public static double yenes(int num){
        double yenes = (num * 129.852);
        return yenes;
    }
    }
    

