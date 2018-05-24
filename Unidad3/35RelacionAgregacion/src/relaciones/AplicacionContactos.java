/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Ariana
 */
public class AplicacionContactos {
    private List<Contacto> contactos;
    public AplicacionContactos(){
        this.contactos = new ArrayList<>();
    }
    public void agregarContacto(Contacto contacto){
        
        this.contactos.add(contacto);
        System.out.println("Se ha agregado un contacto " + contacto.getNombre());
        //System.out.println(contactos);
    }
    
    
}
