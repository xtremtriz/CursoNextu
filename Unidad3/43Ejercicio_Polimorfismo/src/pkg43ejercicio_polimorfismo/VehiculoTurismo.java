/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg43ejercicio_polimorfismo;

/**
 *
 * @author Ariana
 */
public class VehiculoTurismo extends Vehiculo {
    private int puertas;

    public VehiculoTurismo(int puertas, String Matricula, String Marca, String Modelo) {
        super(Matricula, Marca, Modelo);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    /*public void setPuertas(int puertas) {
        this.puertas = puertas;
    }*/
    
    public String mostrarDatos(){
        return "Matricula: "+Matricula+ " Marca: "+Marca+ " Modelo: "+Modelo + " Puertas: " +puertas;
    }
}
