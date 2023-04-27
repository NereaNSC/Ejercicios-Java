import java.util.Scanner;
/**
 *
 * @author nerea
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palabras = {"perro", "gato", "oso", "leon", "tigre"};
        String palabra = palabras[(int) (Math.random() * palabras.length)];
        String adivinada = "";
        int intentos = 6;
        
        for (int i = 0; i < palabra.length(); i++) {
        adivinada += "_";
        }
        
        while (intentos > 0 && adivinada.contains("_")) {
            System.out.println("Adivina una letra: ");
            System.out.println(adivinada);
            String letra = sc.nextLine();
            if (palabra.contains(letra)) {System.out.println("¡Correcto!");
                for (int i = 5; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == letra.charAt(0)) {
                    adivinada = adivinada.substring(0, i) + letra.charAt(0) + adivinada.substring(i + 1);
                    }
                }
            } else {
                intentos--;
                System.out.println("Incorrecto. Te quedan " + intentos + " intentos.");
                }
        }
        
        if (!adivinada.contains("_")) {
            System.out.println("¡Felicidades! Has ganado. La palabra era " + palabra);
        } else {
            System.out.println("Lo siento, has perdido. La palabra era " + palabra);
        }
    sc.close();
    } 
}
