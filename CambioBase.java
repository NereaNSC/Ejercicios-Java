import java.util.Scanner;

// UD 5 - Actividad Semana 10 - Parte 2
// Crea un programa en Java que dado un número por el usuario convierta un número en base decimal a binario. 
// Esto lo realizará un método al que le pasaremos el número entero como parámetro y devolverá un String con el numero convertido a binario.

public class CambioBase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar un número entero al usuario en base decimal
        System.out.print("Introduzca un número entero en base decimal: ");
        int numeroIntroducido = teclado.nextInt();
        
        // 
        String numeroBinario = ConvertirDecimal(numeroIntroducido);
        System.out.println("El número decimal introducido es el: " + numeroIntroducido + " en binario es: " + numeroBinario);

        teclado.close();
    }

    // Realizar la conversión de número decimal a número binario 
    public static String ConvertirDecimal (int numero) {
        String digito;
        String numeroBinario = ""; 

        // Generamos un bucle FOR para que realice la operacion hasta que el número sea = 0
        for (int i = numero; i > 0; i/=2 ) {
            // Generamos un bucle condicional donde según el resultado del resto de la división asignamos el valor a la variable digito. 
            if (i % 2 == 1) {
                digito = "1";
            } else {
                digito = "0";
            }

            numeroBinario = digito + numeroBinario;  
        }
        return numeroBinario; 
    }
}
