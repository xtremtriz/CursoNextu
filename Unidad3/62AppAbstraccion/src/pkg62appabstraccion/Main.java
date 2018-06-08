/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg62appabstraccion;

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
        Piano piano = new Piano();//las clases abstractas no se pueden instanciar solo las hijas
        piano.tocar();
        piano.detener();
        
        Guitarra guitarra = new Guitarra();
        guitarra.afinar();
        guitarra.tocar();
        guitarra.detener();
        
        Violin violin = new Violin();
        violin.tocar();
        violin.afinar();
        violin.detener();
        
    }
    
}
