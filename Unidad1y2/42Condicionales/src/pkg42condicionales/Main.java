/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg42condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author AcerA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa edad"));
        if (edad > 0 && edad <= 18) {
            JOptionPane.showMessageDialog(null, "Eres joven y tu edad es "+edad);
        }else if(edad <18 && edad < 60){
            JOptionPane.showMessageDialog(null, "Eres adulto y tu edad es" +edad);
        }else if(edad >60){
            JOptionPane.showMessageDialog(null,"Eres mayo y tu edad es: " +edad);
        }
    
    }
    
}
