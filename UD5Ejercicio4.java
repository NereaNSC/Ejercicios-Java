import java.util.Scanner;

// UD 5 - PROGRAMACION MODULAR
// EJERCICIOS RESUELTOS FUNCIONES
    // Crea una función recursiva que calcule el resultado de un número elevado a otro.

public class UD5Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // SOLICITUD AL USUARIO QUE INTRODUZCA UN NÚMERO QUE SERA LA BASE
        System.out.print("Introduce un primer número: ");
        double base = teclado.nextInt();

        // SOLICITUD AL USUARIO QUE INTRODUZCA UN SEGUNDO NÚMERO QUE SERA EL EXPONENTE
        System.out.print("Introduce otro número: ");
        double exponente = teclado.nextInt();

        // IMPRIMIMOS EL RESULTADO
        System.out.println(base + " ^ " + exponente + " = " + numeroPotencia(base,exponente));  
        

        teclado.close();
    }

    // FUNCION RECURSIDA
    // CALCULAR EL RESULTADO DE UN NÚMERO ELEVADO A OTRO 
    public static double numeroPotencia (double base, Double exponente) {

        if (exponente==0) {     // Cualquier número elevado a 0 es = 1
            return 1;           
        } else if (exponente==1) {  // Cualquier número elevado a 1 es ese mismo número
            return base;
        } else {
            return (base * numeroPotencia(base, exponente-1));
        }
    }
}
