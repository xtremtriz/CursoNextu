/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg58ejerciciodowhile;

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
        int nu1, nu2,op;
        nu1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa primer numero: "));
        nu2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa segundo numero: "));
        
       
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Opciones:\n1.Sumar\n2.Restar\n0.Salir: "));
            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "La suma es: "+ (nu1+nu2));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "La resta es: "+ (nu1-nu2));
                    break;
                default:
                    break;
            }
        } while (op==0);
        
    }
    
}
