package javaintro1;

import java.util.Scanner;

/*1-Escribir un programa que pida dos números enteros por teclado 
    y calcule la suma de los dos. El programa deberá después mostrar 
    el resultado de la suma*/
public class Ejercicio1 {
    
    public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
    System.out.println("INGRESE 2 NUM ENTEROS PARA LA SUMA");
    int num1,num2;
    num1 = leer.nextInt();
    num2 = leer.nextInt();
    int suma;
    suma = num1 + num2;
    System.out.println("LA SUMA ES: " + suma);
    System.out.println("****");
    System.out.println("****");
    }
    
}
