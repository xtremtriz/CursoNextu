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
public class Operacion {
    //int suma, resta, mul, div;//mis variables globales
    //metodos
    
    public int Sumar(int numero1, int numero2){
        int suma = numero1 +numero2;
        return suma;
    }
    
    public int Restar(int numero1, int numero2){
        int resta = numero1 - numero2;
        return resta;
    }
    
    public int Mult(int numero1, int numero2){
        int mul = numero1 * numero2;
        return mul;
    }
    
    public int Div(int numero1, int numero2){
        int div = numero1 / numero2;
        return div;
    }
    
    public void Mostrar(int suma, int resta, int div, int mul){
        JOptionPane.showMessageDialog(null, "el resultado es: \n1 Suma "+ suma+ "\n2 Resta "+resta+"\n3Mult "+mul+"\n4Div "+div);
        //return muestra;
    }
}
