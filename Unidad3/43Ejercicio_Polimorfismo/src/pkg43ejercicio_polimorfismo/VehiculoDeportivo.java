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
public class VehiculoDeportivo extends Vehiculo{
    private int cilindrada;

    public VehiculoDeportivo(int cilindrada, String Matricula, String Marca, String Modelo) {
        super(Matricula, Marca, Modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    /*public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }*/
     public String mostrarDatos(){
     return "Matricula: "+Matricula+ "Marca: "+Marca+ "Modelo: "+Modelo + " Puertas: " +cilindrada;
    }
}
