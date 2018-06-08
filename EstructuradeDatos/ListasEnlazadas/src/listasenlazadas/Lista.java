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
public class Lista {
    
    private Nodo cabeza = null;
    private class Nodo{
        public Libro libro;
        public Nodo siguiente = null;
        
        public Nodo(Libro libro){
            this.libro = libro;
        }
    }
    
    public void insertarPrincipio(Libro libro){
        Nodo nodo = new Nodo(libro);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        System.out.println("esto regresa: "+cabeza);
        //return cabeza;
    }
}
