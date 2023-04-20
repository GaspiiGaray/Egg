/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

/**
 *
 * @author gaspa
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz = new int [4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int)(Math.random()*10);
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("--------------------");
        for (int j = 0; j < 4 ; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println("");
        }
        
    }
    }
    

