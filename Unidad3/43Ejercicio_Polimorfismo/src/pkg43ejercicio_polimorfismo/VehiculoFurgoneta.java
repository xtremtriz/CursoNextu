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
public class VehiculoFurgoneta extends Vehiculo{
    private int carga;

    public VehiculoFurgoneta(int carga, String Matricula, String Marca, String Modelo) {
        super(Matricula, Marca, Modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public String obtnerDatos(){
        return "Matri: " +Matricula + " MAr " +Marca +" Modelo "+Modelo+"Carga "+carga;
    }
}
