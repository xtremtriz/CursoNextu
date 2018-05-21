/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradas_s11;

import java.util.Scanner;

/**
 *
 * @author AcerA
 */
public class Entradas_S11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.err.println("No debes llegar tarde");
        System.out.println("El empleado ha llegado temprano");
        System.out.println("\t\"8 am\"\n");
        
        String nombre = "Pedro";
        System.out.println("El nombre es : "+nombre);
        
        try (Scanner nom = new Scanner(System.in)) {
            System.out.println("Escribe un nombre: ");
            String nom2 = nom.nextLine();
            System.out.println("El nombre es "+ nom2);
        }
        
        
    }
    
}
