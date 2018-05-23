/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg32implemodularidadencap;

import aplicaciontelefono.hardware.Bateria;
import aplicaciontelefono.software.AppContacto;
import aplicaciontelefono.software.Contacto;

/**
 *
 * @author Ariana
 */
public class TelefonoMovil {
    Bateria bateria = new Bateria();
    AppContacto registro = new AppContacto();
    
    public void encender(){
        System.out.println("Encendido");
        System.out.println("El porcentaje de la bateria "+(bateria.porcentajeDeCarga())+"%");
        //Math.round imrime un valor entero convierte valores double o flat a int los redondea
    }
    public void agregarContacto(Contacto contacto){
        System.out.println("Se esta agregado el contacto "+contacto.getNombre());
        registro.agregarContacto(contacto);
    }
}
