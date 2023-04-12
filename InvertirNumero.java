/*UD 2 - Introduccion a JAVA
**ACTIVIDAD  SEMANA 3 - PARTE 3 - EJERCICIO 2  */ 
import java.util.Scanner;
public class InvertirNumero {
    // Implementar un programa en Java que dado un número entero de 5 dígitos, 
    //   lo escriba al revés.
    public static void main(String[] args) {

        // OPCION 1 - SEPARACIÓN DE CADA DIGITO 
        int num= 13543;
        int unidades = num%10;
        int decenas = (num/10)%10;
        int centenas = (num/10/10)%10;
        int unidadesMillar = (num/10/10/10)%10;
        int centenasMillar = (num/10/10/10/10)%10;

        System.out.println("El numero: " + num + " al revés es: " + unidades + decenas + centenas + unidadesMillar + centenasMillar);


        //OPCION 2 - INVERTIMOS EL NUMERO CON WHILE 
        Scanner teclado = new Scanner(System.in);         

        int numero;
        int invertido=0;
        int resto; 

        System.out.println ("Introduce un número de al menos 5 caracteres"); 
        numero = teclado.nextInt();

            //AÑADIMOS CONDICION DE QUE TIENE QUE TENER 5 CIFRAS Y QUE TIENE QUE SER DISTINTO DE 0.
            while ((Integer.toString(numero).length() !=5) || (numero<0)) {
                System.out.println ("El número introducido  " + numero + "  no tiene 5 cifras o no es mayor que cero.");
                
                System.out.println ("Vuelve a introducir otro numero que sea valido, es decir, que sea mayor que 0 y que tenga 5 cifras.");
                numero = teclado.nextInt();
            }
                
                System.out.println ("El número introducido  " + numero + "  es valido" ); 
                System.out.println ("Vamos a invertir el número");

            //CON WHILE INVERTIMOS EL NUMERO 
            while ( numero > 0) {
                resto = numero % 10;
                invertido = invertido * 10 + resto;
                numero /= 10;
            }           

            System.out.println ("Ahora numero es = " + invertido);
            teclado.close();
    }
}
