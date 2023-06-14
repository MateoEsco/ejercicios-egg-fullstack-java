/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class act5 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.println("escribe un numero");
        int num = leer.nextInt();
        System.out.println(num*2);
        System.out.println(num*3);
        System.out.println(Math.sqrt(num));
    }
}
