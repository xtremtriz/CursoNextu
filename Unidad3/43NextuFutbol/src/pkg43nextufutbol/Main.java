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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estadio estadio = new Estadio();
        estadio.mostrar();
        
        Estadio estadio1 = new Jugadores("Juanche", "Dorado");
        estadio1.mostrar();
    }
    
}
