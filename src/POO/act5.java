/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import POO.objetos.Cuenta;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class act5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Cuenta C1 =new Cuenta();
        C1.crearCuenta();
        C1.ingresar();
        C1.retiro();
        C1.extraccionRapida();
        C1.consultaSaldo();
        C1.consultaDatos();

    }
    
}
