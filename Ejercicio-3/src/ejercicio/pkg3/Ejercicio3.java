/*
 *Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos 
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer, 
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar 
una división con los dos numeros y mostrar el resultado. 
 */
package ejercicio.pkg3;

import entidades.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        String aux1 = leer.next();
        
        System.out.println("Ingrese otro numero");
        String aux2 = leer.next();
        
        
        DivisionNumero dn = new DivisionNumero();
        
        try{
            int n1 = Integer.parseInt(aux1);
            int n2 = Integer.parseInt(aux2);
            dn.divisionNumero(n1, n2);
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
    
}
