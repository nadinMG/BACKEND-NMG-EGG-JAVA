
package javaintro1;

import java.util.Scanner;
    /*3-Escribir un programa que pida una frase y la muestre toda en
    mayúsculas y después toda en minúsculas. 
    Nota: investigar la función toUpperCase() y toLowerCase() en Java.
    */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("INGRESE UNA FRASE:");
        String frase;
        frase = leer.nextLine();
        String mayus = frase.toUpperCase();
        String minus = frase.toLowerCase();
        System.out.println("En Mayusculas: " + mayus);
        System.out.println("En Minusculas: " + minus);
        System.out.println("*****");
    }
    
}
