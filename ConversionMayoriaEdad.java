/* UD 2 - INTRODUCCION A JAVA
** CASO PRÁCTICO 4  

**Si tenemos una cadena de caracteres con tu edad, ¿Qué tipo de conversión tenemos que realizar 
para poder calcular en cuántos años alcanzarás la mayoría de edad? */

/* 
* @author      Nerea Santos
*/



import java.util.Scanner;

public class ConversionMayoriaEdad {

    public static void main (String [] args) {
        Scanner teclado = new Scanner (System.in);
        String edad; 

        System.out.println ("¿Cuantos años tienes?");
        edad = teclado.nextLine ();

        System.out.println ("Tu edad es:  " + edad);


        final int MAYORIA_EDAD = 18;
        
        int edadTiene;
        edadTiene = Integer.parseInt (edad);


        if (edadTiene >=  MAYORIA_EDAD) {
            System.out.println("Ya eres mayor de edad, tienes " + edadTiene + " años.");
        } else {
            System.out.println ("No eres mayor de edad, tienes " + edadTiene + " años");
            System.out.println("Necesitas tener un minimo de 18 años para ser mayor de edad.");
        }

        teclado.close();
    }
}
