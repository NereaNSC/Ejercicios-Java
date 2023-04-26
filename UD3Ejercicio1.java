// UD 3 - ACTIVIDAD SEMANA 5 - PARTE 2 
//EJERCICIO 1  
    //Escribe por pantalla los números del 1 al 100 que sean impares.

public class UD3Ejercicio1 {
    public static void main(String[] args) {
        // IMPRIMIR POR PANTALLA LOS NÚMEROS IMPARES DEL 0 - 100
        System.out.println("Vamos a imprimir por pantalla los número impares del 1 al 100");
            // NÚMEROS DEL 0 - 100 
            for (int numero=0; numero<=100; numero++) {
                    // DE ESOS NÚMEROS SOLO LOS IMPARES
                    if (numero%2 != 0) {
                        System.out.print(numero + " ");     // ... Y LO IMPRIMIMOS POR PANTALLA
                    }
            }
        
        System.out.println("\n");

// COMO EXTRA 
        //IMPRIMIR POR PANTALLA LOS NUMEROS PARES DEL 0 - 100 
        System.out.println("Vamos a imprimir por pantalla los número pares del 1 al 100");
            // NÚMEROS DEL 0 - 100 
            for (int numero2=0; numero2<=100; numero2++) {
                    // DE ESOS NÚMEROS SOLO LOS PARES
                    if (numero2%2 == 0) {
                        System.out.print(numero2 + " ");     // ... Y LO IMPRIMIMOS POR PANTALLA
                    }
            }
    }
}
