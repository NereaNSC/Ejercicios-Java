/* UD 2 - PONTE A PRUEBA 2 
 * 
 * Crea un programa que declare un tipo enumerado para los meses del 
 * año y añade los días de cada mes para poder consultar la fecha en 
 * tu programa.
 */

import java.util.Scanner;
public class EnumMeses {
     //Uso de un constructor, una variable de instancia y un método.
    enum Mes {
        ENERO (31),
        FEBRERO (28),
        MARZO (31),
        ABRIL(30), 
        MAYO(31), 
        JUNIO(30), 
        JULIO(31), 
        AGOSTO(31), 
        SEPTIEMBRE(30), 
        OCTUBRE(31), 
        NOVIEMBRE(30), 
        DICIEMBRE(31); 

                // Declaración del valor del último día de cada mes
                private int ultimoDiaDelMes;  
                
                // Añadir un Constructor que aprenderemos en próximas unidades.
                Mes(int dias){ 
                    ultimoDiaDelMes = dias;
                }

                //Añadir un método para obtener ese valor 
                int getDia(){
                    return ultimoDiaDelMes;
                }          
    } 


    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        // Solicitamos al usuario que nos diga un mes
        System.out.println ("Ingrese el nombre del mes: ");
        String nombreMes = teclado.nextLine().toUpperCase();

        // declaramos la variable MES SELECCIONADO y decimos que es = a la variable introducida por el usuario
        Mes mesSeleccionado = Mes.valueOf (nombreMes);
        
        int dias = mesSeleccionado.getDia();

        System.out.println("El mes " + mesSeleccionado + " tiene " + dias + " días.");

        teclado.close ();
    }
}
