/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg28suma2matricesejercicio;

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
        
        int matriz1[][] =  new int[2][3];
        int matriz2[][] =  new int[2][3];
        int resultado[][] = new int [2][3];
        Matriz1 matriz11 = new Matriz1(matriz1);
        matriz11.llenado1(matriz1);
        llenado2(matriz2);
        suma(resultado,matriz1,matriz2);
        imprimir(resultado);
        //imprimir2(resultado);
        JOptionPane.showMessageDialog(null, imprimir2(resultado));
    }
    /*public static void llenado1(int matriz1[][]){
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor: "+i+"-"+j));                
            }            
        }
    }*/
    public static void llenado2(int matriz2[][]){
        for (int i = 0; i < matriz2.length; i++) {//revisa fila 1
            for (int j = 0; j < matriz2[0].length; j++) {//revisa columnas
                matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor: "+i+"-"+j));                
            }            
        }
    }
    public static void suma(int resultado[][], int matriz1[][], int matriz2[][]){
        
        for (int i=0; i<=1; i++){
            for (int j=0; j<=2; j++){
                resultado [i][j]= matriz1[i][j]+ matriz2[i][j];
            }
        }        
    }
    
    public static void imprimir(int resultado[][]){
        for (int i=0;i<=1;i++){
            for (int j=0;j<=2;j++) {
                System.out.print(resultado[i][j] + " ");
            }
        System.out.println("");            
        }
    }
    public static String imprimir2(int resultado[][]){
        String result="";
        //for (int i = 0; i < resultado.length; i++) {//este es lo mismo que abajo
        for (int[] resultado1 : resultado) {
            result += Arrays.toString(resultado1) + "\n";
        }
        return result;
    }
}
