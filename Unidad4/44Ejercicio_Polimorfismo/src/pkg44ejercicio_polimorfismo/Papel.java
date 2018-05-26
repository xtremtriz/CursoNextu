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
public class Papel extends Pintor{
    String doblado;

    public Papel(String doblado, String nombre, String dibujos) {
        super(nombre, dibujos);
        this.doblado = doblado;
    }

    public String getDoblado() {
        return doblado;
    }

    public void setDoblado(String doblado) {
        this.doblado = doblado;
    }
    
    @Override
    public void mostrar(){
        System.out.println("Este es un tipo de papel: ");
    }
}
