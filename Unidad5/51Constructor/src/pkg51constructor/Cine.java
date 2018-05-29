/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg51constructor;

/**
 *
 * @author Ariana
 */
public class Cine {
    private String telefono;
    private String direccion;

    public Cine() {
        System.out.println("Este es un constructor sencillo");
        this.telefono = "123";
        this.direccion = "Marianos";
    }

    public Cine(String direccion) {
        System.out.println("Este es un constructor con direccion");
        this.telefono = "123";
        this.direccion = direccion;
    }
    
    
    public Cine(String telefono, String direccion) {
        System.out.println("Este es un constructor con direccion y telefono");
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    
}
