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
public class Libro {
    
    public int isbn;
    public String titulo;
    public String autor;
    public int pags;

    public Libro() {

    }
    public Libro(int isbn, String titulo, String autor, int pags) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.pags = pags;
        
    }

      public void crearLibro(){
          Scanner read= new Scanner(System.in);
        
        System.out.println("Escribe el isbn del libro");
        this.isbn=read.nextInt();
        System.out.println("Escribe el titulo del libro");
        this.titulo = read.next();
        System.out.println("Escribe el autor del libro");
        this.autor = read.next();
        System.out.println("Escribe el numero de pags del libro");
        this.pags = read.nextInt();
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", pags=" + pags + '}';
    }
    
 
}
