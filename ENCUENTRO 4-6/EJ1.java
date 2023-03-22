/*1. Crear un programa que dado un número determine si es par o impar.*/
package javaintro2;

import java.util.Scanner;

public class EJ1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO");
        int num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("Su numero es PAR");
        } else {
            System.out.println("Su numero es IMPAR");
        }
    }

}
