/*
 Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora 
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para 
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el 
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando 
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario 
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe 
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el 
carácter fallido como un intento.
 */
package com.mycompany.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        int numeroAdivinar = (int) (Math.random() * 500 + 1);

        Scanner leer = new Scanner(System.in);

        char respuesta;
        do {
            int numero = 0;
            try {
                System.out.println("Adivine el numero entre 1  y 500");
                numero = leer.nextInt();
                if (numero < numeroAdivinar) {
                    System.out.println("El numero a Adivinar es mayor");
                } else if (numero > numeroAdivinar) {
                    System.out.println("El numero a Adivinar es menor");
                } else {
                    System.out.println("Adivinaste el numero es " + numeroAdivinar);
                }
            } catch (InputMismatchException ix) {
                System.out.println("Debe ingresar un numero");
            } finally {
                System.out.println("Quiere adivinar de nuevo? S/N");
                respuesta = leer.next().toUpperCase().charAt(0);
            }

        } while (respuesta != 'N');
    }

}
