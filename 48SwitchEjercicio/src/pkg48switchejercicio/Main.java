/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg48switchejercicio;

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
        int resultado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa primer numero: "));
        int resultado2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa segudno numero"));
        
        if (resultado>resultado2) {
            JOptionPane.showMessageDialog(null,"el numero mayor es " +resultado);
        }else{
            JOptionPane.showMessageDialog(null,"el numero mayor es "+ resultado2);
        }
        
        /*JOptionPane.showMessageDialog(null,"La suma es: "+ (resultado+resultado2));
        JOptionPane.showMessageDialog(null,"La resta es: "+ (resultado-resultado2));*/
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "deseo saber:\n1Suma \n2Resta"));
        switch(opcion){
            case 1:
                JOptionPane.showMessageDialog(null, "La suma es"+ (resultado+resultado2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "La resta es"+ (resultado-resultado2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "No eciste esta opcion");
                break;
        }
        
    }
    
}
