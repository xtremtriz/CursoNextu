/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

/**
 *
 * @author Ariana
 */
public class ListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro = new Libro("Retro", "re", "we");
        System.out.println(libro);
        Lista lista = new Lista();
        lista.insertarPrincipio(libro);
        System.out.println("Es esto: "+lista);
    }
    
    
    
}
