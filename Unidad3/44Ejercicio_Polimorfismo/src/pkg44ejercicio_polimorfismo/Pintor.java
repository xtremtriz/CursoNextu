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
public class Pintor {
    String nombre;
    String dibujos;

    public Pintor(String nombre, String dibujos) {
        this.nombre = nombre;
        this.dibujos = dibujos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDibujos() {
        return dibujos;
    }

    public void setDibujos(String dibujos) {
        this.dibujos = dibujos;
    }
    
    public void mostrar(){
        System.out.println("Necesito Brocha");
    }
}
