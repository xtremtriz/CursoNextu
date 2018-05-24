/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26.pkg1usandometodos;

import javax.swing.JOptionPane;

/**
 *
 * @author Ariana
 */
public class Operacion {
    int suma, resta, mul, div;//mis variables globales
    
    public void Sumar(int numero1, int numero2){
        suma = numero1 +numero2;
    }
    
    public void Restar(int numero1, int numero2){
        resta = numero1 - numero2;
    }
    
    public void Mult(int numero1, int numero2){
        mul = numero1 * numero2;
    }
    
    public void Div(int numero1, int numero2){
        div = numero1 / numero2;
    }
    
    public void Mostrar(){
        JOptionPane.showMessageDialog(null, "el resultado es: \n1 Suma "+ suma+ "\n2 Resta "+resta+"\n3Mult "+mul+"\n4Div "+div);
    }
}
