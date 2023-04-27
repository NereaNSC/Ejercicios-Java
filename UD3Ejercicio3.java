import java.util.Scanner;

// UD 3 - ACTIVIDAD SEMANA 5 - PARTE 2 
// EJERCICIO 3
    // Dados un dividendo y un divisor, indique por pantalla si la división de ambos es exacta.

public class UD3Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1º - SOLICITAMOS AL USUARIO UN DIVIDENDO 
        System.out.println("Indica un dividendo: ");
        var dividendo = Integer.parseInt(teclado.nextLine());

        // 2º - SOLICITAMOS AL USUARIO UN DIVISOR
        System.out.println("Indique un divisor: ");
        var divisor = Integer.parseInt(teclado.nextLine());

        // ESTABLECEMOS LA CONDICON PARA SABER SI LA DIVISION ES ENTERA O NO. 
        if (dividendo % divisor == 0) {
            System.out.println("La division es entera:  ");
            System.out.println("El resto es = " + (dividendo % divisor));
        } else {
            System.out.println("La division no es entera");
            System.out.println("El resto de la division es = " + (dividendo % divisor));
        }

    teclado.close();
    }
}
