/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg29ejerciciolinkedlist;

/**
 *
 * @author Ariana
 */
public class Caracteristicas {
    private int numero;
    private String proceador;
    private int memoria;
    private int disco;

    public Caracteristicas(int numero, String proceador, int memoria, int disco) {
        this.numero = numero;
        this.proceador = proceador;
        this.memoria = memoria;
        this.disco = disco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getProceador() {
        return proceador;
    }

    public void setProceador(String proceador) {
        this.proceador = proceador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    @Override
    public String toString() {
        return "Caracteristicas{" + "numero=" + numero + ", proceador=" + proceador + ", memoria=" + memoria + ", disco=" + disco + '}';
    }
    
    
}
