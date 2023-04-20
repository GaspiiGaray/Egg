/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;


/**
 *
 * @author gaspa
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int num1;
        int num2;
        int retorno;

        System.out.println("Ingrese dos números");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        multiplo(num1, num2);

       
    }

    public static void multiplo(int num1, int num2) {
        int aux;
        int retorno;
        aux = num1 % num2;

        if (aux == 0) {
            System.out.println("El primer valor ingresado es multiplo del segundo");

        } else {
            System.out.println("Los números no son múltiplos");
        }
    }
}

