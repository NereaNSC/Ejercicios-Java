import java.util.Random;
import java.util.Scanner;

// UD 4 – SEMANA 7 – PARTE 2 
// En una estación meteorológica se registra la temperatura (en grados centígrados) en cada hora durante el día. 
// Almacenamos el resultado en un array de 24 elementos. 
// Diseña un programa que muestre por pantalla un menú con las siguientes opciones (en negrita) y que realice las acciones que se describen: 
        // OPCIÓN 1: Rellenar datos de temperatura de forma manual. Esta funcionalidad permite al usuario rellenar manualmente cada uno de los 24 elementos. 
        // OPCIÓN 2: Rellenar datos de temperatura de forma aleatoria. Los 24 elementos del vector se rellenan de forma aleatoria, con valores entre 0 y 40. 
        // OPCIÓN 3: Mostrar datos. Muestra los datos almacenados en el vector.
        // OPCIÓN 4: Obtener máximos y mínimos. Muestra las temperaturas máxima y mínima del día, así como la hora en la que se dan. 
        // OPCIÓN 5: Temperatura media. Calcula la temperatura media del día. 
        // OPCIÓN 6: Salir. Sale del programa.

public class UD4EstacionMetereologica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random numeroRandom = new Random();

        boolean salir = false; 
        int opcion; 
        int tamañoArray = 24; 
        boolean matrizCompleta = false; 
        
        // DECLARACIÓN ARRAY
        double [] arrayDatosMetereologicos = new double [24];  

       

        // MENÚ DE OPCIONES 
        while (!salir) {
            System.out.println("OPCIÓN 1: Rellena datos de temperatura de forma manual");
            System.out.println("OPCIÓN 2: Rellena datos de temperatura de forma aleatoria con valores de entre 0 y 40");
            System.out.println("OPCIÓN 3: Mostrar datos");
            System.out.println("OPCIÓN 4: Obtener máximos y mínimos del día con la hora");
            System.out.println("OPCIÓN 5: Temperatura media del día");
            System.out.println("OPCIÓN 6: Salir del programa");

            // SOLICITAR AL USUARIO UNA OPCIÓN 
            System.out.println("Selecciona una opción: ");
            opcion = teclado.nextInt();

                // BUCLE CON LA EJECUCION DE LA ACCIÓN SELECCIONADA POR EL USUARIO.  
                switch (opcion) {
                    case 1: 
                        // RELLENAR EL ARRAY DE FORMA MANUAL
                        System.out.println("OPCIÓN 1: Rellena datos de temperatura de forma manual");
                            for (int a = 0; a < tamañoArray; a++) {
                                System.out.println("Introduzca un valor para la temperatura en grados centigrados de las " + a + " horas: ");
                                arrayDatosMetereologicos [a] = teclado.nextDouble();
                            }
                            matrizCompleta = true; 
                        break;

                    case 2: 
                        // RELLENAR EL ARRAY DE FORMA ALEATORIA CON VALORES ENTRE 0 Y 40. 
                        System.out.println("OPCIÓN 2: Rellena los datos de la temperatura de forma aleatoria. ");
                        System.out.println("Vamos a completar el array con número aleatorios entre 0 y 40. ");
                            for (int b=0; b < tamañoArray; b ++) {
                                int numeroaleatorio = numeroRandom.nextInt(41) ;
                                arrayDatosMetereologicos [b] = numeroaleatorio; 
                            }
                            matrizCompleta = true; 
                        break;

                    case 3:
                        // MOSTRAR AL USUARIO EL ARRAY 
                        System.out.println("OPCIÓN 3: Mostrar datos");
                            if (matrizCompleta) {
                                for (int c = 0; c < tamañoArray; c++) {
                                    System.out.println("Temperatura a las " + c + " horas: " + arrayDatosMetereologicos[c]);
                                }
                            } else {
                                System.out.println("Debes rellenar los datos antes de elegir esta opcion, usa la OPCION 1 o la OPCION 2 para rellenar el array");
                            }
                        break;

                    case 4:
                        // Mostrar máximos y mínimos del día con la hora.
                        System.out.println("OPCIÓN 4: Obtener máximos y mínimos del día con la hora");
                        double maximo = Double.MAX_VALUE;   // introducimos Double.MAX_VALUE para confirmar que realmente va a ser siempre el valor mayor
                        double minimo = Double.MIN_VALUE;
                        int indiceMaximo = 0;
                        int indiceMinimo = 0;
                        if (matrizCompleta) {
                                for (int d =0; d < tamañoArray; d++) {
                                        if (maximo > arrayDatosMetereologicos [d]) {
                                            maximo = arrayDatosMetereologicos [d];
                                            indiceMaximo = d; 
                                        }
                                        if (minimo > arrayDatosMetereologicos [d]) {
                                            minimo = arrayDatosMetereologicos [d];
                                            indiceMinimo = d; 
                                        }
                                }
                                System.out.println("Temperatura máxima: " + maximo + ". Hora: " + indiceMaximo );
                                System.out.println("Temperatura minima: " + minimo + ". Hora: " + indiceMinimo );
                        } else {
                                System.out.println("Debes rellenar los datos antes de elegir esta opcion, usa la OPCION 1 o la OPCION 2 para rellenar el array");
                        }
                        break;

                    case 5: 
                        // Calcular la temperatura media del día. 
                        System.out.println("OPCIÓN 5: Temperatura media del día");
                        if (matrizCompleta) {
                            double suma = 0;    
                            for ( int e = 0; e < tamañoArray; e++) { // se utiliza un bucle for para recorrer todos los elementos de la matriz y sumar sus valores, 
                                suma += arrayDatosMetereologicos [e]; // almacenando el resultado en la variable suma
                                double media = (double)Math.round(suma / tamañoArray);  // la media se obtiene dividiendo la suma de temperaturas por el número del tamaño de la matriz
                                System.out.println("La media de la temperatura del día es: " + media + " grados centigrados.");
                            }
                        } else {
                            System.out.println("Debes rellenar los datos antes de elegir esta opcion, usa la OPCION 1 o la OPCION 2 para rellenar el array");
                        }
                        break;
                        
                    case 6: 
                        // Finalización del programa 
                        System.out.println("OPCIÓN 6: Salir del programa");
                        System.out.println("Hasta la próxima!");
                        salir = true; 
                        break;
                    default: 
                        System.out.println("La opción introducida no es correcta, por favor, introduzca una opcion valida. ");
                }
        }
    teclado.close();
    }
}
