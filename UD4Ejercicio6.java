import java.util.Scanner;

// UD 4 - EJERCICIO TC 30/11/2022 
    // Crear dos matrices de las dimensiones que indique el usuario 
    // y rellenarlas con datos introducidos por teclado. Mostrar los elementos comunes de la primera matriz en la segunda. 


public class UD4Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //DIMENSIONES POR TECLADO 
        System.out.print("Introduce el número de columnas de la primera matriz:");
        int columnas1 = teclado.nextInt();
        System.out.print("Introduce el número de filas de la primera matriz:");
        int filas1 = teclado.nextInt();
        System.out.print("Introduce el número de columnas de la segunda matriz:");
        int columnas2 = teclado.nextInt();
        System.out.print("Introduce el número de filas de la segunda matriz:");
        int filas2 = teclado.nextInt();
       
        //DECLARACION DE LAS MATRICES
        int[][] matriz1 = new int[filas1][columnas1]; // La otra forma de crear una matriz, solo si sabemos sus valores;   int[][] matriz1 = {{1,2,3},{4,5,6}}
        int[][] matriz2 = new int[filas2][columnas2];

        // RECORREMOS Y DAMOS VALORES PARA LA PRIMERA MATRIZ
        System.out.println("Rellenamos la primera matriz:");
        for (int i = 0; i < filas1; i++){
            for (int j = 0; j < columnas1; j++){
                System.out.print("Introduce el elemento de la posición [" + i + "][" + j + "]: ");
                matriz1[i][j] = teclado.nextInt();
            }
        }

        // RECORREMOS Y DAMOS VALORES PARA LA SEGUNDA MATRIZ
        System.out.println("Rellenamos la segunda matriz:");
        for (int i = 0; i < filas2; i++){
            for (int j = 0; j < columnas2; j++){
                System.out.print("Introduce el elemento de la posición [" + i + "][" + j + "]: ");
                matriz2[i][j] = teclado.nextInt();
            }
        }

        // VAMOS A COMPROBAR QUE ELEMENTOS SE REPITEN EN LAS DOS MATRICES
        System.out.println("Comprobamos que elementos de la primera matriz aparecen en la segunda: ");
       
        // RECORREMOS LAS DOS MATRICES Y COMPARAMOS LOS ELEMENTOS DE LAS MISMAS
        for (int i = 0; i < filas1; i++){
            for (int j = 0; j < columnas1; j++){
                for (int k = 0; k < filas2; k++){
                    for (int n = 0; n < columnas2; n++){
                        // SI LA MATRIZ UNO - ES IGUAL A LA MATRIZ DOS, IMPRIMIMOS LOS DATOS QUE SE REPITEN 
                        if (matriz1[i][j] == matriz2[k][n]){
                            System.out.println("El elemento " + matriz1[i][j] + ", aparece en las dos matrices");
                        }
                    }
                }
            }
        }
    teclado.close();
    }
}
