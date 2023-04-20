/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

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
        boolean magica;
        int[][] matriz = new int[3][3];
        int suma, aux, i, j;
        
        System.out.println("Ingresar una matriz mágica con números del 1 al 9:");
        IngIntMat(matriz, 3, 3);
        
        //Diagonal1
        suma = 0;
        for(i=0; i<3; i++){
            suma+= matriz[i][i];
        }
        //Diagonal2
        aux = 0;
        j = 0;
        for(i=2; i>=0; i--){
            aux+= matriz[i][j];
            j++;
        }
        magica = suma==aux;
        
        if(magica){
            //Filas
            for(i=0; i<3; i++){
                aux = 0;
                for(j=0; j<3; j++){
                    aux+= matriz[i][j];
                }
                magica = suma==aux;
                if(!magica){
                    break;
                }
            }
            //Columnas
            if(magica){
                for(j=0; j<3; j++){
                    aux = 0;
                    for(i=0; i<3; i++){
                        aux+= matriz[i][j];
                    }
                    magica = suma==aux;
                    if(!magica){
                    break;
                    }
                }
            }
        }
        
        if(magica){
            System.out.println("La matriz es mágica. La suma es " +suma);
        }else{
            System.out.println("La matriz no es mágica");
        }
    }

    public static int ValidarInt(int min, int max, int exc){
        Scanner scan = new Scanner(System.in);
        int num;
        do{
            num = scan.nextInt();
        }while(!((num>=min && num<=max) || num==exc));
        return num;
    }
    
    public static void IngIntMat(int[][] mat, int f, int c){
        int i, j;
        for(i=0; i<f; i++){
            for(j=0; j<c; j++){
                System.out.print("[" +i+ "][" +j+ "] = ");
                mat[i][j] = ValidarInt(1, 9, 9);
            }
        }
    }
    
}
