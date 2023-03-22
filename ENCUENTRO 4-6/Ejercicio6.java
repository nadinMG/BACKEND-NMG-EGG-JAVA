/*
/*6-Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.*/

package javaintro2;

import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE 2 NUMEROS ENTEROS");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25){
            System.out.println("Ambos son mayores a 25");
        } else if (num1 > 25 || num2 > 25){
            System.out.println("Uno de Ellos es Mayor a 25");
        }else{
            System.out.println("Ninguno es Mayor a 25");
        }
          
        
    }
    
}
