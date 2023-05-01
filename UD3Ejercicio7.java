import java.util.Scanner;

// UD 3 - ACTIVIDAD SEMANA 5 - PARTE 2 
// EJERCICIO 7
    // Escribir un progrma en java que dado por teclado un número, escriba lo siguiente:
            // “A” si su módulo con 5 es 0 
            // “B” si su módulo con 5 es 1 
            // “C” si su módulo con 5 es 2 
            // “D” si su módulo con 5 es 3 
            // “E” si su módulo con 5 es 4 
            // “F” en otro caso


public class UD3Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        //SOLICITAR AL USUARIO UN NÚMERO
        System.out.println("Introduzca un número entero");
        double numero = teclado.nextDouble();
        int numeroEntero = (int) numero;
            
            switch (numeroEntero % 5) {
                case 0: 
                    System.out.println("A");
                    break;
                case 1:
                    System.out.println("B");
                    break;
                case 2:
                    System.out.println("C");
                    break;
                case 3: 
                    System.out.println("D");
                    break;
                case 4:
                    System.out.println("E");
                    break;
                default:
                    System.out.println("F");
                    break;
            }
    teclado.close();
    }
}
