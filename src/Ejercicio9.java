
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gaspa
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     * Escriba un programa que lea 20 números. 
     * Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje 
     * "Se capturó el numero cero".  El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
     * pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer= new Scanner(System.in);
        
        int i , suma, num;
        i=1;
        
        
        
        System.out.println("Ingrese 20 numeros distintos de 0");
        num = leer.nextInt();
        suma=num;
        while (num!=0 && i<20){
          
            num = leer.nextInt();
        i++;
        
        if (num > 0)
        suma=suma+num;
        else
                System.out.println("El numero es menor a 0");
        
            
        }
        System.out.println("la suma es "+suma);
        
        
        if (num ==0 ){
                System.out.println("Se capturó el numero cero se finaliza el programa");
        
        }
       
    }
}
    

