import java.util.Scanner;

// UD 4 - ACTIVIDAD SEMANA 8 - PARTE 1 
// Crear una matriz 4×4 de números enteros inicialmente vacía
// Realizar un menú con las siguientes opciones:
        // Rellenar toda la matriz de números, el usuario ira introduciendo uno a uno los valores.
        // Suma de una fila que se pedirá al usuario (controlar que elija una correcta).
        // Suma de una columna que se pedirá al usuario (controlar que elija una correcta).
        // Sumar la diagonal principal de la matriz.
        // Sumar la diagonal inversa de la matriz.
        // La media de todos los valores de la matriz.

    // Hasta que se haga rellene la matriz no deberia de funcionar el resto de opciones. 

    // COMO EXTRA HE AÑADIDO LA OPCION 6 - MOSTRAR ARRAY 
    // COMO EXTRA HE AÑADIDO LA OPCIÓN 7 - SALIR

public class UD4Matriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 

        // inicializacion MATRIZ 4 x 4  VACIA
        int [] [] matriz = new int [4] [4];
        
        int numeroFilas = 4;
        int numeroColumnas = 4;

        boolean salir = false;
        int option = 0;
        boolean matrizCompleta = false; 

        // MENU DE OPCIONES PARA EL USUARIO
        while (!salir) {
            System.out.println("OPCIÓN 1: Rellenar toda la matriz");
            System.out.println("OPCIÓN 2: Suma de una fila");
            System.out.println("OPCIÓN 3: Suma de una columna");
            System.out.println("OPCIÓN 4: Suma la diagonal inversa de la matriz");
            System.out.println("OPCIÓN 5: La media de todos los valores de la matriz");
            System.out.println("OPCIÓN 6: Mostrar Matriz");
            System.out.println("OPCIÓN 7: Salir");
            System.out.print("\n");
            System.out.print("Selección una opción: ");
            option = teclado.nextInt(); 

            // EJECUCIÓN DEL CASO ADECUADO SEGUN LA OPCIÓN SELECCIONA POR EL USUARIO
            switch (option) {

                case 1:     // OPCIÓN 1: RELLENAR LA MATRIZ
                    System.out.println("Rellenar toda la matriz: ");
                    for (int fila = 0; fila < numeroFilas; fila++) {    
                        for ( int columna = 0; columna < numeroColumnas; columna++) {
                            System.out.print("Introduzca el valor para la posición: [" + fila + "] [" + columna + "]: " );
                            matriz [fila] [columna] = teclado.nextInt ();
                        }
                    }
                    matrizCompleta = true;  // Tiene que están rellena la matriz para que se puedan ejecurar los siguientes casos. 
                    System.out.print("\n");
                    break;

                case 2:     // OPCIÓN 2: SUMA DE UNA FILA SELECCIONA POR EL USUARIO
                    if (matrizCompleta) {   // CONDICIÓN --> la matriz tiene que estar Completa para que se pueda ejecutar la opción 
                        System.out.println("Suma de la fila seleccionada ");
                        System.out.print("Selección una fila, introduce un número entre 0 y 3:  ");
                        int seleccionFila = teclado.nextInt();
                        // CONDICION --> LA FILA SELECCIONADA TIENE QUE EXISTIR, ES DECIR, TIENE QUE ESTAR ENTRE 0 Y 3. 
                        if (seleccionFila < numeroFilas && seleccionFila >= 0) {
                                int sumaFila = 0; 
                                for (int a = 0; a < numeroFilas; a++) {
                                    sumaFila += matriz [seleccionFila] [a];     // SUMA DE LA FILA SELECCIONADA
                                }
                                System.out.println("La suma de la fila seleccionada " + seleccionFila + " es: " + sumaFila );
                        } else {
                            System.out.println("La fila que has introducido no existe; ");
                            System.out.print("Selecciona una fila entre 0 y 3.");
                        }
                        System.out.print("\n");
                    } else {
                        System.out.println("Tiene que seleccionar la OPCIÓN 1 para completar primero la Matriz");
                    }
                    break; 

                case 3:     // OPCIÓN 3: Suma de una columna
                    if ( matrizCompleta) {  // CONDICIÓN --> la matriz tiene que estar Completa para que se pueda ejecutar la opción
                        System.out.println("Suma de la columna seleccionada");
                        System.out.print("Selecciona una columna, introduce un número entre 0 y 3:  ");
                        int seleccionColumna = teclado.nextInt();
                        // CONDICION --> LA FILA SELECCIONADA TIENE QUE EXISTIR, ES DECIR, TIENE QUE ESTAR ENTRE 0 y 3.
                        if (seleccionColumna < numeroFilas && seleccionColumna >= 0) {
                                int sumaColumna = 0; 
                                for (int a = 0; a < numeroFilas; a++) {
                                    for (int b = 0; b < numeroColumnas; b++) {
                                        sumaColumna += matriz [seleccionColumna] [b];   // SUMA DE LA COLUMNA SELECCIONADA
                                    }
                                }
                            System.out.println("La suma de la columna selecciona " + seleccionColumna + ", es: " + sumaColumna);
                        } else {
                            System.out.println("La columna que has introducido no existe; ");
                            System.out.print("Selecciona una columna entre 0 y 3.");
                        }
                        System.out.print("\n");
                    } else {
                        System.out.println("Tiene que seleccionar la OPCIÓN 1 para completar primero la Matriz");
                    }
                    break;
                
                case 4:     // OPCIÓN 4: Suma la diagonal inversa de la matriz
                        // Para calcular la suma de la diagonal inversa de la matriz, podemos recorrer la matriz desde la última 
                        // fila y columna hasta la primera, sumando los valores de la diagonal inversa en cada iteración.
                    if (matrizCompleta) {   // CONDICIÓN --> la matriz tiene que estar Completa para que se pueda ejecutar la opción
                        int sumaDiagonalInversa=0; 
                        System.out.println("Vamos a calcular la suma de la diagonal inversa de la matriz");
                        for (int a = numeroFilas -1; a >= 0; a --) {   // Comienza desde la ultima fila a la primera
                            for (int b= numeroColumnas -1; b >= 0; b--) {
                                sumaDiagonalInversa += matriz [a] [b];
                            }
                        }
                        System.out.println("La suma de la diagonal inversa es: " + sumaDiagonalInversa);
                        System.out.println("");
                    } else {
                        System.out.println("Tiene que seleccionar la OPCIÓN 1 para completar primero la Matriz");
                    }
                    break; 

                case 5:     // OPCIÓN 5: La media de todos los valores de la matriz
                    if (matrizCompleta) {   // CONDICIÓN --> la matriz tiene que estar Completa para que se pueda ejecutar la opción
                        System.out.println("Vamos a mostrar la media de los valores de la matriz");
                        int suma=0; 
                        for (int a = 0; a < numeroFilas; a++ ) {
                            for (int b =0; b < numeroColumnas; b++) {
                                suma += matriz [a] [b];
                            }
                        }
                        double media = (suma / (numeroFilas * numeroColumnas)); 
                        System.out.println("La media de los valores de la matriz es: " + media);
                        System.out.println("");
                    } else {
                        System.out.println("Tiene que seleccionar la OPCIÓN 1 para completar primero la Matriz");
                    }
                    break; 
                    
                case 6:     // OPCIÓN 6: Mostrar la matriz
                    if (matrizCompleta) {   // CONDICIÓN --> la matriz tiene que estar Completa para que se pueda ejecutar la opción
                        System.out.println("El resultado de la matriz es: ");
                        for (int a =0; a < numeroFilas; a++) {
                            for (int b = 0; b < numeroColumnas; b++) {
                                System.out.print(matriz [a] [b] + " ");
                            }
                            System.out.println("");
                        }
                        System.out.println("");
                    } else {
                        System.out.println("Tiene que seleccionar la OPCIÓN 1 para completar primero la Matriz");
                    }
                    break; 

                case 7:     // OPCIÓN 7: Salir
                    salir = true;
                    System.out.println("Hasta luego!!");
                    System.out.println("");
                    break; 

                default:    // OPCIÓN EXTRA - no deveria de ser necesaria dado que estamos mostrando un menú
                            // pero la introducimos por si el usuario se equivoca 
                    System.out.println("La opcion introducida no es valida ");
                    System.out.print(" \n");
                    break;
            }
        }
    teclado.close();
    }
}
