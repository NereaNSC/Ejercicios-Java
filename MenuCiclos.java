import java.util.Scanner;

// UD 3 - PONTE A PRUEBA 4 
// Menu opciones con los distintos tipos de ciclos
// Que muestre los 30 trimeros numeros guarismos.


public class MenuCiclos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        

        //GENERAMOS UN PRIMER BUCLE CON SHILE PARA LA EJECUCION DEL MENÚ. 
        var salir = false; 
        while (!salir) {
            // MENU PARA EL USUARIO
            System.out.println("Este es nuestro menú de opciones");
            System.out.println("OPCIÓN 1: Bucle WHILE");
            System.out.println("OPCIÓN 2: Bucle DO-WHILE");
            System.out.println("OPCIÓN 3: Bucle FOR");
            System.out.println("OPCIÓN 4: Salir");
            System.out.println("Tecle el número de la OPCIÓN seleccionada");
            // SELECCION USUARIO
            int opcion;
            opcion = teclado.nextInt();
            // BUCLE MENU OPCIONES
            switch (opcion) {
                // OPCIÓN 1: Bucle WHILE
                case 1: 
                    System.out.println("Esto es un bucle con WHILE");
                    int numero1=1;
                    while (numero1 <=30) {
                        if (numero1%2 !=0) {
                            System.out.print(numero1 + " ");
                        }
                        numero1 ++;
                    }
                    break;
                // OPCIÓN 2: Bucle DO-WHILE"
                case 2:
                    System.out.println("Esto es un bucle con DO-WHILE");
                    int numero2=1;
                    do {
                        if (numero2 %2 != 0 ) {
                            System.out.print(numero2 + " ");
                        }
                        numero2 ++;
                    } while (numero2<=30); 
                    break;
                // OPCIÓN 3: Bucle FOR"
                case 3:
                    System.out.println("Esto es un bucle con FOR");  
                    for (int numero = 0; numero<=30; numero++) 
                        if (numero%2 != 0) {
                            System.out.print(numero + " ");  // PRINT para que los imprima en la misma linea
                        }           
                    break;
                // OPCION 4: SALIR 
                case 4:
                    System.out.println("¡Hasta luego!");
                    salir = true;
                    break;
                default: 
                    System.out.println("La opcion introducida no está dentro del menú opciones");
                    break;
            }
        }
    teclado.close();            
    }
}
