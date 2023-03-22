/*
 10.Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.

 */
package javaintro2;

import java.util.Scanner;

public class EJextra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ADIVINE EL RESULTADO DE LA MULTIPLICACION");
        int random = (int) (Math.random()*10), random2 = (int) (Math.random()*10);
        int multi = random * random2;
        System.out.println("INGRESE SU RESPUESTA");
        int resp = leer.nextInt();
        while( resp != multi){
                System.out.println("INCORRECTO");
                System.out.println("INGRESE NUEVAMENTE");
                resp = leer.nextInt();
        }
        if (resp == multi){
                System.out.println("CORRECTO");
            }
    }
    
}
