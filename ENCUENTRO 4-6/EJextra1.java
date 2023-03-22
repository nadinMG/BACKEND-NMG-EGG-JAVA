/*
1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.

 */
package javaintro2;

import java.util.Scanner;

public class EJextra1 {

    public static void main(String[] args) {
        System.out.println("INGRESE UNA CANTIDAD DE TIEMPO EN MINUTOS");
        Scanner leer = new Scanner(System.in);
        int min = (int) leer.nextDouble();
        
        int hora = (int) (min / 60);
        int resto = hora % 24;
        int dia = hora / 24;
        
        System.out.println("LA CANTIDAD DE MINUTOS FUE DE: " + min);
        System.out.println("LA CANTIDAD DE HORAS FUE DE: " + resto );
        System.out.println("LA CANTIDAD DE DIAS FUE DE: " + dia);
    }
    
}
