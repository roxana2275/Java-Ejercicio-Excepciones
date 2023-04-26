/*
 Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para 
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera 
de rango)
 */
package ejercicio.pkg2;

import entidades.Provincia;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Provincia p = new Provincia();
        
        try{
            p.imprimirProvincias();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Fuera de rango, error:"+ e);
        }
        
    }
    
}
