package ejerciciosguia6java;

import java.util.Scanner;



/**
 *
 * @author troll
 */
public class Ej2G6 {

    /**
     Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        String nom;
        System.out.println("Ingresa tu nombre: ");
        nombre = leer.next();
        nom = nombre;
        System.out.println("Su nombre es:" + nom + "!");
    }
    
}
