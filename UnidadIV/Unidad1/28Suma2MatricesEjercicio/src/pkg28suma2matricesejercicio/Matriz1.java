/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg28suma2matricesejercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author Ariana
 */
public class Matriz1 {
    private int matriz1[][] =  new int[2][3];

    public Matriz1(int matriz1[][]) {
        this.matriz1=matriz1;
    }
    public static void llenado1(int matriz1[][]){
        for (int i = 0; i < matriz1.length; i++) {
            
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor: "+i+"-"+j));  
                //System.out.println(matriz1[0].length);
            }            
        }
    }
}
