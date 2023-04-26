/*
 Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el 
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula 
try-catch para probar la nueva excepción que debe ser controlada
 */
package ejercicio.pkg1;


import entidades.LibroException;
import entidades.LibroServicios;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws LibroException {
        LibroServicios ls = new LibroServicios();
        
        try {
            ls.cargarLibro();
        } catch (LibroException e) {
            System.out.println("Error al cargar el libro: " + e.getMessage());
        throw e;
        }

        try{
            ls.crearLibro("123", "asd", "asd",1 );
        }catch(LibroException e){
            System.out.println("Error al cargar el libro: "+e.getMessage());
        }
        
    }

}
