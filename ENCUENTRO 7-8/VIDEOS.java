
package javaintro3;

import java.util.Scanner;

public class VIDEOS {

    public static void main(String[] args) {
        // STATIC, DEVUELVE, VOID, NO DEVUELVE- TIPO DE DATO (TIPO DE DATO,TIPO DE DATO)
        int resultado = suma (10,10);
        System.out.println(resultado);
        System.out.println("**1**");
        saludo("NADIN");
        System.out.println("**2**");
        Scanner leer = new Scanner(System.in);
        String nombre = leer.next();
        saludo(nombre);
        System.out.println("**3**");
        saludo(leer.next());
    }
    public static int suma(int a,int b){
        int resultado = a + b;
    return resultado;
    }
    public static void saludo(String nombre){
        System.out.println("HOLA " + nombre + " COMO ESTAS?");
    }
    
}
