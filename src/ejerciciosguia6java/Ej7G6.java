
package ejerciciosguia6java;

import java.util.Scanner;

/**
 *
 * @author troll
 */
public class Ej7G6 {

    /**
     * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String clave;
       String contra;
        contra = "eureka";
        System.out.println("Ingrese la clave: ");
        clave = leer.next();
        
        if(clave.equals(contra)) {
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
        }
            
    }
    
}
