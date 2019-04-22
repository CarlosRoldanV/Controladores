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
public class Domestico extends Animal implements Acciones {

    public Domestico() {
    }

    public Domestico(int codigo, String nombre, int edad, double peso, String sexo) {
        super(codigo, nombre, edad, peso, sexo);
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

    @Override
    public String toString() {
        return "Domestico{" + '}';
    }
    
    

}
