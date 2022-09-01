
package ejerciciosguia6java;

import java.util.Scanner;

/**
 *
 * @author troll
 */
public class Ej8G6 {

    /**
     * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        int largo;
        
        System.out.println("Ingrese una palabra de 8 caracteres: ");
        palabra = leer.next();

        
        if  (8 == palabra.length()){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
    }

  
    }
    

