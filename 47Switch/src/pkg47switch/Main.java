/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg47switch;

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
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu de opciones :\n1.Opcion 1 \n2.Opcion 2 \n3.Opcion 3 "));
        switch(opcion){
            case 1:
                JOptionPane.showMessageDialog(null,"Seleccionaste la Opcion1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Seleccionaste la Opcion1");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Seleccionaste la Opcion1");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;
                
        }
    }
    
}
