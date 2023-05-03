import java.util.Scanner;

// UD 4 - EJERCICIOS ARRAYS UNIDIMENSIONALES
    // Programa donde le preguntamos al usuario cual es el tamaño del array
    // Lo rellenamos con numeros aleatorios entre 0 y 9, 
            // Muestra por pantalla el valor de cada posicion
            // Y la suma de todos los valores. 

public class UD4Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitud al usuario de la dimension del array
        System.out.print("Introduce una cantidad para el tamaño del array: ");
        int tamañoArray = teclado.nextInt();

        // Declaración del array
        int [] array = new int [tamañoArray] ;

        // Vamos a rellenar el array con numeros aleatorios entre 0 y 9
        for (int a = 0; a < array.length; a++) {
            // Math.floor(Math.random()*(N-M+1)+M); // Valores entre N y M ambos incluidos. Lo hacemos en dos pasos:
            double numeroAletorio = Math.random() * (0-9+1)+9;  // calculamos el numero aleatorio entre 0 y 9
            double numeroAletorioInt = Math.floor(numeroAletorio);  // pasamos ese número decimal a entero

            array [a] = ((int) numeroAletorioInt); // Math.floor nos devuelve un double, hacemos conversión explícita a int
        }

        // Mostramos el contenido del array a la vez que sumamos todos los valores (aprovechamos el mismo bucle for)
        int suma = 0;
        for(int i = 0; i < array.length; i++){
            suma += array[i];
            System.out.println("En el indice "+i+" esta el valor "+array[i]);
        }

        // Mostramos la suma de los valores del array
        System.out.println("La suma de los valores del array es: " + suma);

        teclado.close();
    }
}
