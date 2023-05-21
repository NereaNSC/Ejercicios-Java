// UD 5 - PROGRAMACION MODULAR
// EJERCICIOS RESUELTOS FUNCIONES
    // Realiza una función recursiva que calcule la serie de Fibonacci 
    // hasta un número determinado de elementos que se indicará por teclado.
        // Secuencia Númerica de Fibonacci = cada número se obtiene sumando los dos anteriores de la secuencia. Comenzando con dos unos:  1 + 1 = 2, 2+1 = 3, 3+ 2 = 5 y así sucesivamente: 1, 1, 2, 3, 5, 8, 13,...

import java.util.Scanner;

public class UD5Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // SOLICITUD AL USUARIO PARA QUE INTRODUZCA UN NÚMERO QUE SERAN LAS REPRODUCIONES DE LA SERIE FIBONACCI
        System.out.print("Introduce un número entero: ");
        int limite = teclado.nextInt();

        // IMPRIMIMOS LA SERIE FIBONACCI
        System.out.print("Serie Fibonacci: ");
        for (int i = 0; i < limite; i++ ) {
            System.out.print(serieFibonacci(i) + ", ");
        }

        teclado.close();
    }


    // FUNCIÓN RECURSIVA 
    // CALCULAR LA SERIE DE FIBONACCI
    private static int serieFibonacci (int numeroFibonacci) {
        if (numeroFibonacci == 0 || numeroFibonacci == 1) {  
            return numeroFibonacci;
        } else { 
            return serieFibonacci(numeroFibonacci-1) + serieFibonacci(numeroFibonacci-2);
        }
    }
}
