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
public class act17 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = read.nextInt();
        int[] vector = new int[n];
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            int numero = (int) (Math.random() * 100) * (int) (Math.random() * 100);
            vector[i] = numero;
            System.out.println(vector[i]);
        }
        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        int d4 = 0;
        int d5 = 0;
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            int iCantidad = 0;
            int iNumero = vector[i];
            while (vector[i] > 0) {
                vector[i] = vector[i] / 10;
                iCantidad++;
            }
            
            System.out.println(iNumero + " tiene " + iCantidad + " dígitos");
            switch (iCantidad) {
                case 1:
                    d1++;
                    break;
                case 2:
                    d2++;
                    break;
                case 3:
                    d3++;
                    break;
                case 4:
                    d4++;
                    break;
                case 5:
                    d5++;
                    break;
            }
        }
        System.out.println(" ");
        System.out.println(d1 + " numeros tienen 1 digito");
        System.out.println(d2 + " numeros tienen 2 digito");
        System.out.println(d3 + " numeros tienen 3 digito");
        System.out.println(d4 + " numeros tienen 4 digito");
        System.out.println(d5 + " numeros tienen 5 digito");
    }
}
