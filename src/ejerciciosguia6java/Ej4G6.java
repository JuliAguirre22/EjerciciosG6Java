
package ejerciciosguia6java;

import java.util.Scanner;

/**
 *
 * @author troll
 */
public class Ej4G6 {

    /**
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int centigrados;
      int fahrenheit;
      
        System.out.println("Ingresa una cantidad de grados centigrados: ");
        centigrados = leer.nextInt();
        
        fahrenheit = 32 + (9 * centigrados / 5);
        
        System.out.println("Los " + centigrados + " centigrados son: " + fahrenheit + " Fahrenheit.");
        
    }
    
}
