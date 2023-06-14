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
public class act8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int c = 0;
    
        Scanner read= new Scanner(System.in);
        System.out.println("escriba una frase o palabra de 8 caracteres");
        String fop = read.next();
        
        for(int i = 0 ; i<fop.length();i++){
            c+=1;
        }
            if(c == 8){
                System.out.println("correcto");
            }else{
                System.out.println("incorrecto");
            }

    }
    
}
