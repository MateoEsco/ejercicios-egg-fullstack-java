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
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa tu nombre: ");
        String nombre = leer.next();
        System.out.println("hola mundo! soy "+nombre+" y estoy programando en Java!");
    }
    
}
