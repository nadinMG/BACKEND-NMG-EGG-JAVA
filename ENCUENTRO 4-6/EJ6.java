/*
6. Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.


 */
package javaintro2;

import java.util.Scanner;

public class EJ6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, op;
        String salir = "";
        do {
            System.out.println("INGRESE 2 NUMEROS ENTEROS POSITIVOS");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            while (num1 <= 0 && num2 <= 0) {
                System.out.println("Numeros no Valido, Ingrese nuevamente");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
            }
            System.out.println("------MENU------");
            System.out.println("1-SUMAR");
            System.out.println("2-RESTAR");
            System.out.println("3-MULTIPLICAR");
            System.out.println("4-DIVISION");
            System.out.println("5-SALIR DEL MENU");
            System.out.println("ELIJA ALGUNA OPERACION A REALIZAR");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("LA SUMA DE " + num1 + " + " + num2 + " FUE DE: " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("LA RESTA DE " + num1 + " - " + num2 + " FUE DE: " + resta);
                    break;
                case 3:
                    int pro = num1 * num2;
                    System.out.println("LA MULTIPLICACION DE " + num1 + " * " + num2 + " FUE DE: " + pro);
                    break;
                case 4:
                    double div = num1 / num2;
                    System.out.println("LA DIVISION DE " + num1 + " / " + num2 + " FUE DE: " + div);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa" + "(S/N)?");
                    salir = leer.next();
                    while (!"n".equals(salir.toLowerCase()) && !"s".equals(salir.toLowerCase())) {
                        System.out.println("ERROR, INGRESE NUEVAMENTE");
                        salir = leer.next();
                    }
                    break;
                default:
                    while (op > 5 || op < 0) {
                        System.out.println("ERROR, INGRESE NUEVAMENTE");
                        op = leer.nextInt();
                    }
            }
        } while (salir.equalsIgnoreCase("n"));
    }

}
