/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26.pkg3usandometoconstructor;

import javax.swing.JOptionPane;

/**
 *
 * @author Ariana
 */
public class Persona {
    String nombre;
    int edad;
    
    public Persona(String nombre, int edad){
        //nombre = _nombre;
        //edad = _edad;
        this.nombre = nombre;//this referncia al atibuto y ek que no tiene this al parametro del constructor
        this.edad = edad;
    }
    
    public void Mostrar(){
        JOptionPane.showMessageDialog(null,"Nombre "+nombre+ "Edad: "+ edad);
    }
}
