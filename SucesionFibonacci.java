import java.util.Scanner;

// UD 5 - CASO PRACTICO 5
    // Diseña una funcion a la que le pasemos un número y nos muestre la 
    // cantidad de numeros de Fibonacci requeridos para alcazar el número. 
    // Úsala en un programa que pida la cantidad de números de Fibonacci que debe mostrar por pantalla. 

            // SUCESION DE FIBONACCI – sucesión infinita de números naturales. 
            // Empieza con 0 y 1, siguiendo con la suma de los dos números anteriores hasta el infinito.

public class SucesionFibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            System.out.println("Vamos una imprimir la Sucesión de número de Fibonacci:  ");

            // SOLICITUD AL USUARIO DE INTRODUCIR LA DIMENSION DE LA SERIE FIBONACCI
            System.out.print("¿Cuántos números de Fibonacci quieres mostrar? ");
            int longitudSerie = teclado.nextInt();

            // RECORREMOS EL FOR PARA IMPRIMIR CADA UNO DE LOS NÚMEROS DE LA SERIE FIBONACCI
            for(int i = 0; i < longitudSerie; i++) {
            System.out.print(fibonacci(i) + (i == longitudSerie - 1 ? " " : "," ));
            }
        teclado.close();
    }

    // SERIE FIBONACCI  --- FUNCION RECURSIVA
    public static int fibonacci (int numero) {   
        // CALCULAR LOS NÚMEROS DE LA SERIE DE FIBONACCI QUE SE VAN A MOSTRAR
        if (numero <2) {
            return numero;
        } else {
            return fibonacci(numero-1) + fibonacci(numero-2); 
        }
    }
}
