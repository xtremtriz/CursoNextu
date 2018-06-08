/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26linkedlist;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelo.Persona;

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
        LinkedList<Persona> lista = new LinkedList<>();
        
        lista.add(new Persona("Uriel","12"));
        lista.add(new Persona("Juan","14"));
        lista.add(new Persona("Orl","13"));
        
        JOptionPane.showMessageDialog(null, imprimirLista(lista));
        //System.out.println(lista.size());
        lista.addFirst(new Persona("Jorge","16"));// tambie se puede usar addLast
        JOptionPane.showMessageDialog(null, imprimirLista(lista));
        lista.remove();  // tambien se puede usar removeLast  
        JOptionPane.showMessageDialog(null, imprimirLista(lista));
        
    }
    
    private static String imprimirLista(LinkedList<Persona> lista){
        String result ="";
        for (int i = 0; i < lista.size(); i++) {
            result += lista.get(i).toString()+"\n";
            //JOptionPane.showMessageDialog(null, lista.size());                        
        }
        return result;
    }
    
}
