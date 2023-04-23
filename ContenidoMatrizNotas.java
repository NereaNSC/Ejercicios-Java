import java.util.Scanner;

// UD 4 - PONTE A PRUEBA 4
    // Queremos guardar las notas de una asignatura a lo largo de las tres evaluaciones 
    // y mostrar un listado como el que aparece más abajo

    // Indica, el dígito asociado a cada estudiante (de momento, pondremos solo un número 
    // para identificarlos), su nota para cada evaluación y, por último, su nota media.


public class ContenidoMatrizNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Crear la matriz
        int [] [] notas = new int [4] [4];

        int numeroEstudiantes = 4;  
        int numeroEvaluaciones = 4;

        // Declaracion de la matriz + introducir notar de cada estudiante
        for (int estudiante = 1; estudiante < numeroEstudiantes; estudiante++) {
            System.out.println("Introduce las notal del estudiante " + estudiante + ": ");
            for (int evaluacion = 1; evaluacion < numeroEvaluaciones; evaluacion++) {
                System.out.print("Nota de la evaluación " + evaluacion + ": ");
                notas [estudiante] [evaluacion] = teclado.nextInt();
            }
            System.out.println("\n");
        }

        // Titulo MATRIZ
        System.out.println("==========  NOTAS  ==========");

        // Titulo columnas1
        System.out.println("Al. Eval1 Eval2 Eval3 Media");

        // Mostrar la MATRIZ
        for (int estudiante = 1; estudiante < numeroEstudiantes; estudiante++) {
            System.out.printf("%-2d   ", estudiante); // Titulo FILA 
            int suma = 0;
            for (int evaluacion = 1; evaluacion < numeroEvaluaciones; evaluacion++) {
                System.out.printf( "%-4d  ", notas[estudiante][evaluacion]);

                //Calculo nota media
                suma += notas[estudiante][evaluacion];
            }
            double media = (double) suma / numeroEvaluaciones;
            System.out.printf("%-6.2f\n", media);
        }
   
    teclado.close();
    }
}
