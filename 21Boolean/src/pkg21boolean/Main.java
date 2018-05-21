/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21boolean;

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
        boolean a= 5<4;
        System.out.println("El resultado es "+a);
        boolean b = 6<=6;
        System.out.println("El resultado es "+b);
       
        boolean c1 = (a && b);
        //boolean c = (a || b);
        System.out.println("El resultado es "+ c1);
    }
    
}
