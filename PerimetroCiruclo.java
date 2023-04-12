// UD 1 - Introduccion a la programacion
// Ponte a Prueba 4
// Hacer un programa del calculo de un perimetro de un circulo en JAVA.
        // Calculo del perimetro 2*PI*radio
        // Radio=3


public class PerimetroCirculo {
        final double PI = 3.14;

        public static void main(String[] args) {
                double perimetro ;
                double radio = 3;
                perimetro = 2 * Math.PI * radio;

                System.out.println ("El perimetro del circulo es = " + perimetro);
        }
}
