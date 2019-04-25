/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 *
 * @author Carlos
 */
public final class Gato extends Domestico implements Acciones {
 private String tipo;
    private int añosvida;
    private String color;
    private double meedidas;
///////////getters\\\\\\\\\

    public String getTipo() {
        return tipo;
    }

    public int getAñosvida() {
        return añosvida;
    }

    public String getColor() {
        return color;
    }

    public double getMeedidas() {
        return meedidas;
    }
    ///////////setters\\\\\\\\\\\\

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAñosvida(int añosvida) {
        this.añosvida = añosvida;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMeedidas(double meedidas) {
        this.meedidas = meedidas;
    }
    ///////////contructor\\\\\\\\\\\\\\\\\\\\\\\

    public Gato(String tipo, int añosvida, String color, double meedidas) {
        this.tipo = tipo;
        this.añosvida = añosvida;
        this.color = color;
        this.meedidas = meedidas;
    }

    public Gato(String tipo, int añosvida, String color, double meedidas, int codigo, String nombre, int edad, double peso) {
        super(codigo, nombre, edad, peso);
        this.tipo = tipo;
        this.añosvida = añosvida;
        this.color = color;
        this.meedidas = meedidas;
    }

    public Gato(String tipo, int añosvida, String color, double meedidas, String tamaño, int numExtremindades, double sexo, String alimento) {
        super(tamaño, numExtremindades, sexo, alimento);
        this.tipo = tipo;
        this.añosvida = añosvida;
        this.color = color;
        this.meedidas = meedidas;
    }
    //////////metodos\\\\\\\\\\\\\\\\\
    public boolean cazar(){
       return true ;
    }
    @Override
    public boolean nacer() {
        return true;
    }
     @Override
    public boolean morir() {
        return true;
    }
    //////////////////toString\\\\\\\\\\\\\\\\

    @Override
    public String toString() {
        return "Gato{" + "tipo=" + tipo + ", a\u00f1osvida=" + añosvida + ", color=" + color + ", meedidas=" + meedidas + '}';
    }
    
}
