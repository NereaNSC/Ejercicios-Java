import java.util.Scanner;

// UD 5 - CASO PRACTICO 2
// Declara una funcion
    // Creamos un programa que introduciendo dos numeros, 
    // nos muestre por pantalla el primer numero tantas veces como el valor del segundo numero. 



public class CasoPractico2UD5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 

        // SOLICITUD AL USUARIO DE QUE INTRODUZCA DOS NÚMEROS POR PANTALLA 
        introducirNumero(teclado, 0, 0);
    }

    // PROGRAMACIÓN MODULAR 
    // FUNCION - SOLICITUD AL USUARIO DE QUE INTRODUZCA DOS NÚMEROS POR PANTALLA
    public static void introducirNumero (Scanner teclado, int numero1, int numero2) {
        // Solicitud primer número
        System.out.print("Introduce un número entero: ");
        numero1 = teclado.nextInt(); 
        // Solicitud segundo número
        System.out.print("Introduce otro número entero: ");
        numero2 = teclado.nextInt(); 
        // Impresion por pantalla de los dos números facilitados por el usuario 
        System.out.print ("El primer número introducido es: " + numero1 + ". El segundo núemro introducido es: " + numero2 + "."); 
        System.out.println("");

        // LLAMADA A LA FUNCIÓN repetirNumero CON LOS VALORES INTRODUCIDOS
        repetirNumero(numero1, numero2);
    }

    // PROGRAMACIÓN MODULAR
    // FUNCION - REPETIR EL PRIMER NÚMERO TANTAS VECES COMO TENGA DE VALOR EL SEGUNDO NÚMERO
    public static void repetirNumero (int numero1, int numero2) {
        for (int a = 0; a < numero2; a++) {
            System.out.println(numero1);
        }
    }
}
