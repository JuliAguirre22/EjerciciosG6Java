
package ejerciciosguia6java;

import java.util.Scanner;

/**
 *
 * @author troll
 */
public class Ej1G6 {

    /**
     * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int res;
        System.out.println("Ingrese 2 numeros: ");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        res = num1 + num2;
        System.out.println("La suma de los numeros es: " + res + "!");
        
               
    }
    
}
