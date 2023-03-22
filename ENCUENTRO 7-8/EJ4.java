/*
 Crea una aplicación que nos pida un número por teclado y con 
una función se lo pasamos por parámetro para que nos indique 
si es o no un número primo, debe devolver true si es primo, 
sino false.
Un número primo es aquel que solo puede dividirse entre 1 
y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es 
divisible entre 5, sin embargo, 17 si es primo.

¿Qué son los números primos?
Básicamente, un número primo es un número natural que 
tiene solo dos divisores o factores: 1 y el mismo número. 
Es decir, es primo aquel número que se puede dividir por uno 
y por el mismo número.
El primer número primo es 2, y hay 25 números primos entre 
1 y 100, ellos son: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97.

 */
package javaintro3;

import java.util.Scanner;

public class EJ4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("NUMEROS PRIMOS");
        System.out.println("*******");
        String op;
        do {
        System.out.println("INGRESE UN NUMERO");
        int num = leer.nextInt();
        if(primo(num)){
            System.out.println("ES PRIMO");
        }else{
            System.out.println("NO ES PRIMO");
        }
        System.out.println("Desea continuar S/N?");
                op = leer.next().toLowerCase();
            while (!"n".equals(op) && !"s".equals(op)){
                    System.out.println("ERROR, INGRESE NUEVAMENTE:");
                    op = leer.next();
                }
                if ("n".equals(op)){
                    System.out.println("GRACIAS");
                    break;
                }
        }while (!"n".equals(op));
    }
    public static boolean primo(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {
             if (num <= 1) {
                return false;
            }
            if (num % i == 0) {
                return false;
            } else {
            }
        }
        return true;
    }
}
