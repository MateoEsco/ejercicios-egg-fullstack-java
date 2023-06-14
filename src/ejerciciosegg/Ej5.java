/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("escribe un numero con coma que se almacene en double");
        double x = leer.nextDouble();
      
        System.out.println("escribe true o false para que se almacene en boolean ");
        boolean vof = leer.nextBoolean();

         System.out.println("escribe un caracter que se almacene en char");
        char nombre = leer.next().charAt(0);
         }

}