/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22arregloejemplo;

import java.util.Scanner;

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
        int[] arreglo  = new int[3];
        int arreglo2[]  = {2,3,4};
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Arreglo[0] "+ arreglo2[0]);
        System.out.println("Arreglo[1] "+ arreglo2[1]);
        System.out.println("Arreglo[1] "+ arreglo2[2]);
        
        System.out.println(".......................\n");
        for (int i = 0; i < arreglo2.length; i++) {
            //int j = arreglo2[i];
            System.out.println("Arreglo ["+i+"]: "+arreglo2[i]);            
        }
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese valor del elemento: " +i);
            arreglo[i] = teclado.nextInt();            
        }
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Arreglo ["+i+"]: "+arreglo[i]);              
        }
        
        System.out.println(arreglo.length);
    }
    
}
