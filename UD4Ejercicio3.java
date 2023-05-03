// UD 4 - EJERCICIOS ARRAY UNIDIMENSIONALES
    // Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. 
            // Obtén la suma de todos 
            // y la media


public class UD4Ejercicio3 {
    public static void main(String[] args) {
        
        // Declaración array
        int [] array = new int [100];

        int suma = 0;
        double media;

        System.out.println("Este es el resultado del array: ");

        // RECORRER EL ARRAY - LO COMPLETAMOS - MOSTRAR EL RESULTADO DEL ARRAY
        for (int a = 0; a < array.length; a++) {
            // Completar el array, numeros del 1 al 100. 
            array [a] = a + 1; 
            // Imprimir el array
            System.out.println(" Posición:  " + a + ". Resultado: " + array[a]);
        }

        // CALCULAMOS Y MOSTRAMOS LA SUMA DE TODOS LOS NUMEROS
        System.out.println(" ");
            for (int a = 0; a < array.length; a++) {
                suma += array [a];  // sumamos uno a uno los valores que componen el array 
            }                       // y lo almacenamos en la variable suma
        System.out.print("La suma de todos los números que componen el array es = " + suma);

        // CALCULAMOS Y MOSTRAMOS LA MEDIA 
        System.out.println(" ");
        media = (double) suma / array.length;
        System.out.print("La media de todos los números que componen el array es: " + media);
    }
}
