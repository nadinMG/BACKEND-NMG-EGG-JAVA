/*
Ejercicio 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */
package javaintro2;

import java.util.Scanner;


public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE 20 NUMEROS:");
        int num;
        int c = 0;
        int suma = 0;
        //SE DEFINEN LAS VARIABLES ANTES DEL BUCLE
        do {

            num = leer.nextInt(); //LEE
            c++; //C que era 0 con cada bucle le suma 1
            if (num > 0) { //Mientras sea mayor a 0 entra en el if
                suma = (int) (suma + num);//Necesario los () para especificar su dato
                //Se realiza la suma de los numeros
            }else if(num == 0){ //En cambio si el numero es igual a 0
            break; //Saldra del BUcle
            }
        }while(c < 20); //O mientras el Contador sea menor a 20(20 INtentos)
        
        System.out.println("La suma fue de " + suma); //Y aqui se realizara la suma de los numeros positivos Ingresados
    }

}
