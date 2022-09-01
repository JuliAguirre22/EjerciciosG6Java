package ejerciciosguia6java;


import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;



/**
 *
 * @author troll
 */
public class Ej3G6 {

    /**
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      String frase;
      String mayus;
      String minus;
      
        System.out.println("Ingrese una frase");
        frase = leer.next();
        mayus = toUpperCase(frase);
        minus = toLowerCase(frase);
        
        System.out.println("Frase en mayus: " + mayus + ".");
        System.out.println("Frase en minus: " + minus + ".");
        
        
      
    }
    
}
