/*
5. Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.

 */
package javaintro2;

import java.util.Scanner;


public class EJextra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("----OBRA SOCIAL----");
        System.out.println("-CLASE A");
        System.out.println("-CLASE B");
        System.out.println("-CLASE C");
        System.out.println("******");
        System.out.println("INGRESE UNA CLASE (A-B-C)");
        String letra = leer.next().toUpperCase();
        while(!"A".equals(letra) && !"B".equals(letra) && !"C".equals(letra)){
            System.out.println("ERROR, INGRESE NUEVAMENTE:");
            letra = leer.next();
        }
        System.out.println("COSTO DEL TRATAMIENTO $$$");
        int costo = leer.nextInt();
        int cuota = 0;
        int total;
        switch(letra){
            case "A":
                cuota = 500;
                costo *= 0.5;
                break;
            case "B":
                cuota = 250;
                costo *= 0.65;
                break;
            case "C":
                cuota = 100;
                break;
        }
        total = cuota + costo;
        System.out.println("El costo de tratamiento para el socio de tipo " + letra + " es de " + total);
    }
    
}
