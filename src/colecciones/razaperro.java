/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class razaperro {
    Scanner leer = new Scanner(System.in);
    private ArrayList<String> perro;

    public razaperro() {
        this.perro = new ArrayList();
    }

  public void agregarPerro() {
    
     /* System.out.println("Ingresa el nombre de tu perro");
      String nombre = leer.next();   */
    System.out.println("Ingresa la raza de tu perro");
    String raza = leer.next();
    perro.add(/*nombre+ " "+ */raza+ " ");
}
      public void devolverPerro() { 
          System.out.println("los perros actuales son:");
          for (String aux : perro) {
              System.out.println(aux);
          }
          System.out.println("cantidad " + perro.size());
      }
    public void eliminarPerro() {
        System.out.println("que raza desea eliminar?");
        String afuera = leer.next();
        Iterator<String> it = perro.iterator();
        
        while (it.hasNext()) {
            String palabra = it.next();
            
            if(palabra.equals(afuera)){
                it.remove();
            }else{
            System.out.println(palabra);
        }
        }   
    }
}
