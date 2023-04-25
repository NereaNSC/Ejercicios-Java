import java.util.Scanner;
// UD 5 - PONTE A PRUEBA 3 
    // Introducido por el usuario un numero de DNI y una letra, 
        // Comprobar si dicha letra es la correcta para el numero facilitado. 
        // Nos devolverá el resultado si la letra es correcta o false si no lo es. 

public class ComprobacionLetraDNI {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         
            // SOLICITUD AL USUARIO QUE NOS FACILITE UN NUMERO DE DNI + LETRA
            int numeroDNI = solicitudDNI (teclado, 0);
            char letraDNI = solicitudLetra (teclado, 'A');

            boolean esCorrecto = comprobarLetraDNI(numeroDNI, letraDNI);
            System.out.println(esCorrecto);

    teclado.close();
    }

    // SOLICITUD AL USUARIO DE QUE INTRODUZCA EL NUMERO DEL DNI
    public static  int solicitudDNI (Scanner teclado, int n) {
            System.out.print("Introduzca el número de su DNI: ");
            int numeroDNIIntroducido = teclado.nextInt();
            teclado.nextLine();
            return numeroDNIIntroducido;
    }

    // SOLICITUD AL USUARIO DE QUE INTRODUZCA LA LETRA DEL DNI  
    public static char solicitudLetra (Scanner teclado, char m) {
        System.out.print("Introduzca la letra se su DNI: ");
        char letraDNIIntroducido = Character.toUpperCase(teclado.nextLine().charAt(0)); 
        return letraDNIIntroducido; 
    }
    
    // COMPROBACION SI LA LETRA INTRODUCIDA ES CORRECTA 
    public static boolean comprobarLetraDNI (int numeroDNI, char letraDNIIntroducido) {
        // COMPROBACIÓN DE SI LA LETRA INTRODUCIDA PUEDE PERTENER A ESE NUMERO DEL DNI 
            // Calculo del modulo del DNI para averiguar la letra
            int resto = numeroDNI % 23;

            // Declaración del Array
            char [] arrayLetraDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'}; 
            // Asignacion de la letra que le correcponde a ese DNI 
            char letra = arrayLetraDNI [resto];   
            return letraDNIIntroducido == letra; 
    }
}
