/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg54getterandsetter;

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
        Cine cine = new Cine();
        String cine1 = "";
        cine1 = (JOptionPane.showInputDialog(null, "Ingresa Direccion"));
                
 
        //}System.out.println(doe);
        cine.setDireccion(cine1);
        System.out.println(cine.getDireccion());
        System.out.println(cine.getId());
    }
    
}
