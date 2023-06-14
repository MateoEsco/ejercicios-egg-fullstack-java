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
public class act4 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.println("ingrese cuantos grados centigrados hace");
        int grados = leer.nextInt();
        int Fahrenheit = 32 + (9 * grados / 5);
        System.out.println(Fahrenheit);
    }
}
