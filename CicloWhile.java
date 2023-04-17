// UD 3 - CASO PRÁCTICO 5
//Crear un bucle infinito con WHILE (TRUE), hasta llegar a 30. 

public class cicloWhile {
    public static void main(String[] args) {
        
        System.out.println("VAMOS A MOSTRAR DE FORMA INFINITA UN BUCLE CON WHITE");
        System.out.println("Mostraremos numeros desde el 0 al 30. ");

        //BUCLE INFINITO CON WHILE
        int numero=1;
        boolean ciclo = true;
        while (ciclo) {
            System.out.print(numero++ + " "); // SI EL PROGRAMA LO CERRAMOS AQUI TENDREMOS UN BUCLE INFINITO
            if (numero==30) {           // CON UN CICLO IF CONDICIONAMOS LA SALIDA DE WHILE
                ciclo=false;            //CAMBIAMOS EL VALOR DE LA VARIABLE PARA IMPEDIR EL BUCLE INFINITO
            }
        }

        System.out.println("\n");

        //OTRA MANERA
        int numero2=1;
        while (true) {
            System.out.print(numero2++ + " "); // SI EL PROGRAMA LO CERRAMOS AQUI TENDREMOS UN BUCLE INFINITO
            if (numero2==30) {           // CON UN CICLO IF CONDICIONAMOS LA SALIDA DE WHILE
                break;                      // UTILIZAMOS UN BREAK; 
            }
        }   
    }
}
