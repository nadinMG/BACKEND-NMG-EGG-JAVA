
package javaintro1;

import java.util.Scanner;
        /*5-Escribir un programa que lea un número entero por teclado 
       y muestre por pantalla el doble, el triple y la raíz cuadrada 
       de ese número.  */
public class Ejercicio5 {

    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int num,doble,triple;
    double raiz;
    System.out.println("INGRESE UN NUMERO ENTERO:");
    num = leer.nextInt();
    doble = num * 2;
    triple = num * 3;
    raiz = Math.sqrt(num);
    System.out.println("SU DOBLE ES: " + doble);
    System.out.println("SU TRIPLE ES: " + triple);
    System.out.println("SU RAIZ CUADRADA ES: " + raiz);
    }
    
}
