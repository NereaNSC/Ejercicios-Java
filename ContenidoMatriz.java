import java.util.Scanner;

// UD 4 - CASO PRACTICO 4 
    // Mostrando una matriz con sus números de fila y columna
    // Intenta ponerle un título a cada fila y columna con sus números correspondientes.

public class ContenidoMatriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaración e inicialización de la matriz
        int [] [] matriz = new int [3] [3];

        int numeroFilas = 3;
        int numeroColumnas = 3;

        // Declaración DE LA MATRIZ + permitir al usuario rellenar los valores de la matriz 
        for (int fila = 0; fila < numeroFilas; fila++) {    
            for ( int columna = 0; columna < numeroColumnas; columna++) {
                System.out.println("Introduzca el valor para la posición: [" + fila + "] [" + columna + "]: " );
                matriz [fila] [columna] = teclado.nextInt ();
            }
        }

        // Imprimir titulos de las columnas
        System.out.println("===== CONTENIDO DE LA MATRIZ =====");
        
        // Imprimir titulo de las columnas
        System.out.print ("\t");
        for ( int columna = 0; columna < numeroColumnas; columna++) {
            System.out.printf("    C%1d", columna);
        } 
        System.out.println();

        // Imprimir MATRIZ
        for (int fila = 0; fila < numeroFilas; fila++) {  
            System.out.printf("\t F%-2d", fila);       // Imprimimos TITULO FILA
            for ( int columna = 0; columna < numeroColumnas; columna++) {
                System.out.printf("[%02d] ", matriz [fila] [columna]);
            }
            System.out.println();
        }

    teclado.close();
    }
}
