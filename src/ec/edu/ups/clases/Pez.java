/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 *
 * @author Byron PC
 */
public class Pez extends Domestico implements Acciones {
 private String tipo;
    private int tamaño;
    private String color;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public String getColor() {
        return color;
    }
    
   public Pez() {
    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void moverse() {

    }

    @Override
    public void jugar() {

    }

    @Override
    public void reproducirse() {

    }

    
    public Pez(int codigo, String nombre, int edad, double peso, String sexo) {
        super(codigo, nombre, edad, peso, sexo);
    }

}
