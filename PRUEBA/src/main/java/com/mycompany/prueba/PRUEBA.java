/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;

/**
 *
 * @author Usuario
 */
public class PRUEBA {

    public static void main(String[] args) {
        
        System.out.println("Inicio de main");
        metodoUno();
        System.out.println("Finalizacion de main");
        
        
    }
    
    public static void metodoUno (){
            System.out.println("Inicio metodo 1");
            metodoDos();
            System.out.println("Finaliza metodo 1");
        }
    
    public static void metodoDos(){
        System.out.println("Inicio metodo 2");
        System.out.println("Fin metodo 2");
    }
    
    
//    class A {
//    public void metodoA() {
//                  1) sentencia_a1
//                  2) sentencia_a2
//          try {
                //3) sentencia_a3
                //4) sentencia_a4
            //} catch (MioException e){ 
                //5) sentencia_a6 
                // }
//          6) sentencia_a5
// }
//}
//          Si tira error setencia a3   --> 1 , 2, 5 , 6
    //      Si tira error setencia a4   --> 1, 2, 3, 5, 6
    //      Si no tira ningun error     --> 1, 2, 3, 4, 6

}
