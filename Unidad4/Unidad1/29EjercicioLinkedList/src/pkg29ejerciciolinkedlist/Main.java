/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg29ejerciciolinkedlist;

import java.util.LinkedList;
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
        int numero=0, memoria, disco, opcion=0;
        String procesador;
        boolean seguir=true;
        LinkedList<Caracteristicas> lista = new LinkedList<>();
        
             
        do {
            try {
                if (seguir==true) {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Que deseas realizar:\n1Agregar info: \n2Eliminar: \n3Mostrar \n4Salir"));
                seguir=true;
                }
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Este no es un numero "+e);
                seguir=true;
            }
            catch (NullPointerException nfe) {
                JOptionPane.showMessageDialog(null,"Este no es un numero "+nfe);
                seguir=true;
            }
            
            switch (opcion) {
                case 1:  
                    numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el numero"));
                    procesador = (JOptionPane.showInputDialog(null,"nombre procesador"));
                    memoria = Integer.parseInt(JOptionPane.showInputDialog(null,"capacidad memoria RAM"));                    
                    disco = Integer.parseInt(JOptionPane.showInputDialog(null,"Disco duro"));
                    lista.add(new Caracteristicas(numero,procesador, memoria,disco));
                    //agregar(lista);
                    break;
                case 2:  
                    eliminar(lista);                    
                    break;                    
                case 3:                    
                    JOptionPane.showMessageDialog(null, mostrar(lista));
                    break;                    
                case 4: 
                    seguir = false;
                    break;
                default:
                    seguir=true;
                    JOptionPane.showMessageDialog(null, "Error no es opcion valida");
                    //throw new AssertionError();
                    
                    
            }
        } while (seguir==true);        
        //System.out.println(lista);
    }
    public static String agregar(LinkedList<Caracteristicas> lista){
        String result="";
        return result;
    }
    
    public static String eliminar(LinkedList<Caracteristicas> lista){
        String result="";
        lista.remove();
        return result;
    }
    
    public static String mostrar(LinkedList<Caracteristicas> lista){
        String result="";
        for (int i = 0; i < lista.size(); i++) {
            result += lista.get(i).toString()+"\n";
            //JOptionPane.showMessageDialog(null, lista.size());                        
        }
        return result;
    }
    
}
