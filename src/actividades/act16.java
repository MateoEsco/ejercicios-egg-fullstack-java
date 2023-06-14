/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class act16 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = read.nextInt();
        int[] vector = new int[n];
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            int numero = (int) (Math.random() * 10);
            vector[i] = numero;
            System.out.println(vector[i]);
        }
        System.out.println("Ingrese el numero a buscar");
        int num = read.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (num==vector[i]) {
                System.out.println("La posicion es " + i);
                c++;
            }
            
        }
        System.out.println("El numero aparecio " + c + " veces");
    }

}
