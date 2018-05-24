/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg43nextufutbol;

/**
 *
 * @author Ariana
 */
public class Jugadores extends Estadio{
    private String nombre ;
    private String equipo ;

    public Jugadores(String nombre, String equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    //@Override
    public void mostrar(){
        //return "Nombre: " +nombre + "Equi: " + equipo;
        System.out.println("Nombre: " +nombre + "\nEqui: " + equipo);
    }
    
    
}
