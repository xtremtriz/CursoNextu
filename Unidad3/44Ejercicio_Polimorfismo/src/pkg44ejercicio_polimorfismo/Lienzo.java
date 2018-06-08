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
public class Lienzo extends ColoresPincel {
    String pintura;

    public Lienzo(String pintura, String colores, String nombre, String dibujos) {
        super(colores, nombre, dibujos);
        this.pintura = pintura;
    }

    public String getPintura() {
        return pintura;
    }

    public void setPintura(String pintura) {
        this.pintura = pintura;
    }
    public void mostrar(){
        System.out.println("Mis queridos colores");
    }
}
