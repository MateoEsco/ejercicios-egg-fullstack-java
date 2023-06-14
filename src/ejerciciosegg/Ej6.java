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
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("escribir dos numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1 > 25){
            System.out.println("su primer numero ("+num1+") es mayor a 25");
        }else if (num1 < 25){
            System.out.println("su primer numero ("+num1+") es menor a 25");
        }else {
            System.out.println("su primer numero ("+num1+") es 25");
        }
        if (num2 > 25){
            System.out.println("su segundo numero ("+num2+") es mayor a 25");
        }else if (num2 < 25){
            System.out.println("su segundo numero ("+num2+") es menor a 25");
        }else {
            System.out.println("su segundo numero ("+num2+") es 25");
        }
                
    }
    
}
