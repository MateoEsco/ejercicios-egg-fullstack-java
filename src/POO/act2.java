/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import POO.objetos.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner read= new Scanner(System.in);
       Circunferencia c1 = new Circunferencia();
       c1.crearCircunferencia();
       c1.area();
       c1.perimetro();
    }
}