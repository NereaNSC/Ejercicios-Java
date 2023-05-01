import java.util.Scanner;

// UD 3 - ACTIVIDAD SEMANA 5 - PARTE 2 
// EJERCICIO 4
    // Dado un número, realiza un programa que indique por pantalla en una frase
    // sus propiedades, las cuales pueden ser: 
    // Par o impar. Positivo o negativo. Entero o decimal


public class UD3Ejercicio4 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un numero: ");
    double numero = teclado.nextDouble(); 

        //NUMERO POSITIVO VS NEGATIVO
            if (numero>=0) {
                System.out.println("El número introducido es positivo. ");
            } else {
                System.out.println("El número introducido es negativo.");
            }

        //NUMERO PAR O IMPAR 
            if (numero%2 == 0) {
                System.out.println("El número introducido es par");
            } else {
                System.out.println("El número introducido es impar");
            }

        //NUMERO ENTERO O DECIMAL                   // Math.floor () devuelve el entero mas cercano a un numero decimal
            if (numero == Math.floor(numero)) {     // Comparamos el resultado de la función Math.floor() con el número original. 
                System.out.println("El número introducido es entero");  // Si son iguales, entonces el número es entero
            } else {
                System.out.println("El número introducido es decimal"); // De lo contrario es decimal.
            }

    teclado.close();
    }
}
