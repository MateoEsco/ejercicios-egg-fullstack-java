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
public class act18 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        System.out.println("La Matriz principal es: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                int numero = (int) (Math.random() * 100);
                matriz[i][j] = numero;
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
}
