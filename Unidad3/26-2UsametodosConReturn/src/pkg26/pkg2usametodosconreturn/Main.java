/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26.pkg2usametodosconreturn;

import javax.swing.JOptionPane;

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
        Operacion op = new Operacion();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Dgita numero1: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Dgita numero2: "));
        
        int suma = op.Sumar(n1, n2);
        int resta = op.Restar(n1, n2);
        int mul = op.Mult(n1, n2);
        int div = op.Div(n1, n2);
        
        op.Mostrar(suma, resta, div, mul);
        
        //otro ejemplo
        System.out.println("La sumas es: "+op.Sumar(n1, n2));
    }
    
}
