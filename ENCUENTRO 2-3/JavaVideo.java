/* IDE ENTORNO DE DESARROLLO

*/
package javaintro1; //PROYECTO, ORGANIZAR Y EMPAQUETAR PROYECTOS JAVA

//IMPORTA UNA CLASE DENTRO DEL PAQUETE DE JAVA.util
import java.util.Scanner;

public class JavaVideo { //DATOS DEL CODIGO CLASS, PROGRAMA

    public static void main(String[] args) { 
    //CLASS MAIN, SUBPROGRAMA, PRIMER SUBPROGRAMA
    //METODO = SUBPROGRAMA NOMESCLATURA
    
    // SCANNER = LEER TECLADO DE PSEINT
    Scanner leer = new Scanner(System.in);
    //VARIABLE TIPO CADENA(STRING) PARA LEER TIPOS DE DATOS, DENOMINA
    String nombre;
    //MUESTRA EL MENSAJE POR PANTALLA
    System.out.println("INGRESA TU NOMBRE");
    //GUARDAMOS LA INFO QUE RECIBA EL TECLADO EN LA VARIABLE
    nombre = leer.next();
    //MOSTRAMOS MENSAJE CON LA VARIABLE
    System.out.println("HOLA MUNDO!, SOY " + nombre + " Y ESTOY PROGRAMANDO EN JAVA");
        
    //PARA VARIABLE: 1- tipo de dato _ 2- Nombre_ 3- Cierre con Punto y Coma
    
    }
}
