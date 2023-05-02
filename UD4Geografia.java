import java.util.Scanner;

// UD 4 - ACTIVIDAD SEMANA 7 - PARTE 3
// Crea un programa que pida por pantalla cuatro provincias españolas y a continuacion tres ciudades de cada una de ella.
        // Los nombres de ciudades deben almacenarse en un array multidimensional cuyo primer índice sea el número asignado a cada provincia
        //  y el segundo índice el número asignado a cada ciudad.

public class UD4Geografia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaración de la MATRIZ
        String [][] matrizGeografia = new String [4] [3];

        int provincias = 4;
        int ciudades = 3;

        // Solicitud al usuario de introducir por pantalla 4 PROVINCIAS
        for (int a = 0; a < provincias; a++) {
            System.out.print("Introduzca el nombre de una Provincia: ");
            matrizGeografia [a] [0] = teclado.nextLine(); 

            System.out.print("Introduzca un nombre de una Ciudad para la provincia de " + matrizGeografia [a][0] + ": " );

            // Solicitud al usuario de introducir 3 CIUDADES de cada provincia introducida. 
            for (int b = 0; b < ciudades; b++) {
                matrizGeografia [a] [b] = teclado.nextLine(); 
                System.out.print("Introduce otra ciudad: ");
            }
        }

        // Imprimir los datos introducidos
        System.out.println("La matriz resultante es: ");
        for (int c = 0; c < provincias; c++) {
            System.out.print("Provincia: ");
            System.out.print(matrizGeografia [c][0] + " ");
            System.out.print("Ciudades: ");
            for (int d = 0; d < ciudades; d++) {
                System.out.print(matrizGeografia [c] [d] + " ");
            }
        System.out.println(" ");
        }
    teclado.close();
    }
}
