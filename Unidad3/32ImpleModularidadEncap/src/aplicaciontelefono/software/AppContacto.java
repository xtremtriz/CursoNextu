/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciontelefono.software;

/**
 *
 * @author Ariana
 */
public class AppContacto {
    Contacto contacto = new Contacto();
    public void agregarContacto(Contacto contacto){
        System.out.println("Se ha agregado el contacto correctamente: "+contacto.getNumero());
    }
}
