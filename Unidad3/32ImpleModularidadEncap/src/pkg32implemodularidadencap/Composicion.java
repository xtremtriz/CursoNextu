/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg32implemodularidadencap;

import aplicaciontelefono.software.Contacto;

/**
 *
 * @author Ariana
 */
public class Composicion {
    
    public static void main(String[] args) {
    TelefonoMovil telefono = new TelefonoMovil();
    telefono.encender();
    Contacto contacto1 = new Contacto();
    contacto1.setNombre("Maria");
    contacto1.setNumero(123);
    telefono.agregarContacto(contacto1);
        //System.out.println(contacto1);
    
    Contacto contacto2 = new Contacto();
    contacto2.setNombre("Pedro");
    contacto2.setNumero(1234);
    telefono.agregarContacto(contacto2);
    
    Contacto contacto3 = new Contacto();
    contacto3.setNombre("Juan");
    contacto3.setNumero(12345);
    telefono.agregarContacto(contacto3);
    
        System.out.println("\n\nhasta la vista baby");
    
    }
}
