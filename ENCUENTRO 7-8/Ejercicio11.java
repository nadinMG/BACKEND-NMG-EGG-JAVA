/*
 Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package javaintro3;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = 5, num2 = 7;
        // 1° Puedo invocar el retorno de esta funcion de esta manera
        System.out.println("La suma de ambos es: " + sumar(num1,num2));
        
        // 2° Pero, recomendamos hacerlo de esta manera, ya que los retornos
        //deben alojarse en variables para su posterior uso
        int retorno = sumar(num1, num2);
        System.out.println("La suma de ambos es: " + retorno);
        
        System.out.println("******");
        System.out.println("EJERCICIO 11");
        System.out.println("INGRESE UNA FRASE TERMINADA EN PUNTO");
        String frase = leer.next().toLowerCase();
        while (frase.endsWith("") != frase.endsWith(".")){
            System.out.println("INGRESE UN PUNTO AL FINAL DE LA FRASE");
            frase = leer.next().toLowerCase();
        }
        
        String r = cambio(frase);
        System.out.println("FRASE CAMBIADA: " + r);
    }
    public static String cambio(String frase) {
    String frase2 = "", caracter;
    
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.substring(i, i+1);
            switch (caracter){
                case "a":
                    frase2 = frase2.concat("@");
                break;
                case "e":
                    frase2 = frase2.concat("#");
                break;
                case "i":
                    frase2 = frase2.concat("$");
                break;
                case "o":
                    frase2 = frase2.concat("%");
                break;
                case "u":
                    frase2 = frase2.concat("*");
                break;
                
                default:
                    frase2 = frase2.concat(caracter);
                break;
            }
        }
        
    return frase2;
    } 
    
    
    public static int sumar(int num1, int num2) {
    int suma;
    suma = num1 + num2;
    return suma;
    } //DENTRO DEL PUBLIC CLASS
    
}

