/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import POO.objetos.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class act4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Rectangulo R1 = new Rectangulo();
        R1.parametros();
        R1.superficie();
        R1.perimetro();
        R1.dibujo();
    }
    
}
