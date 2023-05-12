import java.util.Scanner;

public class UD5Recursividad {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int numero = teclado.nextInt();

        System.out.println("El factorial de: " + numero + " es: " + factorial(numero));
        teclado.close();

        System.out.println(sumaDigitosRecur(1234));
        System.out.println(invertirPalabra("hola"));
    }
    // Factorial de un número: producto de dicho número por todos los números menores que él hasta llegar a 1
    // 5! = 5 * 4 * 3 * 2 * 1
    // Excepción: 0! = 1.
    public static int factorial(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact = fact*i;
        }
        return fact;
    }

    // Función recursiva, aquella que se llama así misma: buscar que la llamada deje de producirse en algún momento
    // 5! = 5 * 4!
    // 4! = 4 * 3!
    // 3! = 3 * 2!
    // 2! = 2 * 1!
    // 1! = 1 * 0!
    // 0! = 1
    public static int factorialRecursivo(int num){
        if (num == 0){
            return 1;
        } else{
            return num * factorialRecursivo(num-1);
        }
    }

    // FUNCION PARA IR SUMANDO DIGITOS
    public static int sumaDigitos(int numero) {
        int suma=0;
	    while(numero>0){
		    suma+=(numero%10);
		    numero/=10;
	    }
	    return (suma);
        
    }
    // FUNCION RECURSIVA PARA IR SUMANDO DIGITOS
    // 1234
    // 4 + sumaDigitosRecur(123) = 3 + 2 + 1 
    //     3 + sumaDigitosRecur(12) = 2 + 1 
    //         2 + sumaDigitosRecur(1) = 1
    //                   1
    //   4 + 3 + 2 + 1
    public static int sumaDigitosRecur(int numero) {
        if (numero<10){
            return numero;
        }
        else{
            return numero%10 + sumaDigitosRecur(numero/10);
        }
        
    }

    // "hola" --- (RESULTADO ESPERADO) = "ALOH"
    // invertirPalabra("ola")            + "h"
    // invertirPalabra("la")     + "o" 
    // invertirPalabra("a") + "l"
    // "a"
    // "a" + "l" + "o" + "h" 
    public static String invertirPalabra(String palabra){
         
        if(palabra.length()==1){
            return palabra;
        }else{
            return invertirPalabra(palabra.substring(1)) + palabra.charAt(0);
        }
         
    }
}
