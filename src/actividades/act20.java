package actividades;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class act20 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
         int[][] matriz = new int[3][3];
        int sumD = 0, sumD2 = 0, sumF = 0, sumC = 0;
        boolean comp = true;
        System.out.println("Ingrese los valores de la matriz de 3x3");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("Ingre el elemento " + i + "," + j + " :");
                    matriz[i][j] = read.nextInt();
                } while (matriz[i][j] < 1 || matriz[i][j] > 9);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        for (int i = 0; i < 3; i++) {
            sumD += matriz[i][i];
        }
        int j = 2;
        for (int i = 0; i < 3; i++) {
            sumD2 += matriz[i][j];
            j--;
        }
        if (sumD == sumD2) {
            comp = true;
        } else {
            comp = false;
        }
        for (int i = 0; i < 3; i++) {
            sumF = 0;
            for (j = 0; j < 3; j++) {
                sumF += matriz[i][j];

            }
            if ((sumD == sumF) && comp) {
                comp = true;
            } else {
                comp = false;
            }
        }
        for (j = 0; j < 3; j++) {
            sumC = 0;
            for (int i = 0; i < 3; i++) {
                sumC += matriz[i][j];

            }
            if ((sumD == sumC) && comp) {
                comp = true;
            } else {
                comp = false;
            }
        }

        if (comp == true) {
            System.out.println("La matriz ingresada es MÁGICA");
        } else {
            System.out.println("La matriz NO es MÁGICA");
        }
    }
}
