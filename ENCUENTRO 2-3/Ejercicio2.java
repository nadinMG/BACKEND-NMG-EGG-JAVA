
package javaintro1;

import java.util.Scanner;

    /*2-Escribir un programa que pida tu nombre, lo guarde en 
    una variable y lo muestre por pantalla.*/
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("INGRESE SU NOMBRE");
        nombre = leer.nextLine();
        System.out.println("MUCHO GUSTO " + nombre);
        System.out.println("****");
    }
    
}
