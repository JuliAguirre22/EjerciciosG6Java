
package ejerciciosguia6java;

import java.util.Scanner;

/**
 *
 * @author troll
 */
public class Ej6G6 {

    /**
     * Crear un programa que dado un numero determine si es par o impar.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        
        if(num % 2 == 0) {
            System.out.println(num + " es un numero par.");
        }else {
            System.out.println(num + " no es numero par.");
        }
    }
    
}
