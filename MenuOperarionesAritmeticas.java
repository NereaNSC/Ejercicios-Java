/* VIDEO 16/11/2022 CLASE
 * Pedir al usuario dos números por teclado y que se le muestre un menú con las siguientes opciones:
 *          1.	Sumar
 *          2.	Restar
 *          3.	Salir
 * Para las opciones 1 y 2 se le dará el resultado pedido al usuario y se volverá a mostrar el menú. 
 * Para la opción 3 el programa finaliza.
 */
import java.util.Scanner;

public class MenuOperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double numero1, numero2;

        System.out.println ("Introduce el primer número: ");
        numero1 = teclado.nextDouble();

        System.out.println ("Introduce el segundo número: ");
        numero2 = teclado.nextDouble();


        boolean salir = false;

        // NECESITAMOS WHILE PARA CONTINUAR CON LA EJECUCION HASTA QUE ESCOJA LA OPCION 3 = SALIR
        while (!salir) {

            //LE MOSTRAMOS EL MENÚ AL USUARIO Y LE PREGUNTAMOS QUE QUIERE HACER      // TIENE QUE ESTAR DENTRO DEL WHILE PARA QUE NOS VUELVA A MOSTRAR EL MENU 
            System.out.println ("Opcion 1 - Sumar");
            System.out.println ("Opcion 2 - Restar");
            System.out.println ("Opcion 3 - Salir");
            int opcion = teclado.nextInt();

                //CON SWITCH ESTABLECEMOS LAS OPCIONES DEL MENU CON SU EJECUCION 
                switch (opcion) {
                    case 1:
                            System.out.println ("La suma es: " + (numero1 + numero2));
                            break;
                    case 2:
                            System.out.println ("La resta es: " + (numero1 - numero2));
                            break;
                    case 3:
                            salir=true;
                            break;
                    default: 
                            System.out.println ("La opcion introducida no es correcta.");
                            break;
                }
        }
        teclado.close();
    }
}
