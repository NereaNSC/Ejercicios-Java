import java.util.Scanner;

// UD 3 - ACTIVIDAD SEMANA 5 - PARTE 2 
// EJERCICIO 2
    // Solicitar al usuario un numero que vamos a ir incrementando desde 1 hasta 
    // que la suma de todos esos numeros se mayor a la variable introducida X. 
            // X = 10; 1, 2, 3, 4, 5 -> 1+2+3+4+5 = 15 
            // X = 25; 1, 2, 3, 4, 5, 6, 7 -> 1+2+3+4+5+6+7 = 28 

public class UD3Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //SOLICITUD AL USUARIO DEL VALOR DE X 
        System.out.println("Introduzca el valor de la X:");
        int x = teclado.nextInt ();
        
        int numero = 1;
        int suma = 0;
        String cadena =" ";     // ESTA CADENA IRA ALMACENANDO LOS NÚMEROS y los signos del IF

        // bucle  con WHILE, que se ejecutará mientras la suma de los números introducidos sea menor o igual a X
        while (suma<=x) {
            cadena = cadena + Integer.toString(numero);
            suma = suma+numero;
            numero++;

            // PARA QUE SE ALMACENE EL CARACTER CORRECTO EN LA VARIABLE CADENA
            if (suma <= x) {
                cadena = cadena + " + ";
            } else {
                cadena = cadena + " = ";
            }
        }
        System.out.println(cadena+suma);
        
    teclado.close();
    }
}
