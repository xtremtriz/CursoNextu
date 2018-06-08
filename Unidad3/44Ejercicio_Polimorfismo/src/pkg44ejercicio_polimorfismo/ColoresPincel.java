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
public class ColoresPincel extends Pintor{
    String colores;

    public ColoresPincel(String colores, String nombre, String dibujos) {
        super(nombre, dibujos);
        this.colores = colores;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }
    
    @Override
    public void mostrar(){
        System.out.println("Cuantos colores necestitas: "+ colores);
    }
}
