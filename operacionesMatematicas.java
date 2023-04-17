import java.util.Scanner;

// UD 4 - CASO PRACTICO 1 
    // Aplicacion que le pida al usuario un número y muestre por pantalla su raiz cuadrada y su cuadrado
     

public class OperacionesMatematicas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar al usuario un número 
        System.out.println("Introduce un número");
        double numero = teclado.nextDouble();
        
        // Raiz cuadrada del número introducido por el usuario
        double raiz = Math.sqrt(numero);
        System.out.println("La raíz cuadrada de: " + numero + " es = " + raiz);

        // El cuadrado del número introducido por el usuario
        double cuadrado = Math.pow(numero, 2);
        System.out.println("El cuadrado de: " + numero + " es = " + cuadrado);

    teclado.close();
    }
}
