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
public class Cuenta {
    Scanner read = new Scanner(System.in);
    private long DNI;
    
    private int numCuenta;
    
    private int saldo;
    
    private double interes;
    
    public Cuenta(){
    }

    public Cuenta(int DNI, int numCuenta, int saldo, double interes) {
        this.DNI = DNI;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.interes = interes;
    }

    public long getDNI() {
        return DNI;
    }


    public int getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public void crearCuenta(){
        
        System.out.println("Para crear su cuenta ingrese su DNI");
        this.DNI=read.nextInt();
        System.out.println("Ahora ingrese su numero de cuenta");
        this.numCuenta = read.nextInt();
        System.out.println("Ingrese cuanto dinero va a depositar en su cuenta bancaria");
        this.saldo = read.nextInt(); 
    }
    public void ingresar(){
        
        System.out.println("Digite cuanto dinero va a sumar a su saldo");
        int ingresar = read.nextInt();
        this.saldo=ingresar+saldo;
    }
    public void retiro(){
        
        System.out.println("Digite cuanto dinero va a retirar a su saldo");
        int retirar = read.nextInt();
        if(retirar<saldo){
            this.saldo=saldo-retirar;
            System.out.println("se a descontado: "+retirar+" su saldo actual es: "+saldo);
        }else{
            System.out.println("su cuenta a quedado en 0 ya que su monto de retiro era mayor a su saldo");
        }
    }
    public void extraccionRapida(){
        
        double veinte = saldo*0.2;
        System.out.println("Con la extraccion rapida solo le es posible retirar el 20% de su saldo");
        System.out.println("lo que puede retirar solamente es "+veinte);
        System.out.println("Sabiento esto, ¿cuanto desea retirar?");
        int retiro=read.nextInt();
        if(retiro<=veinte){
            this.saldo = saldo-retiro;
            System.out.println("Su nuevo salgo es: "+saldo);
        }else{
            System.out.println("No es posible ese retiro");
        }
        
    }
    public void consultaSaldo(){
        System.out.println("Su saldo actual es: "+saldo);
    }

    
    public void consultaDatos() {
        System.out.println("Su dni asociado es: "+DNI);
        System.out.println("Su numero de cuenta asociada es: "+numCuenta);
        System.out.println("Su saldo actual es: "+saldo);
    }
   
}
