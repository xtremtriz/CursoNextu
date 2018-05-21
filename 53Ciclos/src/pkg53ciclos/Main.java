/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg53ciclos;

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
        int letrero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa numero de veces: "));
        for (int i = 0; i < letrero; i++) {
            JOptionPane.showMessageDialog(null, "Restaurante para programdores");
            
        }
    }
    
}
