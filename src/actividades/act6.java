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
public class act6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese un numero para verificar si es par o impar");
        int num = read.nextInt() ;
        
        if (num%2 == 0){
            System.out.println("tu numero es par");
            
    }else{
          System.out.println("tu numero es impar");  
        }
  }
}
