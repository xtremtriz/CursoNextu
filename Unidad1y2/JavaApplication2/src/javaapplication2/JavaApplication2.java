/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author AcerA
 */
public class JavaApplication2 {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner teclado = new Scanner(System.in)) {
            System.out.println("Escibe aqui palabra: ");
            String palabras = teclado.nextLine();
            System.out.println("Tu palabra es : "+ palabras);
            
            System.out.println("Escribe entero: ");
            int numero = teclado.nextInt();
            System.out.println("Tu nunero es: " + numero);
            
            System.out.println("Escribe decimal");
            double decimal = teclado.nextDouble();
            System.out.println("Tu decimal es: "+ decimal);
        }
    }
    
}
