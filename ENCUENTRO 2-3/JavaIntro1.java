
package javaintro1; // CARPETA APORTADA POR JAVA PARA LOS ARCHIVOS

public class JavaIntro1 {

    public static void main(String[] args) {
        System.out.println("Hola Mundo"); //MUESTRa, prinLN separado, print junto
        String nombre;// TEXTO, CADENA - NO CAMBIA
        int numero = 10; //BYTE(-128,127),SH0RT(-32...,32,767..)(FLOAT, DOUBLE
        double decimales = 9.8;
        boolean num; //VERDADERO y FALSO
        System.out.println(numero);
        System.out.println(decimales);
        System.out.println("****");
        /****/
        String name = "NADIN GONZALEZ";
        float n = 18;
  	boolean bandera = false;
  	char unicode;
        System.out.println(name);
        System.out.println(n);
        System.out.println(bandera);
        System.out.println("****");
        /****/
        int numeros = 48;
        double d = 3.55; 	
        boolean bande = false;
        System.out.println(numeros);
        System.out.println(d);
        System.out.println(bande);
        System.out.println("****");
        /****/
        int num1 = 5;
	int num2 = 5;
	int suma = num1 + num2;
	double division = num1 / num2;
	boolean logico = num2 < num1;
	num1++; //LE SUMA +1
        System.out.println(division);
        System.out.println(logico);
        System.out.println(num1);
        System.out.println("****");
        /****/
        int n1 = 2; //SE DEFINE N1
        int n2 = 10; //SE DEFINE N1
        int s = n1 + n2; //SUMA
        int r = n1 - n2; //RESTA
        double di = n1 / n2; //DIVISION
        int m = n1 * n2; //MULTIPLICAION
        double mod = n1 % n2; //MOD
        n2++;
        n1--;
        boolean vf = n1 == n2; //LOGICO N1 IGUAL A N2, y asi con otros operadores
        System.out.println(s);
        System.out.println(r);
        System.out.println(di);
        System.out.println(m);
        System.out.println(mod);
        System.out.println(n2);
        System.out.println(n1);
        System.out.println("***");
        /****/
        System.out.println("La variable tata tiene:" + vf);
        System.out.print(vf);
        System.out.print("Hola");
	System.out.print("Mundo");
        System.out.println("***");
        /****/
        int numEntero1 = 4;	
        String numCadena1 = String.valueOf(numEntero1); //PASAR DE NUM A CADENA
        System.out.println(numCadena1);
        String numCadena2 = "1";  	
        int numEntero2 = Integer.parseInt(numCadena2); //PASAR DE CADENA A NUM
        System.out.println(numEntero2);
        System.out.println("***");
        int math = (int) (Math.random() * 10);
        System.out.println(math);
    }
}
