import java.util.Scanner;

public class MenuOpciones {

  public static void main(String args[])
  {
	 Scanner teclado = new Scanner(System.in);
	 int opcion = 0;
	  do {
		    System.out.println("");  System.out.println("");
		    System.out.println("MENÚ OPCIONES BUCLES");
		    System.out.println("OPCIÓN 1. Bucle while");
		    System.out.println("OPCIÓN 2. Bucle do-while");
		    System.out.println("OPCIÓN 3. Bucle for");
		  	System.out.print("Teclee la opción a ejecutar: ");
		  	opcion = teclado.nextInt();
		  	System.out.println("");
		  	
		  	switch (opcion)
	           {
		  	 case 0:   System.out.println("Saliendo del Menú de Opciones..."); break;
	         case 1:   System.out.println("OPCIÓN 1. Bucle while"); 
	         			int i = 1;
	         			while (i <= 29)
	         			{
	         				System.out.print((i%2) == 0 ? ",": i);
	         			    i++;
	         			}
	         			break;
		     case 2:   System.out.println("OPCIÓN 2. Bucle do-while");
		     			int j = 0;
		     			do 
		     			{
		     				j++;
		     				System.out.print((j%2) == 0 ? ",": j);
		     					
		     			} while (j < 29);
		     			break;
		     case 3:   System.out.println("OPCIÓN 3. Bucle for");     
		     			for (int k = 1; k <= 29; k++) 
		     			{
		     				System.out.print((k%2) == 0 ? ",": k);
		     			}
		     			break;
		     default : System.out.println("Opción incorrecta, valores válidos de 0 a 3");
	           }
		} while (opcion != 0);
	teclado.close();
  }
}
