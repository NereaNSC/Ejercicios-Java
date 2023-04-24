import java.util.Scanner;
// UD 5 - CASO PRACTICO 3
// CALCULAR LA LETRA DEL DNI EN FUNCION DEL NÚMERO DE DNI FACILITADO.
    // El calculo de la letra se realiza dividiendo el numero del DNI entre 23, 
    // en función del resto se obtiene la letra que le corresponde. 
    // (El resto tiene que tener como valor los números entre 0 y 22). 

public class CalculoLetraDNI {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero = numeroDNI(teclado, 0);     // asigna el valor devuelto por la funcion a una variable; 
        letraDNI(numero);   // utiliza la variable en otra funcion

    teclado.close();
    }
    // PROGRAMACION MODULAR
        // FUNCION - PEDIR DNI  
        public static int numeroDNI (Scanner teclado, int numeroDNI) {
            // SOLICITUD AL USUARIO DE INTRODUCIR NÚMERO POR PANTALLA 
            System.out.print("Introduzca el número de su DNI: ");
            numeroDNI = teclado.nextInt ();

            return numeroDNI; 
        }
    // PROGRAMACION MODULAR
        // FUNCION - LETRA DNI 
        public static void letraDNI (int numeroDNI) {
            // DECLARACIÓN DEL ARRAY PARA SABER QUE LETRA LE CORRESPONDE AL DNI SEGÚN EL RESTO.
            char [] arrayDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'}; 
            
            // CALCULO DEL MODULO DEL DNI 
            int resto = numeroDNI % 23;
            System.out.println("La letra del DNI es: " + arrayDNI[resto]);        
        }
}
