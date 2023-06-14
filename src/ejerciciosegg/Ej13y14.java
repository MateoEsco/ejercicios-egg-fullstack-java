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
public class Ej13y14 {
        public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        String [] equipo = new String [4];
        for (int i = 0; i < equipo.length;i++ ) {
            System.out.println("ingrese el nombre de un integrante");
            equipo [i] = leer.nextLine();
            
        }
        for (int i = 0; i < equipo.length;i++ ){
            System.out.println(equipo[i]);
        }
        }
}
