/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg44ejercicio_polimorfismo;

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
       Pintor pintor = new Pintor("Juanch", "letal");
       pintor.mostrar();
       
       Pintor pintor1 = new Brocha("Delagada", "Aron", "Extreme");
       Pintor pintor2 = new ColoresPincel("Azul," ,"verne", "Cool");
       Pintor pintor3 = new Lienzo("Manta"," Morado", "Uriel", "Di");
       pintor1.mostrar();
       pintor2.mostrar();
       pintor3.mostrar();
       
       
    }
    
}
