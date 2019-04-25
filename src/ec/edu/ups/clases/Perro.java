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
public final class Perro extends Domestico implements Acciones {
    private String raza;
    private String pelaje;
    private String color;
    private String caracter;
    public Perro(){
    
    }
    //////////getters\\\\\\\\\\\\
    public String getRaza() {
        return raza;
    }
    public String getPelaje(){
        return pelaje;
    }
    public String getColor() {
        return color;
    }
    public String getCaracter() {
        return caracter;
    }
    ///////setters\\\\\\\
    
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }
///////////contructor\\\\\\\\\\\\\

    public Perro(String raza, String pelaje, String color, String caracter, String tamaño, int numExtremindades, String sexo, String alimento, int codigo, String nombre, int edad, double peso) {
        super(tamaño, numExtremindades, sexo, alimento, codigo, nombre, edad, peso);
        this.raza = raza;
        this.pelaje = pelaje;
        this.color = color;
        this.caracter = caracter;
    }

    public Perro(String raza, String pelaje, String color, String caracter, String tamaño, int numExtremindades, String sexo, String alimento, String nombre, int edad, double peso) {
        super(tamaño, numExtremindades, sexo, alimento, nombre, edad, peso);
        this.raza = raza;
        this.pelaje = pelaje;
        this.color = color;
        this.caracter = caracter;
    }




////////// metodos\\\\\\\\\\\    
  public boolean ladrar(){
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
    ////////////tosttring\\\\\\\\\

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", pelaje=" + pelaje + ", color=" + color + ", caracter=" + caracter + '}';
    }
    


}
