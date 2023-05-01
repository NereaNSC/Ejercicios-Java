import java.util.Scanner;

// UD 3 - ACTIVIDAD SEMANA 5 - PARTE 2 
// EJERCICIO 8
    // Programa que calcule si un determinado numero facilitado por pantalla es primo. 
    //** Los números primos son aquellos que solo son divisibles entre ellos mismos y el 1
public class UD3Ejercicio8 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    //SOLICITAMOS AL USUARIO QUE INTRODUZCA UN NÚMERO ENTERO
    System.out.println("Introduce un número entero: ");
    int numero = teclado.nextInt();
    int contador = 0;
        // Comprobaremos las divisiones entre todos los valores hasta él mismo (sin incluir el 1 y él mismo). 
        for (int a = 2; a < numero; a++) {
            if (numero % a == 0) {  //Si el módulo del número es 0 quiere decir que el número es divisible por un valor distinto a 1 y sí mismo 
                contador++;      
            }
        }
        // Si el numero se puede dividir por si mismo  y / o  por 1 es primo 
        if (contador == 0) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " NO es primo.");
        }
    teclado.close();
    }
}
