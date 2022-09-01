
package ejerciciosguia6java;

import java.util.Scanner;

/**
 *
 * @author troll
 */
public class Ej5G6 {

    /**
     * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int doble;
        int triple;
        
        
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        
        doble = num * 2;
        triple = num * 3;
        double raiz = Math.sqrt(num);
        
        System.out.println("El doble de " + num + " es: " + doble + ".");
        System.out.println("El triple de " + num + " es: " + triple + ".");
        System.out.println("La raiz cuadrada de " + num + " es: " + raiz + ".");
        System.out.println("");
        System.out.println("");
        System.out.println("Hasta la proxima.");
    }
    
}
