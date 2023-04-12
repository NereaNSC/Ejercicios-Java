//UD 2 - Introduccion a JAVA
//ACTIVIDAD  SEMANA 3 - PARTE 3
//EJERCICIO 2 

//Definir el programa en Java necesario para intercambiar los valores de dos variables numéricas


import java.util.Scanner; 
public class IntercambioVariables {
    /*
     * @AUTHOR   Nerea Santos 
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in); 
        
        int numero1;
        int numero2;

        //INTRODUCIMOS POR PANTALLA EL VALOR DE NUMERO1
        System.out.println ("Introduce un número");
        numero1 = teclado.nextInt();
        System.out.println ("El valor de numero1 es = " + numero1);

        //INTRODUCIMOS POR PANTALLA EL VALOR DE NUMERO2
        System.out.println ("Introduce otro número");
        numero2 = teclado.nextInt ();
        System.out.println ("El valor de numero2 es = " + numero2);


        //OPCION 1 - INTERCAMBIAMOS LOS VALORES UTILIZANDO UNA VARIABLE AUX
        int aux;
        aux = numero1;
        numero1 = numero2;
        numero2 = aux;
        System.out.println ("Vamos a intercambiar los valores del numero1 y del numero2");
        System.out.println ("El valor del numero1 ahora será = " + numero1);
        System.out.println ("El valor del nuemro2 ahora será = " + numero2);

        teclado.close();
    }
}
