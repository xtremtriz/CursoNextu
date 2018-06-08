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
public class Circulo extends Area{
    public int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    @Override
    public void area(){
        System.out.println("EL area es: "+ Math.round((Math.PI)*radio*radio));
        System.out.println(getRadio());
    }
}
