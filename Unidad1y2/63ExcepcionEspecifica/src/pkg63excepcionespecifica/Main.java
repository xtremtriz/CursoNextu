/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg63excepcionespecifica;

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
            int num;
            do {
                num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar datos\n1.Opcion1\n2.Opcion2"));
                switch (num) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Opcion1");                        
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Opcion2");
                        break;
                    default:
                        break;
                }
            } while (num!=0);
            
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Error no es numero" +nfe);
        } catch (NullPointerException npe){
            JOptionPane.showMessageDialog(null, "Ingresa dato valido (VACIO)"+ npe);
        }
    }
    
}
