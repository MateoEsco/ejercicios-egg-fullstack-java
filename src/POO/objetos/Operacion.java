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
public class Operacion {
    
    private int numero1;
    
    private int numero2;
    
    public Operacion(){
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void pasarNum(){
        Scanner read = new Scanner(System.in);
        System.out.println("Queres pasarle los valores a los numeros?S/N");        
        System.out.println("en casu de no ser una s o S, la respuesta se considerara como un no");
       String son = read.next();
       if ("S".equals(son) || "s".equals(son)){
           System.out.println("escribe el primer numero");
           this.numero1=read.nextInt();
           System.out.println("escribe el segundo numero");
           this.numero2=read.nextInt();
       }else{
           this.numero1=10;
           this.numero2=2;
       }
        System.out.println("Sus numeros son:"+numero1+" y:"+numero2);
    }  
     public void sumar(){
         int suma=numero1+numero2;
         System.out.println("la suma de los numeros es:"+suma);
       }
     public void restar(){
         int resta=numero1-numero2;
         System.out.println("la resta de los 2 numeros es:"+resta);
       }
     public void multiplicar(){
         int resultado=numero1*numero2;
         if (resultado==0){
             System.out.println("ERROR");
             System.out.println("en la multiplicacion habia un 0 por lo que no se puede realizar la multiplicacion");
         }else{
             System.out.println("El resultado de su multiplicacion es:"+resultado);
         }
       }
     public void dividir(){
          int res=numero1/numero2;
         if (res==0){
             System.out.println("ERROR");
             System.out.println("en la division habia un 0 por lo que no se puede realizar la multiplicacion");
         }else{
             System.out.println("El resultado de su division es:"+res);
         }
       }
}
