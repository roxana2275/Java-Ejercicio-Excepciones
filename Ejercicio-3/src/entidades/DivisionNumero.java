/*
  *Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos 
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer, 
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar 
una división con los dos numeros y mostrar el resultado. 
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class DivisionNumero {
    public double num1;
    public double num2;
    
    
    public void divisionNumero(double num1, double num2){
        System.out.println("La division es:"+(num1/num2));
    }
}
