/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26.pkg1usandometodos;

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
        Operacion op = new Operacion();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Dgita numero1: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Dgita numero2: "));
        
        op.Sumar(n1, n2);
        op.Restar(n1, n2);
        op.Mult(n1, n2);
        op.Div(n1, n2);
        op.Mostrar();
    }
    
}
