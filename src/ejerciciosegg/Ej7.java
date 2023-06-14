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
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese que tipo de motor esta buscando:");
        System.out.println("1:De agua");
        System.out.println("2:De gasolina");
        System.out.println("3:De hormigón");
        System.out.println("4:De pasta alimenticia");
        int opc = leer.nextInt();
        switch (opc){
            case 1:
                   System.out.println("La bomba es una bomba de agua"); 
                   break;
            case 2:       
                   System.out.println("La bomba es una bomba de gasolina"); 
                   break;
            case 3:       
                   System.out.println("La bomba es una bomba de hormigón"); 
                   break;
            case 4:       
                   System.out.println("La bomba es una bomba de pasta alimenticia"); 
                   break;
            default:       
                   System.out.println("No existe un valor válido para tipo de bomba");
        }
    
    }
}