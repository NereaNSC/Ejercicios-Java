//UD 2 - Introduccion a JAVA
//ACTIVIDAD  SEMANA 3 - PARTE 3
// EJERCICIO 1 

// El usuario tiene que introducir por pantalla 2 números con decimales  
// Muestra por pantalla:  la suma, resta, multiplicación, división y módulo de los mismos

import java.util.Scanner;
/*
 * @author      Nerea Santos 
 */
public class OperacionesNumericas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double numero1;
        double numero2; 

        System.out.println ("Introduce un número decimal....");
        numero1 = teclado.nextDouble();

        System.out.println ("Introduce un segundo número decimal....");
        numero2 = teclado.nextDouble();

        System.out.println ("La suma de " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
        System.out.println ("La resta de " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
        System.out.println ("La multiplicacion de " + numero1 + " x " + numero2 + " = " + (numero1 * numero2));
        System.out.println ("La division de " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
        System.out.println ("El modulo de " + numero1 + " % " + numero2 + " = " + (numero1 % numero2)); 

        teclado.close();

    }
}
