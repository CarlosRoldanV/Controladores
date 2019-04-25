/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 *
 * @author Estudiante
 */
public final class Leon extends Salvaje implements Acciones{
    private double velocidad;
    private int numDientes;
    private int medida;
    private int numhijos;
    /////////////getters\\\\\\\\\\\\

    public Leon() {
     
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getNumDientes() {
        return numDientes;
    }

    public int getMedida() {
        return medida;
    }

    public int getNumhijos() {
        return numhijos;
    }
    ////////////setters\\\\\\\\

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setNumDientes(int numDientes) {
        this.numDientes = numDientes;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public void setNumhijos(int numhijos) {
        this.numhijos = numhijos;
    }
    /////contructor\\\\\\\

    public Leon(double velocidad, int numDientes, int medida, int numhijos) {
        this.velocidad = velocidad;
        this.numDientes = numDientes;
        this.medida = medida;
        this.numhijos = numhijos;
    }

    public Leon(double velocidad, int numDientes, int medida, int numhijos, int codigo, String nombre, int edad, double peso) {
        super(codigo, nombre, edad, peso);
        this.velocidad = velocidad;
        this.numDientes = numDientes;
        this.medida = medida;
        this.numhijos = numhijos;
    }

    public Leon(double velocidad, int numDientes, int medida, int numhijos, String clima, String ubicacion, int fuerza, double precio) {
        super(clima, ubicacion, fuerza, precio);
        this.velocidad = velocidad;
        this.numDientes = numDientes;
        this.medida = medida;
        this.numhijos = numhijos;
    }
    /////////metodos\\\\\\\\\\
    public boolean correr(){
        return true;
    }
    @Override
    public boolean nacer() {
      return true;
    }

    @Override
    public boolean morir() {
        return true;
    }
    //////////tostring\\\\\\\\\\

    @Override
    public String toString() {
        return "Leon{" + "velocidad=" + velocidad + ", numDientes=" + numDientes + ", medida=" + medida + ", numhijos=" + numhijos + '}';
    }
    
}
