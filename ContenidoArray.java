import java.util.Scanner;

// UD 4 - CASO PRACTICO 3
    // Crea un array de 4 posiciones para guardar números de tipo entero. 
    // Haz un bucle para pedirle al usuario que rellene el array. 
    // A continuación, muestra por pantalla los datos introducidos. 

public class ContenidoArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Inicializacion del array + iniciaclizacion de longitud del array
        int [] arrayEntero = new int [4];
        int n = 4;

        // Petición al usuario de que rellene el ARRAY 
        for (int indice = 0; indice < n; indice++) {
            System.out.println("Introduzca un valor para la posicion " + indice + ": ") ;
            arrayEntero [indice] = teclado.nextInt();
        }

        // MOSTRAR al usuario el ARRAY 
        System.out.println("Valores del array [4]: ");
        for (int a = 0; a<n ; a++) {
            System.out.print(arrayEntero[a] + ", ");
        }

    teclado.close();
    }
}
