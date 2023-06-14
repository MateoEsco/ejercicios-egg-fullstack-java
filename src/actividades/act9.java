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
public class act9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read= new Scanner(System.in);
       System.out.println("ingrese una palabra que empiece por la letra ´A´");
       String palabra,primera;
       palabra = read.next();
       primera = palabra.substring(0,1);
       if(primera.equals("A")){
           System.out.println("correcto");
    }else{
           System.out.println("incorrecto");
       }
    }
}
