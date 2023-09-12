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
public class Circunferencia {
    
    private double radio;

    public Circunferencia() {
    }
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        Scanner read = new Scanner(System.in);
        System.out.println("asignar un radio a la circunferencia");
        this.radio=read.nextFloat();
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

   
    public void area(){
        double area = Math.PI * radio*radio;
        System.out.println("El area de tu circunferencia es:"+area);
    }
     public void perimetro(){
         double perimetro = 2*Math.PI * radio;
         System.out.println("El perimetro de tu circunferencia es:"+perimetro);

    }
}
