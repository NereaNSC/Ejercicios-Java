import java.util.Scanner;

// UD 4 - EJERCICIOS ARAY UNIDIMENSIONALES
    // Pedir al usuario por teclado un frase y pasar sus caracteres a un array de caracteres.

public class UD4Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String frase;

        // SOLICITAS AL USUARIO UNA FRASE 
        System.out.print("Introduzca una frase: ");
        frase = teclado.nextLine();

        // Declaramos el array de caracteres 
        char arrayCaracteres [] = new char [frase.length()]; // le decimos que tamaño es igual a la longitud de la frase

        System.out.println("El resultado del array es: ");
        // Recorremos la frase, cogemos cada caracter y lo metemos en el array
        for (int a = 0; a < frase.length(); a++ ) {
            arrayCaracteres [a] = frase.charAt(a) ; // cada caracter lo convertimos en un valor del array 
            System.out.println("Posición: " + a + " . Resultado: " + arrayCaracteres [a]);  // imprimimos el array por pantalla 
        }
        teclado.close();
    }
}
