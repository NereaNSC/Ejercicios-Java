/* UD 3 - PONTE A PRUEBA 3 
 * 
 * Genera un programa donde el usuario introduzca un numero de un mes.
 * Y te devuelva por pantalla el nombre del mes. 
 */


import java.util.Scanner;
public class MesesSwitch {
      public static void main(String[ ] args) {
           int mes;
           Scanner teclado = new Scanner(System.in);
           System.out.print("Introduzca un número de mes: ");
           mes = teclado.nextInt();	
           switch (mes) {
				case 1:   System.out.println("ENERO que tiene un total de 31 días.");     break;
				case 2:   System.out.println("FEBRERO que tiene un total de 28 o 29 días, dependiendo de si es bisiesto o no.");   break;
				case 3:   System.out.println("MARZO que tiene un total de 31 días.");     break;
				case 4:   System.out.println("ABRIL que tiene un total de 30 días.");     break;
				case 5:   System.out.println("MAYO que tiene un total de 31 días.");      break;
				case 6:   System.out.println("JUNIO que tiene un total de 30 días.");      break;
				case 7:   System.out.println("JULIO que tiene un total de 31 días.");      break;
				case 8:   System.out.println("AGOSTO que tiene un total de 31 días.");     break;
				case 9:   System.out.println("SEPTIEMBRE que tiene un total de 30 días."); break;
				case 10:  System.out.println("OCTUBRE que tiene un total de 31 días.");    break;
				case 11:  System.out.println("NOVIEMBRE que tiene un total de 30 días.");  break;
				case 12:  System.out.println("DICIEMBRE que tiene un total de 31 días.");  break;
				default : System.out.println("El mes introducido no es válido, ha de estar entre 1 y 12"); 
           }
		   teclado.close();
      }
}
