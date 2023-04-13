/*UD 2 - Introduccion a JAVA
**ACTIVIDAD  SEMANA 3 - PARTE 3
**EJERCICIO 2 

    **Diseñar un programa en Java que convierta una cantidad positiva de segundos, 
    a su equivalente en horas, minutos y segundos. */

import java.util.Scanner;

public class ConversorTiempo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);  
        int segundos;
        System.out.println ("Introduce una cantidad de segundos"); //permitimos que el usuario integre por pantalla los segundos
        segundos = teclado.nextInt();

        System.out.println ("La cantidad introducida es de = " + segundos + " segundos");
        
        int horas = segundos / 3600;    // para saber cuantas horas hay en los segundos
        segundos %= 3600 ;              // para saber el resto de segundos que no forman ninguna hora
        int minutos = segundos / 60;    // para calcular los minutos que se forman con el resto de las horas
        segundos %= 60 ;                // para saber el resto de los segundos

        System.out.println ("O lo que es lo mismo, Horas " + horas + ", minutos " + minutos + ", segundos " + segundos);         

        teclado.close();
    }
}
