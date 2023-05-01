import java.util.ArrayList;
import java.util.Scanner;

// UD 3 - ACTIVIDAD SEMANA 5 - PARTE 2 
// EJERCICIO 5
    // Pedir al usuario un número hasta que inserte 0. Una vez finalizado mostrar en orden los números insertados por el usuario.
    
public class UD3Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>(); // NECESITAMOS EL ARRAY PARA QUE ALMACENE LOS NUMEROS INTRODUCIDOS POR EL USUARIO
        int numero;

        // SOLICITAMOS AL USUARIO QUE INTRODUZCA UN PRIMER NÚMERO
        System.out.println("Introduzca un número, (0 para finalizar el programa).");
        numero = teclado.nextInt();

        // INICIAMOS UN BUCLE CON WHILE   
            // PARA QUE EL PROGRAMA SE EJECUTE DE FORMA INFINITA MIENTRAS EL NUMERO SEA DISTINTO DE 0
        while (numero != 0) {
            numeros.add(numero);    // GENERAR EL ALMACEN DE LOS NUMEROS INTRODUCIDOS POR EL USUARIO
            System.out.println("Introduzca otro número: ");
            numero = teclado.nextInt();
        }

        // MOSTRAR AL USUARIO, CUANDO FINALIZE EL PROGRAMA, TODOS LOS NÚMEROS INTRODUCIDOS EN ORDEN.
        System.out.println("Los números ingresados en orden son: ");
        for (int a = 0; a < numeros.size(); a++) {
            System.out.print(numeros.get(a) + " ");
        }

    teclado.close();
    }
}
