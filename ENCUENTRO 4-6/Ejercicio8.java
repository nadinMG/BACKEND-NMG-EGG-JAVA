/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package javaintro2;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    System.out.println("INGRESE UNA NOTA");
    byte nota = leer.nextByte();
    
    while (nota > 10 || nota < 0){
        System.out.println("ERROR,Ingrese Nuevamente:");
        nota = leer.nextByte();
    }
    
        System.out.println("Su nota es:" + nota);
    
}
}