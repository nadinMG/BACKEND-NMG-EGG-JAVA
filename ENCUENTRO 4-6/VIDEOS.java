/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro2;

import java.util.Scanner;

/**
 *
 * @author pueblo3
 */
public class VIDEOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("CONDICIONALES");
        Scanner leer = new Scanner(System.in);
        System.out.println("CLASIFIQUE PELI DEL 1 al 5");
        int opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <= 5){
        switch(opinion) {
            case 1: 
            case 2:
                System.out.println("Nos Sentimos Apenados :'c");
            break;
            case 3:
                System.out.println("PELI COMO MALA");
            break;
            case 4:
                System.out.println("PELI COMO MUY BUENA");
            break;
            case 5:
                System.out.println("Que bueno que haya disfrutado :D");
            break; // SALTA BLOQUES DE CODIGO Y DETIENE EL CASO EN EL SWITCH
            //PARA DEPURAR(PASO A PASO) BREAKPOINT Y DEBUG
            //defaul: 
            //<Acciones>
        }
        }else if (opinion < 0){
            System.out.println("MALISIMA?");
        }else if (opinion == 0){
            System.out.println("INVALIDO");
        }else {
            System.out.println("Que elegancia la de Francia");
        }
        System.out.println("HASTA LA PROXIMA");
        
        System.out.println("*******");
        
        System.out.println("BUCLES Y SENTENCIAS DE SALTO");
        
        int num,i,suma;
        do {
        
         System.out.println("INGRESE UN NUMERO ENTERO POSITIVO");
         num = leer.nextInt();
         if (num > 1000){
             System.out.println("ESTE PROGRAMA PUEDE TARDAR...S/N?");
             String confirma = leer.next();
             if (confirma.equals("s")){
                 break;
             }
         }
        
        } while (num <= 0 || num > 1000);
        
        for (int j = 1; j <= num; j++) {
            if (j%2 != 0){
            continue; //DETENER LA VUELTA Y CONTINUA CON LA OTRA VUELTA DE DE FOR
            //SOLO TOMA VALORES PARES Y LOS IMPARES SE SALTAN
            }
            suma = 0;
            i = j;
                while(i<=j){
                    suma += i;
                    i++;
            }
                System.out.println("LA SUMA DE LOS "+j+ " NUMEROS NATURALES ES: " +suma);
        }
    }
    
}
