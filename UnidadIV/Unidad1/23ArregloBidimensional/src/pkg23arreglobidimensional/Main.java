/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23arreglobidimensional;

import java.util.Arrays;
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
        int arreglo[][] =  new int[2][3];
        
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                arreglo[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor: "+i+"-"+j));                
            }            
        }//System.out.println(arreglo.length);
        JOptionPane.showMessageDialog(null, imprimirArreglo(arreglo));
        //System.out.println(arreglo.length);
    }
    
    public static String imprimirArreglo(int arreglo[][]){
        String result="";
        for (int[] arreglo1 : arreglo) {
            result += Arrays.toString(arreglo1) + "\n";            
        }
        /*for (int i = 0; i < arreglo.length; i++) {
            int[] is = arreglo[i];
            
        }*/
        return result;
    }
}
