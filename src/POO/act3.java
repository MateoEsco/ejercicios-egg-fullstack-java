/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import POO.objetos.Operacion;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class act3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read=new Scanner(System.in);
       Operacion O1 = new Operacion();
       O1.pasarNum();
       O1.sumar();
       O1.restar();
       O1.multiplicar();
       O1.dividir();
    }
    
}
