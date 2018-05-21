/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg62excepciongral;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ariana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor: "));
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Este no es un valor numerico ");
        }
    }
    
}
