/* UD 3 - CASO PRACTICO 4 
 * Crea un programa para imprimir coordenadas en forma de 
 * tablero de ajedrez
 */


 // SI PRETENDEMOS QUE EL PROGRAMA DESCIENDA DESDE 88 HASTA EL NUMERO MAS PEQUEÑO CALCULADO
public class ImprimirTableroCoordenadas {
   public static void main(String[] args) {
        
        int numeroFilas = 8;
        int numeroColumnas = 8;
        int[][] tableroCoordenadas = new int[numeroFilas][numeroColumnas];
 
        for (int valorFila = numeroFilas; valorFila > 0; valorFila--) {
            for (int valorColumna = numeroColumnas; valorColumna > 0; valorColumna--) {
                System.out.print(" " + valorFila + "" + valorColumna + " ");
            }
            //para que incluya una linea de separacion entre las coordenadas
            System.out.println(" ");
        }
    

        System.out.println(" \n");  
    //SOLUCION SI PRETENDEMOS QUE VALLA DESDE 00 HASTA ... 
            int numeroFilas1 = 8;
            int numeroColumnas1 =8;
            int [] [] tableroCoordenadas1 = new int [numeroFilas1] [numeroColumnas1];

           for (int valorFila1 = 0; valorFila1 < numeroFilas1; valorFila1++) {

                for (int valorColumna1 = 0; valorColumna1 < numeroColumnas1; valorColumna1++) {
                //...e imprimir el valor de la posición de la Fila y la Columna
                         System.out.print(" " + valorFila1 + "" + valorColumna1 + " ");
                }

                
            System.out.println(" ");
           }
   
    System.out.println(" \n");  
    //SOLUCION SI PRETENDEMOS QUE VALLA DESDE EL 88 desde la derecha a la izq. 

            int numeroFilas2 = 8;
            int numeroColumnas2 = 8;
            int[][] tableroCoordenadas2 = new int[numeroFilas2][numeroColumnas2];

            for (int valorFila2 = numeroFilas2; valorFila2 > 0; valorFila2--) {
                for (int valorColumna2 = 1; valorColumna2 <= numeroColumnas2; valorColumna2++) {
                    System.out.print(" " + valorFila2 + "" + valorColumna2 + " ");
                }
                //para que incluya una linea de separacion entre las coordenadas
                System.out.println(" ");
            }



    }
}
