/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.objetos;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Rectangulo {
    
    private double base;
    
    private double altura;

    public double getBase() {
        return base;
    }

    public Rectangulo(){
    }
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void parametros(){
        Scanner read=new Scanner(System.in);
        System.out.println("Escribe el parametro de la base del rectangulo");
        this.base=read.nextDouble();
        System.out.println("Escribe el parametro de la altura del rectangulo");
        this.altura=read.nextDouble();
    }
    
    public void superficie(){
        double superficie=base*altura;
        System.out.println("La base del rectangulo es: "+base);
    }
    
    public void perimetro(){
        double perimetro=(base*altura)*2;
        System.out.println("El perimetro del rectangulo es: "+perimetro);
    }
    
    public void dibujo(){
        System.out.println("Asi se veria su rectangulo:");
        System.out.println("");
        for(int i = 0; i < altura; i++){
            for(int j = 0; j < base; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
