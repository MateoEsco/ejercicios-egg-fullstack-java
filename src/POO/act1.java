/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package POO;

import POO.objetos.Libro;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner read= new Scanner(System.in);
        Libro l1 = new Libro();
        l1.crearLibro();
        l1.toString();
    }
}