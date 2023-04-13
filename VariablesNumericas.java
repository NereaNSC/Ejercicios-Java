import java.util.Random;

// UD 2 - PONTE A PRUEBA4
    // Crea un programa que declare una variable de cada tipo básico numérico entero 
    // y que, cada vez que lo ejecutes, te muestre, para cada uno de esos tipos, 
    // un valor diferente dentro de su rango de valores.

public class VariablesNumericas {
    public static void main(String[] args) {
        Random rand = new Random (); 

        //NUMEROS ENTEROS ALEATORIOS
        byte numeroByte = (byte) (Math.random() * Byte.MAX_VALUE);
        short numeroShort = (short) (Math.random() * Short.MAX_VALUE); 
        int numeroInt = rand.nextInt();
        long numeroLong = rand.nextLong();

        System.out.println("Vamos a imprimir varios tipos de numeros enteros aleatorios: ");
        System.out.println("NúmeroByte = " + numeroByte);
        System.out.println("NúmeroShort = " + numeroShort);
        System.out.println("NúmeroInt = " + numeroInt);
        System.out.println("NúmeroLong = " + numeroLong);

        //NÚMEROS DECIMALES
        System.out.println("Vamos a imprimir varios tipos de numeros decimales aleatorios");
        double numeroDouble = rand.nextDouble();
        float numeroFloat = rand.nextFloat();
        
        System.out.println("NúmeroDouble = " + numeroDouble);    
        System.out.println("NúmeroFloat = " + numeroFloat);  
    }
}
