// VAMOS A DIBUJAR UN TABLERO DE AJEDREZ VACIO 

public class TableroAjedrezVacio {
    public static void main(String[] args) {
        final String FONDO_BLANCO = "\u001B[47m";
        final String FONDO_NEGRO = "\u001B[40m";
        final String TEXTO_NEGRO = "\u001B[37m";
        final String RESET ="\u001B[0m";
        final int FILAS = 8;
        final int COLUMNAS = 8;

        boolean blanco = true;

        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                if (blanco) {
                    System.out.print(FONDO_BLANCO + TEXTO_NEGRO + "   " + RESET);
                } else {
                    System.out.print(FONDO_NEGRO + TEXTO_NEGRO + "   " + RESET);
                }
                blanco = !blanco;
            }
            System.out.println(); // Salto de línea
            blanco = !blanco;
        }
    }
}
