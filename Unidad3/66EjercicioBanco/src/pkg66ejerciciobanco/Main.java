/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg66ejerciciobanco;

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
        CuentaAhorro cuenta = new CuentaAhorro();
        cuenta.depositar();
        
        PrestamoCarro carro = new PrestamoCarro();
        carro.pagar();
        
        PrestamoPersonal personal = new PrestamoPersonal();
        personal.saldo();
    }
    
}
