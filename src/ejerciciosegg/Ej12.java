/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg;

/**
 *
 * @author Tachi
 */

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Ej12 {

    public static void main(String[] args) {
        Scanner numeros=new Scanner(System.in);
         
                
        System.out.println("Ingrese un numero");
        int  numero1 = numeros.nextInt();
        
        System.out.println("Ingrese un numero");
        int  numero2= numeros.nextInt();
        
         multiplos(numero1, numero2);
    }
    
    public static void multiplos(int numero1,int numero2){
         int resto;
        
            resto = numero1%numero2;

        if (resto==0){
            System.out.println(numero1 + " es múltiplo de " + numero2);
        } else{
              System.out.println(numero1 + " NO es múltiplo de " + numero2);
        
        }
      
        
       
        
    }
    
}