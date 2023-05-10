import java.util.Scanner;

// UD 5 - PROGRAMACION MODULAR
// EJERCICIOS RESUELTOS FUNCIONES
// Crea una aplicación que nos calcule el área de un círculo, cuadrado o triangulo. 
    // Pedir por teclado de que figura queremos calcular el área 
    // según lo introducido pedirá los valores necesarios para calcular el área. 
        // Crea un método por cada figura para calcular cada área, 
        // este devolverá un número real. Muestra el resultado por pantalla.
                // Circulo: (radio^2)*PI
                // Triangulo: (base * altura) / 2
                // Cuadrado: lado * lado

public class UD5Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0; 
        double resultado = 0; 

        // GENERAMOS UN MENÚ PARA EL USUARIO ESCOJA LA OPCIÓN QUE QUIERA
        System.out.println("OPCIÓN 1: CÁLCULO DE AREA DEL CÍRCULO");
        System.out.println("OPCIÓN 2: CÁLCULO DEL AREA DEL CUADRADO");
        System.out.println("OPCIÓN 3: CÁLCULO DEL AREA DEL TRIÁNGULO");
        opcion = teclado.nextInt();

        // ESTABLECEMOS LAS DISTINTAS OPCIÓNES CON LOS RESULTADOS CORRESPONDIENTES
        switch (opcion) {
            case 1: 
                // CÁLCULO DEL AREA DEL CÍRCULO          (Circulo = (radio^2)*PI)
                System.out.println("VAMOS A CÁLCULAR EL AREA DEL CÍRCULO");
                System.out.print("Introduzca el radio del círculo: ");
                double radio = teclado.nextDouble(); 
                resultado = areaCiruclo(radio); 
                System.out.println("El area del círculo es: " + resultado);
                break;

            case 2:
                // CÁLCULO DEL AREA DEL CUADRADO         (Cuadrado = lado * lado)
                System.out.println("VAMOS A CÁLCULAR EL AREA DEL CUADRADO");
                System.out.print("Introduzca el lado 1: ");
                double lado1 = teclado.nextDouble();
                System.out.print("Introduzca el lado 2: ");
                double lado2 = teclado.nextDouble(); 
                resultado = areaCuadrado(lado1, lado2); 
                System.out.println("El area del cuadrado es: " + resultado);
                break;
            
            case 3:
                // CÁLCULO DEL AREA DEL TRIANGULO        (Triangulo = (base * altura) / 2)
                System.out.println("VAMOS A CÁLCULAR EL AREA DEL TRIÁNGULO");
                System.out.print("Introducza la base: ");
                double base = teclado.nextDouble(); 
                System.out.print("Introduzca la altura: ");
                double altura = teclado.nextDouble(); 
                resultado = areaTriangulo(base, altura); 
                System.out.println("El area del tríangulo es: " + resultado);
                break;

            default: 
                // LA OPCIÓN ESCOGIDA NO ES LA CORRECTA
                System.out.println("No ha introducido una opción correcta");
                break;
        }
        teclado.close();
    }

    // PROGRAMACIÓN MODULAR
    // FUNCIÓN CÁLCULO DEL AREA DEL CÍRCULO          (Circulo = (radio^2)*PI)
    public static double areaCiruclo (double radio) {
        double resultado = 0;
        resultado = Math.pow(radio, 2) * Math.PI;
        return resultado; 
    }

    // PROGRAMACIÓN MODULAR
    // FUNCIÓN CÁLCULO DEL AREA DEL CUADRADO         (Cuadrado = lado * lado)
    public static double areaCuadrado (double lado1, double lado2) {
        double resultado = 0;
        resultado = lado1 * lado2;
        return resultado; 
    }

    // PROGRAMACIÓN MODULAR
    // FUNCIÓN CÁLCULO DEL AREA DEL TRÍANGULO        (Triangulo = (base * altura) / 2)
    public static double areaTriangulo (double base, double altura) {
        double resultado = 0;
        resultado = (base * altura) / 2; 
        return resultado; 
    }
}
