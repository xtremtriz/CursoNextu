/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciontelefono.hardware;

import javax.swing.JOptionPane;

/**
 *
 * @author Ariana
 */
public class Bateria {

    public double porcentajeDeCarga() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        //int porcentaje =0;
        double porcentaje =0;
        boolean verdadero= true;
        do {           
            try {
                //porcentaje = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa porcentaje"));
                porcentaje = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa porcentaje"));
                verdadero = true;
            } catch (NumberFormatException e) {
                System.out.println("No es numerico intenta de nuevo");
                verdadero = false;
            }
        } while (verdadero == false);
        return porcentaje;
    }
    
}
