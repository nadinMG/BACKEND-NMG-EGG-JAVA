/*
 12.Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.

 */
package javaintro2;

public class EJextra12 {

    public static void main(String[] args) {
        System.out.println("CONTADOR");
        String e =  "E";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (k == 3 && j == 3 && i == 3){
                        System.out.println( e + "-" + e + "-" + e );
                        }else if (i == 3 && j == 3) {
                            System.out.println( e + "-" + e + "-" + k );
                        }else if (i == 3) {
                            System.out.println( e + "-" + j + "-" + k);
                        }else if (j==3 && k==3) {
                            System.out.println( i + "-" + e + "-" + e );
                        } else if (j == 3) {
                            System.out.println( i + "-" + e + "-" + k );
                        }else if (k==3 && i==3) {
                             System.out.println( e + "-" + j + "-" + e );  
                        }else if (k==3) {
                            System.out.println( i + "-" + j + "-" + e );
                        }else {
                            System.out.println( i + "-" + j + "-" + k );
                        }
                    
                }
                
            }
            
        }
    }
    
}
