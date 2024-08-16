
import java.util.Scanner;

/**
 * @author nerea
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = leer.nextInt();
        
        if (esPrimo(numero)) {
            System.out.println("========================");
            System.out.println("Es un número primo");
            System.out.println("========================");
        } else {
            System.out.println("========================");
            System.out.println("No es un número primo");
            System.out.println("========================");
        }
        
    }
    
    // Funcion para detectar si el número es primo o no 
    static boolean esPrimo (int numero) {
        int contador = 0;
        
        int[] numeros = new int [numero];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i+1;
        }
        
        for (int i : numeros) {
            if ( i == 1 || i == numero) {
                continue;
            }
            
            if (numero % i == 0) {
                contador ++;
            }
        }
        return contador == 0; 
    }
}
