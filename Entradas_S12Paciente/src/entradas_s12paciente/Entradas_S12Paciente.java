/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradas_s12paciente;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author AcerA
 */
public class Entradas_S12Paciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner paciente = new Scanner(System.in);
        System.out.println("Su nombre: ");
        String nombre = paciente.nextLine();
        System.out.println("Ingresa no. paciente: ");
        int ident = paciente.nextInt();
        System.out.println("Ingresa estatura");
        double est = paciente.nextDouble();
        System.out.println("El nombre es: "+ nombre + " \nSu numero es: " + ident+ " \nSu estatura es de: " +est+ " metros");
         paciente.close();
        
        
        //String palabra = JOptionPane.showInputDialog(null,"Ingresa palabra: ");
        //JOptionPane.showMessageDialog(null, "la palabra ingresada es: " + palabra);
        
       
    }
    
}
