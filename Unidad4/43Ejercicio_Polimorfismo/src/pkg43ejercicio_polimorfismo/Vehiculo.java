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
public class Vehiculo {
    protected String Matricula;
    protected String Marca;
    protected String Modelo;

    public Vehiculo(String Matricula, String Marca, String Modelo) {
        this.Matricula = Matricula;
        this.Marca = Marca;
        this.Modelo = Modelo;
    }
    
    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    public String mostrarDatos(){
        return "Matricula: "+Matricula+ " Marca: "+Marca+ " Modelo: "+Modelo;
    }
}
