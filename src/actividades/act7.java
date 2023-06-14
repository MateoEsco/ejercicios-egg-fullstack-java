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
public class act7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner read = new Scanner(System.in);
      System.out.println("escribe la palabra magica");
      String palabra = read.next();
      if (palabra.equals("eureka")){
          System.out.println("Correcto");
                  
    }else{
          System.out.println("Incorrecto");
      }
    }
}
