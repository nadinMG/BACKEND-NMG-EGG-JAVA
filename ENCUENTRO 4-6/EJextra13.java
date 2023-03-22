/*
 Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
ingresa el número 3:
1
12
123
 */
package javaintro2;

import java.util.Scanner;

public class EJextra13 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("DIBUJEMOS UNA ESCALERA");
        System.out.println("INGRESE LA ALTURA:");
        int num = leer.nextInt();
        String aux = "1";
        String uno;
        for (int i = 1; i <= num; i++) {
           if (i == 1){
               System.out.println(i);
           } else {
               uno = String.valueOf(i);
               aux = aux.concat(uno);
               System.out.println(aux);
           }
        }
    }
    
}
