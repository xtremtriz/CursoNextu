/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg25arraylist;

import Modelo.Persona;
import java.util.ArrayList;
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
        ArrayList<Persona> lista= new ArrayList<>();
        lista.add(new Persona("11","Lalo"));
        lista.add(new Persona("22","Yol"));
        lista.add(new Persona("33","Uriel"));
        
        JOptionPane.showMessageDialog(null, imprimirLista(lista));
        
    }
    private static String imprimirLista(ArrayList<Persona> lista){
        String result= "";
        for (int i = 0; i < lista.size(); i++) {
            result += lista.get(i).toString();            
        }
        return result;
    }
}
