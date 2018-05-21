/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26usandometodos;

import Clases.Rectangulo;
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
        Rectangulo rectangulo = new Rectangulo();
        JOptionPane.showMessageDialog(null, "El area es: " +(rectangulo.area()));
        JOptionPane.showMessageDialog(null, "El triangulo es: " +(rectangulo.area())/2);
    }
    
}
