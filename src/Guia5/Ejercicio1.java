/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

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
         int [] vector = new int [100];
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
        }
        for (int i = 99; i >= 0; i--) {
            System.out.print(" "+vector[i]);
            
        }
        
    }
    
}
