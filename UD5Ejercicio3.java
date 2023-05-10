import java.util.Scanner;

// UD 5 - PROGRAMACION MODULAR
// EJERCICIOS RESUELTOS FUNCIONES
    //  Crea una aplicación que nos genere una cantidad de números enteros aleatorios que nosotros le pasaremos por teclado. 
        // Crea un método donde pasamos como parámetros entre que números queremos que los genere podemos pedirlas por teclado antes de generar los números.
        // Este método devolverá un número entero aleatorio. 
        // Muestra los números por pantalla


public class UD5Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // CONSULTAMOS AL USUARIO CUÁNTOS NÚMEROS QUIERE IMPRIMIR POR PANTALLA 
        System.out.print("Cuántos números quieres que imprimamos por pantalla? ");
        int cantidad = teclado.nextInt(); 
        
        // CONSULTAMOS AL USUARIO EL VALOR MÍNIMO DE LOS NÚMEROS ALEATORIOS 
        System.out.print("Introduce el valor minímo de los números aleatorios: ");
        int minimo = teclado.nextInt(); 
        
        // CONSULTAMOS AL USUARIO EL VALOR MÁXIMO DE LOS NÚMEROS ALEATORIOS 
        System.out.print("Introduce el valor máximo de los números aleatorios: ");
        int maximo = teclado.nextInt(); 

        // GENERAMOS UN BUCLE PARA QUE NOS IMPRIMA POR PANTALLA TANTOS NÚMEROS COMO NOS HA PEDIDO EL USUARIO CON LA VARIABLE "CANTIDAD"
        System.out.print("Los números aleatorios generados son: ");
        for (int i = 0; i < cantidad; i++ ) {
            System.out.print(numeroAleatorio(minimo, maximo) + " "); // 
        }

        teclado.close();
    }

    // PROGRAMACIÓN MODULAR - MÉTODO
    // GENERAMOS NÚMEROS ALEATORIOS ENTRE EL NÚMERO MÍNIMO Y EL MÁXIMO INTRODUCIDO POR EL USUARIO 
    public static int numeroAleatorio (int minimo, int maximo) {
        return ((int)Math.floor(Math.random()*(maximo + 1 - minimo) + minimo));
    }
    
}
