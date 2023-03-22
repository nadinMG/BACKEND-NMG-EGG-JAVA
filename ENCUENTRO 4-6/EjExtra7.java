/*
  7. Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 */
package javaintro2;

import java.util.Scanner;

public class EjExtra7 {

    public static void main(String[] args) {
        System.out.println("1° - CON METODO WHILE");
        int menor = 0, mayor = 0, i = 1;
        double promedio = 0;
        System.out.println("INGRESE VALOR DE N NUMEROS A INGRESAR");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
            while (n < 0){
            System.out.println("ERROR, INGRESE NUEVAMENTE:");
                n = leer.nextInt();
            }
            
        while(i <= n){
            System.out.println("VALOR N°" + i);
            int v = leer.nextInt();
            if (i == 1){
            menor = v;
            mayor = v;
            }
            if (mayor < v){
                mayor = v;
            }else if(menor > v){
            menor = v;
            }
            promedio += v;
            i++;
        }
        System.out.println("EL VALOR MAXIMO INGRESADO FUE " + mayor);
        System.out.println("EL VALOR MINIMO INGRESADO FUE " + menor);
        System.out.println("Y EL VALOR PROMEDIO FUE DE " + (promedio / n));
    }
    
}
