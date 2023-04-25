import java.util.Scanner;

// UD 5 - CASO PRACTICO 4 
// SOBRECARGA DE FUNCIONES
    // Define dos funciones que se llamen superficie, 
        // Una para calcular el area de un triangulo 
        // Otra para calcular el area de un cuadrado

public class AreaTrianguloAreaCuadrado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // AREA TRIANGULO
        float areaTriangulo = superficie(teclado, 0);
        System.out.println("Area Triangulo = " + areaTriangulo);
        System.out.println("");
        // AREA CUADRADO 
        float areaCuadrado = superficie(teclado, 0, 0); 
        System.out.println("Area Cuadrado = " + areaCuadrado);

        teclado.close();
    }
    // PROGRAMACION MODULAR - SOBRECARGA DE FUNCIONES
    // CALCULO AREA TRIANGULO    BASE * ALTURA / 2
    public static float superficie (Scanner teclado, float areaTriangulo) {
        System.out.println("Vamos a calcular el area del triangulo");

        System.out.print("Intruduzca un valor para la base del triangulo: ");
        float base = teclado.nextFloat();

        System.out.print("Introduzca un valor para la altura del triangulo: ");
        float altura = teclado.nextFloat(); 

        areaTriangulo = (base * altura / 2); 
        return areaTriangulo;
    }

    // PROGRAMACION MODULAR - SOBRECARGA DE FUNCIONES
    // CALCULO AREA CUADRADO    LADO * LADO 
    public static float superficie (Scanner teclado, float lado1, float lado2) {
        System.out.println("Vamos a calcular el area del cuadrado: ");
        // Solicitud valor para LADO 1 
        System.out.print("Introduzca un valor para el LADO1 del cuadrado: ");
        lado1 = teclado.nextFloat();
        // Solicitud valor para LADO 2 
        System.out.print("Introduzca un valor para el LADO2 del cuadrado: ");
        lado2 = teclado.nextFloat();
        // Calculo AREA CUADRADO
        float areaCuadrado = (lado1 * lado2); 
        return areaCuadrado; 
    }
}
