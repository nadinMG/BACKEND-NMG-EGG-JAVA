/*
9. Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas.
 */
package javaintro2;

import java.util.Scanner;

public class EJextra9 {

    public static void main(String[] args) {
        System.out.println("INGRESE 2 NUMEROS PARA LA DIVISION");
        Scanner leer = new Scanner(System.in);
        int div = leer.nextInt(),divs = leer.nextInt();
        while(divs <= 0){
                System.out.println("ERROR, INGRESE NUEVAMENTE:");
                divs = leer.nextInt();
        }
        int aux = 0, j = 0;
        for (int i = 0; i <= div; i++) {
            aux = div;
            if (aux >= divs){
            div = aux - divs;
            System.out.println(aux + " / " + divs + " = " + div);
            j++;
            }else{
            break;
            }
        }
        System.out.println("El residuo es: " + aux);
        System.out.println("El cociente es: " + j);
    }
    
}
