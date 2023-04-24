import java.util.Scanner;

// UD 5 - CASO PRACTICO 1
    // Crea un array de 4 posiciones para guardar números de tipo entero. 
    // Haz un bucle para pedirle al usuario que rellene el array. 
    // A continuación, muestra por pantalla los datos introducidos. 

    // De qué manera podrías aprovechar la programación modular para reducir el número de líneas de código 
    // y, sobre todo, para reutilizar el código que se repite varias veces.

public class ContenidoArrayUD5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaración del ARRAY 
        int [] arrayEntero = new int [4];
        int n = 4;

        // SOLICITUD AL USUARIO PARA QUE RELLENE EL ARRAY 
        pedirValores(teclado, arrayEntero, n);
        
        // MOSTRAR EL ARRAY AL USUARIO 
        mostrarArray(arrayEntero, n);
        
    teclado.close();
    }

    // PROGRAMACION MODULAR 
    // FUNCION - SOLICITUD AL USUARIO PARA QUE RELLENE EL ARRAY 
    public static void pedirValores (Scanner teclado, int [] arrayEntero, int n) {
        for (int indice = 0; indice < n; indice++) {
            System.out.print("Introduzca un valor para la posicion " + indice + ": ") ;
            arrayEntero [indice] = teclado.nextInt();
        }

    }
    
    // PROGRAMACION MODULAR 
    // FUNCION - MOSTRAR EL ARRAY AL USUARIO 
    public static void mostrarArray (int [] arrayEntero, int n) {
        System.out.print("Valores del array [4]: ");
        for (int a = 0; a<n ; a++) {
            System.out.print(arrayEntero[a] + ", ");
        }

    }
}
