/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author mateo
 */
public class cliente {

    public cliente(String nombre, String n_cuenta, double saldo){
     
    this.nombre  = nombre;
     
    this.n_cuenta  = n_cuenta;
     
    this.saldo  = saldo;
}

    private String nombre;
    
    private String n_cuenta;
    
    private double saldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(String n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean equals(Object obj){
        if(obj instanceof cliente){
            cliente otro=(cliente)obj;
            
            if(this.n_cuenta==otro.n_cuenta){
                
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
