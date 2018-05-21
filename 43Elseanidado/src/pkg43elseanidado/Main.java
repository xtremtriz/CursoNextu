/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg43elseanidado;

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
        int mayor = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
        int mayor1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
        int mayor2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
        
        if (mayor > mayor1) {            
            if(mayor > mayor2){
                    JOptionPane.showMessageDialog(null, "Este es numero mayor " +mayor);
            }
        }else if (mayor1 > mayor) {
            if(mayor1>mayor2){
                JOptionPane.showMessageDialog(null, "El segundo numero es el mayor "+ mayor2);
            }else{
                JOptionPane.showMessageDialog(null, "El tercer numero es el mayor "+ mayor2);
            }
        }
        
    }
    
}
