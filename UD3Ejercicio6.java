import java.util.Scanner;

// UD 3 - ACTIVIDAD SEMANA 5 - PARTE 2 
// EJERCICIO 6
    // Escribir un programa en Java que dado un número por teclado, 
    // escriba “El número es válido” si cumple los siguientes requisitos. y si no, "el numero no es valido"
            // el número se encuentra entre 1000 y 10000
            // el número no es divisible por 5
            // el número no termina en 0

public class UD3Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // SOLICITAMOS AL USUARIO UN NÚMERO
        System.out.println("Introduce un número entero:");
        int numero = teclado.nextInt();
        // ESTABLECEMOS LAS CONDICIONES
        if (numero<=10000 && numero>=1000 && numero%5 !=0 && numero % 10 != 0) {
            System.out.println("El número es VÁLIDO");
        } else {
            System.out.println("El número NO es VÁLIDO");
        }

    teclado.close();
    }
}
