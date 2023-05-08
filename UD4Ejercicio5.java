import java.util.Scanner;

// UD 4 - EJERCICIO TC 30/11/2022
    // Programa en Java en el que pida al usuario la inserción de números hasta que inserte un 0. 
    // Una vez terminado, mostrar en orden los números insertados por el usuario. 

public class UD4Ejercicio5 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        //SOLICITUD AL USUARIO DE QUE INTRODUZCA UN NÚMERO
        System.out.println("Introduce un número. Introduce 0 para finalizar:");
        String numeroIntroducido = teclado.nextLine();

        String cadenaNumeros = "";

        // SI EL NUMERO INTRODUCIDO NO ES 0, ENTRAMOS EN EL BUCLE. 
        while (Double.parseDouble(numeroIntroducido) != 0){     // !numeroIntroducido.equals ("0")   como es un string con este metodo comprobariamos si el caracter introducido es 0
            cadenaNumeros = cadenaNumeros + " " + numeroIntroducido;        // vamos almacenando los numeros introducidos en la cadena
            System.out.println("introduce otro número: ");
            numeroIntroducido = teclado.nextLine();
        }

        // MOSTRAMOS AL USUARIO LOS NÚMEROS INTRODUCIDOS DESDE LA EJECUCIÓN DEL PROGRAMA
        System.out.println("Los números que has introducido son: " + cadenaNumeros);

       
        // OTRA FORMA DE HACERLO CON ARRAYS --- PROBLEMA SI NO SABEMOS LA EXTENSION DEL ARRAY
        System.out.println("OTRO EJEMPLO - REALIZAMOS LA SOLUCION CON ARRAYS");
            // SOLICITUD AL USUARIO INTRODUZCA UN NÚMERO
            System.out.println("Introduce un número. Introduce 0 para finalizar:");
            double numeroIntroducido2 = teclado.nextDouble();

            // DECLARACIÓN DEL ARRAY 
            double[] numerosIntroducidos = new double[50];       // La otra forma de crear un array, solo si sabemos sus valores: double[] array = {1,2,3,4,5,6,7};
            
            int indice = 0;
            // SI EL NUMERO INTRODUCIDO NO ES 0, ENTRAMOS EN EL BUCLE.
            while (numeroIntroducido2 != 0){
                numerosIntroducidos[indice] = numeroIntroducido2;
                System.out.println("Introduzca otro número: ");
                numeroIntroducido2 = teclado.nextDouble();
                indice++;
            }
            //// MOSTRAMOS AL USUARIO LOS NÚMEROS INTRODUCIDOS DESDE LA EJECUCIÓN DEL PROGRAMA
            System.out.print("Los números introducidos son: ");

            // 
            for (int i = 0; i<indice; i++){         // modificamos la longitud del array por indice para que solo imprima los numeros introducidos por pantalla
                // Modificar para que la longitud sea únicamente 
                // hasta el índice anterior para no sacar los no rellenados
                // for (int i = 0; i<indice; i++)
                System.out.print(numerosIntroducidos[i] + " ");
            }
    teclado.close();
    }
}
