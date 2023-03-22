/*
8. Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 */
package javaintro2;

import java.util.Scanner;

public class EJextra8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i = 1;
        int n;
        int leidos = 0,multiplo = 0, pares = 0,impares = 0;
        System.out.println("INGRESE NUMEROS ENTEROS");
        while (i != 0){
            System.out.println("N°" + i);
            n = leer.nextInt();
            while (n < 0){
            System.out.println("ERROR, INGRESE NUEVAMENTE:");
                n = leer.nextInt();
            }
            leidos++;
            if (n%2 == 0){
                pares++;
            }else if(n%5 == 0){
                multiplo++;
                break;
            }else{
                impares++;
            }
        }
        System.out.println("IMPARES: "+impares);
        System.out.println("IMPARES: "+impares);
    }
    
}
