/*
 7. Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals()
 */
package javaintro2;

import java.util.Scanner;

public class EJ7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int bien = 0;
        int mal = 0;
        String frase;
        System.out.println("--SIMULACION DE UN DISPOSITIVO RS232--");
        System.out.println("Ingrese Frases, de Maximo 5 Caracteres, que Inicie con 'X' y termine con 'O'");
        for (int i = 0; i < 10; i++) {
            System.out.print("FRASE: ");
            frase = leer.next();
            while (frase.length() != 5){
                System.out.println("ERROR, INGRESE NUEVAMENTE:");
                frase = leer.next();
            }
            if (frase.substring(0, 1).equals("X") && (frase.substring(4, 5).equals("O"))){
                bien++;
                System.out.println("“&&&&&”");
            }else{
            mal++;
            }
        
        }
        
        System.out.println("---INFORME DE LA SIMULACION---");
        System.out.println("CANTIDAD DE LECTURAS CORRECTAS: " + bien);
        System.out.println("CANTIDAD DE LECTURAS INCORRECTAS: " + mal);
    }
    
}
