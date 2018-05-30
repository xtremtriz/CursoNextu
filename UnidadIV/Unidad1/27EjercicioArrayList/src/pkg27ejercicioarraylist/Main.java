/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27ejercicioarraylist;

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
        int arreglo[]  = {12, 69, 42, 35, 74, 56, 87, 5, 29, 14};
        int mayor=arreglo[0];
        int menor=arreglo[1];
         for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Arreglo ["+i+"]: "+arreglo[i]);                  
        }
        for (int i = 0; i < arreglo.length; i++) {
            if (mayor < arreglo[i]) {
                 //System.out.println("el numero mayor es " + mayor);
                mayor = arreglo[i];
                //System.out.println("El numero mayor es "+mayor);
            }
        }
        System.out.println("El numero mayor es "+mayor);
        for (int i = 0; i < arreglo.length; i++) {
            if (menor > arreglo[i]) {
                 //System.out.println("el numero mayor es " + mayor);
                menor = arreglo[i];
            }
        }
        System.out.println("El numero menor es "+menor);
        
        int max = 0, min = arreglo[0];
        
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]>max) max = arreglo[i];
            if (arreglo[i]<min) min =arreglo[i];
        }
        JOptionPane.showMessageDialog(null, "Numero mayor: "+max+"\nNumero menor: "+min);
    }
    
}
