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
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int num;
        do{
            contador= contador+1;
            System.out.println("escribe 20 numeros, si el numero leido es 0 se te dejara de pedir numeros");
            num = leer.nextInt();
            if (num > 0){
            suma = suma + num;
            }
           if (contador==20){
               System.out.println("la suma de sus numeros es "+suma);
               break;
           }
           
        }while(num!=0);
        if(contador != 20){
            System.out.println("Se capturó el numero cero ");
        }
        }
        
}

