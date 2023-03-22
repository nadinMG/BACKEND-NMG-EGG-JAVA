/*
3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 */
package javaintro2;

import java.util.Scanner;

public class EJextra3 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE UNA LETRA");
        String letra = leer.next().toUpperCase();
        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O")|| letra.equals("U")){
            System.out.println("ES UNA VOCAL");
        }else{
            System.out.println("NO ES UNA VOCAL");
        }
    }
    
}
