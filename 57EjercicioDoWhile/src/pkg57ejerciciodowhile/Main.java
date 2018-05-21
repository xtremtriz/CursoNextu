/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg57ejerciciodowhile;

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
        int op1, op2;
        op1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa primer numero: "));
        op2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa segundo numero: "));
        
        do{
            JOptionPane.showMessageDialog(null,"el numero es: "+op1);
            op1+=1;
        }while(op1<=op2);
    }
    
}
