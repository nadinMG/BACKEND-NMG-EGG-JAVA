/*
 14.Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
package javaintro2;

import java.util.Scanner;

public class EJextra14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int edad,f = 0,F = 0,T = 0, suma = 0, totalH, totalF;
        System.out.println("INGRESE CANTIDAD DE FAMILIAS");
        int familias = leer.nextInt();
        for (int i = 0; i <= familias-1; i++) {
            System.out.println("FAMILIA N°"+ (i+1));
            System.out.println("INGRESE LA CANTIDAD DE HIJOS");
            int hijos = leer.nextInt();
                for (int j = 0; j <= hijos-1; j++) {
                    System.out.println("HIJO N°" + (j+1) );
                    System.out.println("INGRESE SU EDAD");
                    edad = leer.nextInt();
                    while(edad < 0){
                        System.out.println("ERROR, INGRESE NUEVAMENTE");
                        edad= leer.nextInt();
                    }
                    suma += edad;
                    T++;
                    F += edad;
            }
             f++;
             totalH = suma / hijos;
             System.out.println("LA EDAD PROMEDIO DE LOS HIJOS DE LA FAMILIA N°" +f+ " ES DE " + totalH);
             suma = 0;
        }
            totalF = F / T;
             System.out.println("Y LA EDAD PROMEDIO DE TODOS LOS HIJOS SON " + totalF);
    }
    
}
