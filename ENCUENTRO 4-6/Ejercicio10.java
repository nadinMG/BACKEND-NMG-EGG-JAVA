/*
Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package javaintro2;

import java.util.Scanner;


public class Ejercicio10 {

/*for (int i = 0; i < 10; i++) {
System.out.println("Imprimo el valor de i: " + i);
}
System.out.println("===================================");
System.out.println("For decreciendo");
for (int i = 10; i > 10; i--) {
System.out.println("Imprimo el valor de i: " + i);
}*/
    public static void main(String[] args) {
        System.out.println("Ingrese 4 Numeros Comprendidos entre 1 al 20");
        Scanner leer = new Scanner(System.in);
        int num;
        int c = 0;
        do {
            num = leer.nextInt();
            System.out.print("");
            if (num >= 1 && num <= 20) {
                System.out.print(num);
                for (int i = 0; i < num; i++) {
                    System.out.print("*");
                }
                System.out.println("");
                c++;
            } else {
                System.out.println("Numero no Valido, Ingrese otro:");
            }

        } while (c < 4);
    }
    
}
