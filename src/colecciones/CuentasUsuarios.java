/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.*;

/**
 *
 * @author mateo
 */
public class CuentasUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cliente cl1= new cliente("Morde Banderas", "00001", 1000);
        cliente cl2= new cliente("Bardo Banderas", "00002", 2000);
        cliente cl3= new cliente("Lux Banderas", "00003", 3000);
        cliente cl4= new cliente("Samira Banderas", "00004", 4000);
        cliente cl5= new cliente("Morde Banderas", "00001  ", 1000);
        
         HashSet <cliente> clientesBanco = new HashSet <cliente>();
         
         clientesBanco.add(cl1);
         
         clientesBanco.add(cl2);
         
         clientesBanco.add(cl3);
         
         clientesBanco.add(cl4); 
         
         clientesBanco.add(cl5);
         
         for (cliente cliente : clientesBanco) {
             
             System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta()+ " " + cliente.getSaldo());
            
        }
         if(cl1.equals(cl5)){
             System.out.println("ya esta este n_cuenta");
         }else{
             System.out.println("este n_cuenta no se encuenta en nuestra base de datos");
         }
    }
    
}
