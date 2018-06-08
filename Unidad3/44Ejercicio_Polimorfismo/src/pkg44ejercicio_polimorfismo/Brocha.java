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
public class Brocha extends Pintor{
    String Tipo;

    public Brocha(String Tipo, String nombre, String dibujos) {
        super(nombre, dibujos);
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    @Override
    public void mostrar(){
        System.out.println("Aqui esta tu brocha: ");
    }
    
}
