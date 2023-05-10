import java.util.Scanner;

// UD 5 - PROGRAMACION MODULAR
// EJERCICIOS RESUELTOS FUNCIONES
    // Escribir una función que realice la potencia de 2 números dados por el usuario, 
    // siendo uno la base y otro el exponente. 
    // Utilizar esta función para mostrar los cuadrados de los números del 1 al 10. 

public class UD5Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // SOLICITUD AL USUARIO PARA INTRODUCIR LA BASE 
        System.out.print("Introduce la base: ");
        int base = teclado.nextInt(); 

        // SOLICITUD AL USUARIO PARA INTRODUCIR EL EXPONENTE
        System.out.print("Introduce el exponente: ");
        int exponente = teclado.nextInt();

        // IMPRIMIR POR PANTALLA EL CALCULO DE LA FUNCIÓN DE LA POTENCIA 
        System.out.println("El resultado de " + base + "^" + exponente + " es: " + potencia(base, exponente));

        // IMPRIMIR POR PANTALLA LOS CUADRADOS DE LOS NÚMEROS DEL 1 AL 10.
        System.out.print("Los cuadrados de los números del 1 al 10: ");
            // CALCULO DE LOS CUADRADOS DE LOS NUMEROS DEL 1 AL 10.
            for (int i = 1; i <= 10; i++) {
                System.out.print(potencia(i,2) + " " );
            }
       
        teclado.close();
    }

    // PROGRAMACIÓN MODULAR
    // FUNCION POTENCIA
    public static int potencia (int a, int b) {
        int solucion = 1; 
        if (b == 0) {
            System.out.println("No se puede realizar una potencia con base 0");
        } 
        for (int i = 1; i <= b; i++) {
            solucion = solucion *a;
        }
        return solucion; 
    }   
}
