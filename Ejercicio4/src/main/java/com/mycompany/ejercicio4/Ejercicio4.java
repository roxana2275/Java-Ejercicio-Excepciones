
/*
 Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede 
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena 
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un 
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones 
utilizando bloques try/catch para las distintas excepciones
 */
package com.mycompany.ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        String nombre = null;
        int num1 = 3;
        int num2 = 0;

        try {
            System.out.println(nombre.toString());
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
      
      try{
          double div = num1/num2;
          System.out.println(div);
      }catch(ArithmeticException ex){
          System.out.println(ex.getMessage());
          //ex.printStackTrace();
      }
        Scanner leer = new Scanner(System.in);

     try{
         System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
     }catch(InputMismatchException im){
         System.out.println(im.getMessage());
         System.out.println("Debe ingresar un numero");
     }
        try {
            System.out.println("Ingrese un string");
            int aux = Integer.parseInt(leer.nextLine());
            System.out.println(aux);
        } catch (NumberFormatException ne) {
            System.out.println(ne);
            System.out.println(ne.getMessage());
        }

    }
}
