/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg67ejerciciofiguras;

/**
 *
 * @author Ariana
 */
public class Figura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo tri = new Triangulo(4);
        tri.area();
        
        Circulo cir = new Circulo(3);
        cir.area();
    }
    
}
