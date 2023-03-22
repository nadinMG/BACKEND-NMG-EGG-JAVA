/*
 6. Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.

 */
package javaintro2;

import java.util.Scanner;

public class EJextra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE CANTIDAD DE PERSONAS");
        int n = leer.nextInt();
        System.out.println("DETERMINAR PROMEDIO DE ALTURA(1.00mts) DE "+n+" PERSONAS");
        double general = 0;
        double debajo = 0;
        int d = 0;
        for (int i = 1; i < n+1; i++) {
            System.out.println("PERSONA N°" + i + " , INGRESE SU ALTURA");
            double altura = leer.nextDouble();
            while (altura < 0 || altura > 3){
                System.out.println("ERROR, INGRESE NUEVAMENTE:");
                    altura = leer.nextDouble();
            }
            if (altura < 1.60){
                debajo += altura;
                d++;
            }
            general += altura;
        }
        System.out.println("EL PROMEDIO DE PERSONAS DE ALTURA MENOR A 1.60 FUE: " + debajo / d);
        System.out.println("Y EL PROMEDIO DE TODAS LAS ALTURAS FUE DE: " + general / n);
    }
    
}
