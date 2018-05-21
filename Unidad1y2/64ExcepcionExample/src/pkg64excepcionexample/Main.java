/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg64excepcionexample;

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
        for (int i = 0; i < 5; i++) {
            
            try {
                int num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro no es numerico");
            }
        }
    }
    
}
