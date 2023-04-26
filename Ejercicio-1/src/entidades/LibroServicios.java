/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LibroServicios {

    public void cargarLibro() throws LibroException {
        Scanner leer = new Scanner(System.in);
        Libro libro = new Libro();
        System.out.println("Ingrese el ISBN");
        String ISBN = leer.next();
        if (ISBN.isEmpty()) {
            throw new LibroException("Debe ingresar el ISBN");
        }
        libro.setISBN(ISBN);
        System.out.println("Ingrese el titulo");
        String titulo = leer.nextLine();
        if (titulo.isEmpty()) {
            throw new LibroException("Debe ingresar el titulo");
        }
        libro.setTitulo(titulo);
        System.out.println("Inrese el Autor");
        String autor = leer.nextLine();
        if (autor.isEmpty()) {
            throw new LibroException("Debe ingresar el autor");
        }
        libro.setAutor(autor);
        int paginas;
        try {
            System.out.println("Ingrese el número de Páginas");
            paginas = leer.nextInt();
            
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Debe ingresar un valor numérico para el número de páginas");
        }
        if (paginas <= 0) {
            throw new LibroException("Debe ingresar el número de Páginas");
        }
        libro.setNumeroPaginas(paginas);
        
        
        System.out.println(libro.toString());
    }

    public void crearLibro(String ISBN, String titulo, String autor, int paginas) throws LibroException {
        try {
            if (ISBN.isEmpty()) {
                throw new LibroException("Debe ingresar el ISBN");
            }
            if (titulo.isEmpty()) {
                throw new LibroException("Debe ingresar el titulo");
            }
            if (autor.isEmpty()) {
                throw new LibroException("Debe ingresar el autor");
            }
            if (paginas <= 0) {
                throw new LibroException("Debe ingresar el numero de páginas");
            }
          
            Libro libro = new Libro();
            libro.setISBN(ISBN);
            libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setNumeroPaginas(paginas);
            imprimirLibro(libro);
        } catch (LibroException e) {
            
           // System.out.println("Error al crear el libro: " + e.getMessage());
            throw e; 
        } catch (Exception e) {
            
            e.printStackTrace();
            throw new LibroException("Error del sistema");
        }
        
    }
    public void imprimirLibro(Libro libro){
        System.out.println("ISBN: "+libro.getISBN());
        System.out.println("Titulo: "+libro.getTitulo());
        System.out.println("Autor: "+libro.getAutor());
        System.out.println("Paginas: " + libro.getNumeroPaginas());
    }

}
