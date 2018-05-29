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
public class Triangulo {
    public int lado;

    public Triangulo(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public void area(){
        System.out.println("El area es "+ (lado*4));
        //return area;
    }
}
