/*
5. Escriba un programa en el cual se ingrese un valor limite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package javaintro2;

import java.util.Scanner;

public class EJ5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE UN VALOR LIMITE POSITIVO");
        int limite = leer.nextInt();

        while (limite <= 0){
            System.out.println("Numero no Valido, Ingrese nuevamente");
            limite = leer.nextInt();
        }
        
        System.out.println("AHORA INGRESE NUMEROS PARA SUMAR");
        int numero = 0;
        int suma = 0;
       
        for (int i = 0; suma <= limite; i++) {
            numero = leer.nextInt();
            while (numero <= 0){
            System.out.println("Numero no Valido, Ingrese nuevamente");
            numero = leer.nextInt();
            }
            suma = suma + numero;
        }
            System.out.println("LA SUMA SUPERO EL LIMITE");
    }
    
}
