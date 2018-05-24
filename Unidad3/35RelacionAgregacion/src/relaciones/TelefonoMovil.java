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
public class TelefonoMovil {
    private final Bateria bateria;//creamos atributo bateria
    private final AplicacionContactos aplicacionContactos
;    public TelefonoMovil(){//creamos constructor
        this.bateria = new Bateria();//instanciamos objeto bateria
        this.aplicacionContactos = new AplicacionContactos();
    }
    public void agregar(Contacto contacto){
        this.aplicacionContactos.agregarContacto(contacto);
    }
    public void encender(){
        System.out.println("Encendido\n");
        System.out.println("El porcentaje de la bateria es "+ bateria.porcentajeDeBateria()+"%");
    }
    public class Bateria{//creamos clase bateria dentro de la clase telefono movil
        public int porcentajeDeBateria(){
        return (int)(Math.random() * 100);
        }    
    }
    
}
