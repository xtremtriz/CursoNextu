/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg43ejercicio_polimorfismo;

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
        //VehiculoTurismo vehiculo1 = new VehiculoTurismo(4, "FGCV", "Chevrolete", "SD$");
        Vehiculo misVehiculos[] = new Vehiculo[4];//reserva en memoria para 4
        
        misVehiculos[0] = new Vehiculo("FGCV", "Ford", "SD$");
        misVehiculos[1] = new VehiculoTurismo(4, "FGCV", "Chevrolete", "SD$");
        misVehiculos[2] = new VehiculoDeportivo(300,"FGCV", "Corvete", "SD$");
        misVehiculos[3] = new VehiculoFurgoneta(130,"FGCV", "Nissan", "SD$");
        
        
        //System.out.println(vehiculo1);
        for (Vehiculo vehiculos: misVehiculos) {
            //Vehiculo misvehiculo = misvehiculos[i]; 
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
    }
    
}
