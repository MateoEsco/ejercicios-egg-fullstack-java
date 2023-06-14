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
public class act10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read= new Scanner(System.in);
       System.out.println("ingrese numeros hasta que su suma sea mayor a 100");
       int num = read.nextInt();
       if (num<101)
           
         do{  
           System.out.println("ingrese numeros hasta que su suma sea 100");
           int num2 = read.nextInt();
       num = num2 + num;
               } while(num<101);
       System.out.println("felicidades tu numero:"+num+" es mayor a 100");
    }
    
}
