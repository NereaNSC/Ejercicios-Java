import java.util.Scanner;

// UD 4 - CASO PRACTICO 5  + PONTE A PRUEBA 5 
    // Pedir una contraseña
    // Haz un programa que le pida al usuario un nombre de usuario y una contraseña. 
        // Si la contraseña es correcta, el programa mostrará un mensaje de bienvenida («¡Hola!…» y el login introducido).
        // Si la contraseña es distinta de «1234», entonces mostrará un mensaje de error. 

    // PONTE A PRUEBA 5 
        // Modifica el programa para que si la contraseña no es correcta la vuelva a solicitar
        // Un numero máximo de 3 intentos.  

public class UsuarioContraseña {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String contraseñaValida = "1234";
        int numeroIntentos = 0; 

        // Solicitud al usuario que introduzca un nombre de usuario
        System.out.println("Introduzca un nombre de usuario: ");
        String nombreUsuario = teclado.nextLine();

        // Solicitud al usuario que introduzca una contraseña
        System.out.println("Introduzca una contrasena: ");
        String contraseñaUsuario = teclado.nextLine();

        // Comprobación de si la contraseña es la correcta 
            // Si la contraseña es incorrecta se volvera a solicitar un máximo de 3 veces en total. 
            while (!contraseñaUsuario.equals(contraseñaValida) && numeroIntentos < 2)  {
                numeroIntentos++;
                System.out.println("Lo siento, la contraseña introducida es incorrecta");
                System.out.println("Vuelva a introducir una contraseña: ");  
                contraseñaUsuario = teclado.nextLine(); 
            }

            // Comprobacion si la contraseña es correcta o si se han agotado lso intentos y no es correcta. 
            if (contraseñaUsuario.equals(contraseñaValida)) {
                System.out.println("¡Hola" + nombreUsuario + "! el nombre de usuario y la contraseña son correctos");
            } else {
                System.out.println("Lo siento, " + nombreUsuario + ". La contraseña no es correcta y has agotado el número máximo de intentos!");
            }

    teclado.close();
    }
}
