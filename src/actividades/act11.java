/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package actividades;
import java.util.Scanner;

/**
 *
 * @author cjalil
 */
public class act11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        }
        // TODO code application logic here
        int opcion;
        opcion=0;
        Scanner leer=new Scanner(System.in);
        
        do {
      
            mostrarMenu();
            opcion=leer.nextInt();
            double numero1, numero2;
            switch (opcion){
                case 1:
                        System.out.println("Ingrese el primer número: ");
                        numero1=leer.nextDouble();
                        System.out.println("Ingrese el segundo número: ");
                        numero2=leer.nextDouble();
                        System.out.println("El resultado de la suma es: " +sumar(numero1, numero2));
                      
                        break;
                        
                case 2:
                        System.out.println("Ingrese el primer número: ");
                        numero1=leer.nextDouble();
                        System.out.println("Ingrese el segundo número: ");
                        numero2=leer.nextDouble();
                        System.out.println("El resultado de la resta es: " +restar(numero1, numero2));
                        break;
                case 3:
                        System.out.println("Ingrese el primer número: ");
                        numero1=leer.nextDouble();
                        System.out.println("Ingrese el segundo número: ");
                        numero2=leer.nextDouble();
                        System.out.println("El resultado de la multiplicación es: " +multiplicar(numero1, numero2));
                        break;
                case 4:
                        System.out.println("Ingrese el primer número: ");
                        numero1=leer.nextDouble();
                        System.out.println("Ingrese el segundo número: ");
                        numero2=leer.nextDouble();
                        System.out.println("El resultado de la división es: " +dividir(numero1, numero2));
                        break;
                case 5:
                       String eleccion;
                        System.out.println("Está seguro que desea salir S/N?") ;
                       eleccion=leer.next();
                       if (eleccion.toUpperCase().equals("S")){
                           
                       } else opcion=0;
                   
            }
        } while (opcion!=5);
        
    }
        
    public static double sumar(double num1, double num2){
        return num1+num2;
    }
    
    public static double restar(double num1, double num2){
        return num1-num2;
    }
    
    public static double multiplicar(double num1, double num2){
        return num1*num2;
    }
    
    public static double dividir(double num1, double num2){
        return num1/num2;
    }
    public static void mostrarMenu(){
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        
    }
   
}
