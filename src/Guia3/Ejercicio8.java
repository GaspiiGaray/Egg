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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int num;
        System.out.println("Ingrese un numero");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        
        for(int i=0 ; i <= num-1; i++){
            if( i == 0 || i == num-1) {
                for(int j=0 ; j <= num-1 ; j++){
                    System.out.print(" * ");
                }
            
        } else{
                for(int j=0 ; j<= num ; j++){
                    if(j == 0 || j == num-1){
                        System.out.print(" * ");
                }else {
                        System.out.print("   ");
                    }
            
        
            }
         
    
    }
            System.out.println("");


        
        }
    }
    }
    

