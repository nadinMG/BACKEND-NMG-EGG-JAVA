/*
4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
 */
package javaintro2;

import java.util.Scanner;

public class EJextra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO del 1 al 10: ");
        int num = leer.nextInt();
        
        while(num > 10 || num < 0){
            System.out.println("ERROR, INGRESE NUEVAMENTE:");
            num = leer.nextInt();
        }
        
        switch (num){
            case 1:
                System.out.println("EN ROMANO ES: I");
            break;
            case 2:
                System.out.println("EN ROMANO ES: II");
            break;
            case 3:
                System.out.println("EN ROMANO ES: III");
            break;
            case 4:
                System.out.println("EN ROMANO ES: IV");
            break;
            case 5:
                System.out.println("EN ROMANO ES: V");
            break;
            case 6:
                System.out.println("EN ROMANO ES: VI");
            break;
            case 7:
                System.out.println("EN ROMANO ES: VII");
            break;
            case 8:
                System.out.println("EN ROMANO ES: VIII");
            break;
            case 9:
                System.out.println("EN ROMANO ES: IX");
            break;
            case 10:
                System.out.println("EN ROMANO ES: X");
            break;
        }
        
    }
    
}
