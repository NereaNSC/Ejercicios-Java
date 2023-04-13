/* UD 3 - PONTE A PRUEBA 1 
 * Crea un programa para leer por teclado tres datos diferentes por teclado:
 * 
 * -	El numero de alumnos de tu clase
 * -	Tu nombre completo
 * -	La nota media que obtuviste en la ESO
 */




import java.util.Scanner;

public class LecturaPorPantalla {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int numeroAlumnos;
        float notaMedia;
        String nombreCompleto;

        System.out.println ("¿Cuantos alumnos erais en clase en la ESO?");
        numeroAlumnos = teclado.nextInt();  teclado.nextLine();      // Es necesario añadir teclado.nextLine();  despues de introducir un numero entero por pantalla 
                                                                     //  debido a que si no nos coge el ENTER como la variable nombreCompleto
        System.out.println ("¿Cual es tu nombre completo?");
        nombreCompleto = teclado.nextLine ();


        System.out.println ("¿Cual es tu nota media de la ESO?");
        notaMedia = teclado.nextFloat();

        System.out.println ("Según la información que nos has facilitado...");
        System.out.println ("Tu nombre es: " + nombreCompleto);
        System.out.println ("En la ESO erais un total de " + numeroAlumnos + " en clase.");
        System.out.println ("La nota media que tuviste en la ESO es " + notaMedia);

        teclado.close();
    }
}
