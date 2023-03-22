/*
 Crea una aplicación que a través de una función nos 
convierta una cantidad de euros introducida por teclado a 
otra moneda, estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de euros y 
la moneda a convertir que será una cadena, este no devolverá 
ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package javaintro3;

import java.util.Scanner;

public class EJ3 {

    public static void main(String[] args) {
        System.out.println("CONVERSION DE DOLARES, YENES y LIBRAS");
        Scanner leer = new Scanner(System.in);
        String op;
        do{
            System.out.println("INGRESE CANTIDAD DE EUROS");
            int euro = leer.nextInt();
            System.out.println("ESCRIBA EL TIPO DE CAMBIO A REALIZAR:");
            System.out.println("-DOLARES");
            System.out.println("-YENES");
            System.out.println("-LIBRAS");
            String moneda = leer.next().toLowerCase();
            cambio(moneda, euro);
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
        } while (!"n".equals(op));
    }
    public static void cambio(String moneda, int euro){
        switch (moneda){
            case "dolares":
                System.out.println(euro + "€ a Dolares son: " + (euro * 1.28611));
            break;
            case "yenes":
                System.out.println(euro + "€ a Yenes son: " + (euro * 129.852));
            break;
            case "libras":
                System.out.println(euro + "€ a Libras son: " + (euro * 0.86));
            break;
        }
    }
    
}
