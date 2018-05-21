/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg65excepcionesejercicio;

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
        int num1 = 0, num2 = 0;
        try {
            num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa numero 1"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa numero 2"));         
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"No es un numero");
        }
        catch (NullPointerException npe){
            JOptionPane.showMessageDialog(null, "Ingresa dato valido (VACIO)"+ npe);
        }
            try {
            int opcion;
                do {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu\n1.Sumar\n2.Restar\n3.Salir"));
                    switch (opcion) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "La suma es: " +(num1+num2));
                             break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "La suma es: " +(num1-num2));
                            break;
                        default:
                             break;
                    }
                } while (opcion == 1 || opcion == 2);
            } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"No es un numero");
            }
            catch (NullPointerException npe){
                JOptionPane.showMessageDialog(null, "Ingresa dato valido (VACIO)"+ npe);
            }     
    }
    
}
