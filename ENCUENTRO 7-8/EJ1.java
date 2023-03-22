/*
Crea una aplicación que le pida dos números al usuario y 
este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos 
en el main. 

 */
package javaintro3;

import java.util.Scanner;

public class EJ1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("***MENU***");
        System.out.println("1- SUMAR");
        System.out.println("2- RESTA");
        System.out.println("3- MULTIPLICACION");
        System.out.println("4- DIVISION");
        System.out.println("INGRESE 2 NUMEROS");
        int num1 = leer.nextInt(), num2 = leer.nextInt();
        System.out.println("INGRESE OPCION:");
        int op = leer.nextInt();
        while (op < 0 || op > 4){
            System.out.println("ERROR, INGRESE NUEVAMENTE:");
                op = leer.nextInt();
            }
        int resultado;
        double resultadoD;
        switch (op){
            case 1:
                resultado = s(num1,num2);
                System.out.println("LA SUMA DE " + num1 + " y " +num2+ " ES: " +resultado);
            break;
            case 2:
                resultado = r(num1,num2);
                System.out.println("LA RESTA DE " + num1 + " y " +num2+ " ES: " +resultado);
            break;
            case 3:
                resultado = m(num1,num2);
                System.out.println("LA MULTIPLICACION DE " + num1 + " y " +num2+ " ES: " +resultado);
            break;
            case 4:
                resultadoD = d(num1,num2);
                System.out.println("LA DIVISION DE " + num1 + " y " +num2+ " ES: " +resultadoD);
            break;
        }
        
    }
    
    public static int s(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
    public static int r(int num1, int num2){
        int resta = num1 - num2;
        return resta;
    }
    public static int m(int num1, int num2){
        int multi = num1 * num2;
        return multi;
    }
    public static double d(double num1, double num2){
        double div = num1 / num2;
        return div;
    }
    
}
