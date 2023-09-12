/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import POO.objetos.Cafetera;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class act6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        Cafetera C1 = new Cafetera();
        C1.llenarCafetera();
        C1.agregarCafe();
        C1.servirTaza();
        C1.servirTaza();
        C1.servirTaza();
        C1.servirTaza();
        C1.servirTaza();
        C1.servirTaza();
        C1.vaciarCafetera();
        C1.agregarCafe();
    }
    
}
