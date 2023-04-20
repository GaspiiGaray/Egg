/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author gaspa
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase a codificar");
        String frase=leer.nextLine();
        String retorno=codificar(frase);
        
        System.out.println("===La frase codificada queda así====");
        System.out.println("");
        System.out.println(retorno); 
        
    }
    public static String codificar (String frase){
        String codigo ="";
        for (int i = 0; i<(frase.length()); i++) {
            switch(frase.substring(i,i+1)){
                case "a":
                    codigo=codigo.concat("@");
                    break;
                case "e":
                    codigo=codigo.concat("#");
                    break;
                case "i":
                    codigo=codigo.concat("$"); 
                    break;
                case "o":
                    codigo=codigo.concat("%"); 
                    break;
                case "u":
                    codigo=codigo.concat("*");  
                    break;
                default:
                    codigo=codigo.concat(frase.substring(i,i+1));
                    
            }
          //  System.out.println(codigo);
        }
        return codigo;
    }
}
       
    
    

