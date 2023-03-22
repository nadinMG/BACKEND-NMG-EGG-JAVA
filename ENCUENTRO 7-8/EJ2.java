/*
 Diseñe una función que pida el nombre y la edad de N personas 
e imprima los datos de las personas ingresadas por teclado e 
indique si son mayores o menores de edad. Después de cada 
persona, el programa debe preguntarle al usuario si quiere 
seguir mostrando personas y frenar cuando el usuario ingrese 
la palabra “No”.
 */
package javaintro3;

import java.util.Scanner;

public class EJ2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String op = "";
        String n = "";
        do{
            System.out.println("INGRESE CANTIDAD DE PERSONAS");
            int personas = leer.nextInt();
            for (int i = 1; i < personas+1; i++) {
                System.out.println("INGRESE PERSONA "+i);
                nombre(leer.next());
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
            }
        }while (!"n".equals(op));
    }
    public static void nombre(String nombre){
        Scanner leer = new Scanner(System.in);
        String name = nombre;
        System.out.println(name + " ,INGRESE SU EDAD:");
        int edad = leer.nextInt();
        while (edad < 0){
            System.out.println("ERROR, INGRESE NUEVAMENTE:");
                edad = leer.nextInt();
            }
        if (edad > 18){
            System.out.println(name + " ES MAYOR DE EDAD");
        } else {
            System.out.println(name + " ES MENOR DE EDAD");
        }
    }
}
