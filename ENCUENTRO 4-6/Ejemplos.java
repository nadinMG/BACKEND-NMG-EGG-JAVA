
package javaintro2;

import java.util.Scanner;

public class Ejemplos {

    public static void main(String[] args) {
        /**/
       /*if(<condición>){
        <sentencias A>
        } else {
        <sentencias B>
       }*/
        int num1 = 5;
        int num2 = 7;
        if (num1 < num2) {
        System.out.println("La variable num1 aloja un número menor a la variable num2");
        }else {
        System.out.println("La variable num1 aloja un número mayor a la variable num2");
        }
        
        /*switch(<variable>) {
        case <valor1>:
        <sentencias1>
        break;
        case <valor2>:
        <sentencias2>
        break;
        default:
        <sentencias3>
        }*/
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese una opción");
        opcion = leer.nextInt();
        switch (opcion) {
        case 1:
        System.out.println("Esta línea de código se ejecuta si opcion = 1");
        break;
        case 2:
        System.out.println("Esta línea de código se ejecuta si opcion = 2");
        break;
        default:
        System.out.println("El valor ingresado en la variable opcion es diferente" + "a todos los casos analizados por el switch");
            }
        
        //break IGNORA Y PASA A OTRO BLOQUE DE ACCIONES
        //continue IGNORA Y CONTINUA CON LA SIGUIENTE ITERACION
        
        /*while (<condición>) {
        <sentencias>
        }*/
        String respuesta = "S";
        while (respuesta.equalsIgnoreCase("S")) {
        System.out.println("Desea continuar?");
        respuesta = leer.nextLine();
        }
        
        /*do {
        <sentencias>
        } while (<condición>);*/
        String respuesta2;
        do {
        System.out.println("Desea continuar?");
        respuesta2 = leer.nextLine();
        } while (respuesta2.equalsIgnoreCase("S"));

        /*for (<inicialización>; <terminación>; <incremento>) {
        <sentencias>
        }
        */
        for (int i = 0; i < 10; i++) {
        System.out.println("Imprimo el valor de i: " + i);
        }
        System.out.println("===================================");
        System.out.println("For decreciendo");
        for (int i = 10; i > 10; i--) {
        System.out.println("Imprimo el valor de i: " + i);
        }
        
    }
    
}
