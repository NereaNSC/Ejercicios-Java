/* UD 3 - CASO PRACTICO 2 
 * Transforma el ejemplo de ColoresANSI a constantes
 * 
 * Cuando utilizamos valores como los códigos de escape para los colores,
 *  estos no cambian nunca. Por eso, interesa definirlos con constantes 
 * mediante notación SNAKE_CASE. ¿Te atreves a convertir un color a 
 * esta notación?
 */

public class ConstantesColoresTerminal {
    public static void main(String[] args) {
        final String ANSI_NEGRO = "\033[30m";
        final String ANSI_ROJO = "\033[31m";
        final String ANSI_VERDE = "\033[32m";
        final String ANSI_AMARILLO = "\033[33m";
        final String ANSI_AZUL = "\033[34m";
        final String ANSI_MAGENTA = "\033[35m";
        final String ANSI_CIAN = "\033[36m";
        final String ANSI_BLANCO = "\033[37m";
        final String ANSI_RESET = "\u001B[0m";

        final String FONDO_BLANCO = "\u001B[47m";
        final String FONDO_NEGRO = "\u001B[40m";

        System.out.println ("Aqui tenemos los diferentes colores definidos mediante constantes");
        System.out.println (ANSI_NEGRO + " NEGRO");
        System.out.println (ANSI_ROJO + " ROJO");
        System.out.println (ANSI_VERDE + " VERDE");
        System.out.println (ANSI_AMARILLO + " AMARILLO");
        System.out.println (ANSI_AZUL + " AZUL");
        System.out.println (ANSI_MAGENTA + " MAGENTA");
        System.out.println (ANSI_CIAN + " CIAN");
        System.out.println (ANSI_BLANCO + " BLANCO");
        System.out.println (ANSI_RESET + " RESETEAMOS EL COLOR, COLOR POR DEFECTO");

        System.out.println (FONDO_BLANCO + ANSI_NEGRO + "fb" );
        System.out.println (FONDO_NEGRO + ANSI_BLANCO + "fb" );
    }
}
