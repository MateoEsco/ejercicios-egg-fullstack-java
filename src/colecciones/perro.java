/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class perro {
   
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        razaperro rperro = new razaperro() ;
        int num;
        
        do {
            rperro.agregarPerro();
        System.out.println("quiere agregar otro perro?");
        System.out.println("si=1");
        System.out.println("no u otro numero=2");
        num = leer.nextInt();
        } while ( num != 1);
        rperro.devolverPerro();
        rperro.eliminarPerro();
        rperro.devolverPerro();
    }
}
