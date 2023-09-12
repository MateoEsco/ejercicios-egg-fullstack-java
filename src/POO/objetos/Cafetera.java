/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.objetos;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author mateo
 */
public class Cafetera {
    Scanner read = new Scanner(System.in);
    
    private int capacidadMaxima;
    
    private int capacidadActual;
    
    private int vacio;

    
    public Cafetera(){
    }
            
    public Cafetera(int capacidadMaxima, int capacidadActual, int vacio) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
        this.vacio = vacio;
    }
    
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public int getVacio() {
        return vacio;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void setVacio(int vacio) {
        this.vacio = vacio;
    }
   
    public void llenarCafetera(){
        this.capacidadMaxima=1000;
        this.vacio=0;
        this.capacidadActual=1000;
        System.out.println("Se lleno la cafetera completamente, su cafe es de: "+capacidadActual+"ml");
    }
    
    public void servirTaza(){
        System.out.println("Seleccione el tipo de taza que va a querer.");
        System.out.println("1= Taza de 250ml");
        System.out.println("2= Taza de 200ml");
        System.out.println("3= Taza de 150ml");
        int taza=read.nextInt();
        switch(taza){
            case 1:
                taza= 250;
                break;
            case 2:    
                taza= 200;
                break;
            case 3:    
                taza= 150;
                break;
             default:    
                System.out.println("La opcion no es valida");
       
        }
        switch(taza){
            case 250:
                if(taza<=capacidadActual){
                    this.capacidadActual= capacidadActual-250;
                    System.out.println("La cantidad de cafe ahora es de: "+capacidadActual);
                }else{
                    
                    System.out.println("Lo lamento tu taza no se pudo llenar por completo, nos quedamos sin cafe!");
                    System.out.println("solo se te lleno: "+capacidadActual+" de la taza");
                    this.capacidadActual=0;
                }
                break;
            case 200:    
                if(taza<=capacidadActual){
                    this.capacidadActual= capacidadActual-200;
                    System.out.println("La cantidad de cafe ahora es de: "+capacidadActual);
                }else{
                   System.out.println("Lo lamento tu taza no se pudo llenar por completo, nos quedamos sin cafe!");
                    System.out.println("solo se te lleno: "+capacidadActual+" de la taza");
                    this.capacidadActual=0;
                }
                 break;
            case 150:    
                if(taza<=capacidadActual){
                    this.capacidadActual= capacidadActual-150;
                    System.out.println("La cantidad de cafe ahora es de: "+capacidadActual);
                }else{
                    System.out.println("Lo lamento tu taza no se pudo llenar por completo, nos quedamos sin cafe!");
                    System.out.println("solo se te lleno: "+capacidadActual+" de la taza");
                    this.capacidadActual=0;
                }
                
                break;
            }
        
    }
    
    public void vaciarCafetera(){
        this.capacidadActual=0;
        System.out.println("Se vacio su cafetera, la capacidad actual es: "+capacidadActual+"ml");
    }
    
    public void agregarCafe(){
        System.out.println("Cuanto cafe desea agregar?(pase los parametros en ml)");
        int agregar=read.nextInt();
        if(capacidadActual>=capacidadMaxima){
            System.out.println("La cafetera esta llena");
         }else{
            int falta=capacidadMaxima-capacidadActual;
            if(falta>=agregar){
            this.capacidadActual=capacidadActual+agregar;
        System.out.println("Muy bien se a agregado: "+agregar+" su cafe ahora es de: "+capacidadActual);
            }else{
                this.capacidadActual=capacidadMaxima;
                System.out.println("Lo que quiso agregar: "+agregar+" ,mas el contenido de la cafetera superaban su capacidad maxima, la llenamos hasta el tope. Su cafe ahora es de: "+capacidadActual);
            }
        }
    }
}
