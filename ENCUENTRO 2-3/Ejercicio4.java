
package javaintro1;

import java.util.Scanner;

 /*4-Dada una cantidad de grados centígrados se debe mostrar su
    equivalente en grados Fahrenheit. La fórmula correspondiente 
    es: F = 32 + (9 * C / 5).*/
public class Ejercicio4 {

    public static void main(String[] args) {
   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        float grados;
        System.out.println("INGRESE UNA CANTIDAD DE GRADOS CENTIGRADOS: ");
        grados = leer.nextFloat();
        float far;
        far = 32 + (9 * grados /5);
        System.out.println("Su calculo en Fahrenheit es de: " + far);
        System.out.println("****");
    }
    
}
