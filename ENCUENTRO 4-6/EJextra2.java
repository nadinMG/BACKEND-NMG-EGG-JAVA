/*
 2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar
 */
package javaintro2;

public class EJextra2 {

    public static void main(String[] args) {
       int A,B,C,D,aux;
       A = 1; //D
       B = 2; //C
       C = 3; //A
       D = 4; //B
       System.out.println("VALORES INICIALES");
       System.out.println("A: " + A);
       System.out.println("B: " + B);
       System.out.println("C: " + C);
       System.out.println("D: " + D);
       aux = 0;
       while (aux == 0){
       aux = B;
       B = C;
       C = A;
       A = D;
       D = aux;
       }
       System.out.println("VALORES FINALES");
       System.out.println("A: " + A);
       System.out.println("B: " + B);
       System.out.println("C: " + C);
       System.out.println("D: " + D);
       
       
    }
    
}
