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
public class act19 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] MatrizA, MatrizB;
        MatrizA = new int[4][4];
        MatrizB = new int[4][4];
        boolean isSimetric = true;
        for (int i = 0; i < 4; i++) {
            System.out.println("\n");
            for (int j = 0; j < 4; j++) {
                MatrizA[i][j] = read.nextInt(10);
                MatrizB[i][j] = MatrizA[i][j] * (-1);
                System.out.print("  " + (MatrizA[i][j]) + "  ");
            }
        }
        System.out.println("\n");
        System.out.println("\n");
        for (int i = 0; i < 4; i++) {
            System.out.println("\n");
            for (int j = 0; j < 4; j++) {
                System.out.print("  " + (MatrizA[j][i]) + "  ");
            }
        }
        System.out.println("\n");
        System.out.println("\n");
        for (int i = 0; i < 4; i++) {
            System.out.println("\n");
            for (int j = 0; j < 4; j++) {
                if (Math.abs(MatrizB[i][j]) == MatrizA[i][j]) {
                } else {
                    isSimetric = false;
                }
                System.out.print("  " + (MatrizB[j][i]) + "  ");
            }
        }
        System.out.println(isSimetric);
    }
}
