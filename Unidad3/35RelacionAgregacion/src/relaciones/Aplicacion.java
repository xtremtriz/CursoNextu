/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

/**
 *
 * @author Ariana
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        TelefonoMovil telefonomovil = new TelefonoMovil();
        telefonomovil.encender();
        
        Contacto contacto1 = new Contacto("NEXTU");
        telefonomovil.agregar(contacto1);
        
        Contacto contacto2 = new Contacto("NEXTU2");
        telefonomovil.agregar(contacto2);
    }
}
