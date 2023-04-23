import java.util.Random;

// UD 4 - PONTE A PRUEBA 1 
    // Realiza un programa que simule el lanzamiento de un dado normal tres veces, 
    // es decir, con sus 6 lados numerados del 1 al 6. 
    // Muestra por pantalla el número de la tirada y el valor que ha salido al lanzar el dado. 

public class LanzamientoDado {
    public static void main(String[] args) {
        
        // VAMOS A TIRAR LOS DADOS  - VAMOS A REPETIR LA TIRADA 3 VECES
        System.out.println("Vamos a tirar los dados");

            // Creamos una instancia de la clase Random para generar números aleatorios
            Random aleatorio = new Random();

            // Lanzamiento de los dados
            int numeroAleatorio = (int) aleatorio.nextInt(6) + 1;
            System.out.println("Primera tirada: " + numeroAleatorio);

            int numeroAleatorio2 = (int) aleatorio.nextInt(6) + 1;
            System.out.println("Segunda tirada: " + numeroAleatorio2);

            int numeroAleatorio3 = (int) aleatorio.nextInt(6) +1;
            System.out.println("Tercera tirada: " + numeroAleatorio3);

        System.out.println("\n");
        // MEJORA, GENERAR EL PROGRAMA EN UN BUCLE FOR PARA NO REPETIR EL CODIGO
            // REPETIR LA TIRADA 3 
            final int NUMERO_TIRADAS = 3;

            for (int a = 1; a <= NUMERO_TIRADAS; a++) {
                int numeroAleatorio4 = aleatorio.nextInt(6)+1;
                System.out.println("Tirada: " + a + ": " + numeroAleatorio4);
            }
    }
}
