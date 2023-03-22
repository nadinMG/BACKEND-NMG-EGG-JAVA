/*
 11. Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados
 */
package javaintro2;

import java.util.Scanner;

public class EJextra11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO ENTERO:");
        int num = leer.nextInt();
        int aux = num, j = 1;
        for (int i = 0; i < aux; i++) {
            aux = aux / 10;
            aux = (int) Math.floor(aux);
            System.out.println(aux);
            j++;
        }
        System.out.println(num + " esta compuesto por: " + j + " digitos");
    }
    
}
