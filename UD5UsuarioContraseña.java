import java.util.Scanner;

// UD 5 - CASO PRACTICO 5  + PONTE A PRUEBA 5  DEL TEMA 4 -- MODIFICACIÓN -- 
    // Pedir al usuario un nombre de usuario y una contraseña. 
    // La contraseña correcta seria "1234" y para el usuario seria "alumno". 
        // Si es correcto, el programa mostrará un mensaje de bienvenida («¡Hola!…» y el login introducido).
        // Si el login no es correcto, se mostrará un mensaje de error y se volverá a repetir el proceso un máximo de tres veces.

        // Realizar una función validar que se encargue de validad si el usuario y la contraseña son correctos. 

public class UD5UsuarioContraseña {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroIntentos = 0; 
        boolean valido = false; 

        // Comprobación de si la contraseña y el usuario con correctas
            // Si la contraseña es incorrecta se volvera a solicitar un máximo de 3 veces en total. 
            do { 
                // Solicitud al usuario que introduzca un nombre de usuario
                System.out.print("Introduzca un nombre de usuario: ");
                String nombreUsuario = teclado.nextLine();

                // Solicitud al usuario que introduzca una contraseña
                System.out.print("Introduzca una contrasena: ");
                String contraseñaUsuario = teclado.nextLine();

                // Comprobacion si la contraseña es correcta o si se han agotado los intentos y no es correcta. 
                valido = validar(nombreUsuario, contraseñaUsuario); 
                numeroIntentos ++; // vamos sumando número de intentos

            } while (!valido && numeroIntentos < 3);  // si no es correcto el usuario o la contraseña, tienes tres oportunidades para completar correctamente el login. 
                if (valido == false) { 
                    System.out.println("Lo siento, la contraseña o el usuario no es correcta y has agotado el número máximo de intentos!");

                }
    teclado.close();
    }

    // PROGRAMACION FUNCION 
    // Comprobacion si la contraseña y el usuario son correctos 
    public static boolean validar (String usuario, String contraseña) {
        boolean validar = false; 
        if (usuario.equals("alumno") && contraseña.equals("1234")) {
            validar = true; 
            System.out.println("¡Hola " + usuario + "! el nombre de usuario y la contraseña son correctos");
        }
        return validar; 
    }
}
