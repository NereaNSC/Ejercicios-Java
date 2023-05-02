import java.util.Arrays;
import java.util.Scanner;

// UD 4 - EJERCICIOS ARRAYS UNIDIMENSIONALES
    // CREA UN ARRAY DE 10 POSICIONES DE NÚMEROS CON VALORES PEDIDOS POR TECLADO. 
    // MUESTRA POR CONSOLA EL INDICE Y EL VALOR AL QUE CORRESPONDE. 
    
public class UD4Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaración array 10 posiciones
        int [] array = new int [10];

            // RELLENAR EL ARRAY 
            for ( int a = 0; a < array.length; a++) {
                System.out.print("Introduzca valores para un array de 10 posiciones: ");
                array [a] = teclado.nextInt(); 
            } 
            System.out.println("");
            
            // PARA MOSTRAR EL ARRAY EN TEXTO PLANO: 
            System.out.println("El resultado del array es: " + Arrays.toString(array));
            System.out.println("");

            // MOSTRAR EL INDICE Y VALOR DEL ARRAY 
            for (int a = 0; a < array.length; a++ ) {
                System.out.println("El valor en la posicion: " + a + " es: " + array [a] );
            }
        teclado.close();
    }
}
